package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.ProfileActivity;
public final class n5 extends g71 {
    public final int W;
    public Object f3906a0;
    public final FrameLayout f3907b0;

    public n5(FrameLayout frameLayout, Context context, Object obj, int i7) {
        super(context, null);
        this.W = i7;
        this.f3907b0 = frameLayout;
        this.f3906a0 = obj;
    }

    @Override
    public void a() {
        switch (this.W) {
            case 0:
                eq0 eq0Var = (eq0) this.f3907b0;
                f71 f71Var = eq0Var.f4008n;
                if (eq0Var.b() && f71Var != null) {
                    if (eq0Var.K == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131750082, null, new StringBuilder("+ ")));
                        lq lqVar = new lq(2131232562, 0);
                        lqVar.H = 0.8f;
                        spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
                        eq0Var.K = spannableStringBuilder;
                    }
                    f71Var.a(-1, eq0Var.K);
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
                g10 = ((eq0) this.f3907b0).g();
                break;
            case 1:
                g10 = ((dq0) this.f3907b0).H.F1;
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
                eq0 eq0Var = (eq0) this.f3907b0;
                eq0Var.l();
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f3906a0;
                if (h2Var instanceof ProfileActivity) {
                    ((ProfileActivity) h2Var).W();
                    View fragmentView = h2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                eq0Var.p();
                return;
            case 1:
                dq0 dq0Var = (dq0) this.f3907b0;
                String currentLang = dq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f3906a0, currentLang)) {
                    this.f3906a0 = currentLang;
                    dq0Var.H.Y0();
                    return;
                }
                return;
            default:
                ((gq0) this.f3906a0).d.V0(((hq0) this.f3907b0).f50353b.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void u(int i7) {
        switch (this.W) {
            case 1:
                dq0 dq0Var = (dq0) this.f3907b0;
                String currentLang = dq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f3906a0, currentLang)) {
                    this.f3906a0 = currentLang;
                    dq0Var.H.Y0();
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
                int i10 = ((hq0) this.f3907b0).f50353b.f34995c0.get(i7, -1);
                gt0 gt0Var = ((gq0) this.f3906a0).d;
                if (i10 <= 0) {
                    gt0.t(gt0Var, 8, z10);
                    return;
                } else {
                    gt0.t(gt0Var, gt0Var.x1(i10).f35164a, z10);
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
                ((eq0) this.f3907b0).l();
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f3906a0;
                if (h2Var instanceof ProfileActivity) {
                    ((ProfileActivity) h2Var).W();
                    return;
                }
                return;
            case 1:
                dq0 dq0Var = (dq0) this.f3907b0;
                String currentLang = dq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.f3906a0, currentLang)) {
                    this.f3906a0 = currentLang;
                    dq0Var.H.Y0();
                    return;
                }
                return;
            default:
                ((hq0) this.f3907b0).f50353b.f34995c0.get(i7, -1);
                ((gq0) this.f3906a0).d.V0(1.0f);
                return;
        }
    }

    public n5(dq0 dq0Var, Context context) {
        super(context, null);
        this.W = 1;
        this.f3907b0 = dq0Var;
    }
}
