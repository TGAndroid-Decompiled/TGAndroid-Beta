package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mv7 implements Runnable {
    public final byte a;
    public final yv7 b;

    public mv7(yv7 yv7Var, byte b) {
        this.a = b;
        this.b = yv7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yv7 yv7Var = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = yv7Var.r;
                if (!yv7Var.Q && yv7Var.isAttachedToWindow() && yv7Var.y.getVisibility() != 0 && editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    gl.E3(editTextBoldCursor);
                    return;
                }
                return;
            default:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(yv7Var.b0, 0.0f);
                yv7Var.T = ofFloat;
                ofFloat.addUpdateListener(new nv7(yv7Var, (byte) 1));
                ofFloat.addListener(new v85(yv7Var, (byte) 24));
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(s33.h);
                ofFloat.start();
                return;
        }
    }
}
