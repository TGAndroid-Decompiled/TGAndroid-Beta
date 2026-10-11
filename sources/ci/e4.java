package ci;

import android.view.View;
import android.widget.TextView;
public final class e4 implements View.OnLayoutChangeListener {
    public final int f5024a;
    public final Object f5025b;

    public e4(Object obj, int i10) {
        this.f5024a = i10;
        this.f5025b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f5024a) {
            case 0:
                ((h4) this.f5025b).d();
                return;
            case 1:
                kg.c cVar = (kg.c) this.f5025b;
                TextView textView = cVar.f14818c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f14817b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((ki.k) this.f5025b).d0();
                return;
        }
    }
}
