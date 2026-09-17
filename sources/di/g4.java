package di;

import android.view.View;
import android.widget.TextView;
public final class g4 implements View.OnLayoutChangeListener {
    public final int f7288a;
    public final Object f7289b;

    public g4(Object obj, int i10) {
        this.f7288a = i10;
        this.f7289b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f7288a) {
            case 0:
                ((j4) this.f7289b).d();
                return;
            default:
                lg.c cVar = (lg.c) this.f7289b;
                TextView textView = cVar.f15442c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f15441b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
        }
    }
}
