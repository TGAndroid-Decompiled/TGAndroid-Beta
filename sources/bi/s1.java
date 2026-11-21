package bi;

import android.view.View;
import android.widget.TextView;
public final class s1 implements View.OnLayoutChangeListener {
    public final int f4058a;
    public final Object f4059b;

    public s1(Object obj, int i7) {
        this.f4058a = i7;
        this.f4059b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f4058a) {
            case 0:
                e2 e2Var = (e2) this.f4059b;
                if (i12 - i10 != i16 - i14) {
                    org.telegram.messenger.g0.g3(new n1(e2Var, 2));
                    return;
                }
                return;
            case 1:
                ((hi.o3) this.f4059b).d();
                return;
            case 2:
                ng.c cVar = (ng.c) this.f4059b;
                TextView textView = cVar.f21505c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f21504b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((zi.k) this.f4059b).a0();
                return;
        }
    }
}
