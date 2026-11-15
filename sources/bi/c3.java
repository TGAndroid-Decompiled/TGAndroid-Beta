package bi;

import android.view.View;
import android.widget.FrameLayout;
import hi.sa;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.ys0;
public final class c3 implements View.OnClickListener {
    public final int f3406a;
    public final boolean f3407b;
    public final int f3408c;
    public final FrameLayout d;

    public c3(FrameLayout frameLayout, boolean z10, int i7, int i10) {
        this.f3406a = i10;
        this.d = frameLayout;
        this.f3407b = z10;
        this.f3408c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3406a) {
            case 0:
                wp0 wp0Var = (wp0) this.d;
                if (wp0Var.f3610e.h() && wp0Var.h.getCurrentPosition() != 0) {
                    wp0Var.a();
                    return;
                }
                boolean z10 = this.f3407b;
                int i7 = this.f3408c;
                if (z10) {
                    s2 s2Var = new s2(wp0Var.getContext(), i7, wp0Var.f3609c, null, null);
                    s2Var.e1(org.telegram.messenger.v1.a(i7).c(wp0Var.f3609c));
                    s2Var.show();
                    return;
                }
                wg.c1.l1(2, org.telegram.messenger.v1.a(i7).b());
                return;
            default:
                ys0 ys0Var = (ys0) this.d;
                org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42150y1;
                if (this.f3407b) {
                    ys0Var.a1(e2Var, ys0Var.f42114m1, this.f3408c);
                    return;
                }
                e2Var.getMessagesController().f25280f7.edit().putBoolean("story_keep", true).apply();
                sa.D(e2Var.getParentActivity(), e2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
