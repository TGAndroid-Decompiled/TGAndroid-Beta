package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class iw3 implements ln5 {
    public final jw3 a;
    public final boolean b;
    public final k47 c;
    public final kw3 d;

    public iw3(kw3 kw3Var, jw3 jw3Var, boolean z, k47 k47Var) {
        this.d = kw3Var;
        this.a = jw3Var;
        this.b = z;
        this.c = k47Var;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
        k47 k47Var;
        if (this.b && (k47Var = this.c) != null && k47Var.F2() && imageReceiver.y() != null && imageReceiver.y().y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ImageReceiver imageReceiver2 = this.a.r;
        if (imageReceiver2.y() != null) {
            imageReceiver2.y().I(0, false, true);
        }
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }
}
