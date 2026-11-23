package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class r4 extends FrameLayout {
    public final int f15331a;
    public final u9 f15332b;

    public r4(u9 u9Var, Context context, int i7) {
        super(context);
        this.f15331a = i7;
        switch (i7) {
            case 1:
                this.f15332b = u9Var;
                super(context);
                return;
            default:
                this.f15332b = u9Var;
                setWillNotDraw(false);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f15331a) {
            case 1:
                if (this.f15332b.W1) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f15331a) {
            case 0:
                super.onDraw(canvas);
                u9 u9Var = this.f15332b;
                Paint paint = u9Var.f14873b1;
                tg.f1 f1Var = u9Var.V0;
                paint.setAlpha((int) ((1.0f - u9Var.f14877d1) * f1Var.getAlpha() * 20.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                f1Var.b(rectF);
                g5 g5Var = u9Var.D0;
                int top = g5Var.getTop();
                float translationY = f1Var.getTranslationY() + g5Var.getTranslationY() + f1Var.getTop() + top;
                float f10 = rectF.left;
                tg.k1 k1Var = u9Var.W0;
                rectF.set(org.telegram.messenger.g0.T1(f10, k1Var.getLeft(), u9Var.f14877d1), org.telegram.messenger.g0.T1(rectF.top + translationY, k1Var.getTop() - k1Var.getTranslationY(), u9Var.f14877d1), org.telegram.messenger.g0.T1(rectF.right, k1Var.getRight(), u9Var.f14877d1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, k1Var.getBottom() - k1Var.getTranslationY(), u9Var.f14877d1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(u9Var.f14877d1, 32, 16));
                Paint paint2 = u9Var.f14875c1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * u9Var.f14877d1));
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
        switch (this.f15331a) {
            case 0:
                if (motionEvent.getActionMasked() == 0) {
                    u9 u9Var = this.f15332b;
                    if (u9Var.f14878e1) {
                        u9Var.M0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
