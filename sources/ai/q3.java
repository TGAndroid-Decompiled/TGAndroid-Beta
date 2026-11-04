package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.Components.yp0;
import org.telegram.ui.ProfileActivity;
public final class q3 extends n61 {
    public final int W;
    public Object f923a0;
    public final FrameLayout f924b0;

    public q3(FrameLayout frameLayout, Context context, Object obj, int i3) {
        super(context, null);
        this.W = i3;
        this.f924b0 = frameLayout;
        this.f923a0 = obj;
    }

    @Override
    public void a() {
        switch (this.W) {
            case 0:
                vp0 vp0Var = (vp0) this.f924b0;
                m61 m61Var = vp0Var.f1015n;
                if (vp0Var.b() && m61Var != null) {
                    if (vp0Var.K == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k2.p1.k(2131750106, null, new StringBuilder("+ ")));
                        wp wpVar = new wp(2131232558, 0);
                        wpVar.H = 0.8f;
                        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
                        vp0Var.K = spannableStringBuilder;
                    }
                    m61Var.a(-1, vp0Var.K);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean c(MotionEvent motionEvent) {
        boolean g7;
        switch (this.W) {
            case 0:
                g7 = ((vp0) this.f924b0).g();
                break;
            case 1:
                g7 = ((tp0) this.f924b0).H.F1;
                break;
            default:
                return super.c(motionEvent);
        }
        return !g7;
    }

    @Override
    public final void u(boolean z10) {
        switch (this.W) {
            case 0:
                vp0 vp0Var = (vp0) this.f924b0;
                vp0Var.l();
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f923a0;
                if (d2Var instanceof ProfileActivity) {
                    ((ProfileActivity) d2Var).V();
                    View fragmentView = d2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                vp0Var.p();
                return;
            case 1:
                tp0 tp0Var = (tp0) this.f924b0;
                String currentLang = tp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f923a0, currentLang)) {
                    this.f923a0 = currentLang;
                    tp0Var.H.W0();
                    return;
                }
                return;
            default:
                ((xp0) this.f923a0).d.U0(((yp0) this.f924b0).f44467b.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i3) {
        switch (this.W) {
            case 1:
                tp0 tp0Var = (tp0) this.f924b0;
                String currentLang = tp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f923a0, currentLang)) {
                    this.f923a0 = currentLang;
                    tp0Var.H.W0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void y(int i3, boolean z10) {
        switch (this.W) {
            case 2:
                int i10 = ((yp0) this.f924b0).f44467b.f36031c0.get(i3, -1);
                ws0 ws0Var = ((xp0) this.f923a0).d;
                if (i10 <= 0) {
                    ws0.t(ws0Var, 8, z10);
                    return;
                } else {
                    ws0.t(ws0Var, ws0Var.v1(i10).f39780a, z10);
                    return;
                }
            default:
                super.y(i3, z10);
                return;
        }
    }

    @Override
    public final void z(int i3) {
        switch (this.W) {
            case 0:
                ((vp0) this.f924b0).l();
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f923a0;
                if (d2Var instanceof ProfileActivity) {
                    ((ProfileActivity) d2Var).V();
                    return;
                }
                return;
            case 1:
                tp0 tp0Var = (tp0) this.f924b0;
                String currentLang = tp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f923a0, currentLang)) {
                    this.f923a0 = currentLang;
                    tp0Var.H.W0();
                    return;
                }
                return;
            default:
                ((yp0) this.f924b0).f44467b.f36031c0.get(i3, -1);
                ((xp0) this.f923a0).d.U0(1.0f);
                return;
        }
    }

    public q3(tp0 tp0Var, Context context) {
        super(context, null);
        this.W = 1;
        this.f924b0 = tp0Var;
    }
}
