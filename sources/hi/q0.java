package hi;

import android.net.Uri;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
public final class q0 implements z10 {
    public final int f14894a;
    public final u0 f14895b;

    public q0(u0 u0Var, int i7) {
        this.f14894a = i7;
        this.f14895b = u0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f14894a;
        u0 u0Var = this.f14895b;
        switch (i7) {
            case 0:
                Float f10 = (Float) obj;
                t0 t0Var = u0Var.f15173n;
                if (t0Var != null) {
                    t0Var.setProgress(f10.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (u0Var.f15170c && u0Var.f15174r != null) {
                    u0Var.f15173n.b(2131624056, 3500, hd.N0("VideoSavedHint"));
                    u0Var.f15170c = false;
                    u0Var.d();
                    u0Var.f15176w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                u0Var.f15170c = false;
                u0Var.d();
                t0 t0Var2 = u0Var.f15173n;
                if (t0Var2 != null) {
                    t0Var2.a();
                    u0Var.f15173n = null;
                }
                t0 t0Var3 = new t0(u0Var.getContext());
                u0Var.f15173n = t0Var3;
                t0Var3.b(2131624056, 2500, hd.N0("PhotoSavedHint"));
                u0Var.f15169b.addView(u0Var.f15173n);
                u0Var.f15176w = uri2;
                return;
        }
    }
}
