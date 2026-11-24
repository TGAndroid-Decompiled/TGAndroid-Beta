package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public abstract class n95 extends FrameLayout {
    public int a;
    public pb5 b;
    public ha5 c;
    public rd2 d;
    public boolean e;
    public final boolean f;

    public n95(Context context, boolean z) {
        super(context);
        this.f = z;
    }

    public float getItemHeight() {
        int measuredHeight;
        pb5 pb5Var = this.b;
        if (pb5Var != null) {
            measuredHeight = pb5Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public rd2 getParticipant() {
        return this.d;
    }

    public ha5 getRenderer() {
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
        if (g95.u5) {
            f = 3.0f;
        } else {
            f = 2.0f;
        }
        int L = gm.q.x - (gm.L(14.0f) << 1);
        if (g95.u5) {
            i3 = -gm.L(90.0f);
        } else {
            i3 = 0;
        }
        float f3 = L + i3;
        if (g95.v5) {
            f2 = f3 / 2.0f;
        } else {
            f2 = f3 / f;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (f2 + gm.L(4.0f)), 1073741824));
    }

    public void setRenderer(ha5 ha5Var) {
        this.c = ha5Var;
    }
}
