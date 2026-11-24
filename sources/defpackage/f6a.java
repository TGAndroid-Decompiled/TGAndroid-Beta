package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
public final class f6a extends LinearLayout {
    public final int a;
    public final int b;

    public f6a(Context context, int i, int i2) {
        super(context);
        this.a = i;
        this.b = i2;
    }

    @Override
    public final int getSuggestedMinimumWidth() {
        return gm.L(260.0f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.b), View.MeasureSpec.getMode(i2)));
    }
}
