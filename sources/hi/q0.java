package hi;

import android.net.Uri;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
public final class q0 implements y10 {
    public final int f15213a;
    public final u0 f15214b;

    public q0(u0 u0Var, int i7) {
        this.f15213a = i7;
        this.f15214b = u0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f15213a;
        u0 u0Var = this.f15214b;
        switch (i7) {
            case 0:
                Float f10 = (Float) obj;
                t0 t0Var = u0Var.f15483n;
                if (t0Var != null) {
                    t0Var.setProgress(f10.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (u0Var.f15480c && u0Var.f15484r != null) {
                    u0Var.f15483n.b(2131624056, 3500, hd.O0("VideoSavedHint"));
                    u0Var.f15480c = false;
                    u0Var.d();
                    u0Var.f15486w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                u0Var.f15480c = false;
                u0Var.d();
                t0 t0Var2 = u0Var.f15483n;
                if (t0Var2 != null) {
                    t0Var2.a();
                    u0Var.f15483n = null;
                }
                t0 t0Var3 = new t0(u0Var.getContext());
                u0Var.f15483n = t0Var3;
                t0Var3.b(2131624056, 2500, hd.O0("PhotoSavedHint"));
                u0Var.f15479b.addView(u0Var.f15483n);
                u0Var.f15486w = uri2;
                return;
        }
    }
}
