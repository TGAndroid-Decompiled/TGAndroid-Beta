package defpackage;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class lb1 implements TextWatcher {
    public int a;
    public boolean b;
    public final qb1 c;

    public lb1(qb1 qb1Var) {
        this.c = qb1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i;
        boolean z;
        qb1 qb1Var = this.c;
        hb1 hb1Var = qb1Var.d0;
        in inVar = qb1Var.w;
        qb1Var.x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = qb1Var.getCaptionLimit();
        int i2 = qb1Var.x;
        if (i2 + 25 > captionLimit) {
            str = String.valueOf(captionLimit - i2);
        } else {
            str = null;
        }
        inVar.a();
        inVar.setText(str);
        if (qb1Var.x >= captionLimit) {
            i = -1280137;
        } else {
            i = -1;
        }
        inVar.setTextColor(i);
        if (qb1Var.x > captionLimit && !yac.h(qb1Var.V).p() && qb1Var.x < qb1Var.getCaptionPremiumLimit() && qb1Var.x > this.a && (qb1Var.e() || uc7.s1(qb1Var.V).M3())) {
            int i3 = -qb1Var.O;
            qb1Var.O = i3;
            hl.A3(i3, inVar, null);
            yw0.APP_ERROR.a();
        }
        int i4 = qb1Var.x;
        this.a = i4;
        if (i4 > captionLimit) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.b) {
            qb1Var.q(z);
        }
        this.b = z;
        if (!qb1Var.W) {
            hl.r(hb1Var);
            hl.d3(hb1Var, 1500L);
        }
        qb1Var.W = false;
        hl.c3(new fv0(this, (byte) 18));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        qb1 qb1Var = this.c;
        ObjectAnimator objectAnimator = qb1Var.g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        qb1Var.b0 = qb1Var.f.getEditText().getScrollY();
        qb1Var.a0 = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        qb1 qb1Var = this.c;
        kb1 kb1Var = qb1Var.f;
        if (!kb1Var.getEditText().h) {
            if (qb1Var.N == null) {
                mb1 mb1Var = new mb1(qb1Var, qb1Var.getContext(), qb1Var.y, LaunchActivity.Q(), new x53(), (byte) 0);
                qb1Var.N = mb1Var;
                qb1Var.U = new xl0(qb1Var.P, mb1Var, 0, false);
                qb1Var.N.p(new ri6(qb1Var, (byte) 14));
                ll0 ll0Var = qb1Var.h0;
                if (ll0Var != null) {
                    mb1 mb1Var2 = qb1Var.N;
                    jl0 c = ll0Var.c(mb1Var2, null, false);
                    c.p(dtd.i(qb1Var.a));
                    mb1Var2.setBackgroundDrawable(c);
                }
                qb1Var.b.addView(qb1Var.N, tre.e(-1, -1, 83));
                qb1Var.w();
            }
            if (qb1Var.N.getAdapter() != null) {
                r17 adapter = qb1Var.N.getAdapter();
                uc7.s1(qb1Var.V).X1(Long.valueOf(qb1Var.y));
                TLRPC.Chat M0 = uc7.s1(qb1Var.V).M0(Long.valueOf(-qb1Var.y));
                adapter.getClass();
                adapter.m0 = M0;
                qb1Var.N.getAdapter().U(charSequence, kb1Var.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
