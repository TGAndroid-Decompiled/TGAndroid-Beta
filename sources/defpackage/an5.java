package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class an5 extends FrameLayout {
    public View a;
    public TextView b;
    public ry8 c;
    public LinearLayout d;

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), 1073741824));
    }

    public void setGravity(int i) {
        this.b.setGravity(i);
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i) {
        TextView textView = this.b;
        zkb.q(textView);
        textView.setTextColor(i);
    }
}
