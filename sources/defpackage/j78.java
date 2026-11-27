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
public final class j78 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public final Activity c;
    public final r78 d;

    public j78(r78 r78Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = r78Var;
        this.c = activity2;
        this.a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        r78 r78Var = this.d;
        Paint paint = r78Var.u1;
        int i = r78Var.v1 - r78Var.t0;
        int L = hl.L(30.0f) + getMeasuredHeight() + r78Var.t0;
        float L2 = hl.L(12.0f);
        int i2 = r78Var.t0;
        if (i + i2 < L2) {
            f = 1.0f - Math.min(1.0f, ((L2 - i) - i2) / L2);
        } else {
            f = 1.0f;
        }
        int i3 = hl.m;
        int i4 = i + i3;
        r78Var.s0.setBounds(0, i4, getMeasuredWidth(), L - i3);
        r78Var.s0.draw(canvas);
        if (f != 1.0f) {
            paint.setColor(aob.v0(aob.h5, r78Var.J0));
            int i5 = r78Var.t0 + i4;
            RectF rectF = this.a;
            rectF.set(r78Var.u0, r78Var.t0 + i4, getMeasuredWidth() - r78Var.u0, hl.L(24.0f) + i5);
            float f2 = L2 * f;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
        int v0 = aob.v0(aob.h5, r78Var.J0);
        paint.setColor(Color.argb((int) (r78Var.o1.getAlpha() * 255.0f), (int) (Color.red(v0) * 0.8f), (int) (Color.green(v0) * 0.8f), (int) (Color.blue(v0) * 0.8f)));
        canvas.drawRect(r78Var.u0, 0.0f, getMeasuredWidth() - r78Var.u0, hl.m, paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            r78 r78Var = this.d;
            if (r78Var.v1 != 0 && motionEvent.getY() < r78Var.v1 && r78Var.o1.getAlpha() == 0.0f) {
                r78Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        r78 r78Var = this.d;
        r78Var.t1 = true;
        super.onLayout(z, i, i2, i3, i4);
        r78Var.t1 = false;
        r78Var.F0(false);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2);
        this.b = true;
        r78 r78Var = this.d;
        k78 k78Var = r78Var.m1;
        int i4 = r78Var.u0;
        setPadding(i4, hl.m, i4, 0);
        this.b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i);
        ((FrameLayout.LayoutParams) r78Var.p1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        this.b = true;
        int L = hl.L(80.0f);
        xh4 xh4Var = r78Var.l1;
        int i5 = ((r78) xh4Var.b).y1;
        for (int i6 = 0; i6 < i5; i6++) {
            ViewGroup y = xh4Var.y(this.c, i6);
            y.measure(i, 0);
            L += y.getMeasuredHeight();
        }
        if (L < paddingTop) {
            i3 = paddingTop - L;
        } else {
            i3 = paddingTop / 5;
        }
        if (k78Var.getPaddingTop() != i3) {
            k78Var.getPaddingTop();
            k78Var.setPadding(0, i3, 0, 0);
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
