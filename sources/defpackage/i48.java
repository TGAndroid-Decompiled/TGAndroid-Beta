package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class i48 extends FrameLayout {
    public ImageView a;
    public ImageView b;
    public TextView c;
    public int d;

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), ug8.E(2.0f, this.d, 1073741824));
    }

    public void setItemSize(int i) {
        this.d = i;
    }

    public void setType(int i) {
        TextView textView = this.c;
        ImageView imageView = this.b;
        ImageView imageView2 = this.a;
        if (i == 0) {
            imageView2.setImageResource(2131232519);
            imageView.setImageResource(2131232520);
            textView.setText(k96.M0(2131752581, null));
            imageView2.setLayoutParams(nme.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            imageView.setLayoutParams(nme.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
            return;
        }
        imageView2.setImageResource(2131232521);
        imageView.setImageResource(2131232522);
        textView.setText(k96.M0(2131750460, null));
        imageView2.setLayoutParams(nme.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
        imageView.setLayoutParams(nme.d(44, 44.0f, 17, 0.0f, 0.0f, 2.0f, 27.0f));
    }
}
