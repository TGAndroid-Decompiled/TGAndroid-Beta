package gi;

import android.view.View;
import android.widget.TextView;
public final class m3 implements View.OnLayoutChangeListener {
    public final int f13192a;
    public final Object f13193b;

    public m3(Object obj, int i3) {
        this.f13192a = i3;
        this.f13193b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f13192a) {
            case 0:
                ((p3) this.f13193b).d();
                return;
            case 1:
                og.c cVar = (og.c) this.f13193b;
                TextView textView = cVar.f21063c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f21062b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((wi.j) this.f13193b).d0();
                return;
        }
    }
}
