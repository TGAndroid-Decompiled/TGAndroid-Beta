package hi;

import android.net.Uri;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
public final class r0 implements x10 {
    public final int f15309a;
    public final v0 f15310b;

    public r0(v0 v0Var, int i7) {
        this.f15309a = i7;
        this.f15310b = v0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f15309a;
        v0 v0Var = this.f15310b;
        switch (i7) {
            case 0:
                Float f10 = (Float) obj;
                u0 u0Var = v0Var.f15564n;
                if (u0Var != null) {
                    u0Var.setProgress(f10.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (v0Var.f15561c && v0Var.f15565r != null) {
                    v0Var.f15564n.b(2131624056, 3500, gd.N0("VideoSavedHint"));
                    v0Var.f15561c = false;
                    v0Var.d();
                    v0Var.f15567w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                v0Var.f15561c = false;
                v0Var.d();
                u0 u0Var2 = v0Var.f15564n;
                if (u0Var2 != null) {
                    u0Var2.a();
                    v0Var.f15564n = null;
                }
                u0 u0Var3 = new u0(v0Var.getContext());
                v0Var.f15564n = u0Var3;
                u0Var3.b(2131624056, 2500, gd.N0("PhotoSavedHint"));
                v0Var.f15560b.addView(v0Var.f15564n);
                v0Var.f15567w = uri2;
                return;
        }
    }
}
