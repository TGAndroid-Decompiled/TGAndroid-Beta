package bi;

import android.view.View;
import android.widget.FrameLayout;
import hi.nb;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.it0;
public final class p5 implements View.OnClickListener {
    public final int f3963a;
    public final boolean f3964b;
    public final int f3965c;
    public final FrameLayout d;

    public p5(FrameLayout frameLayout, boolean z10, int i7, int i10) {
        this.f3963a = i10;
        this.d = frameLayout;
        this.f3964b = z10;
        this.f3965c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3963a) {
            case 0:
                fq0 fq0Var = (fq0) this.d;
                if (fq0Var.f4151e.h() && fq0Var.h.getCurrentPosition() != 0) {
                    fq0Var.a();
                    return;
                }
                boolean z10 = this.f3964b;
                int i7 = this.f3965c;
                if (z10) {
                    p3 p3Var = new p3(fq0Var.getContext(), i7, fq0Var.f4150c, null, null);
                    p3Var.g1(org.telegram.messenger.v1.a(i7).c(fq0Var.f4150c));
                    p3Var.show();
                    return;
                }
                f2.l1(false, org.telegram.messenger.v1.a(i7).b());
                return;
            default:
                it0 it0Var = (it0) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
                if (this.f3964b) {
                    it0Var.a1(this.f3965c, it0Var.f36130m1, g2Var);
                    return;
                }
                g2Var.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                nb.D(g2Var.getParentActivity(), g2Var.getCurrentAccount()).Q(null);
                return;
        }
    }
}
