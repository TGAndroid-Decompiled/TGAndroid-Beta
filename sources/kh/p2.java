package kh;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.yu0;
import ph.da;
public final class p2 implements View.OnClickListener {
    public final int f10855a;
    public final boolean f10856b;
    public final int f10857c;
    public final FrameLayout d;

    public p2(FrameLayout frameLayout, boolean z4, int i10, int i11) {
        this.f10855a = i11;
        this.d = frameLayout;
        this.f10856b = z4;
        this.f10857c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10855a) {
            case 0:
                or0 or0Var = (or0) this.d;
                if (or0Var.e.h() && or0Var.h.getCurrentPosition() != 0) {
                    or0Var.a();
                    return;
                }
                boolean z4 = this.f10856b;
                int i10 = this.f10857c;
                if (z4) {
                    g2 g2Var = new g2(or0Var.getContext(), i10, or0Var.f11017c, null, null);
                    g2Var.V(BirthdayController.getInstance(i10).isToday(or0Var.f11017c));
                    g2Var.show();
                    return;
                }
                gg.v2.e0(2, BirthdayController.getInstance(i10).getState());
                return;
            default:
                yu0 yu0Var = (yu0) this.d;
                org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31155s1;
                if (this.f10856b) {
                    yu0Var.O0(p2Var, yu0Var.f31130g1, this.f10857c);
                    return;
                }
                p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                da.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
