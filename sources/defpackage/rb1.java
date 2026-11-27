package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class rb1 implements Runnable {
    public final byte a;
    public final ub1 b;

    public rb1(ub1 ub1Var, byte b) {
        this.a = b;
        this.b = ub1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ub1 ub1Var = this.b;
        switch (b) {
            case 0:
                if (ub1Var.o1) {
                    ub1Var.o1 = false;
                    ub1Var.invalidate();
                    return;
                }
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.d9;
                ub1Var.setVisibility(8);
                return;
        }
    }
}
