package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
public final class h21 extends h11 {
    public final be0 a;
    public final l46 b;
    public final l46 c;

    public h21(Context context, wjb wjbVar) {
        super(context, wjbVar);
        int i = bkb.xj;
        getThemedColor(i);
        setBackground(getThemedColor(bkb.vj));
        be0 be0Var = new be0(context);
        this.a = be0Var;
        addView(be0Var, nme.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i);
        int i2 = bkb.wj;
        getThemedColor(i2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        l46 l46Var = new l46(context, null);
        this.b = l46Var;
        l46Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        zkb.X(l46Var, i, wjbVar);
        l46Var.setTextSize(1, 14.0f);
        l46Var.setTypeface(gl.o());
        linearLayout.addView(l46Var);
        l46 l46Var2 = new l46(context, null);
        this.c = l46Var2;
        l46Var2.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        zkb.X(l46Var2, i, wjbVar);
        zkb.G(l46Var2, i2, wjbVar);
        l46Var2.setTypeface(Typeface.SANS_SERIF);
        l46Var2.setTextSize(1, 13.0f);
        linearLayout.addView(l46Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }
}
