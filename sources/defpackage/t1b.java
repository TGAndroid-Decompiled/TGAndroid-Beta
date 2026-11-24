package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class t1b extends LinearLayout {
    public TextView a;
    public boolean b;

    @Override
    public final void onMeasure(int i, int i2) {
        View view;
        int measuredHeight;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        if (this.b && (view = (View) getParent()) != null && getMeasuredHeight() < (measuredHeight = ((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) - gm.L(24.0f))) {
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setIsLast(boolean z) {
        this.b = z;
        requestLayout();
    }
}
