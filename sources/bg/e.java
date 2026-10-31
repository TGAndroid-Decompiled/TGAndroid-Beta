package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import ig.a0;
import java.util.HashMap;
import java.util.Iterator;
import jg.p0;
import jg.y1;
import kg.j2;
import kg.k2;
import kg.x0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.dj;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.ru;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.u61;
import org.telegram.ui.e8;
import org.telegram.ui.h4;
import org.telegram.ui.h8;
import org.telegram.ui.q4;
import org.telegram.ui.t5;
import org.telegram.ui.u3;
public final class e extends AnimatorListenerAdapter {
    public final int f2679a;
    public final Object f2680b;

    public e(Object obj, int i10) {
        this.f2679a = i10;
        this.f2680b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f2679a) {
            case 12:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2680b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.f1037w = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        float f7;
        int i10 = this.f2679a;
        float f10 = 0.0f;
        Object obj = this.f2680b;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                i iVar = (i) obj;
                if (!iVar.f2725i1) {
                    iVar.f2740u0 = false;
                    iVar.f2739t0.setVisibility(8);
                    iVar.invalidate();
                }
                iVar.f2718f0 = false;
                return;
            case 1:
                dj djVar = (dj) obj;
                djVar.f15247j = false;
                djVar.f15246i = false;
                return;
            case 2:
                ((dg.f) obj).h.setVisibility(8);
                return;
            case 3:
                ((CropAreaView) obj).f23956c0 = null;
                return;
            case 4:
                a0 a0Var = (a0) obj;
                a0Var.f8246a.getPainting().c(null, a0Var.f8246a.getCurrentColor(), true, null);
                a0Var.f8260r = null;
                return;
            case 5:
                super.onAnimationEnd(animator);
                p0 p0Var = (p0) obj;
                ImageView imageView = p0Var.f10132c;
                p0Var.f10132c = p0Var.d;
                p0Var.d = imageView;
                imageView.bringToFront();
                p0Var.d.setVisibility(8);
                p0Var.h = null;
                return;
            case 6:
                y1 y1Var = (y1) obj;
                if (animator == y1Var.f10376r) {
                    y1Var.f10374f = y1Var.h;
                    y1Var.h = -1;
                    y1Var.f10376r = null;
                    return;
                }
                return;
            case 7:
                x0 x0Var = (x0) obj;
                if (x0Var.f11329r) {
                    f10 = 1.0f;
                }
                x0Var.f11330s = f10;
                x0Var.e();
                return;
            case 8:
                k2 k2Var = (k2) ((j2) obj).f11134b;
                k2Var.F = true;
                k2Var.invalidate();
                return;
            case 9:
                int i11 = lg.g.K;
                ((lg.g) ((lg.f) obj).f11865b).d();
                return;
            case 10:
                lg.g gVar = (lg.g) obj;
                gVar.d = null;
                gVar.e();
                return;
            case 11:
                super.onAnimationEnd(animator);
                lg.q qVar = ((lg.l) obj).f11907b;
                qVar.f11919b.d = 0.0f;
                qVar.f11923d0 = null;
                qVar.j(qVar.L);
                return;
            case 12:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.f1037w = false;
                return;
            case 13:
                mg.b bVar = (mg.b) obj;
                bVar.f13072b = 1.0f;
                bVar.invalidate();
                return;
            case 14:
                nh.i iVar2 = (nh.i) obj;
                Iterator it = iVar2.h.iterator();
                while (it.hasNext()) {
                    nh.d dVar = (nh.d) it.next();
                    if (iVar2.f13841c.size() < iVar2.d) {
                        iVar2.f13841c.push(dVar);
                    }
                    it.remove();
                }
                Runnable runnable = iVar2.f13852q;
                if (runnable != null) {
                    runnable.run();
                    iVar2.f13852q = null;
                }
                iVar2.f13853r = null;
                iVar2.invalidateSelf();
                return;
            case 15:
                HashMap hashMap = i0.f16019l0;
                if (hashMap != null) {
                    hashMap.remove((Window) obj);
                    return;
                }
                return;
            case 16:
                u61 u61Var = ((MediaController) obj).f14457i0;
                if (u61Var != null) {
                    u61Var.g0();
                    return;
                }
                return;
            case 17:
                try {
                    ((u61) obj).m0();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 18:
                super.onAnimationEnd(animator);
                ((ru) obj).f17798w = null;
                return;
            case 19:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f20128n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i12 = 0; i12 < itemsCount; i12++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
                    if (!(childAt instanceof h1)) {
                        childAt.setTranslationY(0.0f);
                        if (childAt.isEnabled()) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.5f;
                        }
                        childAt.setAlpha(f7);
                    }
                }
                return;
            case 20:
                m1 m1Var = (m1) obj;
                if (!m1Var.e) {
                    m1Var.j();
                    return;
                }
                return;
            case 21:
                i3 i3Var = (i3) obj;
                if (i3Var.F == animator) {
                    i3Var.G = i3Var.H;
                    Iterator it2 = i3Var.I.iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                    return;
                }
                return;
            case 22:
                q3 q3Var = (q3) obj;
                i3 i3Var2 = q3Var.f20661a;
                if (i3Var2 != null) {
                    i3Var2.f20393b = true;
                    i3Var2.invalidate();
                }
                if (q3Var.U) {
                    f10 = 1.0f;
                }
                q3Var.V = f10;
                q3Var.invalidate();
                if (!q3Var.U) {
                    q3Var.R.clear();
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 24:
                h4 h4Var = (h4) obj;
                Runnable runnable3 = h4Var.f37725a0;
                if (runnable3 != null) {
                    runnable3.run();
                    h4Var.f37725a0 = null;
                    return;
                }
                return;
            case 25:
                u3 u3Var = (u3) obj;
                u3Var.f42003x = 1.0f;
                u3Var.A();
                u3Var.u();
                u3Var.r();
                u3Var.f41995a.e();
                return;
            case 26:
                q4 q4Var = (q4) obj;
                q4Var.getClass();
                q4Var.setVisibility(8);
                return;
            case 27:
                ig.s sVar = (ig.s) obj;
                sVar.f8442b = false;
                sVar.invalidate();
                return;
            case 28:
                ((t5) obj).f41723h0.setVisibility(8);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f2679a) {
            case 26:
                ((q4) this.f2680b).setVisibility(0);
                return;
            case 29:
                h8 h8Var = (h8) this.f2680b;
                for (int i10 = 0; i10 < h8Var.f37796b.getChildCount(); i10++) {
                    e8.a((e8) h8Var.f37796b.getChildAt(i10), h8Var.P, h8Var.Q);
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
