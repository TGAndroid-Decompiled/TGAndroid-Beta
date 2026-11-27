package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class w92 implements on5 {
    public boolean a;
    public final z31 b;
    public final b41 c;

    public w92(b41 b41Var, z31 z31Var) {
        this.c = b41Var;
        this.b = z31Var;
    }

    @Override
    public final void z(int i, Drawable drawable) {
        b29 b29Var;
        ek0 ek0Var;
        if (!this.a) {
            if ((i == 0 || i == 3) && drawable != null) {
                this.a = true;
                boolean z = drawable instanceof b29;
                z31 z31Var = this.b;
                if (z && (ek0Var = (b29Var = (b29) drawable).C0) != null && ek0Var.g()) {
                    b29Var.B0 = new dy1(this, z31Var, (byte) 28);
                    return;
                }
                this.c.d();
                z31Var.run();
            }
        }
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }
}
