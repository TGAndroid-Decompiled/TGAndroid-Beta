package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.qv0;
public final class i5 implements PopupWindow.OnDismissListener {
    public final int f4783a;
    public final qv0 f4784b;

    public i5(qv0 qv0Var, int i10) {
        this.f4783a = i10;
        this.f4784b = qv0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f4783a) {
            case 0:
                ((q6) this.f4784b).I1.d();
                return;
            default:
                ((qg.p0) this.f4784b).S1.d();
                return;
        }
    }
}
