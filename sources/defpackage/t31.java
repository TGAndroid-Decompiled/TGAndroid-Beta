package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
public final class t31 extends p21 {
    public final hd0 a;
    public final l66 b;
    public final l66 c;
    public final LinearLayout d;

    public t31(ylb ylbVar, Context context, boolean z) {
        super(context, ylbVar);
        a31 a31Var;
        hd0 hd0Var = new hd0(context, false);
        this.a = hd0Var;
        hd0Var.setStyle(11);
        hd0Var.setAvatarsTextSize(gm.L(18.0f));
        addView(hd0Var, qoe.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z) {
            a31Var = new a31(context, null, (byte) 1);
            this.b = a31Var;
            nm7.i(a31Var);
            a31Var.setTypeface(Typeface.SANS_SERIF);
            a31Var.setTextSize(1, 15.0f);
            a31Var.setEllipsize(TextUtils.TruncateAt.END);
            a31Var.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
            a31Var.setGravity(jb6.a0 ? 5 : 3);
            addView(a31Var, qoe.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, qoe.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            a31 a31Var2 = new a31(context, null, (byte) 2);
            this.b = a31Var2;
            nm7.i(a31Var2);
            Typeface typeface = Typeface.SANS_SERIF;
            a31Var2.setTypeface(typeface);
            a31Var2.setTextSize(1, 14.0f);
            a31Var2.setTypeface(gm.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            a31Var2.setEllipsize(truncateAt);
            a31Var2.setMaxLines(1);
            linearLayout.addView(a31Var2);
            l66 l66Var = new l66(context, null);
            this.c = l66Var;
            l66Var.setTypeface(typeface);
            l66Var.setTextSize(1, 12.0f);
            l66Var.setEllipsize(truncateAt);
            l66Var.setSingleLine(false);
            l66Var.setMaxLines(3);
            anb.G(l66Var, cmb.wj, ylbVar);
            linearLayout.addView(l66Var, qoe.t(-2, -2, 0, 0, 0, 0, 0));
            a31Var = a31Var2;
        }
        anb.G(a31Var, cmb.wj, ylbVar);
        setTextColor(getThemedColor(cmb.xj));
        setBackground(getThemedColor(cmb.vj));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i) {
        this.b.setTextColor(i);
        l66 l66Var = this.c;
        if (l66Var != null) {
            l66Var.setTextColor(i);
        }
    }
}
