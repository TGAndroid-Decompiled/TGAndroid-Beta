package ih;

import android.view.View;
import android.widget.FrameLayout;
import nh.gb;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.qu0;
public final class q2 implements View.OnClickListener {
    public final int f9334a;
    public final boolean f9335b;
    public final int f9336c;
    public final FrameLayout d;

    public q2(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.f9334a = i11;
        this.d = frameLayout;
        this.f9335b = z10;
        this.f9336c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9334a) {
            case 0:
                gr0 gr0Var = (gr0) this.d;
                if (gr0Var.f9504e.h() && gr0Var.h.getCurrentPosition() != 0) {
                    gr0Var.a();
                    return;
                }
                boolean z10 = this.f9335b;
                int i10 = this.f9336c;
                if (z10) {
                    h2 h2Var = new h2(gr0Var.getContext(), i10, gr0Var.f9503c, null, null);
                    h2Var.V(BirthdayController.getInstance(i10).isToday(gr0Var.f9503c));
                    h2Var.show();
                    return;
                }
                eg.w2.e0(2, BirthdayController.getInstance(i10).getState());
                return;
            default:
                qu0 qu0Var = (qu0) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
                if (this.f9335b) {
                    qu0Var.O0(o2Var, qu0Var.f32069f1, this.f9336c);
                    return;
                }
                o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                gb.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                return;
        }
    }
}
