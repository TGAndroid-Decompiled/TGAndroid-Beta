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
public final class ii7 extends FrameLayout {
    public final lm a;
    public final Paint b;
    public final Path c;
    public float d;
    public final ki7 e;

    public ii7(ki7 ki7Var, Context context) {
        super(context);
        this.e = ki7Var;
        this.a = new lm(250L, this, s33.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(bkb.v0(bkb.g5, ki7Var.J0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v0;
        float f;
        ki7 ki7Var = this.e;
        Integer num = ki7Var.p1;
        if (num != null) {
            v0 = num.intValue();
        } else {
            v0 = bkb.v0(bkb.g5, ki7Var.J0);
        }
        Paint paint = this.b;
        paint.setColor(v0);
        View[] viewPages = ki7Var.l1.getViewPages();
        float f2 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f3 = this.d;
                if (view instanceof ji7) {
                    ji7 ji7Var = (ji7) view;
                    f = Math.max(0.0f, ji7Var.getHeight() - ji7Var.a.getMeasuredHeight());
                } else {
                    f = 0.0f;
                }
                this.d = (f * i) + f3;
                view.getVisibility();
            }
        }
        if (this.d <= gl.m) {
            f2 = 1.0f;
        }
        float e = this.a.e(false, f2);
        float max = Math.max(gl.m, this.d) - (gl.m * e);
        this.d = max;
        RectF rectF = gl.P;
        rectF.set(ki7Var.u0, max, getWidth() - ki7Var.u0, gl.L(8.0f) + getHeight());
        float U1 = gl.U1(e, gl.L(14.0f), 0);
        canvas.drawRoundRect(rectF, U1, U1, paint);
        if (ki7Var.F != null) {
            ki7Var.F.setTranslationY(Math.max((ki7Var.b.getY() + this.d) + ki7Var.t0, ki7Var.F.getHeight() + (gl.L(56.0f) + gl.m)) - ki7Var.F.getBottom());
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
        ki7 ki7Var = this.e;
        FrameLayout frameLayout = ki7Var.o1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
            i3 = ki7Var.o1.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        ki7Var.l1.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i3), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
