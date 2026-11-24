package defpackage;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class ef4 extends jf5 {
    public final qf4 E;
    public final TextView r;
    public final df4 s;
    public int w;
    public final km x;
    public boolean y;

    public ef4(qf4 qf4Var, Context context) {
        super(context, cmb.K6, 22, 15, false, qf4.f0(qf4Var));
        int i;
        int i2;
        this.E = qf4Var;
        TextView textView = new TextView(getContext());
        this.r = textView;
        textView.setTextSize(1, 14.0f);
        anb.X(textView, cmb.y6, qf4Var.getResourceProvider());
        if (qf4Var.getUserConfig().p()) {
            i = 2131750552;
        } else {
            i = 2131750551;
        }
        textView.setText(jb6.M0(i, null));
        textView.setGravity(5);
        if (jb6.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        float f = this.b;
        addView(textView, qoe.d(-1, -1.0f, i2 | 48, f, 16.66f, f, this.c));
        textView.setAlpha(0.0f);
        df4 df4Var = new df4(this, getContext());
        this.s = df4Var;
        this.x = new km(df4Var, 320L, d53.h, 0);
        df4Var.setTextSize(gm.L(10.0f));
        df4Var.setTypeface(gm.o());
        df4Var.setGravity(5);
        df4Var.setPadding(gm.L(4.66f), 0, gm.L(4.66f), 0);
        int i3 = jb6.a0 ? 3 : 5;
        float f2 = this.b;
        addView(df4Var, qoe.d(-1, -1.0f, i3 | 48, f2, 16.66f, f2, this.c));
    }

    public final void d(int i, boolean z) {
        int i2;
        boolean z2;
        float f;
        qf4 qf4Var = this.E;
        if (qf4Var.getUserConfig().p()) {
            i2 = 2131750552;
        } else {
            i2 = 2131750551;
        }
        String M0 = jb6.M0(i2, null);
        TextView textView = this.r;
        textView.setText(M0);
        int i3 = 0;
        if (i < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            int[] iArr = cmb.q8;
            i3 = qf4Var.getThemedColor(iArr[i % iArr.length]);
        }
        this.w = i3;
        df4 df4Var = this.s;
        if (!z2) {
            df4Var.setEmojiColor(i3);
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
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).start();
            ViewPropertyAnimator animate2 = df4Var.animate();
            if (!z2) {
                f2 = 1.0f;
            }
            animate2.alpha(f2).setDuration(320L).setInterpolator(d53Var).start();
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
        df4 df4Var = this.s;
        CharSequence m = gw3.m(charSequence, df4Var.getPaint().getFontMetricsInt(), false, null, 0);
        if (z && !jb6.a0) {
            z2 = true;
        }
        df4Var.c(m, z2, true);
    }
}
