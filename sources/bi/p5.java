package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jq0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.ProfileActivity;
public final class p5 extends j71 {
    public final int W;
    public Object f4005a0;
    public final FrameLayout f4006b0;

    public p5(FrameLayout frameLayout, Context context, Object obj, int i7) {
        super(context, null);
        this.W = i7;
        this.f4006b0 = frameLayout;
        this.f4005a0 = obj;
    }

    @Override
    public void a() {
        switch (this.W) {
            case 0:
                gq0 gq0Var = (gq0) this.f4006b0;
                i71 i71Var = gq0Var.f4096n;
                if (gq0Var.b() && i71Var != null) {
                    if (gq0Var.K == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131750081, null, new StringBuilder("+ ")));
                        nq nqVar = new nq(2131232562, 0);
                        nqVar.H = 0.8f;
                        spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
                        gq0Var.K = spannableStringBuilder;
                    }
                    i71Var.a(-1, gq0Var.K);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean b(MotionEvent motionEvent) {
        boolean g10;
        switch (this.W) {
            case 0:
                g10 = ((gq0) this.f4006b0).g();
                break;
            case 1:
                g10 = ((fq0) this.f4006b0).H.F1;
                break;
            default:
                return super.b(motionEvent);
        }
        return !g10;
    }

    @Override
    public final void s(boolean z10) {
        switch (this.W) {
            case 0:
                gq0 gq0Var = (gq0) this.f4006b0;
                gq0Var.l();
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f4005a0;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).W();
                    View fragmentView = g2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                gq0Var.p();
                return;
            case 1:
                fq0 fq0Var = (fq0) this.f4006b0;
                String currentLang = fq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f4005a0, currentLang)) {
                    this.f4005a0 = currentLang;
                    fq0Var.H.Y0();
                    return;
                }
                return;
            default:
                ((iq0) this.f4005a0).d.V0(((jq0) this.f4006b0).f50348b.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void u(int i7) {
        switch (this.W) {
            case 1:
                fq0 fq0Var = (fq0) this.f4006b0;
                String currentLang = fq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f4005a0, currentLang)) {
                    this.f4005a0 = currentLang;
                    fq0Var.H.Y0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void v(int i7, boolean z10) {
        switch (this.W) {
            case 2:
                int i10 = ((jq0) this.f4006b0).f50348b.f36199c0.get(i7, -1);
                jt0 jt0Var = ((iq0) this.f4005a0).d;
                if (i10 <= 0) {
                    jt0.t(jt0Var, 8, z10);
                    return;
                } else {
                    jt0.t(jt0Var, jt0Var.x1(i10).f36308a, z10);
                    return;
                }
            default:
                super.v(i7, z10);
                return;
        }
    }

    @Override
    public final void w(int i7) {
        switch (this.W) {
            case 0:
                ((gq0) this.f4006b0).l();
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f4005a0;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).W();
                    return;
                }
                return;
            case 1:
                fq0 fq0Var = (fq0) this.f4006b0;
                String currentLang = fq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f4005a0, currentLang)) {
                    this.f4005a0 = currentLang;
                    fq0Var.H.Y0();
                    return;
                }
                return;
            default:
                ((jq0) this.f4006b0).f50348b.f36199c0.get(i7, -1);
                ((iq0) this.f4005a0).d.V0(1.0f);
                return;
        }
    }

    public p5(fq0 fq0Var, Context context) {
        super(context, null);
        this.W = 1;
        this.f4006b0 = fq0Var;
    }
}
