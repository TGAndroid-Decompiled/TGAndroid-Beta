package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
public final class cf6 extends ViewSwitcher {
    public final byte a;

    public cf6(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), Integer.MIN_VALUE));
                return;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), Integer.MIN_VALUE));
                return;
        }
    }
}
