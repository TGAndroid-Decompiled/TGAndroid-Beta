package gh;

import android.content.Context;
import android.view.View;
public final class d5 extends org.telegram.ui.Components.o9 {
    public final int C;

    public d5(Context context, int i9) {
        super(context);
        this.C = i9;
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.C) {
            case 1:
                int size = View.MeasureSpec.getSize(i9);
                setMeasuredDimension(size, size);
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        int i9;
        switch (this.C) {
            case 0:
                super.setAlpha(f10);
                if (f10 > 0.0f) {
                    i9 = 0;
                } else {
                    i9 = 4;
                }
                setVisibility(i9);
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }
}
