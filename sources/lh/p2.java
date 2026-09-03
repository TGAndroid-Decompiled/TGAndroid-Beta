package lh;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.yu0;
import qh.ba;
public final class p2 implements View.OnClickListener {
    public final int f12890a;
    public final boolean f12891b;
    public final int f12892c;
    public final FrameLayout d;

    public p2(FrameLayout frameLayout, boolean z4, int i10, int i11) {
        this.f12890a = i11;
        this.d = frameLayout;
        this.f12891b = z4;
        this.f12892c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12890a) {
            case 0:
                or0 or0Var = (or0) this.d;
                if (or0Var.f13103e.h() && or0Var.h.getCurrentPosition() != 0) {
                    or0Var.a();
                    return;
                }
                boolean z4 = this.f12891b;
                int i10 = this.f12892c;
                if (z4) {
                    g2 g2Var = new g2(or0Var.getContext(), i10, or0Var.f13102c, null, null);
                    g2Var.V(BirthdayController.getInstance(i10).isToday(or0Var.f13102c));
                    g2Var.show();
                    return;
                }
                hg.v2.e0(2, BirthdayController.getInstance(i10).getState());
                return;
            default:
                yu0 yu0Var = (yu0) this.d;
                org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f33649s1;
                if (this.f12891b) {
                    yu0Var.O0(p2Var, yu0Var.f33624g1, this.f12892c);
                    return;
                }
                p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ba.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
