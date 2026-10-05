package li;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k2.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.zl0;
import w7.z5;
public final class a {
    public final p f15605a;
    public final fh.c f15606b;
    public final ah.c f15607c;
    public final ah.i d;
    public final d f15608e;
    public final oi.a f15609f;
    public FrameLayout f15610g;
    public ViewGroup h;
    public bh.a f15611i;

    public a(p pVar, org.telegram.ui.ActionBar.n nVar) {
        this.f15605a = pVar;
        pVar.f15671a = new v(this, 2);
        pVar.d = new ni.b(AndroidUtilities.dp(48.0f));
        fh.c cVar = new fh.c();
        this.f15606b = cVar;
        cVar.a(nVar.f());
        pVar.A.add(new n(cVar, nVar));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.i iVar = new ah.i(false, false);
            this.d = iVar;
            d dVar = new d();
            this.f15608e = dVar;
            pVar.a(iVar);
            fh.d dVar2 = new fh.d(cVar);
            dVar2.f9863f = cVar;
            ah.f.c();
            ah.c cVar2 = new ah.c(dVar2);
            this.f15607c = cVar2;
            cVar2.h = pVar;
            int dp = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar2.f456b = dp;
            cVar2.f457c = dp;
            cVar2.f461i = LiteMode.isEnabled(262144);
            dVar2.h = dVar.d(2);
            cVar2.f456b = 0;
            cVar2.f457c = 0;
            this.f15609f = dVar.d(1);
            return;
        }
        this.f15609f = oi.b.f17222a;
        this.f15608e = null;
        this.d = null;
        ah.c cVar3 = new ah.c(cVar);
        this.f15607c = cVar3;
        cVar3.h = pVar;
    }

    public static void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13) {
        int C = bi.C(48.0f, i10, -AndroidUtilities.dp(8.0f));
        int C2 = bi.C(48.0f, i11, -AndroidUtilities.dp(8.0f));
        AndroidUtilities.setViewLayoutMargins(viewGroup, 0, C, 0, C2);
        viewGroup.setPadding(0, (i10 + i12) - C, 0, (i11 + i13) - C2);
    }

    public final mi.f a(View view) {
        mi.f fVar = new mi.f(this.f15609f);
        mi.g gVar = new mi.g(AndroidUtilities.dp(32.0f));
        mi.g gVar2 = new mi.g(AndroidUtilities.dp(56.0f));
        mi.g gVar3 = new mi.g(AndroidUtilities.dp(48.0f));
        if (fVar.f16471l != 1) {
            fVar.f16471l = 1;
            fVar.f16469j = true;
            fVar.f16470k = true;
            fVar.invalidateSelf();
        }
        fVar.f16475p = this.f15606b;
        fVar.f16469j = true;
        fVar.k();
        fVar.invalidateSelf();
        fVar.f16477r = 160;
        fh.c cVar = fVar.f16475p;
        if (cVar != null) {
            fVar.f16476q = i6.l1(160 / 255.0f, cVar.f9858b);
        }
        fVar.f16469j = true;
        fVar.invalidateSelf();
        fVar.f16472m = gVar;
        fVar.f16469j = true;
        fVar.invalidateSelf();
        fVar.f16473n = gVar2;
        fVar.f16469j = true;
        fVar.invalidateSelf();
        fVar.f16479t = 210;
        fh.c cVar2 = fVar.f16475p;
        if (cVar2 != null) {
            fVar.f16478s = i6.l1(210 / 255.0f, cVar2.f9858b);
        }
        fVar.f16470k = true;
        fVar.invalidateSelf();
        fVar.f16474o = gVar3;
        fVar.f16470k = true;
        fVar.invalidateSelf();
        this.f15605a.f15673c.add(new o(view, fVar));
        return fVar;
    }

    public final mi.f b(View view) {
        mi.f fVar = new mi.f(this.f15609f);
        mi.g gVar = new mi.g(AndroidUtilities.dp(28.0f));
        mi.g gVar2 = new mi.g(AndroidUtilities.dp(40.0f));
        mi.g gVar3 = new mi.g(AndroidUtilities.dp(30.0f));
        if (fVar.f16471l != 4) {
            fVar.f16471l = 4;
            fVar.f16469j = true;
            fVar.f16470k = true;
            fVar.invalidateSelf();
        }
        fVar.f16475p = this.f15606b;
        fVar.f16469j = true;
        fVar.k();
        fVar.invalidateSelf();
        fVar.f16477r = 160;
        fh.c cVar = fVar.f16475p;
        if (cVar != null) {
            fVar.f16476q = i6.l1(160 / 255.0f, cVar.f9858b);
        }
        fVar.f16469j = true;
        fVar.invalidateSelf();
        fVar.f16472m = gVar;
        fVar.f16469j = true;
        fVar.invalidateSelf();
        fVar.f16473n = gVar2;
        fVar.f16469j = true;
        fVar.invalidateSelf();
        fVar.f16479t = 210;
        fh.c cVar2 = fVar.f16475p;
        if (cVar2 != null) {
            fVar.f16478s = i6.l1(210 / 255.0f, cVar2.f9858b);
        }
        fVar.f16470k = true;
        fVar.invalidateSelf();
        fVar.f16474o = gVar3;
        fVar.f16470k = true;
        fVar.invalidateSelf();
        this.f15605a.f15673c.add(new o(view, fVar));
        return fVar;
    }

    public final void d(FrameLayout frameLayout, zl0 zl0Var, org.telegram.ui.ActionBar.k kVar, d6 d6Var) {
        this.f15610g = frameLayout;
        this.h = zl0Var;
        zl0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f15611i = new di.f(1, zl0Var, frameLayout);
        this.f15605a.b(zl0Var);
        zl0Var.setClipToPadding(false);
        AndroidUtilities.removeFromParent(kVar);
        frameLayout.addView(kVar, z5.e(-1, -2, 48));
        kVar.setAddToContainer(false);
        kVar.setCenterTitleAndGlass(true);
        kVar.setExtraHeight(AndroidUtilities.dp(6.0f));
        kVar.T0 = true;
        kVar.J(this.f15607c, eh.b.m(d6Var), false);
    }

    public final void e(FrameLayout frameLayout, h91 h91Var, org.telegram.ui.ActionBar.k kVar, d6 d6Var) {
        this.f15610g = frameLayout;
        this.h = h91Var;
        this.f15605a.c(h91Var);
        AndroidUtilities.removeFromParent(kVar);
        frameLayout.addView(kVar, z5.e(-1, -2, 48));
        kVar.setAddToContainer(false);
        kVar.setCenterTitleAndGlass(true);
        kVar.setExtraHeight(AndroidUtilities.dp(6.0f));
        kVar.T0 = true;
        kVar.J(this.f15607c, eh.b.m(d6Var), false);
    }
}
