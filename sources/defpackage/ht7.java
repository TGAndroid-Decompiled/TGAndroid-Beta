package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class ht7 extends FrameLayout {
    public final byte a;
    public final x6b b;

    public ht7(x6b x6bVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 1:
                this.b = x6bVar;
                super(context);
                return;
            default:
                this.b = x6bVar;
                setWillNotDraw(false);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (this.b.g2) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                x6b x6bVar = this.b;
                Paint paint = x6bVar.h1;
                hs7 hs7Var = x6bVar.b1;
                paint.setAlpha((int) ((1.0f - x6bVar.j1) * hs7Var.getAlpha() * 20.0f));
                RectF rectF = gl.P;
                hs7Var.b(rectF);
                tt7 tt7Var = x6bVar.J0;
                int top = tt7Var.getTop();
                float translationY = hs7Var.getTranslationY() + tt7Var.getTranslationY() + hs7Var.getTop() + top;
                float f = rectF.left;
                ss7 ss7Var = x6bVar.c1;
                rectF.set(gl.R1(f, ss7Var.getLeft(), x6bVar.j1), gl.R1(rectF.top + translationY, ss7Var.getTop() - ss7Var.getTranslationY(), x6bVar.j1), gl.R1(rectF.right, ss7Var.getRight(), x6bVar.j1), gl.R1(translationY + rectF.bottom, ss7Var.getBottom() - ss7Var.getTranslationY(), x6bVar.j1));
                float L = gl.L(gl.U1(x6bVar.j1, 32, 16));
                Paint paint2 = x6bVar.i1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * x6bVar.j1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0) {
                    x6b x6bVar = this.b;
                    if (x6bVar.k1) {
                        x6bVar.P0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
