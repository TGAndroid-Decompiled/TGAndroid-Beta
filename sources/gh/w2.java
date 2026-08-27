package gh;

import android.view.View;
import android.widget.FrameLayout;
import lh.sb;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.wq0;

public final class w2 implements View.OnClickListener {

    public final int f7601a;

    public final boolean f7602b;

    public final int f7603c;
    public final FrameLayout d;

    public w2(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f7601a = i11;
        this.d = frameLayout;
        this.f7602b = z10;
        this.f7603c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7601a) {
            case 0:
                wq0 wq0Var = (wq0) this.d;
                if (wq0Var.f7200e.h() && wq0Var.h.getCurrentPosition() != 0) {
                    wq0Var.a();
                } else {
                    boolean z10 = this.f7602b;
                    int i10 = this.f7603c;
                    if (!z10) {
                        cg.y2.e0(2, BirthdayController.getInstance(i10).getState());
                    } else {
                        k2 k2Var = new k2(wq0Var.getContext(), i10, wq0Var.f7199c, null, null);
                        k2Var.V(BirthdayController.getInstance(i10).isToday(wq0Var.f7199c));
                        k2Var.show();
                    }
                }
                break;
            default:
                hu0 hu0Var = (hu0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
                if (!this.f7602b) {
                    n2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    sb.E(n2Var.getParentActivity(), n2Var.getCurrentAccount()).R(null);
                } else {
                    hu0Var.O0(n2Var, hu0Var.f29121f1, this.f7603c);
                }
                break;
        }
    }
}
