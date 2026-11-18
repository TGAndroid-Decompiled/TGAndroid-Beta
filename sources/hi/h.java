package hi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class h implements TextWatcher {
    public int f14708a;
    public boolean f14709b;
    public final n f14710c;

    public h(n nVar) {
        this.f14710c = nVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i7;
        boolean z10;
        n nVar = this.f14710c;
        e eVar = nVar.f15045d0;
        org.telegram.ui.Components.n6 n6Var = nVar.f15068w;
        nVar.f15070x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = nVar.getCaptionLimit();
        if (nVar.f15070x + 25 > captionLimit) {
            str = "" + (captionLimit - nVar.f15070x);
        } else {
            str = null;
        }
        n6Var.a();
        n6Var.setText(str);
        if (nVar.f15070x >= captionLimit) {
            i7 = -1280137;
        } else {
            i7 = -1;
        }
        n6Var.setTextColor(i7);
        if (nVar.f15070x > captionLimit && !j10.i(nVar.V).q() && nVar.f15070x < nVar.getCaptionPremiumLimit() && nVar.f15070x > this.f14708a && (nVar.e() || mp.u1(nVar.V).K3())) {
            int i10 = -nVar.O;
            nVar.O = i10;
            org.telegram.messenger.g0.E3(i10, n6Var, null);
            org.telegram.messenger.q2.APP_ERROR.a();
        }
        int i11 = nVar.f15070x;
        this.f14708a = i11;
        if (i11 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f14709b) {
            nVar.q(z10);
        }
        this.f14709b = z10;
        if (!nVar.W) {
            org.telegram.messenger.g0.r(eVar);
            org.telegram.messenger.g0.h3(eVar, 1500L);
        }
        nVar.W = false;
        org.telegram.messenger.g0.g3(new f2.a(this, 29));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        n nVar = this.f14710c;
        ObjectAnimator objectAnimator = nVar.f15050g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        nVar.f15042b0 = nVar.f15048f.getEditText().getScrollY();
        nVar.f15040a0 = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        n nVar = this.f14710c;
        g gVar = nVar.f15048f;
        if (!gVar.getEditText().h) {
            if (nVar.N == null) {
                i iVar = new i(nVar, nVar.getContext(), nVar.f15072y, LaunchActivity.Q(), new fi.b(), 0);
                nVar.N = iVar;
                nVar.U = new org.telegram.ui.Components.ga(nVar.P, iVar, 0, false);
                nVar.N.p(new ze.b(nVar));
                dh.c cVar = nVar.f15051h0;
                if (cVar != null) {
                    i iVar2 = nVar.N;
                    fh.g c10 = cVar.c(iVar2, null, false);
                    c10.p(c8.i0.j(nVar.f15039a));
                    iVar2.setBackgroundDrawable(c10);
                }
                nVar.f15041b.addView(nVar.N, c8.ma.e(-1, -1, 83));
                nVar.w();
            }
            if (nVar.N.getAdapter() != null) {
                jg.h1 adapter = nVar.N.getAdapter();
                mp.u1(nVar.V).c2(Long.valueOf(nVar.f15072y));
                TLRPC.Chat O0 = mp.u1(nVar.V).O0(Long.valueOf(-nVar.f15072y));
                adapter.getClass();
                adapter.m0 = O0;
                nVar.N.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
