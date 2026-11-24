package defpackage;

import android.content.Context;
import android.view.View;
public final class qr4 extends be0 {
    public final byte H;

    public qr4(Context context, byte b) {
        super(context);
        this.H = b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.H) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                setMeasuredDimension(size, size);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        int i;
        switch (this.H) {
            case 1:
                super.setAlpha(f);
                if (f > 0.0f) {
                    i = 0;
                } else {
                    i = 4;
                }
                setVisibility(i);
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }
}
