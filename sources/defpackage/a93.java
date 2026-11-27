package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class a93 extends e {
    public static final int[][] r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] s = {aob.Yj, aob.Zj, aob.ck, aob.bk, aob.ak, aob.gk, aob.hk};
    public static final int[] w = {2131232146, 2131232140, 2131232143, 2131232141, 2131232142, 2131232147, 2131232139};
    public static final int[] x = {2131748513, 2131748522, 2131748517, 2131748203, 2131748519, 2131748529, 2131752576};
    public static final int[] y = {2, 5, 4, 1, 7, 3, 0};
    public vic a;
    public uic b;
    public FrameLayout c;
    public View d;
    public final r89 e;
    public boolean f;
    public int h;
    public int n;

    public a93() {
        super(null);
        this.e = new r89(0, false);
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131748052, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 11));
        b6 b6Var = new b6(context, (byte) 10);
        yob.h(aob.a7, null, b6Var);
        vic vicVar = new vic(context, null);
        this.a = vicVar;
        vicVar.setAdapter(new mm2(this, (byte) 2));
        this.c = new FrameLayout(context);
        this.b = this.a.l(-2, true);
        b6Var.addView(this.a, tre.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        b6Var.addView(view, tre.e(-1, 0, 48));
        this.d.getLayoutParams().height = hl.L(44.0f) + a.getCurrentActionBarHeight() + this.h;
        this.c.setTranslationY(eg0.f(this.h) - hl.L(9.66f));
        this.c.addView(this.b, tre.c(48.0f, -1));
        this.c.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        FrameLayout frameLayout = this.c;
        jl0 c = getBaseSimpleGlass().c.c(this.c, null, false);
        c.p(dtd.l(this.resourceProvider));
        c.q(hl.L(9.66f));
        c.r(hl.L(18.0f));
        frameLayout.setBackground(c);
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        vic vicVar2 = this.a;
        jla jlaVar = this.simpleActionBar;
        vnb vnbVar = this.resourceProvider;
        baseSimpleGlass.m = b6Var;
        baseSimpleGlass.n = vicVar2;
        baseSimpleGlass.a.c(vicVar2);
        baseSimpleGlass.j(b6Var, jlaVar, vnbVar);
        getBaseSimpleGlass().o = new dg0(this, b6Var, (byte) 4);
        getBaseSimpleGlass().n = null;
        b6Var.addView(this.c, tre.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = b6Var;
        return b6Var;
    }

    @Override
    public final vnb getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f) {
            return super.isLightStatusBar();
        }
        if (hl.B(aob.w0(null, aob.w8, false)) <= 0.721f) {
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
            if (motionEvent.getY() <= hl.L(48.0f) + a.getCurrentActionBarHeight()) {
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
        this.c.setTranslationY(eg0.f(i2) - hl.L(9.66f));
        this.d.getLayoutParams().height = hl.L(44.0f) + a.getCurrentActionBarHeight() + this.h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            x83 x83Var = (x83) it.next();
            a93 a93Var = x83Var.w3;
            eg0.g(x83Var, a93Var.h, a93Var.n, hl.L(42.0f) + a.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.f) {
            this.f = true;
            jn7.e().k(jn7.u4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void x0() {
        View currentView = this.a.getCurrentView();
        if (!(currentView instanceof x83)) {
            return;
        }
        x83 x83Var = (x83) currentView;
        x83Var.g1(new t83(x83Var), 700, true);
    }
}
