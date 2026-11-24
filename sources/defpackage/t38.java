package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class t38 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public final Activity c;
    public final b48 d;

    public t38(b48 b48Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = b48Var;
        this.c = activity2;
        this.a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        b48 b48Var = this.d;
        Paint paint = b48Var.u1;
        int i = b48Var.v1 - b48Var.t0;
        int L = gl.L(30.0f) + getMeasuredHeight() + b48Var.t0;
        float L2 = gl.L(12.0f);
        int i2 = b48Var.t0;
        if (i + i2 < L2) {
            f = 1.0f - Math.min(1.0f, ((L2 - i) - i2) / L2);
        } else {
            f = 1.0f;
        }
        int i3 = gl.m;
        int i4 = i + i3;
        b48Var.s0.setBounds(0, i4, getMeasuredWidth(), L - i3);
        b48Var.s0.draw(canvas);
        if (f != 1.0f) {
            paint.setColor(bkb.v0(bkb.g5, b48Var.J0));
            int i5 = b48Var.t0 + i4;
            RectF rectF = this.a;
            rectF.set(b48Var.u0, b48Var.t0 + i4, getMeasuredWidth() - b48Var.u0, gl.L(24.0f) + i5);
            float f2 = L2 * f;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
        int v0 = bkb.v0(bkb.g5, b48Var.J0);
        paint.setColor(Color.argb((int) (b48Var.o1.getAlpha() * 255.0f), (int) (Color.red(v0) * 0.8f), (int) (Color.green(v0) * 0.8f), (int) (Color.blue(v0) * 0.8f)));
        canvas.drawRect(b48Var.u0, 0.0f, getMeasuredWidth() - b48Var.u0, gl.m, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            b48 b48Var = this.d;
            if (b48Var.v1 != 0 && motionEvent.getY() < b48Var.v1 && b48Var.o1.getAlpha() == 0.0f) {
                b48Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b48 b48Var = this.d;
        b48Var.t1 = true;
        super.onLayout(z, i, i2, i3, i4);
        b48Var.t1 = false;
        b48Var.E0(false);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2);
        this.b = true;
        b48 b48Var = this.d;
        u38 u38Var = b48Var.m1;
        int i4 = b48Var.u0;
        setPadding(i4, gl.m, i4, 0);
        this.b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i);
        ((FrameLayout.LayoutParams) b48Var.p1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        this.b = true;
        int L = gl.L(80.0f);
        gi3 gi3Var = b48Var.l1;
        int i5 = ((b48) gi3Var.a).y1;
        for (int i6 = 0; i6 < i5; i6++) {
            ViewGroup p = gi3Var.p(this.c, i6);
            p.measure(i, 0);
            L += p.getMeasuredHeight();
        }
        if (L < paddingTop) {
            i3 = paddingTop - L;
        } else {
            i3 = paddingTop / 5;
        }
        if (u38Var.getPaddingTop() != i3) {
            u38Var.getPaddingTop();
            u38Var.setPadding(0, i3, 0, 0);
        }
        this.b = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}
