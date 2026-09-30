package ci;

import android.view.View;
import android.widget.TextView;
public final class f4 implements View.OnLayoutChangeListener {
    public final int f4680a;
    public final Object f4681b;

    public f4(Object obj, int i10) {
        this.f4680a = i10;
        this.f4681b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f4680a) {
            case 0:
                ((i4) this.f4681b).d();
                return;
            case 1:
                kg.c cVar = (kg.c) this.f4681b;
                TextView textView = cVar.f13602c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f13601b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((ki.i) this.f4681b).G();
                return;
        }
    }
}
