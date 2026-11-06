package oi;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import l2.y;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.pj0;
public final class a {
    public final q f21016a;
    public final ri.c f21017b;
    public final dh.c f21018c;
    public final dh.c d;
    public final ri.d f21019e;
    public final dh.c f21020f;
    public final d f21021g;
    public final ri.f h;
    public final ri.f f21022i;
    public Runnable f21023j;
    public final ri.a f21024k;
    public boolean f21025l;
    public FrameLayout f21026m;
    public ViewGroup f21027n;
    public eh.a f21028o;

    public a(q qVar, org.telegram.ui.ActionBar.n nVar) {
        this.f21016a = qVar;
        qVar.f21096a = new y(this, 21);
        qVar.d = new qi.b(g0.L(48.0f));
        ri.c cVar = new ri.c();
        this.f21017b = cVar;
        cVar.a(nVar.h());
        qVar.E.add(new o(cVar, nVar));
        if (Build.VERSION.SDK_INT >= 31) {
            d dVar = new d();
            this.f21021g = dVar;
            ri.f fVar = new ri.f(cVar);
            fVar.f54481f = cVar;
            fVar.h = dVar.d(2);
            this.h = fVar;
            ri.f fVar2 = new ri.f(cVar);
            this.f21022i = fVar2;
            fVar2.f54481f = cVar;
            fVar2.h = dVar.d(3);
            dh.c cVar2 = new dh.c(fVar, fVar2, cVar);
            this.f21018c = cVar2;
            cVar2.f8709j = qVar;
            cVar2.f8710k = true;
            ri.d dVar2 = new ri.d(fVar, fVar2);
            this.f21019e = dVar2;
            dh.c cVar3 = new dh.c(fVar2, fVar2, cVar);
            this.f21020f = cVar3;
            cVar3.f8709j = qVar;
            dh.c cVar4 = new dh.c(dVar2, fVar2, cVar);
            this.d = cVar4;
            cVar4.f8709j = qVar;
            cVar4.f8710k = true;
            this.f21024k = dVar.d(1);
            return;
        }
        this.f21024k = ri.e.f54476a;
        this.f21021g = null;
        this.h = null;
        this.f21022i = null;
        dh.c cVar5 = new dh.c(cVar, cVar, cVar);
        this.f21018c = cVar5;
        cVar5.f8709j = qVar;
        this.f21019e = null;
        this.d = cVar5;
        this.f21020f = cVar5;
    }

    public static int c(int i7) {
        return Math.max(g0.L(8.0f), g0.L(48.0f) - i7);
    }

    public static int d(int i7) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        return g0.L(7.0f) + ((i7 + currentActionBarHeight) - ((currentActionBarHeight - g0.L(46.0f)) / 2));
    }

    public static void e(ViewGroup viewGroup, int i7, int i10, int i11, int i12) {
        int i13 = -c(i7);
        int i14 = -c(i10);
        g0.B3(viewGroup, 0, i13, 0, i14);
        viewGroup.setPadding(0, (i7 + i11) - i13, 0, (i10 + i12) - i14);
    }

    public final pi.f a(View view) {
        pi.f fVar = new pi.f(this.f21024k);
        pi.g gVar = new pi.g(g0.L(32.0f));
        pi.g gVar2 = new pi.g(g0.L(56.0f));
        pi.g gVar3 = new pi.g(g0.L(48.0f));
        if (fVar.f53582y != 1) {
            fVar.f53582y = 1;
            fVar.f53580w = true;
            fVar.f53581x = true;
            fVar.invalidateSelf();
        }
        fVar.G = this.f21017b;
        fVar.f53580w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.I = 160;
        ri.c cVar = fVar.G;
        if (cVar != null) {
            fVar.H = k6.r1(160 / 255.0f, cVar.f54472b);
        }
        fVar.f53580w = true;
        fVar.invalidateSelf();
        fVar.D = gVar;
        fVar.f53580w = true;
        fVar.invalidateSelf();
        fVar.E = gVar2;
        fVar.f53580w = true;
        fVar.invalidateSelf();
        fVar.K = 210;
        ri.c cVar2 = fVar.G;
        if (cVar2 != null) {
            fVar.J = k6.r1(210 / 255.0f, cVar2.f54472b);
        }
        fVar.f53581x = true;
        fVar.invalidateSelf();
        fVar.F = gVar3;
        fVar.f53581x = true;
        fVar.invalidateSelf();
        this.f21016a.f21098c.add(new p(view, fVar));
        return fVar;
    }

    public final pi.f b(View view) {
        pi.f fVar = new pi.f(this.f21024k);
        pi.g gVar = new pi.g(g0.L(28.0f));
        pi.g gVar2 = new pi.g(g0.L(40.0f));
        pi.g gVar3 = new pi.g(g0.L(30.0f));
        if (fVar.f53582y != 4) {
            fVar.f53582y = 4;
            fVar.f53580w = true;
            fVar.f53581x = true;
            fVar.invalidateSelf();
        }
        fVar.G = this.f21017b;
        fVar.f53580w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.I = 160;
        ri.c cVar = fVar.G;
        if (cVar != null) {
            fVar.H = k6.r1(160 / 255.0f, cVar.f54472b);
        }
        fVar.f53580w = true;
        fVar.invalidateSelf();
        fVar.D = gVar;
        fVar.f53580w = true;
        fVar.invalidateSelf();
        fVar.E = gVar2;
        fVar.f53580w = true;
        fVar.invalidateSelf();
        fVar.K = 210;
        ri.c cVar2 = fVar.G;
        if (cVar2 != null) {
            fVar.J = k6.r1(210 / 255.0f, cVar2.f54472b);
        }
        fVar.f53581x = true;
        fVar.invalidateSelf();
        fVar.F = gVar3;
        fVar.f53581x = true;
        fVar.invalidateSelf();
        this.f21016a.f21098c.add(new p(view, fVar));
        return fVar;
    }

    public final void f(FrameLayout frameLayout, pj0 pj0Var, View view, f6 f6Var) {
        this.f21026m = frameLayout;
        this.f21027n = pj0Var;
        pj0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f21028o = new bi.g(4, pj0Var, frameLayout);
        this.f21016a.b(pj0Var);
        pj0Var.setClipToPadding(false);
        g(frameLayout, view, f6Var);
    }

    public final void g(FrameLayout frameLayout, View view, f6 f6Var) {
        if (view != null) {
            g0.E2(view);
            frameLayout.addView(view, ha.e(-1, -2, 48));
            boolean z9 = view instanceof y4;
            dh.c cVar = this.f21018c;
            if (z9) {
                y4 y4Var = (y4) view;
                y4Var.setExtraHeight(g0.L(6.0f));
                gh.e m10 = c8.g0.m(f6Var);
                y4Var.L = cVar;
                y4Var.M = m10;
                y4Var.m();
                y4Var.f28795n0 = this.d;
                y4Var.f28796o0 = this.f21019e;
            } else if (view instanceof org.telegram.ui.ActionBar.k) {
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) view;
                kVar.setAddToContainer(false);
                kVar.setCenterTitleAndGlass(true);
                kVar.setExtraHeight(g0.L(6.0f));
                kVar.T0 = true;
                kVar.M(cVar, c8.g0.m(f6Var), false);
            }
        }
    }
}
