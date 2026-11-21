package bi;

import android.view.View;
import android.widget.FrameLayout;
import hi.sa;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.jt0;
public final class n5 implements View.OnClickListener {
    public final int f3941a;
    public final boolean f3942b;
    public final int f3943c;
    public final FrameLayout d;

    public n5(FrameLayout frameLayout, boolean z10, int i7, int i10) {
        this.f3941a = i10;
        this.d = frameLayout;
        this.f3942b = z10;
        this.f3943c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3941a) {
            case 0:
                gq0 gq0Var = (gq0) this.d;
                if (gq0Var.f4117e.h() && gq0Var.h.getCurrentPosition() != 0) {
                    gq0Var.a();
                    return;
                }
                boolean z10 = this.f3942b;
                int i7 = this.f3943c;
                if (z10) {
                    n3 n3Var = new n3(gq0Var.getContext(), i7, gq0Var.f4116c, null, null);
                    n3Var.g1(org.telegram.messenger.v1.a(i7).c(gq0Var.f4116c));
                    n3Var.show();
                    return;
                }
                e2.l1(false, org.telegram.messenger.v1.a(i7).b());
                return;
            default:
                jt0 jt0Var = (jt0) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36689y1;
                if (this.f3942b) {
                    jt0Var.a1(this.f3943c, jt0Var.f36653m1, g2Var);
                    return;
                }
                g2Var.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                sa.D(g2Var.getParentActivity(), g2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
