package ei;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.yp0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.ProfileActivity;
public final class a extends w61 {
    public final int V;
    public Object W;
    public final FrameLayout f10809a0;

    public a(FrameLayout frameLayout, Context context, Object obj, int i7) {
        super(context, null);
        this.V = i7;
        this.f10809a0 = frameLayout;
        this.W = obj;
    }

    @Override
    public final void A(int i7) {
        switch (this.V) {
            case 0:
                tp0 tp0Var = (tp0) this.f10809a0;
                String currentLang = tp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    tp0Var.G.Y0();
                    return;
                }
                return;
            case 1:
                ((zp0) this.f10809a0).f48546b.f38964b0.get(i7, -1);
                ((yp0) this.W).d.V0(1.0f);
                return;
            default:
                ((vp0) this.f10809a0).l();
                f2 f2Var = (f2) this.W;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).V();
                    return;
                }
                return;
        }
    }

    @Override
    public void a() {
        switch (this.V) {
            case 2:
                vp0 vp0Var = (vp0) this.f10809a0;
                v61 v61Var = vp0Var.f60297n;
                if (vp0Var.b() && v61Var != null) {
                    if (vp0Var.J == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jg.g.l(2131750098, null, new StringBuilder("+ ")));
                        wp wpVar = new wp(2131232560, 0);
                        wpVar.G = 0.8f;
                        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
                        vp0Var.J = spannableStringBuilder;
                    }
                    v61Var.a(-1, vp0Var.J);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean b(MotionEvent motionEvent) {
        boolean z9;
        switch (this.V) {
            case 0:
                z9 = ((tp0) this.f10809a0).G.E1;
                break;
            case 1:
            default:
                return super.b(motionEvent);
            case 2:
                z9 = ((vp0) this.f10809a0).g();
                break;
        }
        return !z9;
    }

    @Override
    public final void w(boolean z9) {
        switch (this.V) {
            case 0:
                tp0 tp0Var = (tp0) this.f10809a0;
                String currentLang = tp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    tp0Var.G.Y0();
                    return;
                }
                return;
            case 1:
                ((yp0) this.W).d.V0(((zp0) this.f10809a0).f48546b.getAnimatingIndicatorProgress());
                return;
            default:
                vp0 vp0Var = (vp0) this.f10809a0;
                vp0Var.l();
                f2 f2Var = (f2) this.W;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).V();
                    View fragmentView = f2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                vp0Var.p();
                return;
        }
    }

    @Override
    public void y(int i7) {
        switch (this.V) {
            case 0:
                tp0 tp0Var = (tp0) this.f10809a0;
                String currentLang = tp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    tp0Var.G.Y0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(int i7, boolean z9) {
        switch (this.V) {
            case 1:
                int i10 = ((zp0) this.f10809a0).f48546b.f38964b0.get(i7, -1);
                zs0 zs0Var = ((yp0) this.W).d;
                if (i10 <= 0) {
                    zs0.t(zs0Var, 8, z9);
                    return;
                } else {
                    zs0.t(zs0Var, zs0Var.x1(i10).f40800a, z9);
                    return;
                }
            default:
                super.z(i7, z9);
                return;
        }
    }

    public a(tp0 tp0Var, Context context) {
        super(context, null);
        this.V = 0;
        this.f10809a0 = tp0Var;
    }
}
