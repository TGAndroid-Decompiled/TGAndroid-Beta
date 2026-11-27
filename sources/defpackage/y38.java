package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e;
public final class y38 extends LinearLayout implements snb {
    public final p66 a;
    public final p66 b;
    public final a48 c;

    public y38(a48 a48Var, Context context) {
        super(context);
        vnb vnbVar;
        int i;
        vnb vnbVar2;
        this.c = a48Var;
        setOrientation(1);
        int i2 = aob.d6;
        h48 h48Var = a48Var.q0;
        yob.h(i2, h48Var.getResourceProvider(), this);
        de0 de0Var = new de0(getContext());
        de0Var.setImageDrawable(new b29(2131624314, hl.L(120.0f), hl.L(120.0f)));
        addView(de0Var, tre.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i3 = aob.y6;
        vnbVar = ((e) h48Var).resourceProvider;
        p66 a = zze.a(context2, 14.0f, i3, false, vnbVar);
        this.a = a;
        a.setGravity(17);
        if (!a48Var.n0) {
            i = 2131750041;
        } else {
            i = 2131750040;
        }
        a.setText(ob6.M0(i, null));
        addView(a, tre.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i4 = aob.Xc;
        vnbVar2 = ((e) h48Var).resourceProvider;
        p66 a2 = zze.a(context3, 14.0f, i4, false, vnbVar2);
        this.b = a2;
        a2.setGravity(17);
        a2.setText(hl.F2(hl.N2(ob6.M0(2131750042, null), -1, 0, new x38(this, (byte) 0), null), true, hl.L(2.6666667f), hl.L(1.33f), 1.0f, 2131232246));
        addView(a2, tre.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override
    public final void updateColors() {
        h48 h48Var = this.c.q0;
        setBackgroundColor(h48Var.getThemedColor(aob.d6));
        this.a.setTextColor(h48Var.getThemedColor(aob.y6));
        int i = aob.Xc;
        int themedColor = h48Var.getThemedColor(i);
        p66 p66Var = this.b;
        p66Var.setTextColor(themedColor);
        p66Var.setLinkTextColor(h48Var.getThemedColor(i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
