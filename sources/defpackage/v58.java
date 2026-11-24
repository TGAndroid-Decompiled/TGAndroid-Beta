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
public final class v58 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public final Activity c;
    public final d68 d;

    public v58(d68 d68Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = d68Var;
        this.c = activity2;
        this.a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        d68 d68Var = this.d;
        Paint paint = d68Var.u1;
        int i = d68Var.v1 - d68Var.t0;
        int L = gm.L(30.0f) + getMeasuredHeight() + d68Var.t0;
        float L2 = gm.L(12.0f);
        int i2 = d68Var.t0;
        if (i + i2 < L2) {
            f = 1.0f - Math.min(1.0f, ((L2 - i) - i2) / L2);
        } else {
            f = 1.0f;
        }
        int i3 = gm.m;
        int i4 = i + i3;
        d68Var.s0.setBounds(0, i4, getMeasuredWidth(), L - i3);
        d68Var.s0.draw(canvas);
        if (f != 1.0f) {
            paint.setColor(cmb.v0(cmb.g5, d68Var.J0));
            int i5 = d68Var.t0 + i4;
            RectF rectF = this.a;
            rectF.set(d68Var.u0, d68Var.t0 + i4, getMeasuredWidth() - d68Var.u0, gm.L(24.0f) + i5);
            float f2 = L2 * f;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
        int v0 = cmb.v0(cmb.g5, d68Var.J0);
        paint.setColor(Color.argb((int) (d68Var.o1.getAlpha() * 255.0f), (int) (Color.red(v0) * 0.8f), (int) (Color.green(v0) * 0.8f), (int) (Color.blue(v0) * 0.8f)));
        canvas.drawRect(d68Var.u0, 0.0f, getMeasuredWidth() - d68Var.u0, gm.m, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            d68 d68Var = this.d;
            if (d68Var.v1 != 0 && motionEvent.getY() < d68Var.v1 && d68Var.o1.getAlpha() == 0.0f) {
                d68Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        d68 d68Var = this.d;
        d68Var.t1 = true;
        super.onLayout(z, i, i2, i3, i4);
        d68Var.t1 = false;
        d68Var.E0(false);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2);
        this.b = true;
        d68 d68Var = this.d;
        w58 w58Var = d68Var.m1;
        int i4 = d68Var.u0;
        setPadding(i4, gm.m, i4, 0);
        this.b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i);
        ((FrameLayout.LayoutParams) d68Var.p1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        this.b = true;
        int L = gm.L(80.0f);
        lj4 lj4Var = d68Var.l1;
        int i5 = ((d68) lj4Var.a).y1;
        for (int i6 = 0; i6 < i5; i6++) {
            ViewGroup k = lj4Var.k(this.c, i6);
            k.measure(i, 0);
            L += k.getMeasuredHeight();
        }
        if (L < paddingTop) {
            i3 = paddingTop - L;
        } else {
            i3 = paddingTop / 5;
        }
        if (w58Var.getPaddingTop() != i3) {
            w58Var.getPaddingTop();
            w58Var.setPadding(0, i3, 0, 0);
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
