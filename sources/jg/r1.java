package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.vw0;
public final class r1 extends vw0 {
    public final int f15824l0;

    public r1(Context context, j5 j5Var, int i10) {
        super(context, j5Var);
        this.f15824l0 = i10;
    }

    @Override
    public boolean O() {
        switch (this.f15824l0) {
            case 2:
                return false;
            case 3:
                return false;
            case 4:
            default:
                return super.O();
            case 5:
                return false;
        }
    }

    @Override
    public void addView(View view) {
        switch (this.f15824l0) {
            case 4:
                if (view instanceof sz) {
                    ViewGroup.LayoutParams layoutParams = ((sz) view).getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams).gravity = 87;
                    }
                    view.setLayoutParams(layoutParams);
                }
                super.addView(view);
                return;
            default:
                super.addView(view);
                return;
        }
    }

    @Override
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: jg.r1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f15824l0) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
