package bi;

import android.view.View;
import android.widget.TextView;
public final class o1 implements View.OnLayoutChangeListener {
    public final int f3886a;
    public final Object f3887b;

    public o1(Object obj, int i7) {
        this.f3886a = i7;
        this.f3887b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f3886a) {
            case 0:
                a2 a2Var = (a2) this.f3887b;
                if (i12 - i10 != i16 - i14) {
                    org.telegram.messenger.g0.g3(new j1(a2Var, 2));
                    return;
                }
                return;
            case 1:
                ((hi.p3) this.f3887b).d();
                return;
            case 2:
                ng.c cVar = (ng.c) this.f3887b;
                TextView textView = cVar.f21477c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f21476b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((zi.k) this.f3887b).a0();
                return;
        }
    }
}
