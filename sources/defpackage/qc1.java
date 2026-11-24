package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class qc1 implements Runnable {
    public final byte a;
    public final tc1 b;

    public qc1(tc1 tc1Var, byte b) {
        this.a = b;
        this.b = tc1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tc1 tc1Var = this.b;
        switch (b) {
            case 0:
                if (tc1Var.o1) {
                    tc1Var.o1 = false;
                    tc1Var.invalidate();
                    return;
                }
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.d9;
                tc1Var.setVisibility(8);
                return;
        }
    }
}
