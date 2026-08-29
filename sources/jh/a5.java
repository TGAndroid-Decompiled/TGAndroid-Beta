package jh;

import android.content.Context;
import android.view.View;
public final class a5 extends org.telegram.ui.Components.t9 {
    public final int C;

    public a5(Context context, int i10) {
        super(context);
        this.C = i10;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.C) {
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
    public void setAlpha(float f9) {
        int i10;
        switch (this.C) {
            case 0:
                super.setAlpha(f9);
                if (f9 > 0.0f) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                setVisibility(i10);
                return;
            default:
                super.setAlpha(f9);
                return;
        }
    }
}
