package hi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class i implements TextWatcher {
    public int f14614a;
    public boolean f14615b;
    public final n f14616c;

    public i(n nVar) {
        this.f14616c = nVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i7;
        boolean z10;
        n nVar = this.f14616c;
        f fVar = nVar.f14933d0;
        org.telegram.ui.Components.n6 n6Var = nVar.f14956w;
        nVar.f14958x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = nVar.getCaptionLimit();
        if (nVar.f14958x + 25 > captionLimit) {
            str = "" + (captionLimit - nVar.f14958x);
        } else {
            str = null;
        }
        n6Var.a();
        n6Var.setText(str);
        if (nVar.f14958x >= captionLimit) {
            i7 = -1280137;
        } else {
            i7 = -1;
        }
        n6Var.setTextColor(i7);
        if (nVar.f14958x > captionLimit && !i10.i(nVar.V).q() && nVar.f14958x < nVar.getCaptionPremiumLimit() && nVar.f14958x > this.f14614a && (nVar.e() || mp.u1(nVar.V).K3())) {
            int i10 = -nVar.O;
            nVar.O = i10;
            org.telegram.messenger.g0.E3(i10, n6Var, null);
            org.telegram.messenger.q2.APP_ERROR.a();
        }
        int i11 = nVar.f14958x;
        this.f14614a = i11;
        if (i11 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f14615b) {
            nVar.q(z10);
        }
        this.f14615b = z10;
        if (!nVar.W) {
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 1500L);
        }
        nVar.W = false;
        org.telegram.messenger.g0.g3(new f2.a(this, 28));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        n nVar = this.f14616c;
        ObjectAnimator objectAnimator = nVar.f14938g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        nVar.f14930b0 = nVar.f14936f.getEditText().getScrollY();
        nVar.f14928a0 = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        n nVar = this.f14616c;
        h hVar = nVar.f14936f;
        if (!hVar.getEditText().h) {
            if (nVar.N == null) {
                j jVar = new j(nVar, nVar.getContext(), nVar.f14960y, LaunchActivity.Q(), new fi.b(), 0);
                nVar.N = jVar;
                nVar.U = new org.telegram.ui.Components.fa(nVar.P, jVar, 0, false);
                nVar.N.p(new d6.i(nVar, 29));
                dh.c cVar = nVar.f14939h0;
                if (cVar != null) {
                    j jVar2 = nVar.N;
                    fh.g c10 = cVar.c(jVar2, null, false);
                    c10.p(c8.j0.j(nVar.f14927a));
                    jVar2.setBackgroundDrawable(c10);
                }
                nVar.f14929b.addView(nVar.N, c8.na.e(-1, -1, 83));
                nVar.w();
            }
            if (nVar.N.getAdapter() != null) {
                jg.h1 adapter = nVar.N.getAdapter();
                mp.u1(nVar.V).c2(Long.valueOf(nVar.f14960y));
                TLRPC.Chat O0 = mp.u1(nVar.V).O0(Long.valueOf(-nVar.f14960y));
                adapter.getClass();
                adapter.m0 = O0;
                nVar.N.getAdapter().U(charSequence, hVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
