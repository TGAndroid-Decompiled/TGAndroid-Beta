package ag;

import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.r20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class k {
    public static volatile k[] f593g = new k[4];
    public static final Object[] h = new Object[4];
    public final int f594a;
    public long f595b;
    public TL_account.connectedBots f596c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f597f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public k(int i10) {
        this.f594a = i10;
    }

    public static k a(int i10) {
        k kVar;
        k kVar2 = f593g[i10];
        if (kVar2 == null) {
            synchronized (h[i10]) {
                try {
                    kVar = f593g[i10];
                    if (kVar == null) {
                        k[] kVarArr = f593g;
                        k kVar3 = new k(i10);
                        kVarArr[i10] = kVar3;
                        kVar = kVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return kVar;
        }
        return kVar2;
    }

    public final void b() {
        this.f597f = false;
        c(null);
    }

    public final void c(r20 r20Var) {
        boolean z10;
        if (r20Var != null) {
            this.d.add(r20Var);
        }
        if (!this.e) {
            if (System.currentTimeMillis() - this.f595b <= 60000 && (z10 = this.f597f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.e = true;
            ConnectionsManager.getInstance(this.f594a).sendRequest(new TL_account.getConnectedBots(), new c(this, 1));
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) != null) {
                    ((r20) arrayList.get(i10)).a(this.f596c);
                }
                i10++;
            } else {
                arrayList.clear();
                at.f(this.f594a).k(at.Z3, new Object[0]);
                return;
            }
        }
    }
}
