package di;

import android.view.View;
import android.widget.TextView;
public final class e4 implements View.OnLayoutChangeListener {
    public final int f6889a;
    public final Object f6890b;

    public e4(Object obj, int i10) {
        this.f6889a = i10;
        this.f6890b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f6889a) {
            case 0:
                ((h4) this.f6890b).d();
                return;
            case 1:
                lg.c cVar = (lg.c) this.f6890b;
                TextView textView = cVar.f14691c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f14690b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((li.l) this.f6890b).d0();
                return;
        }
    }
}
