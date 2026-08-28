package kh;

import android.view.View;
import android.widget.TextView;
public final class y3 implements View.OnLayoutChangeListener {
    public final int f16395a;
    public final Object f16396b;

    public y3(Object obj, int i9) {
        this.f16395a = i9;
        this.f16396b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f16395a) {
            case 0:
                ((b4) this.f16396b).d();
                return;
            default:
                sf.c cVar = (sf.c) this.f16396b;
                TextView textView = cVar.f47524c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f47523b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
        }
    }
}
