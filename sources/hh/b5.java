package hh;

import android.content.Context;
import android.view.View;

public final class b5 extends org.telegram.ui.Components.n9 {
    public final int C;

    public b5(Context context, int i10) {
        super(context);
        this.C = i10;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.C) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.C) {
            case 0:
                super.setAlpha(f10);
                setVisibility(f10 > 0.0f ? 0 : 4);
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }
}
