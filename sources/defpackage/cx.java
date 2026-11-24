package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class cx extends FrameLayout {
    public final LinearLayout a;
    public boolean b;
    public final bf0 c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final b61 h;
    public ValueAnimator n;
    public boolean r;

    public cx(Context context) {
        super(context);
        this.r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setPadding(gm.L(32.0f), gm.L(24.0f), gm.L(32.0f), gm.L(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, qoe.e(-2, -2, 17));
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        linearLayout.addView(bf0Var, qoe.o(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(gm.o());
        textView.setTextColor(-1);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = m;
        m.setTextSize(1, 15.0f);
        m.setTextColor(-1);
        m.setSingleLine(false);
        m.setMaxLines(3);
        TextView m2 = wi8.m(linearLayout, m, qoe.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f = m2;
        m2.setTextSize(1, 12.0f);
        m2.setTextColor(-1);
        m2.setAlpha(0.4f);
        linearLayout.addView(m2, qoe.r(-2, -2, 3));
        b61 b61Var = new b61(null, context, true);
        this.h = b61Var;
        b61Var.setMinWidth(gm.L(140.0f));
        b61Var.i(jb6.M0(2131746073, null), false, true);
        linearLayout.addView(b61Var, qoe.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(jb6.M0(2131742585, null));
        hg9.q(null, null, 2131742587, new Object[]{str}, this.e);
        this.f.setText(str2);
    }

    public final void b(boolean z, boolean z2) {
        int i;
        int i2;
        if (this.r == z) {
            return;
        }
        this.r = z;
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z2) {
            float f = 1.0f;
            float f2 = 0.0f;
            if (!z) {
                f2 = 1.0f;
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.n = ofFloat;
            ofFloat.addUpdateListener(new f0(this, (byte) 8));
            this.n.start();
            return;
        }
        int i3 = -1;
        if (!z) {
            i = -16777216;
        } else {
            i = -1;
        }
        this.d.setTextColor(i);
        if (!z) {
            i2 = -16777216;
        } else {
            i2 = -1;
        }
        this.e.setTextColor(i2);
        if (!z) {
            i3 = -16777216;
        }
        this.f.setTextColor(i3);
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && !this.b) {
            this.b = true;
            hs6.d0(z8c.t0).e2(this.c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
