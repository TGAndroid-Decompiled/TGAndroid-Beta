package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class iv7 extends FrameLayout {
    public final byte a;
    public final z8b b;

    public iv7(z8b z8bVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 1:
                this.b = z8bVar;
                super(context);
                return;
            default:
                this.b = z8bVar;
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
                z8b z8bVar = this.b;
                Paint paint = z8bVar.h1;
                iu7 iu7Var = z8bVar.b1;
                paint.setAlpha((int) ((1.0f - z8bVar.j1) * iu7Var.getAlpha() * 20.0f));
                RectF rectF = gm.P;
                iu7Var.b(rectF);
                uv7 uv7Var = z8bVar.J0;
                int top = uv7Var.getTop();
                float translationY = iu7Var.getTranslationY() + uv7Var.getTranslationY() + iu7Var.getTop() + top;
                float f = rectF.left;
                tu7 tu7Var = z8bVar.c1;
                rectF.set(gm.R1(f, tu7Var.getLeft(), z8bVar.j1), gm.R1(rectF.top + translationY, tu7Var.getTop() - tu7Var.getTranslationY(), z8bVar.j1), gm.R1(rectF.right, tu7Var.getRight(), z8bVar.j1), gm.R1(translationY + rectF.bottom, tu7Var.getBottom() - tu7Var.getTranslationY(), z8bVar.j1));
                float L = gm.L(gm.U1(z8bVar.j1, 32, 16));
                Paint paint2 = z8bVar.i1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * z8bVar.j1));
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
                    z8b z8bVar = this.b;
                    if (z8bVar.k1) {
                        z8bVar.P0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
