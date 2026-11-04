package lg;

import java.util.ArrayList;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class f {
    public static volatile f[] f18289g = new f[4];
    public static final Object[] h = new Object[4];
    public final int f18290a;
    public long f18291b;
    public TL_account.connectedBots f18292c;
    public final ArrayList d = new ArrayList();
    public boolean f18293e;
    public boolean f18294f;

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            h[i3] = new Object();
        }
    }

    public f(int i3) {
        this.f18290a = i3;
    }

    public static f a(int i3) {
        f fVar;
        f fVar2 = f18289g[i3];
        if (fVar2 == null) {
            synchronized (h[i3]) {
                try {
                    fVar = f18289g[i3];
                    if (fVar == null) {
                        f[] fVarArr = f18289g;
                        f fVar3 = new f(i3);
                        fVarArr[i3] = fVar3;
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
        this.f18294f = false;
        c(null);
    }

    public final void c(u10 u10Var) {
        boolean z10;
        if (u10Var != null) {
            this.d.add(u10Var);
        }
        if (!this.f18293e) {
            if (System.currentTimeMillis() - this.f18291b <= 60000 && (z10 = this.f18294f)) {
                if (z10) {
                    d();
                    return;
                }
                return;
            }
            this.f18293e = true;
            ConnectionsManager.getInstance(this.f18290a).sendRequest(new TL_account.getConnectedBots(), new ci.d0(this, 15));
        }
    }

    public final void d() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 < arrayList.size()) {
                if (arrayList.get(i3) != null) {
                    ((u10) arrayList.get(i3)).a(this.f18292c);
                }
                i3++;
            } else {
                arrayList.clear();
                hs.f(this.f18290a).k(hs.Z3, new Object[0]);
                return;
            }
        }
    }
}
