package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class h83 extends d {
    public static final int[][] r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] s = {bkb.Xj, bkb.Yj, bkb.bk, bkb.ak, bkb.Zj, bkb.fk, bkb.gk};
    public static final int[] w = {2131232146, 2131232140, 2131232143, 2131232141, 2131232142, 2131232147, 2131232139};
    public static final int[] x = {2131748567, 2131748576, 2131748571, 2131748257, 2131748573, 2131748583, 2131752583};
    public static final int[] y = {2, 5, 4, 1, 7, 3, 0};
    public wec a;
    public vec b;
    public FrameLayout c;
    public View d;
    public final e59 e;
    public boolean f;
    public int h;
    public int n;

    public h83() {
        super(null);
        this.e = new e59(0, false);
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131748106, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 10));
        a6 a6Var = new a6(context, (byte) 10);
        zkb.h(bkb.Z6, null, a6Var);
        wec wecVar = new wec(context, null);
        this.a = wecVar;
        wecVar.setAdapter(new sl2(this, (byte) 2));
        this.c = new FrameLayout(context);
        this.b = this.a.l(-2, true);
        a6Var.addView(this.a, nme.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        a6Var.addView(view, nme.e(-1, 0, 48));
        this.d.getLayoutParams().height = gl.L(44.0f) + a.getCurrentActionBarHeight() + this.h;
        this.c.setTranslationY(dg0.d(this.h) - gl.L(9.66f));
        this.c.addView(this.b, nme.c(48.0f, -1));
        this.c.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        FrameLayout frameLayout = this.c;
        il0 c = getBaseSimpleGlass().c.c(this.c, null, false);
        c.p(nod.l(this.resourceProvider));
        c.q(gl.L(9.66f));
        c.r(gl.L(18.0f));
        frameLayout.setBackground(c);
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        wec wecVar2 = this.a;
        pha phaVar = this.simpleActionBar;
        wjb wjbVar = this.resourceProvider;
        baseSimpleGlass.m = a6Var;
        baseSimpleGlass.n = wecVar2;
        baseSimpleGlass.a.c(wecVar2);
        baseSimpleGlass.g(a6Var, phaVar, wjbVar);
        getBaseSimpleGlass().o = new cg0(this, a6Var, (byte) 4);
        getBaseSimpleGlass().n = null;
        a6Var.addView(this.c, nme.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = a6Var;
        return a6Var;
    }

    @Override
    public final wjb getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f) {
            return super.isLightStatusBar();
        }
        if (gl.B(bkb.w0(null, bkb.v8, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= gl.L(48.0f) + a.getCurrentActionBarHeight()) {
                return true;
            }
        }
        if (this.a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.h = i2;
        this.n = i4;
        this.c.setTranslationY(dg0.d(i2) - gl.L(9.66f));
        this.d.getLayoutParams().height = gl.L(44.0f) + a.getCurrentActionBarHeight() + this.h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            e83 e83Var = (e83) it.next();
            h83 h83Var = e83Var.w3;
            dg0.e(e83Var, h83Var.h, h83Var.n, gl.L(42.0f) + a.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.f) {
            this.f = true;
            kk7.e().k(kk7.t4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        View currentView = this.a.getCurrentView();
        if (!(currentView instanceof e83)) {
            return;
        }
        e83 e83Var = (e83) currentView;
        e83Var.f1(new a83(e83Var), 700, true);
    }
}
