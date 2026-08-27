package lh;

import android.widget.PopupWindow;
import org.telegram.ui.Components.av0;

public final class y4 implements PopupWindow.OnDismissListener {

    public final int f17081a;

    public final av0 f17082b;

    public y4(av0 av0Var, int i10) {
        this.f17081a = i10;
        this.f17082b = av0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f17081a) {
            case 0:
                ((f6) this.f17082b).E1.d();
                break;
            default:
                ((zf.l0) this.f17082b).O1.d();
                break;
        }
    }
}
