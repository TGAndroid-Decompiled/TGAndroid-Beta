package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
public final class ti1 extends FrameLayout {
    public final q5c a;
    public final wjb b;
    public final int c;
    public final int d;
    public final eg e;
    public final vi1 f;

    public ti1(vi1 vi1Var, Activity activity, int i, int i2, int i3, eg egVar, wjb wjbVar) {
        super(activity);
        this.f = vi1Var;
        this.d = i;
        this.c = i2;
        this.b = wjbVar;
        this.e = egVar;
        q5c q5cVar = new q5c(activity, i2, i3, true, new f(this, (byte) 25), new rh1(this, (byte) 1), null, wjbVar);
        this.a = q5cVar;
        setClipChildren(false);
        setClipToPadding(false);
        q5cVar.setClipToPadding(false);
        q5cVar.s1(gl.L(12.0f), gl.L(16.0f), false);
        q5cVar.g3.r = false;
        q5cVar.setCaptureSectionsDecoratorAllowed(true);
        q5cVar.setOverScrollMode(0);
        addView(q5cVar, nme.c(-1.0f, -1));
        q5cVar.setOnScrollListener(new si1(this, egVar, (byte) 0));
        qw4 qw4Var = vi1Var.x.d1;
        if (qw4Var != null) {
            qw4Var.b(q5cVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g3.O(false);
    }
}
