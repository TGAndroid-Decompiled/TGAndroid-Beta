package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public abstract class p21 extends y21 {
    private o21 button;
    private int childrenMeasuredWidth;
    ylb resourcesProvider;
    public n31 timerView;
    private boolean wrapWidth;

    public p21(Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.resourcesProvider = ylbVar;
    }

    public o21 getButton() {
        return this.button;
    }

    @Override
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        o21 o21Var = this.button;
        if (o21Var != null && view != o21Var) {
            i2 = b10.z(12.0f, o21Var.getMeasuredWidth(), i2);
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

    public void setButton(o21 o21Var) {
        o21 o21Var2 = this.button;
        if (o21Var2 != null) {
            removeCallback(o21Var2);
            removeView(this.button);
        }
        this.button = o21Var;
        if (o21Var != null) {
            addCallback(o21Var);
            addView(o21Var, 0, qoe.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        n31 n31Var = new n31(getContext(), this.resourcesProvider);
        this.timerView = n31Var;
        n31Var.b = 5000L;
        addView(n31Var, qoe.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
