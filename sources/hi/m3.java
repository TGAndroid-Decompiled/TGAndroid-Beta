package hi;

import android.view.View;
import android.widget.TextView;
public final class m3 implements View.OnLayoutChangeListener {
    public final int f14653a;
    public final Object f14654b;

    public m3(Object obj, int i7) {
        this.f14653a = i7;
        this.f14654b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f14653a) {
            case 0:
                ((p3) this.f14654b).d();
                return;
            case 1:
                ng.c cVar = (ng.c) this.f14654b;
                TextView textView = cVar.f21116c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f21115b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((zi.l) this.f14654b).a0();
                return;
        }
    }
}
