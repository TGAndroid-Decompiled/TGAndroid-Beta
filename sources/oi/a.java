package oi;

import android.os.Build;
import android.support.v4.media.session.x;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import jg.e1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.r5;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
public final class a {
    public final q f19418a;
    public final hh.c f19419b;
    public final ch.b f19420c;
    public final ch.f d;
    public final d e;
    public final ri.a f19421f;
    public FrameLayout f19422g;
    public ViewGroup h;
    public dh.a f19423i;

    public a(q qVar, org.telegram.ui.ActionBar.n nVar) {
        this.f19418a = qVar;
        qVar.f19481a = new e1(this, 25);
        qVar.d = new qi.b(AndroidUtilities.dp(48.0f));
        hh.c cVar = new hh.c();
        this.f19419b = cVar;
        cVar.a(nVar.f());
        qVar.A.add(new o(cVar, nVar));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ch.f fVar = new ch.f(false, false);
            this.d = fVar;
            d dVar = new d();
            this.e = dVar;
            qVar.a(fVar);
            hh.d dVar2 = new hh.d(cVar);
            dVar2.f12840f = cVar;
            new ArrayList();
            new ArrayList();
            new ArrayList();
            x.c();
            ch.b bVar = new ch.b(dVar2);
            this.f19420c = bVar;
            bVar.h = qVar;
            int dp = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            bVar.f6299b = dp;
            bVar.f6300c = dp;
            bVar.f6303i = LiteMode.isEnabled(262144);
            dVar2.h = dVar.d(2);
            bVar.f6299b = 0;
            bVar.f6300c = 0;
            this.f19421f = dVar.d(1);
            return;
        }
        this.f19421f = ri.b.f47664a;
        this.e = null;
        this.d = null;
        ch.b bVar2 = new ch.b(cVar);
        this.f19420c = bVar2;
        bVar2.h = qVar;
    }

    public static int c(int i10) {
        return Math.max(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(48.0f) - i10);
    }

    public static void d(ViewGroup viewGroup, int i10, int i11, int i12, int i13) {
        int i14 = -c(i10);
        int i15 = -c(i11);
        AndroidUtilities.setViewLayoutMargins(viewGroup, 0, i14, 0, i15);
        viewGroup.setPadding(0, (i10 + i12) - i14, 0, (i11 + i13) - i15);
    }

    public final pi.e a(View view) {
        pi.e eVar = new pi.e(this.f19421f);
        pi.f fVar = new pi.f(AndroidUtilities.dp(32.0f));
        pi.f fVar2 = new pi.f(AndroidUtilities.dp(56.0f));
        pi.f fVar3 = new pi.f(AndroidUtilities.dp(48.0f));
        if (eVar.f46924w != 1) {
            eVar.f46924w = 1;
            eVar.f46923s = true;
            eVar.v = true;
            eVar.invalidateSelf();
        }
        eVar.F = this.f19419b;
        eVar.f46923s = true;
        eVar.updateColors();
        eVar.invalidateSelf();
        eVar.H = 160;
        hh.c cVar = eVar.F;
        if (cVar != null) {
            eVar.G = y6.o1(160 / 255.0f, cVar.f12836b);
        }
        eVar.f46923s = true;
        eVar.invalidateSelf();
        eVar.f46925x = fVar;
        eVar.f46923s = true;
        eVar.invalidateSelf();
        eVar.f46926y = fVar2;
        eVar.f46923s = true;
        eVar.invalidateSelf();
        eVar.J = 210;
        hh.c cVar2 = eVar.F;
        if (cVar2 != null) {
            eVar.I = y6.o1(210 / 255.0f, cVar2.f12836b);
        }
        eVar.v = true;
        eVar.invalidateSelf();
        eVar.E = fVar3;
        eVar.v = true;
        eVar.invalidateSelf();
        this.f19418a.f19483c.add(new p(view, eVar));
        return eVar;
    }

    public final pi.e b(View view) {
        pi.e eVar = new pi.e(this.f19421f);
        pi.f fVar = new pi.f(AndroidUtilities.dp(28.0f));
        pi.f fVar2 = new pi.f(AndroidUtilities.dp(40.0f));
        pi.f fVar3 = new pi.f(AndroidUtilities.dp(30.0f));
        if (eVar.f46924w != 4) {
            eVar.f46924w = 4;
            eVar.f46923s = true;
            eVar.v = true;
            eVar.invalidateSelf();
        }
        eVar.F = this.f19419b;
        eVar.f46923s = true;
        eVar.updateColors();
        eVar.invalidateSelf();
        eVar.H = 160;
        hh.c cVar = eVar.F;
        if (cVar != null) {
            eVar.G = y6.o1(160 / 255.0f, cVar.f12836b);
        }
        eVar.f46923s = true;
        eVar.invalidateSelf();
        eVar.f46925x = fVar;
        eVar.f46923s = true;
        eVar.invalidateSelf();
        eVar.f46926y = fVar2;
        eVar.f46923s = true;
        eVar.invalidateSelf();
        eVar.J = 210;
        hh.c cVar2 = eVar.F;
        if (cVar2 != null) {
            eVar.I = y6.o1(210 / 255.0f, cVar2.f12836b);
        }
        eVar.v = true;
        eVar.invalidateSelf();
        eVar.E = fVar3;
        eVar.v = true;
        eVar.invalidateSelf();
        this.f19418a.f19483c.add(new p(view, eVar));
        return eVar;
    }

    public final void e(FrameLayout frameLayout, nm0 nm0Var, View view, u6 u6Var) {
        this.f19422g = frameLayout;
        this.h = nm0Var;
        nm0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f19423i = new bi.g(4, nm0Var, frameLayout);
        this.f19418a.b(nm0Var);
        nm0Var.setClipToPadding(false);
        f(frameLayout, view, u6Var);
    }

    public final void f(FrameLayout frameLayout, View view, u6 u6Var) {
        if (view != null) {
            AndroidUtilities.removeFromParent(view);
            frameLayout.addView(view, kb1.i(-1, -2, 48));
            boolean z10 = view instanceof r5;
            ch.b bVar = this.f19420c;
            if (z10) {
                r5 r5Var = (r5) view;
                r5Var.setExtraHeight(AndroidUtilities.dp(6.0f));
                fh.e m10 = gh.c.m(u6Var);
                eh.d c10 = bVar.c(r5Var, null, false);
                c10.v(m10);
                wh.s(c10, AndroidUtilities.dp(23.0f), 6.0f);
                r5Var.H = c10;
                eh.d c11 = bVar.c(r5Var, null, false);
                c11.v(m10);
                wh.s(c11, AndroidUtilities.dp(23.0f), 6.0f);
                r5Var.I = c11;
                eh.d c12 = bVar.c(r5Var, null, false);
                c12.v(m10);
                wh.s(c12, AndroidUtilities.dp(23.0f), 6.0f);
                r5Var.J = c12;
                r5Var.K = AndroidUtilities.dp(23.0f);
                r5Var.L = bVar;
                r5Var.M = m10;
                r5Var.invalidate();
            } else if (view instanceof org.telegram.ui.ActionBar.k) {
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) view;
                kVar.setAddToContainer(false);
                kVar.setCenterTitleAndGlass(true);
                kVar.setExtraHeight(AndroidUtilities.dp(6.0f));
                kVar.T0 = true;
                kVar.I(bVar, gh.c.m(u6Var), false);
            }
        }
    }
}
