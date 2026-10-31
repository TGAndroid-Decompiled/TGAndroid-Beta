package ei;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.i0;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.tk0;
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
    public Runnable f6602i;
    public final hi.a f6603j;
    public FrameLayout f6604k;
    public ViewGroup f6605l;
    public ug.a f6606m;

    public b(r rVar, org.telegram.ui.ActionBar.o oVar) {
        this.f6597a = rVar;
        rVar.f6670a = new a1.c(this, 20);
        rVar.d = new gi.b(i0.L(48.0f));
        hi.c cVar = new hi.c();
        this.f6598b = cVar;
        cVar.a(oVar.c());
        rVar.E.add(new p(cVar, oVar));
        if (Build.VERSION.SDK_INT >= 31 && tz.f()) {
            e eVar = new e();
            this.f6601g = eVar;
            hi.f fVar = new hi.f(cVar);
            fVar.f7719f = cVar;
            tg.b bVar = new tg.b(fVar);
            this.f6599c = bVar;
            bVar.h = rVar;
            int L = i0.L(sc.e(262144) ? 8.0f : 48.0f);
            bVar.f48698b = L;
            bVar.f48699c = L;
            bVar.f48702i = true;
            fVar.h = eVar.d(2);
            bVar.f48698b = 0;
            bVar.f48699c = 0;
            this.h = fVar;
            hi.f fVar2 = new hi.f(cVar);
            fVar2.f7719f = cVar;
            fVar2.h = eVar.d(3);
            hi.d dVar = new hi.d(fVar, fVar2);
            this.e = dVar;
            tg.b bVar2 = new tg.b(fVar2);
            this.f6600f = bVar2;
            bVar2.h = rVar;
            tg.b bVar3 = new tg.b(dVar);
            this.d = bVar3;
            bVar3.h = rVar;
            bVar3.f48702i = true;
            this.f6603j = eVar.d(1);
            return;
        }
        this.f6603j = hi.e.f7715a;
        this.f6601g = null;
        this.h = null;
        tg.b bVar4 = new tg.b(cVar);
        this.f6599c = bVar4;
        bVar4.h = rVar;
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

    public final fi.f a(View view) {
        fi.f fVar = new fi.f(this.f6603j);
        fi.g gVar = new fi.g(i0.L(32.0f));
        fi.g gVar2 = new fi.g(i0.L(56.0f));
        fi.g gVar3 = new fi.g(i0.L(48.0f));
        if (fVar.f7130y != 1) {
            fVar.f7130y = 1;
            fVar.f7128w = true;
            fVar.f7129x = true;
            fVar.invalidateSelf();
        }
        fVar.G = this.f6598b;
        fVar.f7128w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.I = 160;
        hi.c cVar = fVar.G;
        if (cVar != null) {
            fVar.H = t6.r1(160 / 255.0f, cVar.f7711b);
        }
        fVar.f7128w = true;
        fVar.invalidateSelf();
        fVar.D = gVar;
        fVar.f7128w = true;
        fVar.invalidateSelf();
        fVar.E = gVar2;
        fVar.f7128w = true;
        fVar.invalidateSelf();
        fVar.K = 210;
        hi.c cVar2 = fVar.G;
        if (cVar2 != null) {
            fVar.J = t6.r1(210 / 255.0f, cVar2.f7711b);
        }
        fVar.f7129x = true;
        fVar.invalidateSelf();
        fVar.F = gVar3;
        fVar.f7129x = true;
        fVar.invalidateSelf();
        this.f6597a.f6672c.add(new q(view, fVar));
        return fVar;
    }

    public final fi.f b(View view) {
        fi.f fVar = new fi.f(this.f6603j);
        fi.g gVar = new fi.g(i0.L(28.0f));
        fi.g gVar2 = new fi.g(i0.L(40.0f));
        fi.g gVar3 = new fi.g(i0.L(30.0f));
        if (fVar.f7130y != 4) {
            fVar.f7130y = 4;
            fVar.f7128w = true;
            fVar.f7129x = true;
            fVar.invalidateSelf();
        }
        fVar.G = this.f6598b;
        fVar.f7128w = true;
        fVar.updateColors();
        fVar.invalidateSelf();
        fVar.I = 160;
        hi.c cVar = fVar.G;
        if (cVar != null) {
            fVar.H = t6.r1(160 / 255.0f, cVar.f7711b);
        }
        fVar.f7128w = true;
        fVar.invalidateSelf();
        fVar.D = gVar;
        fVar.f7128w = true;
        fVar.invalidateSelf();
        fVar.E = gVar2;
        fVar.f7128w = true;
        fVar.invalidateSelf();
        fVar.K = 210;
        hi.c cVar2 = fVar.G;
        if (cVar2 != null) {
            fVar.J = t6.r1(210 / 255.0f, cVar2.f7711b);
        }
        fVar.f7129x = true;
        fVar.invalidateSelf();
        fVar.F = gVar3;
        fVar.f7129x = true;
        fVar.invalidateSelf();
        this.f6597a.f6672c.add(new q(view, fVar));
        return fVar;
    }

    public final void f(FrameLayout frameLayout, tk0 tk0Var, View view, p6 p6Var) {
        this.f6604k = frameLayout;
        this.f6605l = tk0Var;
        tk0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f6606m = new a(1, tk0Var, frameLayout);
        this.f6597a.b(tk0Var);
        tk0Var.setClipToPadding(false);
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
                i5Var.f20422n0 = this.d;
                i5Var.f20423o0 = this.e;
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
