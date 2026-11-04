package ci;

import android.content.Context;
import android.view.View;
public final class c6 extends org.telegram.ui.Components.k9 {
    public final int H;

    public c6(Context context, int i3) {
        super(context);
        this.H = i3;
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.H) {
            case 1:
                int size = View.MeasureSpec.getSize(i3);
                setMeasuredDimension(size, size);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        int i3;
        switch (this.H) {
            case 0:
                super.setAlpha(f10);
                if (f10 > 0.0f) {
                    i3 = 0;
                } else {
                    i3 = 4;
                }
                setVisibility(i3);
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }
}
