package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
public final class u21 extends q11 {
    public final jc0 a;
    public final p66 b;
    public final p66 c;
    public final LinearLayout d;

    public u21(vnb vnbVar, Context context, boolean z) {
        super(context, vnbVar);
        b21 b21Var;
        jc0 jc0Var = new jc0(context, false);
        this.a = jc0Var;
        jc0Var.setStyle(11);
        jc0Var.setAvatarsTextSize(hl.L(18.0f));
        addView(jc0Var, tre.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z) {
            b21Var = new b21(context, null, (byte) 1);
            this.b = b21Var;
            jn7.i(b21Var);
            b21Var.setTypeface(Typeface.SANS_SERIF);
            b21Var.setTextSize(1, 15.0f);
            b21Var.setEllipsize(TextUtils.TruncateAt.END);
            b21Var.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
            b21Var.setGravity(ob6.a0 ? 5 : 3);
            addView(b21Var, tre.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, tre.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            b21 b21Var2 = new b21(context, null, (byte) 2);
            this.b = b21Var2;
            jn7.i(b21Var2);
            Typeface typeface = Typeface.SANS_SERIF;
            b21Var2.setTypeface(typeface);
            b21Var2.setTextSize(1, 14.0f);
            b21Var2.setTypeface(hl.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            b21Var2.setEllipsize(truncateAt);
            b21Var2.setMaxLines(1);
            linearLayout.addView(b21Var2);
            p66 p66Var = new p66(context, null);
            this.c = p66Var;
            p66Var.setTypeface(typeface);
            p66Var.setTextSize(1, 12.0f);
            p66Var.setEllipsize(truncateAt);
            p66Var.setSingleLine(false);
            p66Var.setMaxLines(3);
            yob.G(p66Var, aob.xj, vnbVar);
            linearLayout.addView(p66Var, tre.t(-2, -2, 0, 0, 0, 0, 0));
            b21Var = b21Var2;
        }
        yob.G(b21Var, aob.xj, vnbVar);
        setTextColor(getThemedColor(aob.yj));
        setBackground(getThemedColor(aob.wj));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i) {
        this.b.setTextColor(i);
        p66 p66Var = this.c;
        if (p66Var != null) {
            p66Var.setTextColor(i);
        }
    }
}
