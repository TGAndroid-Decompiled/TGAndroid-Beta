package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
public final class q21 extends q11 {
    public final de0 a;
    public final p66 b;
    public final p66 c;

    public q21(Context context, vnb vnbVar) {
        super(context, vnbVar);
        int i = aob.yj;
        getThemedColor(i);
        setBackground(getThemedColor(aob.wj));
        de0 de0Var = new de0(context);
        this.a = de0Var;
        addView(de0Var, tre.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i);
        int i2 = aob.xj;
        getThemedColor(i2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        p66 p66Var = new p66(context, null);
        this.b = p66Var;
        p66Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        yob.X(p66Var, i, vnbVar);
        p66Var.setTextSize(1, 14.0f);
        p66Var.setTypeface(hl.o());
        linearLayout.addView(p66Var);
        p66 p66Var2 = new p66(context, null);
        this.c = p66Var2;
        p66Var2.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        yob.X(p66Var2, i, vnbVar);
        yob.G(p66Var2, i2, vnbVar);
        p66Var2.setTypeface(Typeface.SANS_SERIF);
        p66Var2.setTextSize(1, 13.0f);
        linearLayout.addView(p66Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }
}
