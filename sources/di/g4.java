package di;

import android.view.View;
import android.widget.TextView;
public final class g4 implements View.OnLayoutChangeListener {
    public final int f7260a;
    public final Object f7261b;

    public g4(Object obj, int i10) {
        this.f7260a = i10;
        this.f7261b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f7260a) {
            case 0:
                ((j4) this.f7261b).d();
                return;
            default:
                lg.c cVar = (lg.c) this.f7261b;
                TextView textView = cVar.f15415c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f15414b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
        }
    }
}
