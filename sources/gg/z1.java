package gg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.rz;
public final class z1 extends aw0 {
    public final int f9105w0;

    public z1(Context context, f5 f5Var, int i10) {
        super(context, f5Var);
        this.f9105w0 = i10;
    }

    @Override
    public boolean P() {
        switch (this.f9105w0) {
            case 2:
                return false;
            case 3:
                return false;
            case 4:
            default:
                return super.P();
            case 5:
                return false;
        }
    }

    @Override
    public void addView(View view) {
        switch (this.f9105w0) {
            case 4:
                if (view instanceof rz) {
                    ViewGroup.LayoutParams layoutParams = ((rz) view).getLayoutParams();
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
        throw new UnsupportedOperationException("Method not decompiled: gg.z1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f9105w0) {
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
