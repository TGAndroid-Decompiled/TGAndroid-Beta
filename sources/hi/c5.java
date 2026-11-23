package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class c5 extends FrameLayout {
    public final int f14268a;
    public final pa f14269b;

    public c5(pa paVar, Context context, int i7) {
        super(context);
        this.f14268a = i7;
        switch (i7) {
            case 1:
                this.f14269b = paVar;
                super(context);
                return;
            default:
                this.f14269b = paVar;
                setWillNotDraw(false);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f14268a) {
            case 1:
                if (this.f14269b.f15554a2) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f14268a) {
            case 0:
                super.onDraw(canvas);
                pa paVar = this.f14269b;
                Paint paint = paVar.f15555b1;
                tg.j1 j1Var = paVar.V0;
                paint.setAlpha((int) ((1.0f - paVar.f15559d1) * j1Var.getAlpha() * 20.0f));
                RectF rectF = org.telegram.messenger.g0.P;
                j1Var.b(rectF);
                r5 r5Var = paVar.D0;
                int top = r5Var.getTop();
                float translationY = j1Var.getTranslationY() + r5Var.getTranslationY() + j1Var.getTop() + top;
                float f10 = rectF.left;
                tg.o1 o1Var = paVar.W0;
                rectF.set(org.telegram.messenger.g0.T1(f10, o1Var.getLeft(), paVar.f15559d1), org.telegram.messenger.g0.T1(rectF.top + translationY, o1Var.getTop() - o1Var.getTranslationY(), paVar.f15559d1), org.telegram.messenger.g0.T1(rectF.right, o1Var.getRight(), paVar.f15559d1), org.telegram.messenger.g0.T1(translationY + rectF.bottom, o1Var.getBottom() - o1Var.getTranslationY(), paVar.f15559d1));
                float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(paVar.f15559d1, 32, 16));
                Paint paint2 = paVar.f15557c1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * paVar.f15559d1));
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
        switch (this.f14268a) {
            case 0:
                if (motionEvent.getActionMasked() == 0) {
                    pa paVar = this.f14269b;
                    if (paVar.f15560e1) {
                        paVar.P0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
