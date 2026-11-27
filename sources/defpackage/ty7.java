package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ty7 implements Runnable {
    public final byte a;
    public final fz7 b;

    public ty7(fz7 fz7Var, byte b) {
        this.a = b;
        this.b = fz7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fz7 fz7Var = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = fz7Var.r;
                if (!fz7Var.Q && fz7Var.isAttachedToWindow() && fz7Var.y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    hl.E3(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fz7Var.b0, 0.0f);
                fz7Var.T = ofFloat;
                ofFloat.addUpdateListener(new uy7(fz7Var, (byte) 0));
                ofFloat.addListener(new ad5(fz7Var, (byte) 23));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(k43.h);
                ofFloat.start();
                return;
        }
    }
}
