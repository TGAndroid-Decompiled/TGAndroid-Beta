package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class v4 extends FrameLayout {
    public final int f12920a;
    public final x9 f12921b;

    public v4(x9 x9Var, Context context, int i7) {
        super(context);
        this.f12920a = i7;
        switch (i7) {
            case 1:
                this.f12921b = x9Var;
                super(context);
                return;
            default:
                this.f12921b = x9Var;
                setWillNotDraw(false);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f12920a) {
            case 1:
                if (this.f12921b.V1) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f12920a) {
            case 0:
                super.onDraw(canvas);
                x9 x9Var = this.f12921b;
                Paint paint = x9Var.f12514a1;
                tg.e1 e1Var = x9Var.U0;
                paint.setAlpha((int) ((1.0f - x9Var.f12518c1) * e1Var.getAlpha() * 20.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                e1Var.b(rectF);
                k5 k5Var = x9Var.C0;
                int top = k5Var.getTop();
                float translationY = e1Var.getTranslationY() + k5Var.getTranslationY() + e1Var.getTop() + top;
                float f10 = rectF.left;
                tg.j1 j1Var = x9Var.V0;
                rectF.set(org.telegram.messenger.g0.T1(f10, j1Var.getLeft(), x9Var.f12518c1), org.telegram.messenger.g0.T1(rectF.top + translationY, j1Var.getTop() - j1Var.getTranslationY(), x9Var.f12518c1), org.telegram.messenger.g0.T1(rectF.right, j1Var.getRight(), x9Var.f12518c1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, j1Var.getBottom() - j1Var.getTranslationY(), x9Var.f12518c1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(x9Var.f12518c1, 32, 16));
                Paint paint2 = x9Var.f12516b1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * x9Var.f12518c1));
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
        switch (this.f12920a) {
            case 0:
                if (motionEvent.getActionMasked() == 0) {
                    x9 x9Var = this.f12921b;
                    if (x9Var.f12520d1) {
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
