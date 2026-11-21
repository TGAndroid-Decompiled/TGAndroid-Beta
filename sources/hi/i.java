package hi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class i implements TextWatcher {
    public int f14767a;
    public boolean f14768b;
    public final o f14769c;

    public i(o oVar) {
        this.f14769c = oVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i7;
        boolean z10;
        o oVar = this.f14769c;
        f fVar = oVar.f15145d0;
        org.telegram.ui.Components.o6 o6Var = oVar.f15168w;
        oVar.f15170x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = oVar.getCaptionLimit();
        if (oVar.f15170x + 25 > captionLimit) {
            str = "" + (captionLimit - oVar.f15170x);
        } else {
            str = null;
        }
        o6Var.a();
        o6Var.setText(str);
        if (oVar.f15170x >= captionLimit) {
            i7 = -1280137;
        } else {
            i7 = -1;
        }
        o6Var.setTextColor(i7);
        if (oVar.f15170x > captionLimit && !j10.i(oVar.V).q() && oVar.f15170x < oVar.getCaptionPremiumLimit() && oVar.f15170x > this.f14767a && (oVar.e() || mp.u1(oVar.V).K3())) {
            int i10 = -oVar.O;
            oVar.O = i10;
            org.telegram.messenger.g0.E3(i10, o6Var, null);
            org.telegram.messenger.q2.APP_ERROR.a();
        }
        int i11 = oVar.f15170x;
        this.f14767a = i11;
        if (i11 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f14768b) {
            oVar.q(z10);
        }
        this.f14768b = z10;
        if (!oVar.W) {
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 1500L);
        }
        oVar.W = false;
        org.telegram.messenger.g0.g3(new f2.a(this, 29));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        o oVar = this.f14769c;
        ObjectAnimator objectAnimator = oVar.f15150g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        oVar.f15142b0 = oVar.f15148f.getEditText().getScrollY();
        oVar.f15140a0 = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        o oVar = this.f14769c;
        h hVar = oVar.f15148f;
        if (!hVar.getEditText().h) {
            if (oVar.N == null) {
                j jVar = new j(oVar, oVar.getContext(), oVar.f15172y, LaunchActivity.Q(), new fi.b(), 0);
                oVar.N = jVar;
                oVar.U = new org.telegram.ui.Components.ga(oVar.P, jVar, 0, false);
                oVar.N.p(new ze.b(oVar));
                dh.c cVar = oVar.f15151h0;
                if (cVar != null) {
                    j jVar2 = oVar.N;
                    fh.g c10 = cVar.c(jVar2, null, false);
                    c10.p(c8.i0.j(oVar.f15139a));
                    jVar2.setBackgroundDrawable(c10);
                }
                oVar.f15141b.addView(oVar.N, c8.ma.e(-1, -1, 83));
                oVar.w();
            }
            if (oVar.N.getAdapter() != null) {
                jg.h1 adapter = oVar.N.getAdapter();
                mp.u1(oVar.V).c2(Long.valueOf(oVar.f15172y));
                TLRPC.Chat O0 = mp.u1(oVar.V).O0(Long.valueOf(-oVar.f15172y));
                adapter.getClass();
                adapter.m0 = O0;
                oVar.N.getAdapter().U(charSequence, hVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
