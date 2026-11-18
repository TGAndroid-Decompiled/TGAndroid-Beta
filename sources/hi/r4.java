package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class r4 extends FrameLayout {
    public final int f15325a;
    public final v9 f15326b;

    public r4(v9 v9Var, Context context, int i7) {
        super(context);
        this.f15325a = i7;
        switch (i7) {
            case 1:
                this.f15326b = v9Var;
                super(context);
                return;
            default:
                this.f15326b = v9Var;
                setWillNotDraw(false);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f15325a) {
            case 1:
                if (this.f15326b.W1) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f15325a) {
            case 0:
                super.onDraw(canvas);
                v9 v9Var = this.f15326b;
                Paint paint = v9Var.f14898b1;
                tg.e1 e1Var = v9Var.V0;
                paint.setAlpha((int) ((1.0f - v9Var.f14902d1) * e1Var.getAlpha() * 20.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                e1Var.b(rectF);
                h5 h5Var = v9Var.D0;
                int top = h5Var.getTop();
                float translationY = e1Var.getTranslationY() + h5Var.getTranslationY() + e1Var.getTop() + top;
                float f10 = rectF.left;
                tg.j1 j1Var = v9Var.W0;
                rectF.set(org.telegram.messenger.g0.T1(f10, j1Var.getLeft(), v9Var.f14902d1), org.telegram.messenger.g0.T1(rectF.top + translationY, j1Var.getTop() - j1Var.getTranslationY(), v9Var.f14902d1), org.telegram.messenger.g0.T1(rectF.right, j1Var.getRight(), v9Var.f14902d1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, j1Var.getBottom() - j1Var.getTranslationY(), v9Var.f14902d1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(v9Var.f14902d1, 32, 16));
                Paint paint2 = v9Var.f14900c1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * v9Var.f14902d1));
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
        switch (this.f15325a) {
            case 0:
                if (motionEvent.getActionMasked() == 0) {
                    v9 v9Var = this.f15326b;
                    if (v9Var.f14903e1) {
                        v9Var.M0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
