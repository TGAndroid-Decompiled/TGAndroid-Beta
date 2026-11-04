package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class t4 extends FrameLayout {
    public final int f13611a;
    public final x9 f13612b;

    public t4(x9 x9Var, Context context, int i3) {
        super(context);
        this.f13611a = i3;
        switch (i3) {
            case 1:
                this.f13612b = x9Var;
                super(context);
                return;
            default:
                this.f13612b = x9Var;
                setWillNotDraw(false);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f13611a) {
            case 1:
                if (this.f13612b.W1) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f13611a) {
            case 0:
                super.onDraw(canvas);
                x9 x9Var = this.f13612b;
                Paint paint = x9Var.f13198b1;
                ug.d1 d1Var = x9Var.V0;
                paint.setAlpha((int) ((1.0f - x9Var.f13201d1) * d1Var.getAlpha() * 20.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                d1Var.b(rectF);
                i5 i5Var = x9Var.D0;
                int top = i5Var.getTop();
                float translationY = d1Var.getTranslationY() + i5Var.getTranslationY() + d1Var.getTop() + top;
                float f10 = rectF.left;
                ug.i1 i1Var = x9Var.W0;
                rectF.set(org.telegram.messenger.g0.T1(f10, i1Var.getLeft(), x9Var.f13201d1), org.telegram.messenger.g0.T1(rectF.top + translationY, i1Var.getTop() - i1Var.getTranslationY(), x9Var.f13201d1), org.telegram.messenger.g0.T1(rectF.right, i1Var.getRight(), x9Var.f13201d1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, i1Var.getBottom() - i1Var.getTranslationY(), x9Var.f13201d1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(x9Var.f13201d1, 32, 16));
                Paint paint2 = x9Var.f13200c1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * x9Var.f13201d1));
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
        switch (this.f13611a) {
            case 0:
                if (motionEvent.getActionMasked() == 0) {
                    x9 x9Var = this.f13612b;
                    if (x9Var.f13203e1) {
                        x9Var.M0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
