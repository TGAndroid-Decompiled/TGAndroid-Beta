package oi;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import l2.x;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.pj0;
public final class a {
    public final q f21024a;
    public final ri.c f21025b;
    public final dh.c f21026c;
    public final dh.c d;
    public final ri.d f21027e;
    public final dh.c f21028f;
    public final d f21029g;
    public final ri.f h;
    public final ri.f f21030i;
    public Runnable f21031j;
    public final ri.a f21032k;
    public boolean f21033l;
    public FrameLayout f21034m;
    public ViewGroup f21035n;
    public eh.a f21036o;

    public a(q qVar, n nVar) {
        this.f21024a = qVar;
        qVar.f21104a = new x(this, 21);
        qVar.d = new qi.b(g0.L(48.0f));
        ri.c cVar = new ri.c();
        this.f21025b = cVar;
        cVar.a(nVar.h());
        qVar.E.add(new o(cVar, nVar));
        if (Build.VERSION.SDK_INT >= 31) {
            d dVar = new d();
            this.f21029g = dVar;
            ri.f fVar = new ri.f(cVar);
            fVar.f54584f = cVar;
            fVar.h = dVar.d(2);
            this.h = fVar;
            ri.f fVar2 = new ri.f(cVar);
            this.f21030i = fVar2;
            fVar2.f54584f = cVar;
            fVar2.h = dVar.d(3);
            dh.c cVar2 = new dh.c(fVar, fVar2, cVar);
            this.f21026c = cVar2;
            cVar2.f8712j = qVar;
            cVar2.f8713k = true;
            ri.d dVar2 = new ri.d(fVar, fVar2);
            this.f21027e = dVar2;
            dh.c cVar3 = new dh.c(fVar2, fVar2, cVar);
            this.f21028f = cVar3;
            cVar3.f8712j = qVar;
            dh.c cVar4 = new dh.c(dVar2, fVar2, cVar);
            this.d = cVar4;
            cVar4.f8712j = qVar;
            cVar4.f8713k = true;
            this.f21032k = dVar.d(1);
            return;
        }
        this.f21032k = ri.e.f54579a;
        this.f21029g = null;
        this.h = null;
        this.f21030i = null;
        dh.c cVar5 = new dh.c(cVar, cVar, cVar);
        this.f21026c = cVar5;
        cVar5.f8712j = qVar;
        this.f21027e = null;
        this.d = cVar5;
        this.f21028f = cVar5;
    }

    public static int c(int i7) {
        return Math.max(g0.L(8.0f), g0.L(48.0f) - i7);
    }

    public static int d(int i7) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        return g0.L(7.0f) + ((i7 + currentActionBarHeight) - ((currentActionBarHeight - g0.L(46.0f)) / 2));
    }

    public static void e(ViewGroup viewGroup, int i7, int i10, int i11, int i12) {
        int i13 = -c(i7);
        int i14 = -c(i10);
        g0.B3(viewGroup, 0, i13, 0, i14);
        viewGroup.setPadding(0, (i7 + i11) - i13, 0, (i10 + i12) - i14);
    }

    public final pi.f a(View view) {
        pi.f fVar = new pi.f(this.f21032k);
        pi.g gVar = new pi.g(g0.L(32.0f));
        pi.g gVar2 = new pi.g(g0.L(56.0f));
        pi.g gVar3 = new pi.g(g0.L(48.0f));
        if (fVar.f53686y != 1) {
            fVar.f53686y = 1;
            fVar.f53684w = true;
            fVar.f53685x = true;
            fVar.invalidateSelf();
        }
        fVar.G = this.f21025b;
        fVar.f53684w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.I = 160;
        ri.c cVar = fVar.G;
        if (cVar != null) {
            fVar.H = m6.r1(160 / 255.0f, cVar.f54575b);
        }
        fVar.f53684w = true;
        fVar.invalidateSelf();
        fVar.D = gVar;
        fVar.f53684w = true;
        fVar.invalidateSelf();
        fVar.E = gVar2;
        fVar.f53684w = true;
        fVar.invalidateSelf();
        fVar.K = 210;
        ri.c cVar2 = fVar.G;
        if (cVar2 != null) {
            fVar.J = m6.r1(210 / 255.0f, cVar2.f54575b);
        }
        fVar.f53685x = true;
        fVar.invalidateSelf();
        fVar.F = gVar3;
        fVar.f53685x = true;
        fVar.invalidateSelf();
        this.f21024a.f21106c.add(new p(view, fVar));
        return fVar;
    }

    public final pi.f b(View view) {
        pi.f fVar = new pi.f(this.f21032k);
        pi.g gVar = new pi.g(g0.L(28.0f));
        pi.g gVar2 = new pi.g(g0.L(40.0f));
        pi.g gVar3 = new pi.g(g0.L(30.0f));
        if (fVar.f53686y != 4) {
            fVar.f53686y = 4;
            fVar.f53684w = true;
            fVar.f53685x = true;
            fVar.invalidateSelf();
        }
        fVar.G = this.f21025b;
        fVar.f53684w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.I = 160;
        ri.c cVar = fVar.G;
        if (cVar != null) {
            fVar.H = m6.r1(160 / 255.0f, cVar.f54575b);
        }
        fVar.f53684w = true;
        fVar.invalidateSelf();
        fVar.D = gVar;
        fVar.f53684w = true;
        fVar.invalidateSelf();
        fVar.E = gVar2;
        fVar.f53684w = true;
        fVar.invalidateSelf();
        fVar.K = 210;
        ri.c cVar2 = fVar.G;
        if (cVar2 != null) {
            fVar.J = m6.r1(210 / 255.0f, cVar2.f54575b);
        }
        fVar.f53685x = true;
        fVar.invalidateSelf();
        fVar.F = gVar3;
        fVar.f53685x = true;
        fVar.invalidateSelf();
        this.f21024a.f21106c.add(new p(view, fVar));
        return fVar;
    }

    public final void f(FrameLayout frameLayout, pj0 pj0Var, View view, h6 h6Var) {
        this.f21034m = frameLayout;
        this.f21035n = pj0Var;
        pj0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f21036o = new bi.g(4, pj0Var, frameLayout);
        this.f21024a.b(pj0Var);
        pj0Var.setClipToPadding(false);
        g(frameLayout, view, h6Var);
    }

    public final void g(FrameLayout frameLayout, View view, h6 h6Var) {
        if (view != null) {
            g0.E2(view);
            frameLayout.addView(view, ha.e(-1, -2, 48));
            boolean z9 = view instanceof z4;
            dh.c cVar = this.f21026c;
            if (z9) {
                z4 z4Var = (z4) view;
                z4Var.setExtraHeight(g0.L(6.0f));
                gh.e l10 = c8.g0.l(h6Var);
                z4Var.L = cVar;
                z4Var.M = l10;
                z4Var.o();
                z4Var.f28837n0 = this.d;
                z4Var.f28838o0 = this.f21027e;
            } else if (view instanceof org.telegram.ui.ActionBar.l) {
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) view;
                lVar.setAddToContainer(false);
                lVar.setCenterTitleAndGlass(true);
                lVar.setExtraHeight(g0.L(6.0f));
                lVar.T0 = true;
                lVar.O(cVar, c8.g0.l(h6Var), false);
            }
        }
    }
}
