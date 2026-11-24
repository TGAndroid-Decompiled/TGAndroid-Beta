package defpackage;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class kc1 implements TextWatcher {
    public int a;
    public boolean b;
    public final pc1 c;

    public kc1(pc1 pc1Var) {
        this.c = pc1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i;
        boolean z;
        pc1 pc1Var = this.c;
        hc1 hc1Var = pc1Var.d0;
        io ioVar = pc1Var.w;
        pc1Var.x = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = pc1Var.getCaptionLimit();
        int i2 = pc1Var.x;
        if (i2 + 25 > captionLimit) {
            str = String.valueOf(captionLimit - i2);
        } else {
            str = null;
        }
        ioVar.a();
        ioVar.setText(str);
        if (pc1Var.x >= captionLimit) {
            i = -1280137;
        } else {
            i = -1;
        }
        ioVar.setTextColor(i);
        if (pc1Var.x > captionLimit && !z8c.h(pc1Var.V).p() && pc1Var.x < pc1Var.getCaptionPremiumLimit() && pc1Var.x > this.a && (pc1Var.e() || oc7.r1(pc1Var.V).H3())) {
            int i3 = -pc1Var.O;
            pc1Var.O = i3;
            gm.A3(i3, ioVar, null);
            xx0.APP_ERROR.a();
        }
        int i4 = pc1Var.x;
        this.a = i4;
        if (i4 > captionLimit) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.b) {
            pc1Var.q(z);
        }
        this.b = z;
        if (!pc1Var.W) {
            gm.r(hc1Var);
            gm.d3(hc1Var, 1500L);
        }
        pc1Var.W = false;
        gm.c3(new yt0(this, (byte) 18));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        pc1 pc1Var = this.c;
        ObjectAnimator objectAnimator = pc1Var.g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        pc1Var.b0 = pc1Var.f.getEditText().getScrollY();
        pc1Var.a0 = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        pc1 pc1Var = this.c;
        jc1 jc1Var = pc1Var.f;
        if (!jc1Var.getEditText().h) {
            if (pc1Var.N == null) {
                lc1 lc1Var = new lc1(pc1Var, pc1Var.getContext(), pc1Var.y, LaunchActivity.Q(), new r63(), (byte) 0);
                pc1Var.N = lc1Var;
                pc1Var.U = new wm0(pc1Var.P, lc1Var, 0, false);
                pc1Var.N.p(new ni6(pc1Var, (byte) 14));
                km0 km0Var = pc1Var.h0;
                if (km0Var != null) {
                    lc1 lc1Var2 = pc1Var.N;
                    im0 c = km0Var.c(lc1Var2, null, false);
                    c.p(qqd.i(pc1Var.a));
                    lc1Var2.setBackgroundDrawable(c);
                }
                pc1Var.b.addView(pc1Var.N, qoe.e(-1, -1, 83));
                pc1Var.w();
            }
            if (pc1Var.N.getAdapter() != null) {
                k17 adapter = pc1Var.N.getAdapter();
                oc7.r1(pc1Var.V).W1(Long.valueOf(pc1Var.y));
                TLRPC.Chat L0 = oc7.r1(pc1Var.V).L0(Long.valueOf(-pc1Var.y));
                adapter.getClass();
                adapter.m0 = L0;
                pc1Var.N.getAdapter().U(charSequence, jc1Var.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
