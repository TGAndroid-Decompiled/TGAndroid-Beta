package defpackage;

import android.view.View;
public final class j5c extends View {
    public int a;

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.a, 1073741824));
    }

    public void setHeight(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        requestLayout();
    }
}
