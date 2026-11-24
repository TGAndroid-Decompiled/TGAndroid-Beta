package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public abstract class o75 extends FrameLayout {
    public int a;
    public r95 b;
    public h85 c;
    public gc2 d;
    public boolean e;
    public final boolean f;

    public o75(Context context, boolean z) {
        super(context);
        this.f = z;
    }

    public float getItemHeight() {
        int measuredHeight;
        r95 r95Var = this.b;
        if (r95Var != null) {
            measuredHeight = r95Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public gc2 getParticipant() {
        return this.d;
    }

    public h85 getRenderer() {
        return this.c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int i3;
        float f2;
        if (this.f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.b.F(), 1073741824));
            return;
        }
        if (h75.u5) {
            f = 3.0f;
        } else {
            f = 2.0f;
        }
        int L = gl.q.x - (gl.L(14.0f) << 1);
        if (h75.u5) {
            i3 = -gl.L(90.0f);
        } else {
            i3 = 0;
        }
        float f3 = L + i3;
        if (h75.v5) {
            f2 = f3 / 2.0f;
        } else {
            f2 = f3 / f;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (f2 + gl.L(4.0f)), 1073741824));
    }

    public void setRenderer(h85 h85Var) {
        this.c = h85Var;
    }
}
