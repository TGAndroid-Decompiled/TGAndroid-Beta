package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kq;
import org.telegram.ui.ProfileActivity;
public final class s5 extends k71 {
    public final int W;
    public Object f4054a0;
    public final FrameLayout f4055b0;

    public s5(FrameLayout frameLayout, Context context, Object obj, int i7) {
        super(context, null);
        this.W = i7;
        this.f4055b0 = frameLayout;
        this.f4054a0 = obj;
    }

    @Override
    public void a() {
        switch (this.W) {
            case 0:
                fq0 fq0Var = (fq0) this.f4055b0;
                j71 j71Var = fq0Var.f4153n;
                if (fq0Var.b() && j71Var != null) {
                    if (fq0Var.K == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131750081, null, new StringBuilder("+ ")));
                        kq kqVar = new kq(2131232565, 0);
                        kqVar.H = 0.8f;
                        spannableStringBuilder.setSpan(kqVar, 0, 1, 33);
                        fq0Var.K = spannableStringBuilder;
                    }
                    j71Var.a(-1, fq0Var.K);
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
                g10 = ((fq0) this.f4055b0).g();
                break;
            case 1:
                g10 = ((eq0) this.f4055b0).H.F1;
                break;
            default:
                return super.b(motionEvent);
        }
        return !g10;
    }

    @Override
    public final void t(boolean z10) {
        switch (this.W) {
            case 0:
                fq0 fq0Var = (fq0) this.f4055b0;
                fq0Var.l();
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f4054a0;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).W();
                    View fragmentView = g2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                fq0Var.p();
                return;
            case 1:
                eq0 eq0Var = (eq0) this.f4055b0;
                String currentLang = eq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f4054a0, currentLang)) {
                    this.f4054a0 = currentLang;
                    eq0Var.H.Y0();
                    return;
                }
                return;
            default:
                ((hq0) this.f4054a0).d.V0(((iq0) this.f4055b0).f49870b.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void v(int i7) {
        switch (this.W) {
            case 1:
                eq0 eq0Var = (eq0) this.f4055b0;
                String currentLang = eq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f4054a0, currentLang)) {
                    this.f4054a0 = currentLang;
                    eq0Var.H.Y0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void w(int i7, boolean z10) {
        switch (this.W) {
            case 2:
                int i10 = ((iq0) this.f4055b0).f49870b.f36327c0.get(i7, -1);
                it0 it0Var = ((hq0) this.f4054a0).d;
                if (i10 <= 0) {
                    it0.t(it0Var, 8, z10);
                    return;
                } else {
                    it0.t(it0Var, it0Var.x1(i10).f35816a, z10);
                    return;
                }
            default:
                super.w(i7, z10);
                return;
        }
    }

    @Override
    public final void x(int i7) {
        switch (this.W) {
            case 0:
                ((fq0) this.f4055b0).l();
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f4054a0;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).W();
                    return;
                }
                return;
            case 1:
                eq0 eq0Var = (eq0) this.f4055b0;
                String currentLang = eq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f4054a0, currentLang)) {
                    this.f4054a0 = currentLang;
                    eq0Var.H.Y0();
                    return;
                }
                return;
            default:
                ((iq0) this.f4055b0).f49870b.f36327c0.get(i7, -1);
                ((hq0) this.f4054a0).d.V0(1.0f);
                return;
        }
    }

    public s5(eq0 eq0Var, Context context) {
        super(context, null);
        this.W = 1;
        this.f4055b0 = eq0Var;
    }
}
