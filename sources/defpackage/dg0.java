package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class dg0 {
    public final qw4 a;
    public final ix4 b;
    public final kl0 c;
    public final kl0 d;
    public final jx4 e;
    public final kl0 f;
    public final ew4 g;
    public final lx4 h;
    public final lx4 i;
    public Runnable j;
    public final gx4 k;
    public boolean l;
    public FrameLayout m;
    public ViewGroup n;
    public wg5 o;

    public dg0(qw4 qw4Var, nw4 nw4Var) {
        this.a = qw4Var;
        qw4Var.a = new l0(this, (byte) 29);
        qw4Var.d = new ax4(gl.L(48.0f));
        ix4 ix4Var = new ix4();
        this.b = ix4Var;
        ix4Var.a(nw4Var.i());
        qw4Var.E.add(new ow4(ix4Var, nw4Var));
        if (Build.VERSION.SDK_INT >= 31) {
            ew4 ew4Var = new ew4();
            this.g = ew4Var;
            lx4 lx4Var = new lx4(ix4Var);
            lx4Var.f = ix4Var;
            lx4Var.h = ew4Var.d(2);
            this.h = lx4Var;
            lx4 lx4Var2 = new lx4(ix4Var);
            this.i = lx4Var2;
            lx4Var2.f = ix4Var;
            lx4Var2.h = ew4Var.d(3);
            kl0 kl0Var = new kl0(lx4Var, lx4Var2, ix4Var);
            this.c = kl0Var;
            kl0Var.j = qw4Var;
            kl0Var.k = true;
            jx4 jx4Var = new jx4(lx4Var, lx4Var2);
            this.e = jx4Var;
            kl0 kl0Var2 = new kl0(lx4Var2, lx4Var2, ix4Var);
            this.f = kl0Var2;
            kl0Var2.j = qw4Var;
            kl0 kl0Var3 = new kl0(jx4Var, lx4Var2, ix4Var);
            this.d = kl0Var3;
            kl0Var3.j = qw4Var;
            kl0Var3.k = true;
            this.k = ew4Var.d(1);
            return;
        }
        this.k = kx4.a;
        this.g = null;
        this.h = null;
        this.i = null;
        kl0 kl0Var4 = new kl0(ix4Var, ix4Var, ix4Var);
        this.c = kl0Var4;
        kl0Var4.j = qw4Var;
        this.e = null;
        this.d = kl0Var4;
        this.f = kl0Var4;
    }

    public static int c(int i) {
        return Math.max(gl.L(8.0f), gl.L(48.0f) - i);
    }

    public static int d(int i) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        return gl.L(7.0f) + ((i + currentActionBarHeight) - ((currentActionBarHeight - gl.L(46.0f)) / 2));
    }

    public static void e(ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        int i5 = -c(i);
        int i6 = -c(i2);
        gl.v3(viewGroup, 0, i5, 0, i6);
        viewGroup.setPadding(0, (i + i3) - i5, 0, (i2 + i4) - i6);
    }

    public final ww4 a(View view) {
        ww4 ww4Var = new ww4(this.k);
        xw4 xw4Var = new xw4(gl.L(32.0f));
        xw4 xw4Var2 = new xw4(gl.L(56.0f));
        xw4 xw4Var3 = new xw4(gl.L(48.0f));
        if (ww4Var.y != 1) {
            ww4Var.y = 1;
            ww4Var.w = true;
            ww4Var.x = true;
            ww4Var.invalidateSelf();
        }
        ww4Var.H = this.b;
        ww4Var.w = true;
        ww4Var.updateColors();
        ww4Var.invalidateSelf();
        ww4Var.J = (short) 160;
        ix4 ix4Var = ww4Var.H;
        if (ix4Var != null) {
            ww4Var.I = bkb.p1(0.627451f, ix4Var.b);
        }
        ww4Var.w = true;
        ww4Var.invalidateSelf();
        ww4Var.E = xw4Var;
        ww4Var.w = true;
        ww4Var.invalidateSelf();
        ww4Var.F = xw4Var2;
        ww4Var.w = true;
        ww4Var.invalidateSelf();
        ww4Var.L = (short) 210;
        ix4 ix4Var2 = ww4Var.H;
        if (ix4Var2 != null) {
            ww4Var.K = bkb.p1(0.8235294f, ix4Var2.b);
        }
        ww4Var.x = true;
        ww4Var.invalidateSelf();
        ww4Var.G = xw4Var3;
        ww4Var.x = true;
        ww4Var.invalidateSelf();
        this.a.c.add(new pw4(view, ww4Var));
        return ww4Var;
    }

    public final ww4 b(View view) {
        ww4 ww4Var = new ww4(this.k);
        xw4 xw4Var = new xw4(gl.L(28.0f));
        xw4 xw4Var2 = new xw4(gl.L(40.0f));
        xw4 xw4Var3 = new xw4(gl.L(30.0f));
        if (ww4Var.y != 4) {
            ww4Var.y = 4;
            ww4Var.w = true;
            ww4Var.x = true;
            ww4Var.invalidateSelf();
        }
        ww4Var.H = this.b;
        ww4Var.w = true;
        ww4Var.updateColors();
        ww4Var.invalidateSelf();
        ww4Var.J = (short) 160;
        ix4 ix4Var = ww4Var.H;
        if (ix4Var != null) {
            ww4Var.I = bkb.p1(0.627451f, ix4Var.b);
        }
        ww4Var.w = true;
        ww4Var.invalidateSelf();
        ww4Var.E = xw4Var;
        ww4Var.w = true;
        ww4Var.invalidateSelf();
        ww4Var.F = xw4Var2;
        ww4Var.w = true;
        ww4Var.invalidateSelf();
        ww4Var.L = (short) 210;
        ix4 ix4Var2 = ww4Var.H;
        if (ix4Var2 != null) {
            ww4Var.K = bkb.p1(0.8235294f, ix4Var2.b);
        }
        ww4Var.x = true;
        ww4Var.invalidateSelf();
        ww4Var.G = xw4Var3;
        ww4Var.x = true;
        ww4Var.invalidateSelf();
        this.a.c.add(new pw4(view, ww4Var));
        return ww4Var;
    }

    public final void f(FrameLayout frameLayout, o39 o39Var, View view, wjb wjbVar) {
        this.m = frameLayout;
        this.n = o39Var;
        o39Var.setCaptureSectionsDecoratorAllowed(true);
        this.o = new cg0(o39Var, frameLayout, (byte) 1);
        this.a.b(o39Var);
        o39Var.setClipToPadding(false);
        g(frameLayout, view, wjbVar);
    }

    public final void g(FrameLayout frameLayout, View view, wjb wjbVar) {
        if (view != null) {
            gl.B2(view);
            frameLayout.addView(view, nme.e(-1, -2, 48));
            boolean z = view instanceof pha;
            kl0 kl0Var = this.c;
            if (z) {
                pha phaVar = (pha) view;
                phaVar.setExtraHeight(gl.L(6.0f));
                nl0 l = nod.l(wjbVar);
                phaVar.M = kl0Var;
                phaVar.N = l;
                phaVar.r();
                phaVar.p0 = this.d;
                phaVar.q0 = this.e;
            } else if (view instanceof a) {
                a aVar = (a) view;
                aVar.setAddToContainer(false);
                aVar.setCenterTitleAndGlass(true);
                aVar.setExtraHeight(gl.L(6.0f));
                aVar.U0 = true;
                aVar.P(kl0Var, nod.l(wjbVar), false);
            }
        }
    }
}
