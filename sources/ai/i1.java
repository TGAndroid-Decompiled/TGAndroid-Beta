package ai;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
public final class i1 implements Utilities.Callback {
    public final int f1549a;
    public final t1 f1550b;
    public final String f1551c;

    public i1(t1 t1Var, String str, int i10) {
        this.f1549a = i10;
        this.f1550b = t1Var;
        this.f1551c = str;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        g gVar = (g) obj;
        switch (this.f1549a) {
            case 0:
                t1 t1Var = this.f1550b;
                if (TextUtils.equals(t1Var.d, this.f1551c)) {
                    if (t1Var.f1868t0 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t1Var.f1868t0 = gVar;
                    if (!t1Var.f1888v0) {
                        if (z10) {
                            t1Var.f1858s0.a(gVar);
                            t1Var.invalidate();
                            return;
                        }
                        t1Var.j1(gVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                t1 t1Var2 = this.f1550b;
                if (TextUtils.equals(t1Var2.e, this.f1551c)) {
                    t1Var2.f1878u0 = gVar;
                    if (t1Var2.f1888v0 && t1Var2.f1899w0 && t1Var2.A0) {
                        t1Var2.A0 = false;
                        t1Var2.f1929z0 = System.currentTimeMillis() + 60000;
                        t1Var2.A2 = -1;
                    }
                    if (t1Var2.f1888v0) {
                        t1Var2.j1(gVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
