package fi;

import android.view.View;
import android.widget.TextView;
public final class w3 implements View.OnLayoutChangeListener {
    public final int f11847a;
    public final Object f11848b;

    public w3(Object obj, int i10) {
        this.f11847a = i10;
        this.f11848b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f11847a) {
            case 0:
                ((z3) this.f11848b).d();
                return;
            case 1:
                mg.c cVar = (mg.c) this.f11848b;
                TextView textView = cVar.f18445c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f18444b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            default:
                ((vi.j) this.f11848b).d0();
                return;
        }
    }
}
