package li;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k2.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.zl0;
import w7.z5;
public final class a {
    public final m f15604a;
    public final fh.c f15605b;
    public final ah.c f15606c;
    public final ah.i d;
    public final d f15607e;
    public final oi.a f15608f;
    public FrameLayout f15609g;
    public ViewGroup h;
    public bh.a f15610i;

    public a(m mVar, org.telegram.ui.ActionBar.n nVar) {
        this.f15604a = mVar;
        mVar.f15662a = new v(this, 2);
        mVar.d = new ni.b(AndroidUtilities.dp(48.0f));
        fh.c cVar = new fh.c();
        this.f15605b = cVar;
        cVar.a(nVar.f());
        mVar.f15684z.add(new k(cVar, nVar));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.i iVar = new ah.i(false, false);
            this.d = iVar;
            d dVar = new d();
            this.f15607e = dVar;
            mVar.a(iVar);
            fh.d dVar2 = new fh.d(cVar);
            dVar2.f9862f = cVar;
            ah.f.c();
            ah.c cVar2 = new ah.c(dVar2);
            this.f15606c = cVar2;
            cVar2.h = mVar;
            int dp = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar2.f456b = dp;
            cVar2.f457c = dp;
            cVar2.f461i = LiteMode.isEnabled(262144);
            dVar2.h = dVar.d(2);
            cVar2.f456b = 0;
            cVar2.f457c = 0;
            this.f15608f = dVar.d(1);
            return;
        }
        this.f15608f = oi.b.f17213a;
        this.f15607e = null;
        this.d = null;
        ah.c cVar3 = new ah.c(cVar);
        this.f15606c = cVar3;
        cVar3.h = mVar;
    }

    public static void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13) {
        int C = ok.C(48.0f, i10, -AndroidUtilities.dp(8.0f));
        int C2 = ok.C(48.0f, i11, -AndroidUtilities.dp(8.0f));
        AndroidUtilities.setViewLayoutMargins(viewGroup, 0, C, 0, C2);
        viewGroup.setPadding(0, (i10 + i12) - C, 0, (i11 + i13) - C2);
    }

    public final mi.f a(View view) {
        mi.f fVar = new mi.f(this.f15608f);
        mi.g gVar = new mi.g(AndroidUtilities.dp(32.0f));
        mi.g gVar2 = new mi.g(AndroidUtilities.dp(56.0f));
        mi.g gVar3 = new mi.g(AndroidUtilities.dp(48.0f));
        if (fVar.f16462l != 1) {
            fVar.f16462l = 1;
            fVar.f16460j = true;
            fVar.f16461k = true;
            fVar.invalidateSelf();
        }
        fVar.f16466p = this.f15605b;
        fVar.f16460j = true;
        fVar.k();
        fVar.invalidateSelf();
        fVar.f16468r = 160;
        fh.c cVar = fVar.f16466p;
        if (cVar != null) {
            fVar.f16467q = i6.l1(160 / 255.0f, cVar.f9857b);
        }
        fVar.f16460j = true;
        fVar.invalidateSelf();
        fVar.f16463m = gVar;
        fVar.f16460j = true;
        fVar.invalidateSelf();
        fVar.f16464n = gVar2;
        fVar.f16460j = true;
        fVar.invalidateSelf();
        fVar.f16470t = 210;
        fh.c cVar2 = fVar.f16466p;
        if (cVar2 != null) {
            fVar.f16469s = i6.l1(210 / 255.0f, cVar2.f9857b);
        }
        fVar.f16461k = true;
        fVar.invalidateSelf();
        fVar.f16465o = gVar3;
        fVar.f16461k = true;
        fVar.invalidateSelf();
        this.f15604a.f15664c.add(new l(view, fVar));
        return fVar;
    }

    public final mi.f b(View view) {
        mi.f fVar = new mi.f(this.f15608f);
        mi.g gVar = new mi.g(AndroidUtilities.dp(28.0f));
        mi.g gVar2 = new mi.g(AndroidUtilities.dp(40.0f));
        mi.g gVar3 = new mi.g(AndroidUtilities.dp(30.0f));
        if (fVar.f16462l != 4) {
            fVar.f16462l = 4;
            fVar.f16460j = true;
            fVar.f16461k = true;
            fVar.invalidateSelf();
        }
        fVar.f16466p = this.f15605b;
        fVar.f16460j = true;
        fVar.k();
        fVar.invalidateSelf();
        fVar.f16468r = 160;
        fh.c cVar = fVar.f16466p;
        if (cVar != null) {
            fVar.f16467q = i6.l1(160 / 255.0f, cVar.f9857b);
        }
        fVar.f16460j = true;
        fVar.invalidateSelf();
        fVar.f16463m = gVar;
        fVar.f16460j = true;
        fVar.invalidateSelf();
        fVar.f16464n = gVar2;
        fVar.f16460j = true;
        fVar.invalidateSelf();
        fVar.f16470t = 210;
        fh.c cVar2 = fVar.f16466p;
        if (cVar2 != null) {
            fVar.f16469s = i6.l1(210 / 255.0f, cVar2.f9857b);
        }
        fVar.f16461k = true;
        fVar.invalidateSelf();
        fVar.f16465o = gVar3;
        fVar.f16461k = true;
        fVar.invalidateSelf();
        this.f15604a.f15664c.add(new l(view, fVar));
        return fVar;
    }

    public final void d(FrameLayout frameLayout, zl0 zl0Var, org.telegram.ui.ActionBar.k kVar, d6 d6Var) {
        this.f15609g = frameLayout;
        this.h = zl0Var;
        zl0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f15610i = new di.f(1, zl0Var, frameLayout);
        this.f15604a.b(zl0Var);
        zl0Var.setClipToPadding(false);
        AndroidUtilities.removeFromParent(kVar);
        frameLayout.addView(kVar, z5.e(-1, -2, 48));
        kVar.setAddToContainer(false);
        kVar.setCenterTitleAndGlass(true);
        kVar.setExtraHeight(AndroidUtilities.dp(6.0f));
        kVar.T0 = true;
        kVar.K(this.f15606c, eh.b.m(d6Var), false);
    }

    public final void e(FrameLayout frameLayout, g91 g91Var, org.telegram.ui.ActionBar.k kVar, d6 d6Var) {
        this.f15609g = frameLayout;
        this.h = g91Var;
        this.f15604a.c(g91Var);
        AndroidUtilities.removeFromParent(kVar);
        frameLayout.addView(kVar, z5.e(-1, -2, 48));
        kVar.setAddToContainer(false);
        kVar.setCenterTitleAndGlass(true);
        kVar.setExtraHeight(AndroidUtilities.dp(6.0f));
        kVar.T0 = true;
        kVar.K(this.f15606c, eh.b.m(d6Var), false);
    }
}
