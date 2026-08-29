package nh;

import android.view.View;
import android.widget.TextView;
public final class u3 implements View.OnLayoutChangeListener {
    public final int f18715a;
    public final Object f18716b;

    public u3(Object obj, int i10) {
        this.f18715a = i10;
        this.f18716b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f18715a) {
            case 0:
                ((w3) this.f18716b).d();
                return;
            default:
                vf.c cVar = (vf.c) this.f18716b;
                TextView textView = cVar.f49550c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f49549b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
        }
    }
}
