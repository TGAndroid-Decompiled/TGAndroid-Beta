package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
public final class x14 extends ImageView {
    public int a;
    public wl b;
    public boolean c;
    public hm d;
    public c14 e;
    public final ln5[] f;
    public float h;
    public ValueAnimator n;

    public x14(Context context) {
        super(context);
        this.f = new ln5[2];
        setScaleType(ImageView.ScaleType.CENTER);
        int i = aob.i6;
        hf0 Y = aob.Y(aob.w0(null, i, false), hl.L(2.0f), hl.L(2.0f));
        uob M = yob.M(i);
        setBackground(Y);
        yob.j(this, Y, null, M, null);
    }

    public final void a(lv3 lv3Var, boolean z) {
        setImageDrawable(lv3Var);
        this.c = z;
    }

    public hm getSpan() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f = this.h;
            if (f != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / hl.r) / 100.0f) + f;
                this.h = min;
                this.h = Utilities.i(min, 1.0f, 0.0f);
                invalidate();
            }
        }
        float f2 = ((1.0f - this.h) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.view.View");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
    }

    @Override
    public void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (isPressed() != z) {
            super.setPressed(z);
            invalidate();
            if (z && (valueAnimator = this.n) != null) {
                valueAnimator.removeAllListeners();
                this.n.cancel();
            }
            if (!z) {
                float f = this.h;
                if (f != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.n = ofFloat;
                    ofFloat.addUpdateListener(new az1(this, (byte) 24));
                    this.n.addListener(new cn2(this, (byte) 18));
                    c00.o(5.0f, this.n);
                    this.n.setDuration(350L);
                    this.n.start();
                }
            }
        }
    }

    public void setSpan(hm hmVar) {
        this.d = hmVar;
    }
}
