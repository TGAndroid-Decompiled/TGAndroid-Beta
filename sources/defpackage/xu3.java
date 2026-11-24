package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class xu3 implements ll5 {
    public final yu3 a;
    public final boolean b;
    public final k27 c;
    public final zu3 d;

    public xu3(zu3 zu3Var, yu3 yu3Var, boolean z, k27 k27Var) {
        this.d = zu3Var;
        this.a = yu3Var;
        this.b = z;
        this.c = k27Var;
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.y() != null) {
            imageReceiver2.y().I(0, false, true);
        }
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
        k27 k27Var;
        if (this.b && (k27Var = this.c) != null && k27Var.F2() && imageReceiver.y() != null && imageReceiver.y().y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }
}
