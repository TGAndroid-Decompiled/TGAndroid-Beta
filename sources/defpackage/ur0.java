package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class ur0 extends wgc {
    public final byte W;
    public Object a0;
    public final FrameLayout b0;

    public ur0(FrameLayout frameLayout, Context context, Object obj, byte b) {
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
                kea keaVar = (kea) frameLayout;
                String currentLang = keaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    keaVar.H.S0();
                    return;
                }
                return;
            case 1:
                ((lea) frameLayout).l();
                d dVar = (d) this.a0;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).W();
                    return;
                }
                return;
            default:
                ((oea) frameLayout).b.c0.get(i, -1);
                ((nea) this.a0).d.P0(1.0f);
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.W) {
            case 1:
                lea leaVar = (lea) this.b0;
                vgc vgcVar = leaVar.n;
                if (leaVar.b() && vgcVar != null) {
                    SpannableStringBuilder spannableStringBuilder = leaVar.K;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder("+ ".concat(jb6.M0(2131750031, null)));
                        pn2 pn2Var = new pn2(2131232577, 0);
                        pn2Var.H = 0.8f;
                        spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
                        leaVar.K = spannableStringBuilder;
                    }
                    vgcVar.a(-1, spannableStringBuilder);
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
                z = ((kea) frameLayout).H.F1;
                break;
            case 1:
                z = ((lea) frameLayout).g();
                break;
            default:
                return super.c(motionEvent);
        }
        return !z;
    }

    @Override
    public final void w(boolean z) {
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                kea keaVar = (kea) frameLayout;
                String currentLang = keaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    keaVar.H.S0();
                    return;
                }
                return;
            case 1:
                lea leaVar = (lea) frameLayout;
                leaVar.l();
                d dVar = (d) this.a0;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).W();
                    View fragmentView = dVar.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                leaVar.p();
                return;
            default:
                ((nea) this.a0).d.P0(((oea) frameLayout).b.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public final void y(int i) {
        switch (this.W) {
            case 0:
                kea keaVar = (kea) this.b0;
                String currentLang = keaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    keaVar.H.S0();
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
                int i2 = ((oea) this.b0).b.c0.get(i, -1);
                nha nhaVar = ((nea) this.a0).d;
                if (i2 <= 0) {
                    nhaVar.X0(8, z);
                    return;
                } else {
                    nhaVar.X0(nhaVar.t1(i2).a, z);
                    return;
                }
            default:
                super.z(i, z);
                return;
        }
    }

    public ur0(kea keaVar, Context context) {
        super(context, null);
        this.W = (byte) 0;
        this.b0 = keaVar;
    }
}
