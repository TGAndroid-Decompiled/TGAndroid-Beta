package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class cw5 extends FrameLayout {
    public View a;
    public TextView b;

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
