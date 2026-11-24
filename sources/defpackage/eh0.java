package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
public final class eh0 {
    public final sy4 a;
    public final kz4 b;
    public final km0 c;
    public final km0 d;
    public final lz4 e;
    public final km0 f;
    public final gy4 g;
    public final nz4 h;
    public final nz4 i;
    public Runnable j;
    public final iz4 k;
    public boolean l;
    public FrameLayout m;
    public ViewGroup n;
    public vi5 o;

    public eh0(sy4 sy4Var, py4 py4Var) {
        this.a = sy4Var;
        sy4Var.a = new xg0(this, (byte) 1);
        sy4Var.d = new cz4(gm.L(48.0f));
        kz4 kz4Var = new kz4();
        this.b = kz4Var;
        kz4Var.a(py4Var.i());
        sy4Var.E.add(new qy4(kz4Var, py4Var));
        if (Build.VERSION.SDK_INT >= 31) {
            gy4 gy4Var = new gy4();
            this.g = gy4Var;
            nz4 nz4Var = new nz4(kz4Var);
            nz4Var.f = kz4Var;
            nz4Var.h = gy4Var.d(2);
            this.h = nz4Var;
            nz4 nz4Var2 = new nz4(kz4Var);
            this.i = nz4Var2;
            nz4Var2.f = kz4Var;
            nz4Var2.h = gy4Var.d(3);
            km0 km0Var = new km0(nz4Var, nz4Var2, kz4Var);
            this.c = km0Var;
            km0Var.j = sy4Var;
            km0Var.k = true;
            lz4 lz4Var = new lz4(nz4Var, nz4Var2);
            this.e = lz4Var;
            km0 km0Var2 = new km0(nz4Var2, nz4Var2, kz4Var);
            this.f = km0Var2;
            km0Var2.j = sy4Var;
            km0 km0Var3 = new km0(lz4Var, nz4Var2, kz4Var);
            this.d = km0Var3;
            km0Var3.j = sy4Var;
            km0Var3.k = true;
            this.k = gy4Var.d(1);
            return;
        }
        this.k = mz4.a;
        this.g = null;
        this.h = null;
        this.i = null;
        km0 km0Var4 = new km0(kz4Var, kz4Var, kz4Var);
        this.c = km0Var4;
        km0Var4.j = sy4Var;
        this.e = null;
        this.d = km0Var4;
        this.f = km0Var4;
    }

    public static int c(int i) {
        return Math.max(gm.L(8.0f), gm.L(48.0f) - i);
    }

