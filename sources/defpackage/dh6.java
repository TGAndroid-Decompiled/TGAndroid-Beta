package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class dh6 extends AnimatorListenerAdapter {
    public final byte a;
    public final eh6 b;

    public dh6(eh6 eh6Var, byte b) {
        this.a = b;
        this.b = eh6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        eh6 eh6Var = this.b;
        switch (b) {
            case 0:
                if (hl.A1()) {
                    eh6Var.h.requestFocus();
                    return;
                }
                return;
            default:
                if (eh6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) eh6Var.getParent()).removeView(eh6Var);
                }
                eh6Var.c.setVisibility(0);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                eh6 eh6Var = this.b;
                eh6Var.c.setVisibility(8);
                int measuredWidth = (int) (eh6Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (eh6Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(aob.w0(null, aob.d6, false));
                eh6Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                eh6Var.d.setBackground(new BitmapDrawable(eh6Var.getContext().getResources(), createBitmap));
                eh6Var.d.setAlpha(0.0f);
                eh6Var.d.setVisibility(0);
                eh6Var.b.addView(eh6Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
