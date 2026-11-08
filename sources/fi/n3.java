package fi;

import android.view.View;
import android.widget.TextView;
public final class n3 implements View.OnLayoutChangeListener {
    public final int f12475a;
    public final Object f12476b;

    public n3(Object obj, int i7) {
        this.f12475a = i7;
        this.f12476b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f12475a) {
            case 0:
                ((q3) this.f12476b).d();
                return;
            case 1:
                ng.c cVar = (ng.c) this.f12476b;
                TextView textView = cVar.f20546c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f20545b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((wi.k) this.f12476b).b0();
                return;
        }
    }
}
