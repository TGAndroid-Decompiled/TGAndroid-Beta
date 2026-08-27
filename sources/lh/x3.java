package lh;

import android.view.View;
import android.widget.TextView;

public final class x3 implements View.OnLayoutChangeListener {

    public final int f17032a;

    public final Object f17033b;

    public x3(Object obj, int i10) {
        this.f17032a = i10;
        this.f17033b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f17032a) {
            case 0:
                ((a4) this.f17033b).d();
                break;
            default:
                tf.c cVar = (tf.c) this.f17033b;
                TextView textView = cVar.f48173c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f48172b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                break;
        }
    }
}
