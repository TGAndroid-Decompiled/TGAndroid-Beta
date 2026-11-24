package defpackage;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class ed4 extends ld5 {
    public final pd4 E;
    public final TextView r;
    public final dd4 s;
    public int w;
    public final kl x;
    public boolean y;

    public ed4(defpackage.pd4 r12, android.content.Context r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed4.<init>(pd4, android.content.Context):void");
    }

    public final void d(int i, boolean z) {
        int i2;
        boolean z2;
        float f;
        pd4 pd4Var = this.E;
        if (pd4Var.getUserConfig().p()) {
            i2 = 2131750603;
        } else {
            i2 = 2131750602;
        }
        String M0 = k96.M0(i2, null);
        TextView textView = this.r;
        textView.setText(M0);
        int i3 = 0;
        if (i < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            int[] iArr = bkb.q8;
            i3 = pd4Var.getThemedColor(iArr[i % iArr.length]);
        }
        this.w = i3;
        dd4 dd4Var = this.s;
        if (!z2) {
            dd4Var.setEmojiColor(i3);
        }
        if (!z) {
            this.x.a(this.w, true);
        }
        if (z2 != this.y) {
            this.y = z2;
            ViewPropertyAnimator animate = textView.animate();
            float f2 = 0.0f;
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f).setDuration(320L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).start();
            ViewPropertyAnimator animate2 = dd4Var.animate();
            if (!z2) {
                f2 = 1.0f;
            }
            animate2.alpha(f2).setDuration(320L).setInterpolator(s33Var).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z2 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        dd4 dd4Var = this.s;
        CharSequence m = vu3.m(charSequence, dd4Var.getPaint().getFontMetricsInt(), false, null, 0);
        if (z && !k96.a0) {
            z2 = true;
        }
        dd4Var.c(m, z2, true);
    }
}
