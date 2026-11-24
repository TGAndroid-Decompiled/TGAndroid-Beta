package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
public final class p31 extends p21 {
    public final bf0 a;
    public final l66 b;
    public final l66 c;

    public p31(Context context, ylb ylbVar) {
        super(context, ylbVar);
        int i = cmb.xj;
        getThemedColor(i);
        setBackground(getThemedColor(cmb.vj));
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        addView(bf0Var, qoe.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i);
        int i2 = cmb.wj;
        getThemedColor(i2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        l66 l66Var = new l66(context, null);
        this.b = l66Var;
        l66Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        anb.X(l66Var, i, ylbVar);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setTypeface(gm.o());
        linearLayout.addView(l66Var);
        l66 l66Var2 = new l66(context, null);
        this.c = l66Var2;
        l66Var2.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        anb.X(l66Var2, i, ylbVar);
        anb.G(l66Var2, i2, ylbVar);
        l66Var2.setTypeface(Typeface.SANS_SERIF);
        l66Var2.setTextSize(1, 13.0f);
        linearLayout.addView(l66Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }
}
