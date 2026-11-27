package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class rv3 implements on5 {
    public final sv3 a;
    public final boolean b;
    public final r47 c;
    public final tv3 d;

    public rv3(tv3 tv3Var, sv3 sv3Var, boolean z, r47 r47Var) {
        this.d = tv3Var;
        this.a = sv3Var;
        this.b = z;
        this.c = r47Var;
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
        r47 r47Var;
        if (this.b && (r47Var = this.c) != null && r47Var.F2() && imageReceiver.y() != null && imageReceiver.y().y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.y() != null) {
            imageReceiver2.y().I(0, false, true);
        }
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }
}
