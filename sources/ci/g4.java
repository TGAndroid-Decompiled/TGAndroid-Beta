package ci;

import android.view.View;
import android.widget.TextView;
public final class g4 implements View.OnLayoutChangeListener {
    public final int f4685a;
    public final Object f4686b;

    public g4(Object obj, int i10) {
        this.f4685a = i10;
        this.f4686b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f4685a) {
            case 0:
                ((j4) this.f4686b).d();
                return;
            default:
                kg.c cVar = (kg.c) this.f4686b;
                TextView textView = cVar.f13601c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f13600b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
        }
    }
}
