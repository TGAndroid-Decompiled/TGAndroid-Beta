package ci;

import android.widget.PopupWindow;
import org.telegram.ui.Components.zw0;
public final class h5 implements PopupWindow.OnDismissListener {
    public final int f5166a;
    public final zw0 f5167b;

    public h5(zw0 zw0Var, int i10) {
        this.f5166a = i10;
        this.f5167b = zw0Var;
    }

    @Override
    public final void onDismiss() {
        switch (this.f5166a) {
            case 0:
                ((q6) this.f5167b).I1.d();
                return;
            default:
                ((qg.m0) this.f5167b).S1.d();
                return;
        }
    }
}
