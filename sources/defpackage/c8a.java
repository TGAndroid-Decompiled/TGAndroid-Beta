package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class c8a extends LinearLayout implements tjb {
    public final wjb a;
    public final l46 b;
    public final l46 c;
    public final u41 d;
    public final u41 e;

    public c8a(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        setOrientation(1);
        int i = bkb.F6;
        l46 a = hve.a(context, 15.0f, i, true, wjbVar);
        this.b = a;
        a.setGravity(17);
        addView(a, nme.t(-1, -2, 55, 32, 20, 32, 0));
        l46 a2 = hve.a(context, 13.0f, i, false, wjbVar);
        this.c = a2;
        a2.setGravity(17);
        addView(a2, nme.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        u41 i2 = yjb.i(24, wjbVar, context, true);
        this.d = i2;
        u41 i3 = yjb.i(24, wjbVar, context, true);
        this.e = i3;
        linearLayout.addView(i2, nme.q(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(i3, nme.q(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, nme.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
    }

    @Override
    public final void updateColors() {
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.b.setTextColor(bkb.v0(i, wjbVar));
        this.c.setTextColor(bkb.v0(i, wjbVar));
    }
}
