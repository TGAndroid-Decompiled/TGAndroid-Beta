package gi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import b8.cd;
import b8.mf;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class h implements TextWatcher {
    public int f12852a;
    public boolean f12853b;
    public final m f12854c;

    public h(m mVar) {
        this.f12854c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i3;
        boolean z10;
        m mVar = this.f12854c;
        e eVar = mVar.f13141d0;
        org.telegram.ui.Components.h6 h6Var = mVar.f13164w;
        mVar.f13166x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f13166x + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f13166x);
        } else {
            str = null;
        }
        h6Var.a();
        h6Var.setText(str);
        if (mVar.f13166x >= captionLimit) {
            i3 = -1280137;
        } else {
            i3 = -1;
        }
        h6Var.setTextColor(i3);
        if (mVar.f13166x > captionLimit && !h10.i(mVar.V).q() && mVar.f13166x < mVar.getCaptionPremiumLimit() && mVar.f13166x > this.f12852a && (mVar.e() || hp.s1(mVar.V).D3())) {
            int i10 = -mVar.O;
            mVar.O = i10;
            org.telegram.messenger.g0.G3(i10, h6Var, null);
            org.telegram.messenger.p2.APP_ERROR.a();
        }
        int i11 = mVar.f13166x;
        this.f12852a = i11;
        if (i11 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f12853b) {
            mVar.q(z10);
        }
        this.f12853b = z10;
        if (!mVar.W) {
            org.telegram.messenger.g0.r(eVar);
            org.telegram.messenger.g0.i3(eVar, 1500L);
        }
        mVar.W = false;
        org.telegram.messenger.g0.h3(new ei.z5(this, 16));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        m mVar = this.f12854c;
        ObjectAnimator objectAnimator = mVar.f13146g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f13138b0 = mVar.f13144f.getEditText().getScrollY();
        mVar.f13136a0 = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        m mVar = this.f12854c;
        g gVar = mVar.f13144f;
        if (!gVar.getEditText().h) {
            if (mVar.N == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f13168y, LaunchActivity.Q(), new ei.b(), 0);
                mVar.N = iVar;
                mVar.U = new org.telegram.ui.Components.ba(mVar.P, iVar, 0, false);
                mVar.N.p(new c6.i(mVar, 28));
                eh.c cVar = mVar.f13147h0;
                if (cVar != null) {
                    i iVar2 = mVar.N;
                    gh.g c2 = cVar.c(iVar2, null, false);
                    c2.p(cd.i(mVar.f13135a));
                    iVar2.setBackgroundDrawable(c2);
                }
                mVar.f13137b.addView(mVar.N, mf.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.N.getAdapter() != null) {
                kg.e1 adapter = mVar.N.getAdapter();
                hp.s1(mVar.V).a2(Long.valueOf(mVar.f13168y));
                TLRPC.Chat M0 = hp.s1(mVar.V).M0(Long.valueOf(-mVar.f13168y));
                adapter.getClass();
                adapter.m0 = M0;
                mVar.N.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
