package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
public final class ck1 extends FrameLayout {
    public final q7c a;
    public final ylb b;
    public final int c;
    public final int d;
    public final eh e;
    public final ek1 f;

    public ck1(ek1 ek1Var, Activity activity, int i, int i2, int i3, eh ehVar, ylb ylbVar) {
        super(activity);
        this.f = ek1Var;
        this.d = i;
        this.c = i2;
        this.b = ylbVar;
        this.e = ehVar;
        q7c q7cVar = new q7c(activity, i2, i3, true, new f(this, (byte) 25), new cd1(this, (byte) 4), null, ylbVar);
        this.a = q7cVar;
        setClipChildren(false);
        setClipToPadding(false);
        q7cVar.setClipToPadding(false);
        q7cVar.s1(gm.L(12.0f), gm.L(16.0f), false);
        q7cVar.g3.r = false;
        q7cVar.setCaptureSectionsDecoratorAllowed(true);
        q7cVar.setOverScrollMode(0);
        addView(q7cVar, qoe.c(-1.0f, -1));
        q7cVar.setOnScrollListener(new bk1(this, ehVar, (byte) 0));
        sy4 sy4Var = ek1Var.x.d1;
        if (sy4Var != null) {
            sy4Var.b(q7cVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g3.O(false);
    }
}
