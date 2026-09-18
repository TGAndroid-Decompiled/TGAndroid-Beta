package li;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k2.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.n;
import org.telegram.ui.Components.wl0;
import w7.y5;
public final class b {
    public final i f14285a;
    public final ah.c f14286b;
    public final ah.c f14287c;
    public final ah.i d;
    public FrameLayout e;
    public ViewGroup f14288f;
    public bh.a f14289g;

    public b(i iVar, n nVar) {
        int i10;
        this.f14285a = iVar;
        iVar.f14300a = new v(this, 2);
        iVar.d = new mi.b(AndroidUtilities.dp(48.0f));
        fh.c cVar = new fh.c();
        cVar.a(nVar.f19601a.getThemedColor(j6.f19006a7));
        iVar.f14315s.add(new g(cVar, nVar));
        this.f14287c = new ah.c(cVar);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.i iVar2 = new ah.i(false);
            this.d = iVar2;
            iVar.f14305i.add(iVar2);
            fh.d dVar = new fh.d(cVar);
            dVar.f9076f = cVar;
            ah.c cVar2 = new ah.c(dVar);
            this.f14286b = cVar2;
            cVar2.h = iVar;
            int dp = AndroidUtilities.dp(LiteMode.isEnabled(262144) ? 8.0f : 48.0f);
            cVar2.f423b = dp;
            cVar2.f424c = dp;
            cVar2.f427i = LiteMode.isEnabled(262144);
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
        this.f14286b = cVar3;
        cVar3.h = iVar;
    }

    public static void a(ViewGroup viewGroup, int i10, int i11, int i12) {
        int min = Math.min(0, i10 - AndroidUtilities.dp(48.0f));
        int min2 = Math.min(0, i11 - AndroidUtilities.dp(48.0f));
        AndroidUtilities.setViewLayoutMargins(viewGroup, 0, min, 0, min2);
        viewGroup.setPadding(0, (i10 + i12) - min, 0, i11 - min2);
    }

    public final void b(FrameLayout frameLayout, wl0 wl0Var, k kVar, e6 e6Var) {
        this.e = frameLayout;
        this.f14288f = wl0Var;
        wl0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f14289g = new a(0, wl0Var, frameLayout);
        this.f14285a.a(wl0Var);
        kVar.setCenterTitleAndGlass(true);
        kVar.M(this.f14286b, eh.b.m(e6Var), false);
        kVar.setAddToContainer(false);
        AndroidUtilities.removeFromParent(kVar);
        frameLayout.addView(kVar, y5.e(-1, -2, 48));
        ah.e eVar = new ah.e(this.f14287c.c(kVar, null, false));
        eVar.b(-AndroidUtilities.dp(50.0f), true);
        eVar.f443q = 224;
        kVar.setBackground(eVar);
        kVar.setExtraHeight(AndroidUtilities.dp(12.0f));
        wl0Var.setClipToPadding(false);
    }
}
