package ei;

import android.view.View;
import android.widget.TextView;
public final class y3 implements View.OnLayoutChangeListener {
    public final int f10132a;
    public final Object f10133b;

    public y3(Object obj, int i10) {
        this.f10132a = i10;
        this.f10133b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f10132a) {
            case 0:
                ((b4) this.f10133b).d();
                return;
            case 1:
                lg.c cVar = (lg.c) this.f10133b;
                TextView textView = cVar.f16035c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f16034b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((si.k) this.f10133b).d0();
                return;
        }
    }
}
