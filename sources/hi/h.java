package hi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class h implements TextWatcher {
    public int f14352a;
    public boolean f14353b;
    public final m f14354c;

    public h(m mVar) {
        this.f14354c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i7;
        boolean z10;
        m mVar = this.f14354c;
        e eVar = mVar.f14620d0;
        org.telegram.ui.Components.h6 h6Var = mVar.f14643w;
        mVar.f14645x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f14645x + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f14645x);
        } else {
            str = null;
        }
        h6Var.a();
        h6Var.setText(str);
        if (mVar.f14645x >= captionLimit) {
            i7 = -1280137;
        } else {
            i7 = -1;
        }
        h6Var.setTextColor(i7);
        if (mVar.f14645x > captionLimit && !m10.i(mVar.V).q() && mVar.f14645x < mVar.getCaptionPremiumLimit() && mVar.f14645x > this.f14352a && (mVar.e() || np.s1(mVar.V).D3())) {
            int i10 = -mVar.O;
            mVar.O = i10;
            org.telegram.messenger.g0.F3(i10, h6Var, null);
            org.telegram.messenger.p2.APP_ERROR.a();
        }
        int i11 = mVar.f14645x;
        this.f14352a = i11;
        if (i11 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f14353b) {
            mVar.q(z10);
        }
        this.f14353b = z10;
        if (!mVar.W) {
            org.telegram.messenger.g0.r(eVar);
            org.telegram.messenger.g0.i3(eVar, 1500L);
        }
        mVar.W = false;
        org.telegram.messenger.g0.h3(new fi.c1(this, 25));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        m mVar = this.f14354c;
        ObjectAnimator objectAnimator = mVar.f14625g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f14617b0 = mVar.f14623f.getEditText().getScrollY();
        mVar.f14615a0 = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        m mVar = this.f14354c;
        g gVar = mVar.f14623f;
        if (!gVar.getEditText().h) {
            if (mVar.N == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f14647y, LaunchActivity.Q(), new fi.b(), 0);
                mVar.N = iVar;
                mVar.U = new org.telegram.ui.Components.y9(mVar.P, iVar, 0, false);
                mVar.N.p(new gc.b(mVar, 3));
                dh.c cVar = mVar.f14626h0;
                if (cVar != null) {
                    i iVar2 = mVar.N;
                    fh.g c10 = cVar.c(iVar2, null, false);
                    c10.p(c8.g0.i(mVar.f14614a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f14616b.addView(mVar.N, c8.ja.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.N.getAdapter() != null) {
                jg.h1 adapter = mVar.N.getAdapter();
                np.s1(mVar.V).a2(Long.valueOf(mVar.f14647y));
                TLRPC.Chat M0 = np.s1(mVar.V).M0(Long.valueOf(-mVar.f14647y));
                adapter.getClass();
                adapter.m0 = M0;
                mVar.N.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
