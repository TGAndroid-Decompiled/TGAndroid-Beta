package gi;

import android.net.Uri;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
public final class p0 implements u10 {
    public final int f13354a;
    public final t0 f13355b;

    public p0(t0 t0Var, int i3) {
        this.f13354a = i3;
        this.f13355b = t0Var;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f13354a;
        t0 t0Var = this.f13355b;
        switch (i3) {
            case 0:
                Float f10 = (Float) obj;
                s0 s0Var = t0Var.f13595n;
                if (s0Var != null) {
                    s0Var.setProgress(f10.floatValue());
                    return;
                }
                return;
            case 1:
                Uri uri = (Uri) obj;
                if (t0Var.f13592c && t0Var.f13596r != null) {
                    t0Var.f13595n.b(2131624055, 3500, bd.N0("VideoSavedHint"));
                    t0Var.f13592c = false;
                    t0Var.d();
                    t0Var.f13598w = uri;
                    return;
                }
                return;
            default:
                Uri uri2 = (Uri) obj;
                t0Var.f13592c = false;
                t0Var.d();
                s0 s0Var2 = t0Var.f13595n;
                if (s0Var2 != null) {
                    s0Var2.a();
                    t0Var.f13595n = null;
                }
                s0 s0Var3 = new s0(t0Var.getContext());
                t0Var.f13595n = s0Var3;
                s0Var3.b(2131624055, 2500, bd.N0("PhotoSavedHint"));
                t0Var.f13591b.addView(t0Var.f13595n);
                t0Var.f13598w = uri2;
                return;
        }
    }
}
