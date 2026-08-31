package lh;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.zu0;
import qh.ca;
public final class p2 implements View.OnClickListener {
    public final int f12888a;
    public final boolean f12889b;
    public final int f12890c;
    public final FrameLayout d;

    public p2(FrameLayout frameLayout, boolean z4, int i10, int i11) {
        this.f12888a = i11;
        this.d = frameLayout;
        this.f12889b = z4;
        this.f12890c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12888a) {
            case 0:
                pr0 pr0Var = (pr0) this.d;
                if (pr0Var.f13101e.h() && pr0Var.h.getCurrentPosition() != 0) {
                    pr0Var.a();
                    return;
                }
                boolean z4 = this.f12889b;
                int i10 = this.f12890c;
                if (z4) {
                    g2 g2Var = new g2(pr0Var.getContext(), i10, pr0Var.f13100c, null, null);
                    g2Var.V(BirthdayController.getInstance(i10).isToday(pr0Var.f13100c));
                    g2Var.show();
                    return;
                }
                hg.v2.e0(2, BirthdayController.getInstance(i10).getState());
                return;
            default:
                zu0 zu0Var = (zu0) this.d;
                org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
                if (this.f12889b) {
                    zu0Var.O0(p2Var, zu0Var.f33979g1, this.f12890c);
                    return;
                }
                p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                ca.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
