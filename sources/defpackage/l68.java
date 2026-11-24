package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class l68 extends FrameLayout {
    public ImageView a;
    public ImageView b;
    public TextView c;
    public int d;

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), wi8.E(2.0f, this.d, 1073741824));
    }

    public void setItemSize(int i) {
        this.d = i;
    }

    public void setType(int i) {
        TextView textView = this.c;
        ImageView imageView = this.b;
        ImageView imageView2 = this.a;
        if (i == 0) {
            imageView2.setImageResource(2131232531);
            imageView.setImageResource(2131232532);
            textView.setText(jb6.M0(2131752546, null));
            imageView2.setLayoutParams(qoe.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(qoe.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(2131232533);
        imageView.setImageResource(2131232534);
        textView.setText(jb6.M0(2131750409, null));
        imageView2.setLayoutParams(qoe.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(qoe.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