    public static int d(int i) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        return gm.L(7.0f) + ((i + currentActionBarHeight) - ((currentActionBarHeight - gm.L(46.0f)) / 2));
    }

    public static void e(ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        int i5 = -c(i);
        int i6 = -c(i2);
        gm.v3(viewGroup, 0, i5, 0, i6);
        viewGroup.setPadding(0, (i + i3) - i5, 0, (i2 + i4) - i6);
    }

    public final yy4 a(View view) {
        yy4 yy4Var = new yy4(this.k);
        zy4 zy4Var = new zy4(gm.L(32.0f));
        zy4 zy4Var2 = new zy4(gm.L(56.0f));
        zy4 zy4Var3 = new zy4(gm.L(48.0f));
        if (yy4Var.y != 1) {
            yy4Var.y = 1;
            yy4Var.w = true;
            yy4Var.x = true;
            yy4Var.invalidateSelf();
        }
        yy4Var.H = this.b;
        yy4Var.w = true;
        yy4Var.updateColors();
        yy4Var.invalidateSelf();
        yy4Var.J = (short) 160;
        kz4 kz4Var = yy4Var.H;
        if (kz4Var != null) {
            yy4Var.I = cmb.p1(0.627451f, kz4Var.b);
        }
        yy4Var.w = true;
        yy4Var.invalidateSelf();
        yy4Var.E = zy4Var;
        yy4Var.w = true;
        yy4Var.invalidateSelf();
        yy4Var.F = zy4Var2;
        yy4Var.w = true;
        yy4Var.invalidateSelf();
        yy4Var.L = (short) 210;
        kz4 kz4Var2 = yy4Var.H;
        if (kz4Var2 != null) {
            yy4Var.K = cmb.p1(0.8235294f, kz4Var2.b);
        }
        yy4Var.x = true;
        yy4Var.invalidateSelf();
        yy4Var.G = zy4Var3;
        yy4Var.x = true;
        yy4Var.invalidateSelf();
        this.a.c.add(new ry4(view, yy4Var));
        return yy4Var;
    }

    public final yy4 b(View view) {
        yy4 yy4Var = new yy4(this.k);
        zy4 zy4Var = new zy4(gm.L(28.0f));
        zy4 zy4Var2 = new zy4(gm.L(40.0f));
        zy4 zy4Var3 = new zy4(gm.L(30.0f));
        if (yy4Var.y != 4) {
            yy4Var.y = 4;
            yy4Var.w = true;
            yy4Var.x = true;
            yy4Var.invalidateSelf();
        }
        yy4Var.H = this.b;
        yy4Var.w = true;
        yy4Var.updateColors();
        yy4Var.invalidateSelf();
        yy4Var.J = (short) 160;
        kz4 kz4Var = yy4Var.H;
        if (kz4Var != null) {
            yy4Var.I = cmb.p1(0.627451f, kz4Var.b);
        }
        yy4Var.w = true;
        yy4Var.invalidateSelf();
        yy4Var.E = zy4Var;
        yy4Var.w = true;
        yy4Var.invalidateSelf();
        yy4Var.F = zy4Var2;
        yy4Var.w = true;
        yy4Var.invalidateSelf();
        yy4Var.L = (short) 210;
        kz4 kz4Var2 = yy4Var.H;
        if (kz4Var2 != null) {
            yy4Var.K = cmb.p1(0.8235294f, kz4Var2.b);
        }
        yy4Var.x = true;
        yy4Var.invalidateSelf();
        yy4Var.G = zy4Var3;
        yy4Var.x = true;
        yy4Var.invalidateSelf();
        this.a.c.add(new ry4(view, yy4Var));
        return yy4Var;
    }

    public final void f(FrameLayout frameLayout, r59 r59Var, View view, ylb ylbVar) {
        this.m = frameLayout;
        this.n = r59Var;
        r59Var.setCaptureSectionsDecoratorAllowed(true);
        this.o = new dh0(r59Var, frameLayout, (byte) 1);
        this.a.b(r59Var);
        r59Var.setClipToPadding(false);
        h(frameLayout, view, ylbVar);
    }

    public final void g(FrameLayout frameLayout, View view, ylb ylbVar) {
        this.m = frameLayout;
        this.n = null;
        h(frameLayout, view, ylbVar);
    }

    public final void h(FrameLayout frameLayout, View view, ylb ylbVar) {
        if (view != null) {
            gm.B2(view);
            frameLayout.addView(view, qoe.e(-1, -2, 48));
            boolean z = view instanceof rja;
            km0 km0Var = this.c;
            if (z) {
                rja rjaVar = (rja) view;
                rjaVar.setExtraHeight(gm.L(6.0f));
                nm0 l = qqd.l(ylbVar);
                rjaVar.M = km0Var;
                rjaVar.N = l;
                rjaVar.r();
                rjaVar.p0 = this.d;
                rjaVar.q0 = this.e;
            } else if (view instanceof a) {
                a aVar = (a) view;
                aVar.setAddToContainer(false);
                aVar.setCenterTitleAndGlass(true);
                aVar.setExtraHeight(gm.L(6.0f));
                aVar.U0 = true;
                aVar.P(km0Var, qqd.l(ylbVar), false);
            }
        }
    }
}
