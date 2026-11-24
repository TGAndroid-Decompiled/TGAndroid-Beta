package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class caa extends LinearLayout implements vlb {
    public final ylb a;
    public final l66 b;
    public final l66 c;
    public final b61 d;
    public final b61 e;

    public caa(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        setOrientation(1);
        int i = cmb.F6;
        l66 a = jxe.a(context, 15.0f, i, true, ylbVar);
        this.b = a;
        a.setGravity(17);
        addView(a, qoe.t(-1, -2, 55, 32, 20, 32, 0));
        l66 a2 = jxe.a(context, 13.0f, i, false, ylbVar);
        this.c = a2;
        a2.setGravity(17);
        addView(a2, qoe.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        b61 i2 = mlb.i(24, ylbVar, context, true);
        this.d = i2;
        b61 i3 = mlb.i(24, ylbVar, context, true);
        this.e = i3;
        linearLayout.addView(i2, qoe.q(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(i3, qoe.q(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, qoe.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
    }

    @Override
    public final void updateColors() {
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.b.setTextColor(cmb.v0(i, ylbVar));
        this.c.setTextColor(cmb.v0(i, ylbVar));
    }
}
