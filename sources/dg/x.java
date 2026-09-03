package dg;

import android.widget.PopupWindow;
import org.telegram.ui.Components.rv0;
import ph.c5;
public final class x implements PopupWindow.OnDismissListener {
    public final int f4849a;
    public final rv0 f4850b;

    public x(rv0 rv0Var, int i10) {
        this.f4849a = i10;
        this.f4850b = rv0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f4849a) {
            case 0:
                ((e1) this.f4850b).P1.d();
                return;
            default:
                ((c5) this.f4850b).F1.d();
                return;
        }
    }
}
