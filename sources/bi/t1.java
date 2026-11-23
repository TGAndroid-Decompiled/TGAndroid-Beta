package bi;

import android.view.View;
import android.widget.TextView;
public final class t1 implements View.OnLayoutChangeListener {
    public final int f4071a;
    public final Object f4072b;

    public t1(Object obj, int i7) {
        this.f4071a = i7;
        this.f4072b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f4071a) {
            case 0:
                f2 f2Var = (f2) this.f4072b;
                if (i12 - i10 != i16 - i14) {
                    org.telegram.messenger.g0.g3(new n1(f2Var, 2));
                    return;
                }
                return;
            case 1:
                ((hi.x3) this.f4072b).d();
                return;
            case 2:
                ng.c cVar = (ng.c) this.f4072b;
                TextView textView = cVar.f21573c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f21572b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((zi.k) this.f4072b).a0();
                return;
        }
    }
}
