package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class t24 extends FrameLayout {
    public int a;

    public t24(Context context) {
        this(context, 8);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.a, 1073741824));
    }

    public void setHeight(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    public t24(Context context, int i) {
        super(context);
        this.a = i;
    }
}
