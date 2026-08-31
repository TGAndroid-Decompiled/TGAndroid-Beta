package mh;

import android.content.Context;
import android.view.View;
public final class z4 extends org.telegram.ui.Components.p9 {
    public final int D;

    public z4(Context context, int i10) {
        super(context);
        this.D = i10;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.D) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        int i10;
        switch (this.D) {
            case 0:
                super.setAlpha(f10);
                if (f10 > 0.0f) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                setVisibility(i10);
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }
}
