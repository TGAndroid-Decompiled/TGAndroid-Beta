package li;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k2.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.n;
import org.telegram.ui.Components.yl0;
import w7.y5;
public final class b {
    public final i f14336a;
    public final ah.c f14337b;
    public final ah.c f14338c;
    public final ah.i d;
    public FrameLayout e;
    public ViewGroup f14339f;
    public bh.a f14340g;

    public b(i iVar, n nVar) {
        int i10;
        this.f14336a = iVar;
        iVar.f14351a = new v(this, 2);
        iVar.d = new mi.b(AndroidUtilities.dp(48.0f));
        fh.c cVar = new fh.c();
        cVar.a(nVar.f19648a.getThemedColor(j6.f19053a7));
        iVar.f14366s.add(new g(cVar, nVar));
        this.f14338c = new ah.c(cVar);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.i iVar2 = new ah.i(false);
            this.d = iVar2;
            iVar.f14356i.add(iVar2);
            fh.d dVar = new fh.d(cVar);
            dVar.f9077f = cVar;
            ah.c cVar2 = new ah.c(dVar);
            this.f14337b = cVar2;
            cVar2.h = iVar;
            int dp = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar2.f420b = dp;
            cVar2.f421c = dp;
            cVar2.f424i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                i10 = -2;
            } else {
                i10 = -3;
            }
            dVar.d = iVar2;
            dVar.e = i10;
            return;
        }
        this.d = null;
        ah.c cVar3 = new ah.c(cVar);
        this.f14337b = cVar3;
        cVar3.h = iVar;
    }

    public static void a(ViewGroup viewGroup, int i10, int i11, int i12) {
        int min = Math.min(0, i10 - AndroidUtilities.dp(48.0f));
        int min2 = Math.min(0, i11 - AndroidUtilities.dp(48.0f));
        AndroidUtilities.setViewLayoutMargins(viewGroup, 0, min, 0, min2);
        viewGroup.setPadding(0, (i10 + i12) - min, 0, i11 - min2);
    }

    public final void b(FrameLayout frameLayout, yl0 yl0Var, k kVar, f6 f6Var) {
        this.e = frameLayout;
        this.f14339f = yl0Var;
        yl0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f14340g = new a(0, yl0Var, frameLayout);
        this.f14336a.a(yl0Var);
        kVar.setCenterTitleAndGlass(true);
        kVar.M(this.f14337b, eh.b.m(f6Var), false);
        kVar.setAddToContainer(false);
        AndroidUtilities.removeFromParent(kVar);
        frameLayout.addView(kVar, y5.e(-1, -2, 48));
        ah.e eVar = new ah.e(this.f14338c.c(kVar, null, false));
        eVar.b(-AndroidUtilities.dp(50.0f), true);
        eVar.f440q = 224;
        kVar.setBackground(eVar);
        kVar.setExtraHeight(AndroidUtilities.dp(12.0f));
        yl0Var.setClipToPadding(false);
    }
}
