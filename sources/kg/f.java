package kg;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f {
    public static volatile f[] f17365g = new f[4];
    public static final Object[] h = new Object[4];
    public final int f17366a;
    public long f17367b;
    public TL_account.connectedBots f17368c;
    public final ArrayList d = new ArrayList();
    public boolean f17369e;
    public boolean f17370f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public f(int i7) {
        this.f17366a = i7;
    }

    public static f a(int i7) {
        f fVar;
        f fVar2 = f17365g[i7];
        if (fVar2 == null) {
            synchronized (h[i7]) {
                try {
                    fVar = f17365g[i7];
                    if (fVar == null) {
                        f[] fVarArr = f17365g;
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
        this.f17370f = false;
        c(null);
    }

    public final void c(c20 c20Var) {
        boolean z9;
        if (c20Var != null) {
            this.d.add(c20Var);
        }
        if (!this.f17369e) {
            if (System.currentTimeMillis() - this.f17367b <= 60000 && (z9 = this.f17370f)) {
                if (z9) {
                    d();
                    return;
                }
                return;
            }
            this.f17369e = true;
            ConnectionsManager.getInstance(this.f17366a).sendRequest(new TL_account.getConnectedBots(), new bi.j0(this, 15));
        }
    }

    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                if (arrayList.get(i7) != null) {
                    ((c20) arrayList.get(i7)).a(this.f17368c);
                }
                i7++;
            } else {
                arrayList.clear();
                qs.f(this.f17366a).k(qs.Z3, new Object[0]);
                return;
            }
        }
    }
}
