package ai;

import android.text.TextUtils;
import org.telegram.messenger.c20;
public final class b1 implements c20 {
    public final int f1129a;
    public final l1 f1130b;
    public final String f1131c;

    public b1(l1 l1Var, String str, int i7) {
        this.f1129a = i7;
        this.f1130b = l1Var;
        this.f1131c = str;
    }

    @Override
    public final void a(Object obj) {
        boolean z9;
        g gVar = (g) obj;
        switch (this.f1129a) {
            case 0:
                l1 l1Var = this.f1130b;
                if (TextUtils.equals(l1Var.d, this.f1131c)) {
                    if (l1Var.f1505t0 == null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    l1Var.f1505t0 = gVar;
                    if (!l1Var.f1524v0) {
                        if (z9) {
                            l1Var.f1497s0.a(gVar);
                            l1Var.invalidate();
                            return;
                        }
                        l1Var.j1(gVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                l1 l1Var2 = this.f1130b;
                if (TextUtils.equals(l1Var2.f1359e, this.f1131c)) {
                    l1Var2.f1514u0 = gVar;
                    if (l1Var2.f1524v0 && l1Var2.f1535w0 && l1Var2.A0) {
                        l1Var2.A0 = false;
                        l1Var2.f1567z0 = System.currentTimeMillis() + 60000;
                        l1Var2.A2 = -1;
                    }
                    if (l1Var2.f1524v0) {
                        l1Var2.j1(gVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
