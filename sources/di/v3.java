package di;

import android.content.Context;
import android.view.View;
public final class v3 extends org.telegram.ui.Components.x9 {
    public final int G;

    public v3(Context context, int i10) {
        super(context);
        this.G = i10;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        int i10;
        switch (this.G) {
            case 1:
                super.setAlpha(f7);
                if (f7 > 0.0f) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                setVisibility(i10);
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }
}
