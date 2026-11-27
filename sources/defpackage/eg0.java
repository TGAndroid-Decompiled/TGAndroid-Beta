package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class eg0 {
    public final vy4 a;
    public final oz4 b;
    public final ll0 c;
    public final ll0 d;
    public final pz4 e;
    public final ll0 f;
    public final jy4 g;
    public final rz4 h;
    public final rz4 i;
    public Runnable j;
    public final mz4 k;
    public boolean l;
    public FrameLayout m;
    public ViewGroup n;
    public yi5 o;

    public eg0(vy4 vy4Var, sy4 sy4Var) {
        this.a = vy4Var;
        vy4Var.a = new m0(this, (byte) 29);
        vy4Var.d = new gz4(hl.L(48.0f));
        oz4 oz4Var = new oz4();
        this.b = oz4Var;
        oz4Var.a(sy4Var.h());
        vy4Var.E.add(new ty4(oz4Var, sy4Var));
        if (Build.VERSION.SDK_INT >= 31) {
            jy4 jy4Var = new jy4();
            this.g = jy4Var;
            rz4 rz4Var = new rz4(oz4Var);
            rz4Var.f = oz4Var;
            rz4Var.h = jy4Var.d(2);
            this.h = rz4Var;
            rz4 rz4Var2 = new rz4(oz4Var);
            this.i = rz4Var2;
            rz4Var2.f = oz4Var;
            rz4Var2.h = jy4Var.d(3);
            ll0 ll0Var = new ll0(rz4Var, rz4Var2, oz4Var);
            this.c = ll0Var;
            ll0Var.j = vy4Var;
            ll0Var.k = true;
            pz4 pz4Var = new pz4(rz4Var, rz4Var2);
            this.e = pz4Var;
            ll0 ll0Var2 = new ll0(rz4Var2, rz4Var2, oz4Var);
            this.f = ll0Var2;
            ll0Var2.j = vy4Var;
            ll0 ll0Var3 = new ll0(pz4Var, rz4Var2, oz4Var);
            this.d = ll0Var3;
            ll0Var3.j = vy4Var;
            ll0Var3.k = true;
            this.k = jy4Var.d(1);
            return;
        }
        this.k = qz4.a;
        this.g = null;
        this.h = null;
        this.i = null;
        ll0 ll0Var4 = new ll0(oz4Var, oz4Var, oz4Var);
        this.c = ll0Var4;
        ll0Var4.j = vy4Var;
        this.e = null;
        this.d = ll0Var4;
        this.f = ll0Var4;
    }

    public static int e(int i) {
        return Math.max(hl.L(8.0f), hl.L(48.0f) - i);
    }

    public static int f(int i) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        return hl.L(7.0f) + ((i + currentActionBarHeight) - ((currentActionBarHeight - hl.L(46.0f)) / 2));
    }

    public static void g(ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        int i5 = -e(i);
        int i6 = -e(i2);
        hl.v3(viewGroup, 0, i5, 0, i6);
        viewGroup.setPadding(0, (i + i3) - i5, 0, (i2 + i4) - i6);
    }

    public final bz4 a(View view) {
        bz4 bz4Var = new bz4(this.k);
        cz4 cz4Var = new cz4(hl.L(32.0f));
        cz4 cz4Var2 = new cz4(hl.L(56.0f));
        cz4 cz4Var3 = new cz4(hl.L(48.0f));
        if (bz4Var.y != 1) {
            bz4Var.y = 1;
            bz4Var.w = true;
            bz4Var.x = true;
            bz4Var.invalidateSelf();
        }
        bz4Var.H = this.b;
        bz4Var.w = true;
        bz4Var.updateColors();
        bz4Var.invalidateSelf();
        bz4Var.J = (short) 160;
        oz4 oz4Var = bz4Var.H;
        if (oz4Var != null) {
            bz4Var.I = aob.p1(0.627451f, oz4Var.b);
        }
        bz4Var.w = true;
        bz4Var.invalidateSelf();
        bz4Var.E = cz4Var;
        bz4Var.w = true;
        bz4Var.invalidateSelf();
        bz4Var.F = cz4Var2;
        bz4Var.w = true;
        bz4Var.invalidateSelf();
        bz4Var.L = (short) 210;
        oz4 oz4Var2 = bz4Var.H;
        if (oz4Var2 != null) {
            bz4Var.K = aob.p1(0.8235294f, oz4Var2.b);
        }
        bz4Var.x = true;
        bz4Var.invalidateSelf();
        bz4Var.G = cz4Var3;
        bz4Var.x = true;
        bz4Var.invalidateSelf();
        this.a.c.add(new uy4(view, bz4Var));
        return bz4Var;
    }

    public final bz4 b(View view) {
        bz4 bz4Var = new bz4(this.k);
        cz4 cz4Var = new cz4(hl.L(28.0f));
        cz4 cz4Var2 = new cz4(hl.L(40.0f));
        cz4 cz4Var3 = new cz4(hl.L(30.0f));
        if (bz4Var.y != 4) {
            bz4Var.y = 4;
            bz4Var.w = true;
            bz4Var.x = true;
            bz4Var.invalidateSelf();
        }
        bz4Var.H = this.b;
        bz4Var.w = true;
        bz4Var.updateColors();
        bz4Var.invalidateSelf();
        bz4Var.J = (short) 160;
        oz4 oz4Var = bz4Var.H;
        if (oz4Var != null) {
            bz4Var.I = aob.p1(0.627451f, oz4Var.b);
        }
        bz4Var.w = true;
        bz4Var.invalidateSelf();
        bz4Var.E = cz4Var;
        bz4Var.w = true;
        bz4Var.invalidateSelf();
        bz4Var.F = cz4Var2;
        bz4Var.w = true;
        bz4Var.invalidateSelf();
        bz4Var.L = (short) 210;
        oz4 oz4Var2 = bz4Var.H;
        if (oz4Var2 != null) {
            bz4Var.K = aob.p1(0.8235294f, oz4Var2.b);
        }
        bz4Var.x = true;
        bz4Var.invalidateSelf();
        bz4Var.G = cz4Var3;
        bz4Var.x = true;
        bz4Var.invalidateSelf();
        this.a.c.add(new uy4(view, bz4Var));
        return bz4Var;
    }

    public final rz4 c() {
        if (vy4.f().a) {
            return this.i;
        }
        return null;
    }

    public final rz4 d() {
        if (vy4.f().a) {
            return this.h;
        }
        return null;
    }

    public final void h(FrameLayout frameLayout, d79 d79Var, View view, vnb vnbVar) {
        this.m = frameLayout;
        this.n = d79Var;
        d79Var.setCaptureSectionsDecoratorAllowed(true);
        this.o = new dg0(d79Var, frameLayout, (byte) 1);
        this.a.b(d79Var);
        d79Var.setClipToPadding(false);
        j(frameLayout, view, vnbVar);
    }

    public final void i(FrameLayout frameLayout, View view, vnb vnbVar) {
        this.m = frameLayout;
        this.n = null;
        j(frameLayout, view, vnbVar);
    }

    public final void j(FrameLayout frameLayout, View view, vnb vnbVar) {
        if (view != null) {
            hl.B2(view);
            frameLayout.addView(view, tre.e(-1, -2, 48));
            boolean z = view instanceof jla;
            ll0 ll0Var = this.c;
            if (z) {
                jla jlaVar = (jla) view;
                jlaVar.setExtraHeight(hl.L(6.0f));
                ol0 l = dtd.l(vnbVar);
                jlaVar.S = ll0Var;
                jlaVar.T = l;
                jlaVar.s();
                jlaVar.v0 = this.d;
                jlaVar.w0 = this.e;
            } else if (view instanceof a) {
                a aVar = (a) view;
                aVar.setAddToContainer(false);
                aVar.setCenterTitleAndGlass(true);
                aVar.setExtraHeight(hl.L(6.0f));
                aVar.U0 = true;
                aVar.P(ll0Var, dtd.l(vnbVar), false);
            }
        }
    }
}
