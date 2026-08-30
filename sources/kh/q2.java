package kh;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.yu0;
import ph.da;
public final class q2 implements View.OnClickListener {
    public final int f10759a;
    public final boolean f10760b;
    public final int f10761c;
    public final FrameLayout d;

    public q2(FrameLayout frameLayout, boolean z4, int i10, int i11) {
        this.f10759a = i11;
        this.d = frameLayout;
        this.f10760b = z4;
        this.f10761c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10759a) {
            case 0:
                or0 or0Var = (or0) this.d;
                if (or0Var.e.h() && or0Var.h.getCurrentPosition() != 0) {
                    or0Var.a();
                    return;
                }
                boolean z4 = this.f10760b;
                int i10 = this.f10761c;
                if (z4) {
                    h2 h2Var = new h2(or0Var.getContext(), i10, or0Var.f10941c, null, null);
                    h2Var.V(BirthdayController.getInstance(i10).isToday(or0Var.f10941c));
                    h2Var.show();
                    return;
                }
                gg.v2.e0(2, BirthdayController.getInstance(i10).getState());
                return;
            default:
                yu0 yu0Var = (yu0) this.d;
                org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31144s1;
                if (this.f10760b) {
                    yu0Var.O0(p2Var, yu0Var.f31119g1, this.f10761c);
                    return;
                }
                p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                da.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
