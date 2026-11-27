package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
public final class cj1 extends FrameLayout {
    public final q9c a;
    public final vnb b;
    public final int c;
    public final int d;
    public final zd e;
    public final ej1 f;

    public cj1(ej1 ej1Var, Activity activity, int i, int i2, int i3, zd zdVar, vnb vnbVar) {
        super(activity);
        this.f = ej1Var;
        this.d = i;
        this.c = i2;
        this.b = vnbVar;
        this.e = zdVar;
        q9c q9cVar = new q9c(activity, i2, i3, true, new c(this, (byte) 25), new rd1(this, (byte) 3), null, vnbVar);
        this.a = q9cVar;
        setClipChildren(false);
        setClipToPadding(false);
        q9cVar.setClipToPadding(false);
        q9cVar.t1(hl.L(12.0f), hl.L(16.0f), false);
        q9cVar.g3.r = false;
        q9cVar.setCaptureSectionsDecoratorAllowed(true);
        q9cVar.setOverScrollMode(0);
        addView(q9cVar, tre.c(-1.0f, -1));
        q9cVar.setOnScrollListener(new bj1(this, zdVar, (byte) 0));
        vy4 vy4Var = ej1Var.x.d1;
        if (vy4Var != null) {
            vy4Var.b(q9cVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g3.O(false);
    }
}
