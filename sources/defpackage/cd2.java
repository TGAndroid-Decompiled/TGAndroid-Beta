package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public abstract class cd2 extends FrameLayout {
    public vec a;
    public float b;
    public boolean c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z);

    public final void b(boolean z) {
        float f;
        this.c = z;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            this.e = null;
            valueAnimator.cancel();
        }
        if (z) {
            setVisibility(0);
        }
        float f2 = this.d;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new uz1(this, (byte) 7));
        this.e.setInterpolator(s33.h);
        this.e.setDuration(320L);
        this.e.addListener(new y7((byte) 19, this, z));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.b);
    }

    @Override
    public final boolean isShown() {
        return this.c;
    }

    public void setShown(float f) {
        this.b = f;
        vec vecVar = this.a;
        if (vecVar != null) {
            vecVar.setPivotX(vecVar.getWidth() / 2.0f);
            this.a.setPivotY(0.0f);
            this.a.setScaleX(gl.R1(0.8f, 1.0f, f));
            this.a.setScaleY(gl.R1(0.8f, 1.0f, f));
        }
        setAlpha(f);
        invalidate();
    }

    public void setTabs(vec vecVar) {
        this.a = vecVar;
        addView(vecVar, nme.c(-1.0f, -1));
    }
}
