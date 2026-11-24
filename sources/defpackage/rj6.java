package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public abstract class rj6 extends FrameLayout {
    public TextView a;
    public TextView b;
    public ty0 c;
    public long d;

    public final void a(ArrayList arrayList, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        TextView textView = this.b;
        ty0 ty0Var = this.c;
        super.setEnabled(z);
        TextView textView2 = this.a;
        float f5 = 0.5f;
        if (arrayList != null) {
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView2, "alpha", f3));
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ty0Var, "alpha", f4));
            if (z) {
                f5 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f5));
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        textView2.setAlpha(f);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        ty0Var.setAlpha(f2);
        if (z) {
            f5 = 1.0f;
        }
        textView.setAlpha(f5);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public long getSize() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (k96.a0) {
            L = 0.0f;
        } else {
            L = gl.L(20.0f);
        }
        float f = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (k96.a0) {
            i = gl.L(20.0f);
        } else {
            i = 0;
        }
        canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(80.0f));
        int measuredWidth = getMeasuredWidth() - gl.L(42.0f);
        TextView textView = this.b;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), 1073741824));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(b00.c(8.0f, measuredWidth - textView.getMeasuredWidth(), gl.L(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), 1073741824));
        this.c.measure(ug8.f(20.0f, getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSize(long j) {
        float max;
        float f;
        float f2;
        this.d = j;
        this.b.setText(k96.a0("AutodownloadSizeLimitUpTo", null, 2131753769, gl.i0(j, false, false)));
        long j2 = j - 512000;
        if (j2 < 536576) {
            f2 = Math.max(0.0f, ((float) j2) / 536576.0f) * 0.25f;
        } else {
            long j3 = j - 1048576;
            if (j3 < 9437184) {
                f2 = (Math.max(0.0f, ((float) j3) / 9437184.0f) * 0.25f) + 0.25f;
            } else {
                long j4 = j - 10485760;
                if (j4 < 94371840) {
                    max = Math.max(0.0f, ((float) j4) / 9.437184E7f) * 0.25f;
                    f = 0.5f;
                } else {
                    max = Math.max(0.0f, ((float) (j - 104857600)) / 1.9922944E9f) * 0.25f;
                    f = 0.75f;
                }
                f2 = max + f;
            }
        }
        this.c.setProgress(Math.min(1.0f, f2));
    }

    public void setText(String str) {
        this.a.setText(str);
    }
}
