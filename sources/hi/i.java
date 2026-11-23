package hi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class i implements TextWatcher {
    public int f14770a;
    public boolean f14771b;
    public final o f14772c;

    public i(o oVar) {
        this.f14772c = oVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i7;
        boolean z10;
        o oVar = this.f14772c;
        f fVar = oVar.f15148d0;
        org.telegram.ui.Components.o6 o6Var = oVar.f15171w;
        oVar.f15173x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = oVar.getCaptionLimit();
        if (oVar.f15173x + 25 > captionLimit) {
            str = "" + (captionLimit - oVar.f15173x);
        } else {
            str = null;
        }
        o6Var.a();
        o6Var.setText(str);
        if (oVar.f15173x >= captionLimit) {
            i7 = -1280137;
        } else {
            i7 = -1;
        }
        o6Var.setTextColor(i7);
        if (oVar.f15173x > captionLimit && !k10.i(oVar.V).q() && oVar.f15173x < oVar.getCaptionPremiumLimit() && oVar.f15173x > this.f14770a && (oVar.e() || np.u1(oVar.V).K3())) {
            int i10 = -oVar.O;
            oVar.O = i10;
            org.telegram.messenger.g0.E3(i10, o6Var, null);
            org.telegram.messenger.q2.APP_ERROR.a();
        }
        int i11 = oVar.f15173x;
        this.f14770a = i11;
        if (i11 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f14771b) {
            oVar.q(z10);
        }
        this.f14771b = z10;
        if (!oVar.W) {
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 1500L);
        }
        oVar.W = false;
        org.telegram.messenger.g0.g3(new f2.a(this, 29));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        o oVar = this.f14772c;
        ObjectAnimator objectAnimator = oVar.f15153g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        oVar.f15145b0 = oVar.f15151f.getEditText().getScrollY();
        oVar.f15143a0 = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        o oVar = this.f14772c;
        h hVar = oVar.f15151f;
        if (!hVar.getEditText().h) {
            if (oVar.N == null) {
                j jVar = new j(oVar, oVar.getContext(), oVar.f15175y, LaunchActivity.Q(), new fi.b(), 0);
                oVar.N = jVar;
                oVar.U = new org.telegram.ui.Components.ga(oVar.P, jVar, 0, false);
                oVar.N.p(new ze.b(oVar));
                dh.c cVar = oVar.f15154h0;
                if (cVar != null) {
                    j jVar2 = oVar.N;
                    fh.g c10 = cVar.c(jVar2, null, false);
                    c10.p(c8.i0.j(oVar.f15142a));
                    jVar2.setBackgroundDrawable(c10);
                }
                oVar.f15144b.addView(oVar.N, c8.ma.e(-1, -1, 83));
                oVar.w();
            }
            if (oVar.N.getAdapter() != null) {
                jg.h1 adapter = oVar.N.getAdapter();
                np.u1(oVar.V).c2(Long.valueOf(oVar.f15175y));
                TLRPC.Chat O0 = np.u1(oVar.V).O0(Long.valueOf(-oVar.f15175y));
                adapter.getClass();
                adapter.m0 = O0;
                oVar.N.getAdapter().U(charSequence, hVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
