package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class pu0 extends FrameLayout {
    public TextView a;

    public TextView getTextView() {
        return this.a;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(36.0f), 1073741824));
    }

    public void setText(String str) {
        this.a.setText(str);
    }
}
