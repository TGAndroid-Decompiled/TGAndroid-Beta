package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public abstract class q95 extends FrameLayout {
    public int a;
    public sb5 b;
    public ka5 c;
    public wc2 d;
    public boolean e;
    public final boolean f;

    public q95(Context context, boolean z) {
        super(context);
        this.f = z;
    }

    public float getItemHeight() {
        int measuredHeight;
        sb5 sb5Var = this.b;
        if (sb5Var != null) {
            measuredHeight = sb5Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public wc2 getParticipant() {
        return this.d;
    }

    public ka5 getRenderer() {
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
        if (j95.u5) {
            f = 3.0f;
        } else {
            f = 2.0f;
        }
        int L = hl.q.x - (hl.L(14.0f) << 1);
        if (j95.u5) {
            i3 = -hl.L(90.0f);
        } else {
            i3 = 0;
        }
        float f3 = L + i3;
        if (j95.v5) {
            f2 = f3 / 2.0f;
        } else {
            f2 = f3 / f;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (f2 + hl.L(4.0f)), 1073741824));
    }

    public void setRenderer(ka5 ka5Var) {
        this.c = ka5Var;
    }
}
