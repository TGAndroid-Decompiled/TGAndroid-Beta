package kg;

import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f {
    public static volatile f[] f18402g = new f[4];
    public static final Object[] h = new Object[4];
    public final int f18403a;
    public long f18404b;
    public TL_account.connectedBots f18405c;
    public final ArrayList d = new ArrayList();
    public boolean f18406e;
    public boolean f18407f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public f(int i7) {
        this.f18403a = i7;
    }

    public static f a(int i7) {
        f fVar;
        f fVar2 = f18402g[i7];
        if (fVar2 == null) {
            synchronized (h[i7]) {
                try {
                    fVar = f18402g[i7];
                    if (fVar == null) {
                        f[] fVarArr = f18402g;
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
        this.f18407f = false;
        c(null);
    }

    public final void c(w10 w10Var) {
        boolean z10;
        if (w10Var != null) {
            this.d.add(w10Var);
        }
        if (!this.f18406e) {
            if (System.currentTimeMillis() - this.f18404b <= 60000 && (z10 = this.f18407f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.f18406e = true;
            ConnectionsManager.getInstance(this.f18403a).sendRequest(new TL_account.getConnectedBots(), new ai.b1(this, 17));
        }
    }

    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) != null) {
                    ((w10) arrayList.get(i7)).a(this.f18405c);
                }
                i7++;
            } else {
                arrayList.clear();
                ks.f(this.f18403a).k(ks.f25196c4, new Object[0]);
                return;
            }
        }
    }
}
