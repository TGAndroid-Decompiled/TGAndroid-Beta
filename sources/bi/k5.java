package bi;

import android.view.View;
import android.widget.FrameLayout;
import hi.ta;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gt0;
public final class k5 implements View.OnClickListener {
    public final int f3810a;
    public final boolean f3811b;
    public final int f3812c;
    public final FrameLayout d;

    public k5(FrameLayout frameLayout, boolean z10, int i7, int i10) {
        this.f3810a = i10;
        this.d = frameLayout;
        this.f3811b = z10;
        this.f3812c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3810a) {
            case 0:
                eq0 eq0Var = (eq0) this.d;
                if (eq0Var.f4006e.h() && eq0Var.h.getCurrentPosition() != 0) {
                    eq0Var.a();
                    return;
                }
                boolean z10 = this.f3811b;
                int i7 = this.f3812c;
                if (z10) {
                    j3 j3Var = new j3(eq0Var.getContext(), i7, eq0Var.f4005c, null, null);
                    j3Var.g1(org.telegram.messenger.v1.a(i7).c(eq0Var.f4005c));
                    j3Var.show();
                    return;
                }
                a2.l1(false, org.telegram.messenger.v1.a(i7).b());
                return;
            default:
                gt0 gt0Var = (gt0) this.d;
                org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
                if (this.f3811b) {
                    gt0Var.a1(this.f3812c, gt0Var.f35606m1, h2Var);
                    return;
                }
                h2Var.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                ta.D(h2Var.getParentActivity(), h2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
