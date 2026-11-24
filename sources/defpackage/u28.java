package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.ui.ActionBar.d;
public final class u28 extends LinearLayout implements vlb {
    public final l66 a;
    public final l66 b;
    public final w28 c;

    public u28(w28 w28Var, Context context) {
        super(context);
        ylb ylbVar;
        int i;
        ylb ylbVar2;
        this.c = w28Var;
        setOrientation(1);
        int i2 = cmb.c6;
        d38 d38Var = w28Var.q0;
        anb.h(i2, d38Var.getResourceProvider(), this);
        bf0 bf0Var = new bf0(getContext());
        bf0Var.setImageDrawable(new p09(2131624314, gm.L(120.0f), gm.L(120.0f)));
        addView(bf0Var, qoe.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i3 = cmb.x6;
        ylbVar = ((d) d38Var).resourceProvider;
        l66 a = jxe.a(context2, 14.0f, i3, false, ylbVar);
        this.a = a;
        a.setGravity(17);
        if (!w28Var.n0) {
            i = 2131750016;
        } else {
            i = 2131750015;
        }
        a.setText(jb6.M0(i, null));
        addView(a, qoe.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i4 = cmb.Wc;
        ylbVar2 = ((d) d38Var).resourceProvider;
        l66 a2 = jxe.a(context3, 14.0f, i4, false, ylbVar2);
        this.b = a2;
        a2.setGravity(17);
        a2.setText(gm.F2(gm.N2(jb6.M0(2131750017, null), -1, 0, new kl7(this, (byte) 22), null), true, gm.L(2.6666667f), gm.L(1.33f), 1.0f, 2131232247));
        addView(a2, qoe.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        d38 d38Var = this.c.q0;
        setBackgroundColor(d38Var.getThemedColor(cmb.c6));
        this.a.setTextColor(d38Var.getThemedColor(cmb.x6));
        int i = cmb.Wc;
        int themedColor = d38Var.getThemedColor(i);
        l66 l66Var = this.b;
        l66Var.setTextColor(themedColor);
        l66Var.setLinkTextColor(d38Var.getThemedColor(i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
