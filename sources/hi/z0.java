package hi;

import android.net.Uri;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
public final class z0 implements w10 {
    public final int f15889a;
    public final d1 f15890b;

    public z0(d1 d1Var, int i7) {
        this.f15889a = i7;
        this.f15890b = d1Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f15889a;
        d1 d1Var = this.f15890b;
        switch (i7) {
            case 0:
                Float f10 = (Float) obj;
                c1 c1Var = d1Var.f14301n;
                if (c1Var != null) {
                    c1Var.setProgress(f10.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (d1Var.f14298c && d1Var.f14302r != null) {
                    d1Var.f14301n.b(2131624056, 3500, gd.O0("VideoSavedHint"));
                    d1Var.f14298c = false;
                    d1Var.d();
                    d1Var.f14304w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                d1Var.f14298c = false;
                d1Var.d();
                c1 c1Var2 = d1Var.f14301n;
                if (c1Var2 != null) {
                    c1Var2.a();
                    d1Var.f14301n = null;
                }
                c1 c1Var3 = new c1(d1Var.getContext());
                d1Var.f14301n = c1Var3;
                c1Var3.b(2131624056, 2500, gd.O0("PhotoSavedHint"));
                d1Var.f14297b.addView(d1Var.f14301n);
                d1Var.f14304w = uri2;
                return;
        }
    }
}
