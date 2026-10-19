package ei;

import android.view.View;
import android.widget.TextView;
public final class y3 implements View.OnLayoutChangeListener {
    public final int f10131a;
    public final Object f10132b;

    public y3(Object obj, int i10) {
        this.f10131a = i10;
        this.f10132b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f10131a) {
            case 0:
                ((b4) this.f10132b).d();
                return;
            case 1:
                lg.c cVar = (lg.c) this.f10132b;
                TextView textView = cVar.f16036c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f16035b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((si.j) this.f10132b).d0();
                return;
        }
    }
}
