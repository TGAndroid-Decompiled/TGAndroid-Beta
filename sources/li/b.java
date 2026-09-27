package li;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.o;
import org.telegram.ui.Components.y81;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.es;
import w7.y5;
public final class b {
    public final l f14354a;
    public final fh.c f14355b;
    public final ah.c f14356c;
    public final ah.c d;
    public final ah.c e;
    public final org.telegram.ui.ActionBar.k f14357f;
    public final ah.i f14358g;
    public final d h;
    public FrameLayout f14359i;
    public ViewGroup f14360j;
    public bh.a f14361k;

    public b(l lVar, o oVar) {
        int dp;
        int i10;
        org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) qi.e.f42138i.a();
        this.f14357f = kVar;
        this.f14354a = lVar;
        lVar.f14381a = new le.b(this, 1);
        lVar.d = new ni.b(AndroidUtilities.dp(48.0f));
        fh.c cVar = new fh.c();
        this.f14355b = cVar;
        cVar.a(oVar.g());
        lVar.v.add(new j(cVar, oVar));
        this.d = new ah.c(cVar);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            org.telegram.ui.ActionBar.k kVar2 = org.telegram.ui.ActionBar.k.f19517c;
            if (kVar == kVar2) {
                this.f14358g = new ah.i(false, false);
            } else {
                this.f14358g = new ah.i();
            }
            d dVar = new d();
            this.h = dVar;
            lVar.a(this.f14358g);
            fh.d dVar2 = new fh.d(cVar);
            dVar2.f9062f = cVar;
            fh.d dVar3 = new fh.d(cVar);
            dVar3.f9062f = cVar;
            ah.c cVar2 = new ah.c(dVar2);
            this.f14356c = cVar2;
            cVar2.h = lVar;
            if (LiteMode.isEnabled(262144)) {
                dp = AndroidUtilities.dp(8.0f);
            } else {
                dp = AndroidUtilities.dp(48.0f);
            }
            cVar2.f423b = dp;
            cVar2.f424c = dp;
            cVar2.f427i = LiteMode.isEnabled(262144);
            ah.c cVar3 = new ah.c(dVar3);
            this.e = cVar3;
            cVar3.h = lVar;
            int dp2 = AndroidUtilities.dp(48.0f);
            cVar3.f423b = dp2;
            cVar3.f424c = dp2;
            if (kVar == kVar2) {
                dVar2.h = dVar;
                dVar2.f9063n = 1;
            } else {
                ah.i iVar = this.f14358g;
                if (LiteMode.isEnabled(262144)) {
                    i10 = -2;
                } else {
                    i10 = -3;
                }
                dVar2.d = iVar;
                dVar2.e = i10;
            }
            dVar3.d = this.f14358g;
            dVar3.e = -4;
            return;
        }
        this.h = null;
        this.f14358g = null;
        ah.c cVar4 = new ah.c(cVar);
        this.f14356c = cVar4;
        this.e = cVar4;
        cVar4.h = lVar;
    }

    public static void a(ViewGroup viewGroup, int i10, int i11, int i12, int i13) {
        int min = Math.min(-AndroidUtilities.dp(8.0f), i10 - AndroidUtilities.dp(48.0f));
        int min2 = Math.min(-AndroidUtilities.dp(8.0f), i11 - AndroidUtilities.dp(48.0f));
        AndroidUtilities.setViewLayoutMargins(viewGroup, 0, min, 0, min2);
        viewGroup.setPadding(0, (i10 + i12) - min, 0, (i11 + i13) - min2);
    }

    public final void b(FrameLayout frameLayout, yl0 yl0Var, org.telegram.ui.ActionBar.l lVar, e6 e6Var) {
        d dVar;
        this.f14359i = frameLayout;
        this.f14360j = yl0Var;
        yl0Var.setCaptureSectionsDecoratorAllowed(true);
        this.f14361k = new a(0, yl0Var, frameLayout);
        l lVar2 = this.f14354a;
        lVar2.b(yl0Var);
        lVar.setAddToContainer(false);
        AndroidUtilities.removeFromParent(lVar);
        frameLayout.addView(lVar, y5.e(-1, -2, 48));
        yl0Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.k kVar = org.telegram.ui.ActionBar.k.f19517c;
        ah.c cVar = this.d;
        ah.c cVar2 = this.f14356c;
        org.telegram.ui.ActionBar.k kVar2 = this.f14357f;
        if (kVar2 == kVar) {
            if (Build.VERSION.SDK_INT >= 33 && (dVar = this.h) != null) {
                mi.b bVar = new mi.b(dVar);
                lVar2.f14383c.add(new k(lVar, bVar));
                com.google.android.gms.internal.cast.a aVar = new com.google.android.gms.internal.cast.a(AndroidUtilities.dp(32.0f));
                com.google.android.gms.internal.cast.a aVar2 = new com.google.android.gms.internal.cast.a(AndroidUtilities.dp(56.0f));
                if (bVar.f15092i != 1) {
                    bVar.f15092i = 1;
                    bVar.h = true;
                    bVar.invalidateSelf();
                }
                bVar.f15095l = this.f14355b;
                bVar.h = true;
                bVar.g();
                bVar.invalidateSelf();
                bVar.f15097n = 170;
                bVar.h = true;
                bVar.g();
                bVar.invalidateSelf();
                bVar.f15093j = aVar;
                bVar.h = true;
                bVar.invalidateSelf();
                bVar.f15094k = aVar2;
                bVar.h = true;
                bVar.invalidateSelf();
                lVar.setCenterTitleAndGlass(true);
                lVar.N(cVar2, eh.b.m(e6Var), false);
                lVar.U0 = true;
                lVar.setBackground(bVar);
                lVar.setExtraHeight(AndroidUtilities.dp(6.0f));
                return;
            }
            ah.e eVar = new ah.e(this.e.c(lVar, null, false));
            eVar.b(-AndroidUtilities.dp(50.0f), false);
            lVar.setCenterTitleAndGlass(true);
            lVar.N(cVar2, eh.b.m(e6Var), false);
            lVar.U0 = true;
            lVar.setExtraHeight(AndroidUtilities.dp(8.0f));
            ah.e eVar2 = new ah.e(cVar.c(lVar, null, false));
            eVar2.b(-AndroidUtilities.dp(50.0f), false);
            eVar2.f443q = 180;
            if (this.f14358g != null) {
                es esVar = new es(eVar, eVar2);
                esVar.b(true, false);
                esVar.f33312g = true;
                lVar.setBackground(esVar);
                return;
            }
            lVar.setBackground(eVar2);
        } else if (kVar2 == org.telegram.ui.ActionBar.k.f19515a) {
            lVar.setBackground(null);
            lVar.I0 = true;
            lVar.setExtraHeight(AndroidUtilities.dp(16.0f));
        } else {
            lVar.setCenterTitleAndGlass(true);
            lVar.N(cVar2, eh.b.m(e6Var), false);
            ah.e eVar3 = new ah.e(cVar.c(lVar, null, false));
            if (kVar2 == org.telegram.ui.ActionBar.k.f19516b) {
                eVar3.b(-AndroidUtilities.dp(50.0f), true);
                eVar3.f443q = 224;
                lVar.setExtraHeight(AndroidUtilities.dp(12.0f));
            } else {
                eVar3.b(-AndroidUtilities.dp(40.0f), false);
                eVar3.f443q = 240;
                lVar.setExtraHeight(AndroidUtilities.dp(10.0f));
                lVar.U0 = true;
            }
            lVar.setBackground(eVar3);
        }
    }

    public final void c(FrameLayout frameLayout, y81 y81Var, org.telegram.ui.ActionBar.l lVar, e6 e6Var) {
        this.f14359i = frameLayout;
        this.f14360j = y81Var;
        this.f14354a.c(y81Var);
        lVar.setAddToContainer(false);
        AndroidUtilities.removeFromParent(lVar);
        frameLayout.addView(lVar, y5.e(-1, -2, 48));
        org.telegram.ui.ActionBar.k kVar = org.telegram.ui.ActionBar.k.f19517c;
        ah.c cVar = this.d;
        ah.c cVar2 = this.f14356c;
        org.telegram.ui.ActionBar.k kVar2 = this.f14357f;
        if (kVar2 == kVar) {
            ah.e eVar = new ah.e(this.e.c(lVar, null, false));
            eVar.b(-AndroidUtilities.dp(50.0f), false);
            lVar.setCenterTitleAndGlass(true);
            lVar.N(cVar2, eh.b.m(e6Var), false);
            lVar.U0 = true;
            lVar.setExtraHeight(AndroidUtilities.dp(8.0f));
            ah.e eVar2 = new ah.e(cVar.c(lVar, null, false));
            eVar2.b(-AndroidUtilities.dp(50.0f), false);
            eVar2.f443q = 180;
            es esVar = new es(eVar, eVar2);
            esVar.b(true, false);
            esVar.f33312g = true;
            lVar.setBackground(esVar);
        } else if (kVar2 == org.telegram.ui.ActionBar.k.f19515a) {
            lVar.setBackground(null);
            lVar.I0 = true;
            lVar.setExtraHeight(AndroidUtilities.dp(16.0f));
        } else {
            lVar.setCenterTitleAndGlass(true);
            lVar.N(cVar2, eh.b.m(e6Var), false);
            ah.e eVar3 = new ah.e(cVar.c(lVar, null, false));
            if (kVar2 == org.telegram.ui.ActionBar.k.f19516b) {
                eVar3.b(-AndroidUtilities.dp(50.0f), true);
                eVar3.f443q = 224;
                lVar.setExtraHeight(AndroidUtilities.dp(12.0f));
            } else {
                eVar3.b(-AndroidUtilities.dp(40.0f), false);
                eVar3.f443q = 240;
                lVar.setExtraHeight(AndroidUtilities.dp(10.0f));
                lVar.U0 = true;
            }
            lVar.setBackground(eVar3);
        }
    }
}
