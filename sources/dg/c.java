package dg;

import android.view.View;
import android.widget.TextView;
import li.l;
import vh.r2;
public final class c implements View.OnLayoutChangeListener {
    public final int f5886a;
    public final Object f5887b;

    public c(Object obj, int i10) {
        this.f5886a = i10;
        this.f5887b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f5886a) {
            case 0:
                d dVar = (d) this.f5887b;
                TextView textView = dVar.f5890c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = dVar.f5889b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            case 1:
                ((l) this.f5887b).d0();
                return;
            default:
                ((r2) this.f5887b).d();
                return;
        }
    }
}
