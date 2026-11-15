package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.yp0;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.ProfileActivity;
public final class f3 extends w61 {
    public final int W;
    public Object f3512a0;
    public final FrameLayout f3513b0;

    public f3(FrameLayout frameLayout, Context context, Object obj, int i7) {
        super(context, null);
        this.W = i7;
        this.f3513b0 = frameLayout;
        this.f3512a0 = obj;
    }

    @Override
    public void a() {
        switch (this.W) {
            case 0:
                wp0 wp0Var = (wp0) this.f3513b0;
                v61 v61Var = wp0Var.f3612n;
                if (wp0Var.b() && v61Var != null) {
                    if (wp0Var.K == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131750098, null, new StringBuilder("+ ")));
                        eq eqVar = new eq(2131232561, 0);
                        eqVar.H = 0.8f;
                        spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
                        wp0Var.K = spannableStringBuilder;
                    }
                    v61Var.a(-1, wp0Var.K);
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
                g10 = ((wp0) this.f3513b0).g();
                break;
            case 1:
                g10 = ((vp0) this.f3513b0).H.F1;
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
                wp0 wp0Var = (wp0) this.f3513b0;
                wp0Var.l();
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f3512a0;
                if (e2Var instanceof ProfileActivity) {
                    ((ProfileActivity) e2Var).W();
                    View fragmentView = e2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                wp0Var.p();
                return;
            case 1:
                vp0 vp0Var = (vp0) this.f3513b0;
                String currentLang = vp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f3512a0, currentLang)) {
                    this.f3512a0 = currentLang;
                    vp0Var.H.Y0();
                    return;
                }
                return;
            default:
                ((yp0) this.f3512a0).d.V0(((zp0) this.f3513b0).f48492b.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void v(int i7) {
        switch (this.W) {
            case 1:
                vp0 vp0Var = (vp0) this.f3513b0;
                String currentLang = vp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f3512a0, currentLang)) {
                    this.f3512a0 = currentLang;
                    vp0Var.H.Y0();
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
                int i10 = ((zp0) this.f3513b0).f48492b.f40296c0.get(i7, -1);
                ys0 ys0Var = ((yp0) this.f3512a0).d;
                if (i10 <= 0) {
                    ys0.t(ys0Var, 8, z10);
                    return;
                } else {
                    ys0.t(ys0Var, ys0Var.x1(i10).f41758a, z10);
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
                ((wp0) this.f3513b0).l();
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f3512a0;
                if (e2Var instanceof ProfileActivity) {
                    ((ProfileActivity) e2Var).W();
                    return;
                }
                return;
            case 1:
                vp0 vp0Var = (vp0) this.f3513b0;
                String currentLang = vp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f3512a0, currentLang)) {
                    this.f3512a0 = currentLang;
                    vp0Var.H.Y0();
                    return;
                }
                return;
            default:
                ((zp0) this.f3513b0).f48492b.f40296c0.get(i7, -1);
                ((yp0) this.f3512a0).d.V0(1.0f);
                return;
        }
    }

    public f3(vp0 vp0Var, Context context) {
        super(context, null);
        this.W = 1;
        this.f3513b0 = vp0Var;
    }
}
