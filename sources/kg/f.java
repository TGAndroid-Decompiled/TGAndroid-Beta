package kg;

import java.util.ArrayList;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f {
    public static volatile f[] f17924g = new f[4];
    public static final Object[] h = new Object[4];
    public final int f17925a;
    public long f17926b;
    public TL_account.connectedBots f17927c;
    public final ArrayList d = new ArrayList();
    public boolean f17928e;
    public boolean f17929f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public f(int i7) {
        this.f17925a = i7;
    }

    public static f a(int i7) {
        f fVar;
        f fVar2 = f17924g[i7];
        if (fVar2 == null) {
            synchronized (h[i7]) {
                try {
                    fVar = f17924g[i7];
                    if (fVar == null) {
                        f[] fVarArr = f17924g;
                        f fVar3 = new f(i7);
                        fVarArr[i7] = fVar3;
                        fVar = fVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fVar;
        }
        return fVar2;
    }

    public final void b() {
        this.f17929f = false;
        c(null);
    }

    public final void c(z10 z10Var) {
        boolean z10;
        if (z10Var != null) {
            this.d.add(z10Var);
        }
        if (!this.f17928e) {
            if (System.currentTimeMillis() - this.f17926b <= 60000 && (z10 = this.f17929f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.f17928e = true;
            ConnectionsManager.getInstance(this.f17925a).sendRequest(new TL_account.getConnectedBots(), new ai.e1(this, 15));
        }
    }

    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) != null) {
                    ((z10) arrayList.get(i7)).a(this.f17927c);
                }
                i7++;
            } else {
                arrayList.clear();
                ns.f(this.f17925a).k(ns.Z3, new Object[0]);
                return;
            }
        }
    }
}
