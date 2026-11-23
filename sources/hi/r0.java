package hi;

import android.net.Uri;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
public final class r0 implements y10 {
    public final int f15319a;
    public final v0 f15320b;

    public r0(v0 v0Var, int i7) {
        this.f15319a = i7;
        this.f15320b = v0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f15319a;
        v0 v0Var = this.f15320b;
        switch (i7) {
            case 0:
                Float f10 = (Float) obj;
                u0 u0Var = v0Var.f15597n;
                if (u0Var != null) {
                    u0Var.setProgress(f10.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (v0Var.f15594c && v0Var.f15598r != null) {
                    v0Var.f15597n.b(2131624056, 3500, hd.O0("VideoSavedHint"));
                    v0Var.f15594c = false;
                    v0Var.d();
                    v0Var.f15600w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                v0Var.f15594c = false;
                v0Var.d();
                u0 u0Var2 = v0Var.f15597n;
                if (u0Var2 != null) {
                    u0Var2.a();
                    v0Var.f15597n = null;
                }
                u0 u0Var3 = new u0(v0Var.getContext());
                v0Var.f15597n = u0Var3;
                u0Var3.b(2131624056, 2500, hd.O0("PhotoSavedHint"));
                v0Var.f15593b.addView(v0Var.f15597n);
                v0Var.f15600w = uri2;
                return;
        }
    }
}
