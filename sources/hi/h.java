package hi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class h implements TextWatcher {
    public int f14711a;
    public boolean f14712b;
    public final n f14713c;

    public h(n nVar) {
        this.f14713c = nVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i7;
        boolean z10;
        n nVar = this.f14713c;
        e eVar = nVar.f15048d0;
        org.telegram.ui.Components.n6 n6Var = nVar.f15071w;
        nVar.f15073x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = nVar.getCaptionLimit();
        if (nVar.f15073x + 25 > captionLimit) {
            str = "" + (captionLimit - nVar.f15073x);
        } else {
            str = null;
        }
        n6Var.a();
        n6Var.setText(str);
        if (nVar.f15073x >= captionLimit) {
            i7 = -1280137;
        } else {
            i7 = -1;
        }
        n6Var.setTextColor(i7);
        if (nVar.f15073x > captionLimit && !j10.i(nVar.V).q() && nVar.f15073x < nVar.getCaptionPremiumLimit() && nVar.f15073x > this.f14711a && (nVar.e() || mp.u1(nVar.V).K3())) {
            int i10 = -nVar.O;
            nVar.O = i10;
            org.telegram.messenger.g0.E3(i10, n6Var, null);
            org.telegram.messenger.q2.APP_ERROR.a();
        }
        int i11 = nVar.f15073x;
        this.f14711a = i11;
        if (i11 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f14712b) {
            nVar.q(z10);
        }
        this.f14712b = z10;
        if (!nVar.W) {
            org.telegram.messenger.g0.r(eVar);
            org.telegram.messenger.g0.h3(eVar, 1500L);
        }
        nVar.W = false;
        org.telegram.messenger.g0.g3(new f2.a(this, 29));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        n nVar = this.f14713c;
        ObjectAnimator objectAnimator = nVar.f15053g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        nVar.f15045b0 = nVar.f15051f.getEditText().getScrollY();
        nVar.f15043a0 = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        n nVar = this.f14713c;
        g gVar = nVar.f15051f;
        if (!gVar.getEditText().h) {
            if (nVar.N == null) {
                i iVar = new i(nVar, nVar.getContext(), nVar.f15075y, LaunchActivity.Q(), new fi.b(), 0);
                nVar.N = iVar;
                nVar.U = new org.telegram.ui.Components.ga(nVar.P, iVar, 0, false);
                nVar.N.p(new ze.b(nVar));
                dh.c cVar = nVar.f15054h0;
                if (cVar != null) {
                    i iVar2 = nVar.N;
                    fh.g c10 = cVar.c(iVar2, null, false);
                    c10.p(c8.i0.j(nVar.f15042a));
                    iVar2.setBackgroundDrawable(c10);
                }
                nVar.f15044b.addView(nVar.N, c8.ma.e(-1, -1, 83));
                nVar.w();
            }
            if (nVar.N.getAdapter() != null) {
                jg.h1 adapter = nVar.N.getAdapter();
                mp.u1(nVar.V).c2(Long.valueOf(nVar.f15075y));
                TLRPC.Chat O0 = mp.u1(nVar.V).O0(Long.valueOf(-nVar.f15075y));
                adapter.getClass();
                adapter.m0 = O0;
                nVar.N.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
