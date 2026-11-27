package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class uq0 extends vic {
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
    public final void A(int i, boolean z) {
        switch (this.W) {
            case 2:
                int i2 = ((fga) this.b0).b.c0.get(i, -1);
                eja ejaVar = ((ega) this.a0).d;
                if (i2 <= 0) {
                    ejaVar.X0(8, z);
                    return;
                } else {
                    ejaVar.X0(ejaVar.t1(i2).a, z);
                    return;
                }
            default:
                super.A(i, z);
                return;
        }
    }

    @Override
    public final void B(int i) {
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                bga bgaVar = (bga) frameLayout;
                String currentLang = bgaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    bgaVar.H.S0();
                    return;
                }
                return;
            case 1:
                ((cga) frameLayout).l();
                e eVar = (e) this.a0;
                if (eVar instanceof ProfileActivity) {
                    ((ProfileActivity) eVar).V();
                    return;
                }
                return;
            default:
                ((fga) frameLayout).b.c0.get(i, -1);
                ((ega) this.a0).d.P0(1.0f);
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.W) {
            case 1:
                cga cgaVar = (cga) this.b0;
                uic uicVar = cgaVar.n;
                if (cgaVar.b() && uicVar != null) {
                    SpannableStringBuilder spannableStringBuilder = cgaVar.K;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder("+ ".concat(ob6.M0(2131750057, null)));
                        wm2 wm2Var = new wm2(2131232576, 0);
                        wm2Var.H = 0.8f;
                        spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
                        cgaVar.K = spannableStringBuilder;
                    }
                    uicVar.a(-1, spannableStringBuilder);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean c(MotionEvent motionEvent) {
        boolean z;
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                z = ((bga) frameLayout).H.F1;
                break;
            case 1:
                z = ((cga) frameLayout).g();
                break;
            default:
                return super.c(motionEvent);
        }
        return !z;
    }

    @Override
    public final void x(boolean z) {
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                bga bgaVar = (bga) frameLayout;
                String currentLang = bgaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    bgaVar.H.S0();
                    return;
                }
                return;
            case 1:
                cga cgaVar = (cga) frameLayout;
                cgaVar.l();
                e eVar = (e) this.a0;
                if (eVar instanceof ProfileActivity) {
                    ((ProfileActivity) eVar).V();
                    View fragmentView = eVar.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                cgaVar.p();
                return;
            default:
                ((ega) this.a0).d.P0(((fga) frameLayout).b.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public final void z(int i) {
        switch (this.W) {
            case 0:
                bga bgaVar = (bga) this.b0;
                String currentLang = bgaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    bgaVar.H.S0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public uq0(bga bgaVar, Context context) {
        super(context, null);
        this.W = (byte) 0;
        this.b0 = bgaVar;
    }
}
