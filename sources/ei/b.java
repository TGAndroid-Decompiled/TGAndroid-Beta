package ei;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.uk0;
import w7.b6;
import w7.b9;
public final class b {
    public final r f6597a;
    public final hi.c f6598b;
    public final tg.b f6599c;
    public final tg.b d;
    public final hi.d e;
    public final tg.b f6600f;
    public final e f6601g;
    public final hi.f h;
    public final hi.f f6602i;
    public Runnable f6603j;
    public final hi.a f6604k;
    public FrameLayout f6605l;
    public ViewGroup f6606m;
    public ug.a f6607n;

    public b(r rVar, org.telegram.ui.ActionBar.o oVar) {
        this.f6597a = rVar;
        rVar.f6671a = new a1.c(this, 20);
        rVar.d = new gi.b(i0.L(48.0f));
        hi.c cVar = new hi.c();
        this.f6598b = cVar;
        cVar.a(oVar.c());
        rVar.E.add(new p(cVar, oVar));
        if (Build.VERSION.SDK_INT >= 31) {
            e eVar = new e();
            this.f6601g = eVar;
            hi.f fVar = new hi.f(cVar);
            fVar.f7720f = cVar;
            fVar.h = eVar.d(2);
            this.h = fVar;
            hi.f fVar2 = new hi.f(cVar);
            this.f6602i = fVar2;
            fVar2.f7720f = cVar;
            fVar2.h = eVar.d(3);
            tg.b bVar = new tg.b(fVar, fVar2, cVar);
            this.f6599c = bVar;
            bVar.f48714j = rVar;
            bVar.f48715k = true;
            hi.d dVar = new hi.d(fVar, fVar2);
            this.e = dVar;
            tg.b bVar2 = new tg.b(fVar2, fVar2, cVar);
            this.f6600f = bVar2;
            bVar2.f48714j = rVar;
            tg.b bVar3 = new tg.b(dVar, fVar2, cVar);
            this.d = bVar3;
            bVar3.f48714j = rVar;
            bVar3.f48715k = true;
            this.f6604k = eVar.d(1);
            return;
        }
        this.f6604k = hi.e.f7716a;
        this.f6601g = null;
        this.h = null;
        this.f6602i = null;
        tg.b bVar4 = new tg.b(cVar, cVar, cVar);
        this.f6599c = bVar4;
        bVar4.f48714j = rVar;
        this.e = null;
        this.d = bVar4;
        this.f6600f = bVar4;
    }

    public static int c(int i10) {
        return Math.max(i0.L(8.0f), i0.L(48.0f) - i10);
    }

    public static int d(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        return i0.L(7.0f) + ((i10 + currentActionBarHeight) - ((currentActionBarHeight - i0.L(46.0f)) / 2));
    }

    public static void e(ViewGroup viewGroup, int i10, int i11, int i12, int i13) {
        int i14 = -c(i10);
        int i15 = -c(i11);
        i0.A3(viewGroup, 0, i14, 0, i15);
        viewGroup.setPadding(0, (i10 + i12) - i14, 0, (i11 + i13) - i15);
    }

    public final fi.g a(View view) {
        fi.g gVar = new fi.g(this.f6604k);
        fi.h hVar = new fi.h(i0.L(32.0f));
        fi.h hVar2 = new fi.h(i0.L(56.0f));
        fi.h hVar3 = new fi.h(i0.L(48.0f));
        if (gVar.f7131y != 1) {
            gVar.f7131y = 1;
            gVar.f7129w = true;
            gVar.f7130x = true;
            gVar.invalidateSelf();
        }
        gVar.G = this.f6598b;
        gVar.f7129w = true;
        gVar.updateColors();
        gVar.invalidateSelf();
        gVar.I = 160;
        hi.c cVar = gVar.G;
        if (cVar != null) {
            gVar.H = t6.r1(160 / 255.0f, cVar.f7712b);
        }
        gVar.f7129w = true;
        gVar.invalidateSelf();
        gVar.D = hVar;
        gVar.f7129w = true;
        gVar.invalidateSelf();
        gVar.E = hVar2;
        gVar.f7129w = true;
        gVar.invalidateSelf();
        gVar.K = 210;
        hi.c cVar2 = gVar.G;
        if (cVar2 != null) {
            gVar.J = t6.r1(210 / 255.0f, cVar2.f7712b);
        }
        gVar.f7130x = true;
        gVar.invalidateSelf();
        gVar.F = hVar3;
        gVar.f7130x = true;
        gVar.invalidateSelf();
        this.f6597a.f6673c.add(new q(view, gVar));
        return gVar;
    }

    public final fi.g b(View view) {
        fi.g gVar = new fi.g(this.f6604k);
        fi.h hVar = new fi.h(i0.L(28.0f));
        fi.h hVar2 = new fi.h(i0.L(40.0f));
        fi.h hVar3 = new fi.h(i0.L(30.0f));
        if (gVar.f7131y != 4) {
            gVar.f7131y = 4;
            gVar.f7129w = true;
            gVar.f7130x = true;
            gVar.invalidateSelf();
        }
        gVar.G = this.f6598b;
        gVar.f7129w = true;
        gVar.updateColors();
        gVar.invalidateSelf();
        gVar.I = 160;
        hi.c cVar = gVar.G;
        if (cVar != null) {
            gVar.H = t6.r1(160 / 255.0f, cVar.f7712b);
        }
        gVar.f7129w = true;
        gVar.invalidateSelf();
        gVar.D = hVar;
        gVar.f7129w = true;
        gVar.invalidateSelf();
        gVar.E = hVar2;
        gVar.f7129w = true;
        gVar.invalidateSelf();
        gVar.K = 210;
        hi.c cVar2 = gVar.G;
        if (cVar2 != null) {
            gVar.J = t6.r1(210 / 255.0f, cVar2.f7712b);
        }
        gVar.f7130x = true;
        gVar.invalidateSelf();
        gVar.F = hVar3;
        gVar.f7130x = true;
        gVar.invalidateSelf();
        this.f6597a.f6673c.add(new q(view, gVar));
        return gVar;
    }

    public final void f(FrameLayout frameLayout, uk0 uk0Var, View view, p6 p6Var) {
        this.f6605l = frameLayout;
        this.f6606m = uk0Var;
        uk0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f6607n = new a(1, uk0Var, frameLayout);
        this.f6597a.b(uk0Var);
        uk0Var.setClipToPadding(false);
        g(frameLayout, view, p6Var);
    }

    public final void g(FrameLayout frameLayout, View view, p6 p6Var) {
        if (view != null) {
            i0.E2(view);
            frameLayout.addView(view, b6.e(-1, -2, 48));
            boolean z10 = view instanceof i5;
            tg.b bVar = this.f6599c;
            if (z10) {
                i5 i5Var = (i5) view;
                i5Var.setExtraHeight(i0.L(6.0f));
                wg.d m10 = b9.m(p6Var);
                i5Var.L = bVar;
                i5Var.M = m10;
                i5Var.m();
                i5Var.f20423n0 = this.d;
                i5Var.f20424o0 = this.e;
            } else if (view instanceof org.telegram.ui.ActionBar.l) {
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) view;
                lVar.setAddToContainer(false);
                lVar.setCenterTitleAndGlass(true);
                lVar.setExtraHeight(i0.L(6.0f));
                lVar.T0 = true;
                lVar.M(bVar, b9.m(p6Var), false);
            }
        }
    }
}
