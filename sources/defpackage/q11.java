package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class q11 extends z11 {
    private p11 button;
    private int childrenMeasuredWidth;
    vnb resourcesProvider;
    public o21 timerView;
    private boolean wrapWidth;

    public q11(Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.resourcesProvider = vnbVar;
    }

    public p11 getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        p11 p11Var = this.button;
        if (p11Var != null && view != p11Var) {
            i2 = c00.A(12.0f, p11Var.getMeasuredWidth(), i2);
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
        if (view != this.button) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            this.childrenMeasuredWidth = Math.max(this.childrenMeasuredWidth, view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        this.childrenMeasuredWidth = 0;
        if (this.wrapWidth) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.button != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(this.button.getMeasuredWidth() + this.childrenMeasuredWidth, getMeasuredHeight());
        }
    }

    public void setButton(p11 p11Var) {
        p11 p11Var2 = this.button;
        if (p11Var2 != null) {
            removeCallback(p11Var2);
            removeView(this.button);
        }
        this.button = p11Var;
        if (p11Var != null) {
            addCallback(p11Var);
            addView(p11Var, 0, tre.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        o21 o21Var = new o21(getContext(), this.resourcesProvider);
        this.timerView = o21Var;
        o21Var.b = 5000L;
        addView(o21Var, tre.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
