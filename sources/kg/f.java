package kg;

import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f {
    public static volatile f[] f18303g = new f[4];
    public static final Object[] h = new Object[4];
    public final int f18304a;
    public long f18305b;
    public TL_account.connectedBots f18306c;
    public final ArrayList d = new ArrayList();
    public boolean f18307e;
    public boolean f18308f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public f(int i7) {
        this.f18304a = i7;
    }

    public static f a(int i7) {
        f fVar;
        f fVar2 = f18303g[i7];
        if (fVar2 == null) {
            synchronized (h[i7]) {
                try {
                    fVar = f18303g[i7];
                    if (fVar == null) {
                        f[] fVarArr = f18303g;
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
        this.f18308f = false;
        c(null);
    }

    public final void c(x10 x10Var) {
        boolean z10;
        if (x10Var != null) {
            this.d.add(x10Var);
        }
        if (!this.f18307e) {
            if (System.currentTimeMillis() - this.f18305b <= 60000 && (z10 = this.f18308f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.f18307e = true;
            ConnectionsManager.getInstance(this.f18304a).sendRequest(new TL_account.getConnectedBots(), new ai.e1(this, 17));
        }
    }

    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) != null) {
                    ((x10) arrayList.get(i7)).a(this.f18306c);
                }
                i7++;
            } else {
                arrayList.clear();
                ks.f(this.f18304a).k(ks.f25097c4, new Object[0]);
                return;
            }
        }
    }
}
