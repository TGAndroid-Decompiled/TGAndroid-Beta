package bi;

import android.content.Context;
import android.view.View;
public final class b7 extends org.telegram.ui.Components.k9 {
    public final int G;

    public b7(Context context, int i7) {
        super(context);
        this.G = i7;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.G) {
            case 1:
                int size = View.MeasureSpec.getSize(i7);
                setMeasuredDimension(size, size);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        int i7;
        switch (this.G) {
            case 0:
                super.setAlpha(f10);
                if (f10 > 0.0f) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                setVisibility(i7);
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }
}
