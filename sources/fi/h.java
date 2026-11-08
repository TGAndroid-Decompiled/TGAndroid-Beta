package fi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class h implements TextWatcher {
    public int f12118a;
    public boolean f12119b;
    public final m f12120c;

    public h(m mVar) {
        this.f12120c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i7;
        boolean z9;
        m mVar = this.f12120c;
        e eVar = mVar.f12361c0;
        org.telegram.ui.Components.j6 j6Var = mVar.f12385w;
        mVar.f12387x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f12387x + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f12387x);
        } else {
            str = null;
        }
        j6Var.a();
        j6Var.setText(str);
        if (mVar.f12387x >= captionLimit) {
            i7 = -1280137;
        } else {
            i7 = -1;
        }
        j6Var.setTextColor(i7);
        if (mVar.f12387x > captionLimit && !p10.i(mVar.U).q() && mVar.f12387x < mVar.getCaptionPremiumLimit() && mVar.f12387x > this.f12118a && (mVar.e() || qp.s1(mVar.U).D3())) {
            int i10 = -mVar.N;
            mVar.N = i10;
            org.telegram.messenger.g0.G3(i10, j6Var, null);
            org.telegram.messenger.p2.APP_ERROR.a();
        }
        int i11 = mVar.f12387x;
        this.f12118a = i11;
        if (i11 > captionLimit) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != this.f12119b) {
            mVar.q(z9);
        }
        this.f12119b = z9;
        if (!mVar.V) {
            org.telegram.messenger.g0.r(eVar);
            org.telegram.messenger.g0.i3(eVar, 1500L);
        }
        mVar.V = false;
        org.telegram.messenger.g0.h3(new di.s7(this, 12));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        m mVar = this.f12120c;
        ObjectAnimator objectAnimator = mVar.f12366f0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f12357a0 = mVar.f12365f.getEditText().getScrollY();
        mVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        m mVar = this.f12120c;
        g gVar = mVar.f12365f;
        if (!gVar.getEditText().h) {
            if (mVar.M == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f12389y, LaunchActivity.Q(), new di.b(), 0);
                mVar.M = iVar;
                mVar.T = new org.telegram.ui.Components.ca(mVar.O, iVar, 0, false);
                mVar.M.p(new cb.c(mVar, 24));
                dh.c cVar = mVar.f12367g0;
                if (cVar != null) {
                    i iVar2 = mVar.M;
                    fh.g c10 = cVar.c(iVar2, null, false);
                    c10.p(c8.g0.i(mVar.f12356a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f12358b.addView(mVar.M, c8.ha.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.M.getAdapter() != null) {
                jg.i1 adapter = mVar.M.getAdapter();
                qp.s1(mVar.U).a2(Long.valueOf(mVar.f12389y));
                TLRPC.Chat M0 = qp.s1(mVar.U).M0(Long.valueOf(-mVar.f12389y));
                adapter.getClass();
                adapter.f16788l0 = M0;
                mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
