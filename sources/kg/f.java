package kg;

import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f {
    public static volatile f[] f18302g = new f[4];
    public static final Object[] h = new Object[4];
    public final int f18303a;
    public long f18304b;
    public TL_account.connectedBots f18305c;
    public final ArrayList d = new ArrayList();
    public boolean f18306e;
    public boolean f18307f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public f(int i7) {
        this.f18303a = i7;
    }

    public static f a(int i7) {
        f fVar;
        f fVar2 = f18302g[i7];
        if (fVar2 == null) {
            synchronized (h[i7]) {
                try {
                    fVar = f18302g[i7];
                    if (fVar == null) {
                        f[] fVarArr = f18302g;
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
        this.f18307f = false;
        c(null);
    }

    public final void c(y10 y10Var) {
        boolean z10;
        if (y10Var != null) {
            this.d.add(y10Var);
        }
        if (!this.f18306e) {
            if (System.currentTimeMillis() - this.f18304b <= 60000 && (z10 = this.f18307f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.f18306e = true;
            ConnectionsManager.getInstance(this.f18303a).sendRequest(new TL_account.getConnectedBots(), new ai.a1(this, 17));
        }
    }

    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) != null) {
                    ((y10) arrayList.get(i7)).a(this.f18305c);
                }
                i7++;
            } else {
                arrayList.clear();
                ls.f(this.f18303a).k(ls.f25255c4, new Object[0]);
                return;
            }
        }
    }
}
