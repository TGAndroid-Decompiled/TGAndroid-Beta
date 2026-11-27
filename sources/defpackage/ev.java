package defpackage;

import android.view.View;
import org.telegram.ui.o;
public final class ev implements View.OnScrollChangeListener {
    public final byte a;
    public final Object b;

    public ev(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                amb ambVar = ((o) ((xi5) obj)).Q0;
                if (ambVar != null && ambVar.w()) {
                    ambVar.v();
                    return;
                }
                return;
            default:
                v94 v94Var = (v94) obj;
                float f = v94Var.R;
                if (f <= 0.0f || f >= 1.0f) {
                    if (f >= 1.0f) {
                        for (int i5 = 0; i5 < v94Var.O; i5++) {
                            if (v94Var.i(i5)) {
                            }
                        }
                        return;
                    }
                    return;
                }
                v94Var.requestLayout();
                return;
        }
    }
}
