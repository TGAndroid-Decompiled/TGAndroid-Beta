package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class sa2 implements ln5 {
    public boolean a;
    public final y41 b;
    public final a51 c;

    public sa2(a51 a51Var, y41 y41Var) {
        this.c = a51Var;
        this.b = y41Var;
    }

    @Override
    public final void B0(int i, Drawable drawable) {
        p09 p09Var;
        dl0 dl0Var;
        if (!this.a) {
            if ((i == 0 || i == 3) && drawable != null) {
                this.a = true;
                boolean z = drawable instanceof p09;
                y41 y41Var = this.b;
                if (z && (dl0Var = (p09Var = (p09) drawable).C0) != null && dl0Var.g()) {
                    p09Var.B0 = new ra2(this, y41Var, (byte) 0);
                    return;
                }
                this.c.d();
                y41Var.run();
            }
        }
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }
}
