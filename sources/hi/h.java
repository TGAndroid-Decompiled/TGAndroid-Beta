package hi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class h implements TextWatcher {
    public int f14660a;
    public boolean f14661b;
    public final m f14662c;

    public h(m mVar) {
        this.f14662c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i7;
        boolean z10;
        m mVar = this.f14662c;
        e eVar = mVar.f14968d0;
        org.telegram.ui.Components.o6 o6Var = mVar.f14991w;
        mVar.f14993x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f14993x + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f14993x);
        } else {
            str = null;
        }
        o6Var.a();
        o6Var.setText(str);
        if (mVar.f14993x >= captionLimit) {
            i7 = -1280137;
        } else {
            i7 = -1;
        }
        o6Var.setTextColor(i7);
        if (mVar.f14993x > captionLimit && !k10.i(mVar.V).q() && mVar.f14993x < mVar.getCaptionPremiumLimit() && mVar.f14993x > this.f14660a && (mVar.e() || np.u1(mVar.V).K3())) {
            int i10 = -mVar.O;
            mVar.O = i10;
            org.telegram.messenger.g0.E3(i10, o6Var, null);
            org.telegram.messenger.q2.APP_ERROR.a();
        }
        int i11 = mVar.f14993x;
        this.f14660a = i11;
        if (i11 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f14661b) {
            mVar.q(z10);
        }
        this.f14661b = z10;
        if (!mVar.W) {
            org.telegram.messenger.g0.r(eVar);
            org.telegram.messenger.g0.h3(eVar, 1500L);
        }
        mVar.W = false;
        org.telegram.messenger.g0.g3(new f2.a(this, 28));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        m mVar = this.f14662c;
        ObjectAnimator objectAnimator = mVar.f14973g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f14965b0 = mVar.f14971f.getEditText().getScrollY();
        mVar.f14963a0 = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        m mVar = this.f14662c;
        g gVar = mVar.f14971f;
        if (!gVar.getEditText().h) {
            if (mVar.N == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f14995y, LaunchActivity.Q(), new fi.b(), 0);
                mVar.N = iVar;
                mVar.U = new org.telegram.ui.Components.ga(mVar.P, iVar, 0, false);
                mVar.N.p(new ze.b(mVar));
                dh.c cVar = mVar.f14974h0;
                if (cVar != null) {
                    i iVar2 = mVar.N;
                    fh.g c10 = cVar.c(iVar2, null, false);
                    c10.p(c8.j0.j(mVar.f14962a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f14964b.addView(mVar.N, c8.na.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.N.getAdapter() != null) {
                jg.h1 adapter = mVar.N.getAdapter();
                np.u1(mVar.V).c2(Long.valueOf(mVar.f14995y));
                TLRPC.Chat O0 = np.u1(mVar.V).O0(Long.valueOf(-mVar.f14995y));
                adapter.getClass();
                adapter.m0 = O0;
                mVar.N.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
