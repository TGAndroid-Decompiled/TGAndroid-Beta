package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class kk7 extends FrameLayout {
    public final ln a;
    public final Paint b;
    public final Path c;
    public float d;
    public final mk7 e;

    public kk7(mk7 mk7Var, Context context) {
        super(context);
        this.e = mk7Var;
        this.a = new ln(250L, this, d53.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(cmb.v0(cmb.g5, mk7Var.J0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v0;
        float f;
        mk7 mk7Var = this.e;
        Integer num = mk7Var.p1;
        if (num != null) {
            v0 = num.intValue();
        } else {
            v0 = cmb.v0(cmb.g5, mk7Var.J0);
        }
        Paint paint = this.b;
        paint.setColor(v0);
        View[] viewPages = mk7Var.l1.getViewPages();
        float f2 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f3 = this.d;
                if (view instanceof lk7) {
                    lk7 lk7Var = (lk7) view;
                    f = Math.max(0.0f, lk7Var.getHeight() - lk7Var.a.getMeasuredHeight());
                } else {
                    f = 0.0f;
                }
                this.d = (f * i) + f3;
                view.getVisibility();
            }
        }
        if (this.d <= gm.m) {
            f2 = 1.0f;
        }
        float e = this.a.e(false, f2);
        float max = Math.max(gm.m, this.d) - (gm.m * e);
        this.d = max;
        RectF rectF = gm.P;
        rectF.set(mk7Var.u0, max, getWidth() - mk7Var.u0, gm.L(8.0f) + getHeight());
        float U1 = gm.U1(e, gm.L(14.0f), 0);
        canvas.drawRoundRect(rectF, U1, U1, paint);
        if (mk7Var.F != null) {
            mk7Var.F.setTranslationY(Math.max((mk7Var.b.getY() + this.d) + mk7Var.t0, mk7Var.F.getHeight() + (gm.L(56.0f) + gm.m)) - mk7Var.F.getBottom());
        }
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        mk7 mk7Var = this.e;
        FrameLayout frameLayout = mk7Var.o1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
            i3 = mk7Var.o1.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        mk7Var.l1.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i3), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
