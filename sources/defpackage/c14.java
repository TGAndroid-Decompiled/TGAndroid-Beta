package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
public final class c14 extends ImageView {
    public int a;
    public vl b;
    public boolean c;
    public gm d;
    public h04 e;
    public final il5[] f;
    public float h;
    public ValueAnimator n;

    public c14(Context context) {
        super(context);
        this.f = new il5[2];
        setScaleType(ImageView.ScaleType.CENTER);
        int i = bkb.h6;
        ff0 Y = bkb.Y(bkb.w0(null, i, false), gl.L(2.0f), gl.L(2.0f));
        vkb M = zkb.M(i);
        setBackground(Y);
        zkb.j(this, Y, null, M, null);
    }

    public final void a(ru3 ru3Var, boolean z) {
        setImageDrawable(ru3Var);
        this.c = z;
    }

    public gm getSpan() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f = this.h;
            if (f != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / gl.r) / 100.0f) + f;
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
                    ofFloat.addUpdateListener(new uz1(this, (byte) 23));
                    this.n.addListener(new im2(this, (byte) 18));
                    b00.n(5.0f, this.n);
                    this.n.setDuration(350L);
                    this.n.start();
                }
            }
        }
    }

    public void setSpan(gm gmVar) {
        this.d = gmVar;
    }
}
