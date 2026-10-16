package ig;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.wz;
public final class q1 extends ow0 {
    public final int f11616w0;

    public q1(Context context, b5 b5Var, int i10) {
        super(context, b5Var);
        this.f11616w0 = i10;
    }

    @Override
    public boolean P() {
        switch (this.f11616w0) {
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
        switch (this.f11616w0) {
            case 4:
                if (view instanceof wz) {
                    ViewGroup.LayoutParams layoutParams = ((wz) view).getLayoutParams();
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
        throw new UnsupportedOperationException("Method not decompiled: ig.q1.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f11616w0) {
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
