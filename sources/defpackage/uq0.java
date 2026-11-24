package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class uq0 extends wec {
    public final byte W;
    public Object a0;
    public final FrameLayout b0;

    public uq0(FrameLayout frameLayout, Context context, Object obj, byte b) {
        super(context, null);
        this.W = b;
        this.b0 = frameLayout;
        this.a0 = obj;
    }

    @Override
    public final void A(int i) {
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                kca kcaVar = (kca) frameLayout;
                String currentLang = kcaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    kcaVar.H.S0();
                    return;
                }
                return;
            case 1:
                ((lca) frameLayout).l();
                d dVar = (d) this.a0;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).V();
                    return;
                }
                return;
            default:
                ((oca) frameLayout).b.c0.get(i, -1);
                ((nca) this.a0).d.P0(1.0f);
                return;
        }
    }

    @Override
    public final void e() {
        switch (this.W) {
            case 1:
                lca lcaVar = (lca) this.b0;
                vec vecVar = lcaVar.n;
                if (lcaVar.b() && vecVar != null) {
                    SpannableStringBuilder spannableStringBuilder = lcaVar.K;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder("+ ".concat(k96.M0(2131750082, null)));
                        cm2 cm2Var = new cm2(2131232565, 0);
                        cm2Var.H = 0.8f;
                        spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
                        lcaVar.K = spannableStringBuilder;
                    }
                    vecVar.a(-1, spannableStringBuilder);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean g(MotionEvent motionEvent) {
        boolean z;
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                z = ((kca) frameLayout).H.F1;
                break;
            case 1:
                z = ((lca) frameLayout).g();
                break;
            default:
                return super.g(motionEvent);
        }
        return !z;
    }

    @Override
    public final void w(boolean z) {
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                kca kcaVar = (kca) frameLayout;
                String currentLang = kcaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    kcaVar.H.S0();
                    return;
                }
                return;
            case 1:
                lca lcaVar = (lca) frameLayout;
                lcaVar.l();
                d dVar = (d) this.a0;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).V();
                    View fragmentView = dVar.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                lcaVar.p();
                return;
            default:
                ((nca) this.a0).d.P0(((oca) frameLayout).b.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public final void y(int i) {
        switch (this.W) {
            case 0:
                kca kcaVar = (kca) this.b0;
                String currentLang = kcaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    kcaVar.H.S0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void z(int i, boolean z) {
        switch (this.W) {
            case 2:
                int i2 = ((oca) this.b0).b.c0.get(i, -1);
                nfa nfaVar = ((nca) this.a0).d;
                if (i2 <= 0) {
                    nfaVar.X0(8, z);
                    return;
                } else {
                    nfaVar.X0(nfaVar.t1(i2).a, z);
                    return;
                }
            default:
                super.z(i, z);
                return;
        }
    }

    public uq0(kca kcaVar, Context context) {
        super(context, null);
        this.W = (byte) 0;
        this.b0 = kcaVar;
    }
}
