package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.zu;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bm;
import org.telegram.ui.pn;
import org.telegram.ui.tp;
import org.telegram.ui.wn;
import org.telegram.ui.xi;
public final class ce extends AnimatorListenerAdapter {
    public final int f4471a;
    public final Object f4472b;
    public final Object f4473c;

    public ce(int i10, Object obj, Object obj2) {
        this.f4471a = i10;
        this.f4473c = obj;
        this.f4472b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f4471a) {
            case 11:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f4473c;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f4473c;
                if (animator.equals(actionBarLayout.f22339q0)) {
                    actionBarLayout.f22322h0.clear();
                    actionBarLayout.f22308b0.clear();
                    actionBarLayout.f22311c0.clear();
                    actionBarLayout.f22326j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    org.telegram.ui.ActionBar.y6.vl = null;
                    actionBarLayout.f22324i0 = null;
                    actionBarLayout.f22320g0 = null;
                    actionBarLayout.f22339q0 = null;
                    pn pnVar = ((org.telegram.ui.ActionBar.i5) this.f4472b).f22725j;
                    if (pnVar != null) {
                        pnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4473c;
                if (animator.equals(chatActivityEnterView.f25951r2)) {
                    chatActivityEnterView.f25951r2 = null;
                    return;
                }
                return;
            case 23:
                ti tiVar = (ti) this.f4473c;
                if (ti.X(tiVar) != null && ti.Y(tiVar).equals(animator)) {
                    ti.Z(tiVar);
                    ti.a0(tiVar);
                    return;
                }
                return;
            case 25:
                sz szVar = (sz) this.f4473c;
                if (animator.equals(szVar.M0)) {
                    szVar.M0 = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean[] zArr;
        o1.j jVar;
        int i10 = this.f4471a;
        int i11 = 0;
        Object obj = this.f4472b;
        Object obj2 = this.f4473c;
        switch (i10) {
            case 0:
                ee eeVar = (ee) obj2;
                eeVar.f4580b.remove((de) obj);
                eeVar.f1();
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((di.q) obj2).f8937b0.f9083j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 2:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f36256s0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new u6(profileStoriesView, 20), 180L);
                    }
                }
                profileStoriesView.W = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 3:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((fi.w2) obj2).f11846b.h.setVisibility(8);
                return;
            case 4:
                fi.s3 s3Var = (fi.s3) obj2;
                s3Var.f11581c = null;
                s3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                fi.p pVar = (fi.p) obj2;
                ((sg.c2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 6:
                fi.j9 j9Var = (fi.j9) obj2;
                j9Var.removeView((x30) obj);
                j9Var.h.clear();
                j9Var.f11065b = null;
                j9Var.f11066c = false;
                fi.k9 k9Var = (fi.k9) j9Var.f11068n;
                k9Var.f11123b.setAllowDrawCursor(true);
                fi.w8 w8Var = k9Var.h;
                if (w8Var != null) {
                    w8Var.run();
                }
                if (k9Var.L) {
                    k9Var.fullScroll(130);
                    k9Var.L = false;
                    return;
                }
                return;
            case 7:
                kg.h hVar = (kg.h) obj2;
                hVar.f16585b.clear();
                hVar.f16585b.add((mg.d) obj);
                return;
            case 8:
                super.onAnimationEnd(animator);
                kg.h hVar2 = (kg.h) obj2;
                hVar2.f16588c.clear();
                hVar2.f16588c.add((mg.b) obj);
                return;
            case 9:
                li.b2 b2Var = (li.b2) obj2;
                b2Var.E = false;
                b2Var.v.setAlpha(1.0f);
                b2Var.v.A1.setVisibility(0);
                b2Var.f17148x.x(AndroidUtilities.dp(22.0f));
                b2Var.f17148x.setAlpha(255);
                jh.f fVar = b2Var.f17141s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 10:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f26136k0 = null;
                return;
            case 11:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    org.telegram.ui.ActionBar.b6 b6Var = kVar.f22774n[0];
                    if (b6Var != null) {
                        b6Var.setVisibility(4);
                    }
                    if (kVar.f22783r != null && !TextUtils.isEmpty(kVar.A0)) {
                        kVar.f22783r.setVisibility(4);
                    }
                    org.telegram.ui.ActionBar.z zVar = kVar.E;
                    if (zVar != null) {
                        zVar.setVisibility(4);
                    }
                    if (kVar.Q == null) {
                        return;
                    }
                    while (true) {
                        View[] viewArr = kVar.Q;
                        if (i11 < viewArr.length) {
                            View view2 = viewArr[i11];
                            if (view2 != null && ((zArr = (boolean[]) obj) == null || i11 >= zArr.length || zArr[i11])) {
                                view2.setVisibility(4);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.f22342r0.unlock();
                if (animator.equals(actionBarLayout.f22339q0)) {
                    actionBarLayout.f22322h0.clear();
                    actionBarLayout.f22308b0.clear();
                    actionBarLayout.f22311c0.clear();
                    actionBarLayout.f22326j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    org.telegram.ui.ActionBar.y6.vl = null;
                    actionBarLayout.f22324i0 = null;
                    actionBarLayout.f22320g0 = null;
                    actionBarLayout.f22339q0 = null;
                    pn pnVar = ((org.telegram.ui.ActionBar.i5) obj).f22725j;
                    if (pnVar != null) {
                        pnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((ActionBarLayout) obj2).f22332n = false;
                ((org.telegram.ui.ActionBar.r2) obj).onPreviewOpenAnimationEnd();
                return;
            case 14:
                View view3 = (View) obj;
                wn wnVar = (wn) obj2;
                wnVar.Q9 = 0.0f;
                if (animator == wnVar.Gb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    wnVar.f45189l3 = null;
                    wnVar.Gb = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) ((bm) obj2).f38063b;
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().f24947x0 = false;
                org.telegram.ui.s0 s0Var = new org.telegram.ui.s0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((r60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s1Var, s0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new kg.e(this, 28));
                animatorSet2.start();
                return;
            case 16:
                tp tpVar = (tp) obj2;
                tpVar.L = 0.0f;
                tpVar.K = 1.0f;
                ((View) obj).invalidate();
                tpVar.T.invalidate();
                xi xiVar = tpVar.Y;
                if (xiVar != null) {
                    xiVar.run();
                    tpVar.Y = null;
                    return;
                }
                return;
            case 17:
                ((pg) obj2).run();
                return;
            case 18:
                ((org.telegram.ui.Components.db) obj2).run();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f25951r2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.Z0.setVisibility(8);
                    bf bfVar = chatActivityEnterView.S0;
                    if (bfVar != null) {
                        bfVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f25951r2 = null;
                    chatActivityEnterView.f25972v2 = 0;
                    return;
                }
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.unlock();
                ((org.telegram.ui.Components.sd) obj).run();
                return;
            case 21:
                ((org.telegram.ui.Components.h2) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                return;
            case 22:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((org.telegram.ui.Components.sd) obj).run();
                return;
            case 23:
                ti tiVar = (ti) obj2;
                if (ti.V(tiVar) != null && ti.W(tiVar).equals(animator) && (jVar = tiVar.f33032s2) != null && !jVar.f18962f) {
                    ((kg) obj).run();
                    return;
                }
                return;
            case 24:
                zu zuVar = (zu) obj2;
                if (zuVar.f35451a.e.getVisibility() == 0) {
                    zuVar.f35451a.e.setAlpha(1.0f);
                    zuVar.f35451a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 25:
                nm0 nm0Var = (nm0) obj;
                sz szVar = (sz) obj2;
                if (animator.equals(szVar.M0)) {
                    nm0Var.setTranslationY(0.0f);
                    if (nm0Var == szVar.D0) {
                        nm0Var.setPadding(0, 0, 0, szVar.f32756q2);
                    } else if (nm0Var == szVar.P) {
                        nm0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), szVar.f32756q2);
                    } else if (nm0Var == szVar.f32728h0) {
                        nm0Var.setPadding(0, szVar.f32709b1, 0, szVar.f32756q2);
                    }
                    szVar.M0 = null;
                    return;
                }
                return;
            case 26:
                p20 p20Var = (p20) obj2;
                p20Var.removeView((x30) obj);
                p20Var.e.clear();
                p20Var.f31437a = null;
                p20Var.f31438b = false;
                return;
            case 27:
                ArrayList arrayList = (ArrayList) obj;
                p20 p20Var2 = (p20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    p20Var2.removeView((View) arrayList.get(i13));
                }
                p20Var2.e.clear();
                p20Var2.f31437a = null;
                p20Var2.f31438b = false;
                return;
            case 28:
                y70 y70Var = (y70) obj2;
                y70Var.removeView((x30) obj);
                y70Var.f34987c = null;
                y70Var.e.f35264d0 = null;
                y70Var.f34985a = false;
                return;
            default:
                ((rg0) obj2).h = null;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f4471a) {
            case 11:
                ((org.telegram.ui.ActionBar.k) this.f4473c).F.setVisibility(0);
                return;
            case 17:
                ((org.telegram.ui.Components.fb) this.f4472b).run();
                return;
            case 18:
                ((org.telegram.ui.Components.fb) this.f4472b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ce(Runnable runnable, Runnable runnable2, int i10) {
        this.f4471a = i10;
        this.f4472b = runnable;
        this.f4473c = runnable2;
    }
}
