package defpackage;

import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class cf4 extends mf5 {
    public final nf4 E;
    public final TextView r;
    public final bf4 s;
    public int w;
    public final ll x;
    public boolean y;

    public cf4(defpackage.nf4 r12, android.content.Context r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf4.<init>(nf4, android.content.Context):void");
    }

    public final void d(int i, boolean z) {
        int i2;
        boolean z2;
        float f;
        nf4 nf4Var = this.E;
        if (nf4Var.getUserConfig().p()) {
            i2 = 2131750580;
        } else {
            i2 = 2131750579;
        }
        String M0 = ob6.M0(i2, null);
        TextView textView = this.r;
        textView.setText(M0);
        int i3 = 0;
        if (i < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            int[] iArr = aob.r8;
            i3 = nf4Var.getThemedColor(iArr[i % iArr.length]);
        }
        this.w = i3;
        bf4 bf4Var = this.s;
        if (!z2) {
            bf4Var.setEmojiColor(i3);
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
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).start();
            ViewPropertyAnimator animate2 = bf4Var.animate();
            if (!z2) {
                f2 = 1.0f;
            }
            animate2.alpha(f2).setDuration(320L).setInterpolator(k43Var).start();
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
        bf4 bf4Var = this.s;
        CharSequence m = pv3.m(charSequence, bf4Var.getPaint().getFontMetricsInt(), false, null, 0);
        if (z && !ob6.a0) {
            z2 = true;
        }
        bf4Var.c(m, z2, true);
    }
}
