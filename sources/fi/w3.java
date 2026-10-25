package fi;

import android.view.View;
import android.widget.TextView;
public final class w3 implements View.OnLayoutChangeListener {
    public final int f11848a;
    public final Object f11849b;

    public w3(Object obj, int i10) {
        this.f11848a = i10;
        this.f11849b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f11848a) {
            case 0:
                ((z3) this.f11849b).d();
                return;
            case 1:
                mg.c cVar = (mg.c) this.f11849b;
                TextView textView = cVar.f18446c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f18445b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((vi.j) this.f11849b).d0();
                return;
        }
    }
}
