package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.aj;
import org.telegram.ui.dm;
import org.telegram.ui.pn;
import org.telegram.ui.up;
import org.telegram.ui.wn;
public final class z extends AnimatorListenerAdapter {
    public final int f1767a;
    public final Object f1768b;
    public final Object f1769c;

    public z(int i10, Object obj, Object obj2) {
        this.f1767a = i10;
        this.f1769c = obj;
        this.f1768b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f1767a) {
            case 10:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f1769c;
                AnimatorSet animatorSet3 = kVar.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f1769c;
                if (animator.equals(actionBarLayout.f18612k0)) {
                    actionBarLayout.f18606h0.clear();
                    actionBarLayout.f18592b0.clear();
                    actionBarLayout.f18595c0.clear();
                    actionBarLayout.f18610j0.clear();
                    org.telegram.ui.ActionBar.h6.sl = null;
                    actionBarLayout.f18608i0 = null;
                    actionBarLayout.f18604g0 = null;
                    actionBarLayout.f18612k0 = null;
                    pn pnVar = ((org.telegram.ui.ActionBar.a5) this.f1768b).f18713j;
                    if (pnVar != null) {
                        pnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1769c;
                if (animator.equals(chatActivityEnterView.f22040r2)) {
                    chatActivityEnterView.f22040r2 = null;
                    return;
                }
                return;
            case 22:
                wi wiVar = (wi) this.f1769c;
                animatorSet = ((org.telegram.ui.ActionBar.e3) wiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.e3) wiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.e3) wiVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.e3) wiVar).currentSheetAnimationType = 0;
                        return;
                    }
                    return;
                }
                return;
            case 24:
                lz lzVar = (lz) this.f1769c;
                if (animator.equals(lzVar.M0)) {
                    lzVar.M0 = null;
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
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        o1.k kVar;
        int i10 = this.f1767a;
        int i11 = 0;
        Object obj = this.f1768b;
        Object obj2 = this.f1769c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                ((a0) obj2).f495b0.f557j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f31790s0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new a3.d(profileStoriesView, 9), 180L);
                    }
                }
                profileStoriesView.W = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 2:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((ci.d3) obj2).h.h.setVisibility(8);
                return;
            case 3:
                ci.a4 a4Var = (ci.a4) obj2;
                a4Var.f4340c = null;
                a4Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                ci.p pVar = (ci.p) obj2;
                ((qg.c2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 5:
                ci.ba baVar = (ci.ba) obj2;
                baVar.removeView((n30) obj);
                baVar.h.clear();
                baVar.f4417b = null;
                baVar.f4418c = false;
                ci.ca caVar = (ci.ca) baVar.f4420n;
                caVar.f4447a.setAllowDrawCursor(true);
                ci.m9 m9Var = caVar.f4450f;
                if (m9Var != null) {
                    m9Var.run();
                }
                if (caVar.K) {
                    caVar.fullScroll(130);
                    caVar.K = false;
                    return;
                }
                return;
            case 6:
                ig.g gVar = (ig.g) obj2;
                gVar.f11120b.clear();
                gVar.f11120b.add((kg.d) obj);
                return;
            case 7:
                super.onAnimationEnd(animator);
                ig.g gVar2 = (ig.g) obj2;
                gVar2.f11123c.clear();
                gVar2.f11123c.add((kg.b) obj);
                return;
            case 8:
                ii.e2 e2Var = (ii.e2) obj2;
                e2Var.E = false;
                e2Var.v.setAlpha(1.0f);
                e2Var.v.A1.setVisibility(0);
                e2Var.f11337x.q(AndroidUtilities.dp(22.0f));
                e2Var.f11337x.setAlpha(255);
                hh.g gVar3 = e2Var.f11330s;
                gVar3.e = true;
                gVar3.invalidate();
                ((Runnable) obj).run();
                return;
            case 9:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f22225k0 = null;
                return;
            case 10:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar2.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar2.P = null;
                    org.telegram.ui.ActionBar.h5 h5Var = kVar2.f19540n[0];
                    if (h5Var != null) {
                        h5Var.setVisibility(4);
                    }
                    if (kVar2.f19549r != null && !TextUtils.isEmpty(kVar2.A0)) {
                        kVar2.f19549r.setVisibility(4);
                    }
                    org.telegram.ui.ActionBar.y yVar = kVar2.E;
                    if (yVar != null) {
                        yVar.setVisibility(4);
                    }
                    if (kVar2.Q == null) {
                        return;
                    }
                    while (true) {
                        View[] viewArr = kVar2.Q;
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
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.f18614l0.unlock();
                if (animator.equals(actionBarLayout.f18612k0)) {
                    actionBarLayout.f18606h0.clear();
                    actionBarLayout.f18592b0.clear();
                    actionBarLayout.f18595c0.clear();
                    actionBarLayout.f18610j0.clear();
                    org.telegram.ui.ActionBar.h6.sl = null;
                    actionBarLayout.f18608i0 = null;
                    actionBarLayout.f18604g0 = null;
                    actionBarLayout.f18612k0 = null;
                    pn pnVar = ((org.telegram.ui.ActionBar.a5) obj).f18713j;
                    if (pnVar != null) {
                        pnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).f18616n = false;
                ((org.telegram.ui.ActionBar.m2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                wn wnVar = (wn) obj2;
                wnVar.A9 = 0.0f;
                if (animator == wnVar.f39467fb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    wnVar.Z2 = null;
                    wnVar.f39467fb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ((dm) obj2).f33130b;
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f21160x0 = false;
                org.telegram.ui.t0 t0Var = new org.telegram.ui.t0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((e60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(u1Var, t0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new org.telegram.ui.t4(this, 21));
                animatorSet4.start();
                return;
            case 15:
                up upVar = (up) obj2;
                upVar.L = 0.0f;
                upVar.K = 1.0f;
                ((View) obj).invalidate();
                upVar.T.invalidate();
                aj ajVar = upVar.Y;
                if (ajVar != null) {
                    ajVar.run();
                    upVar.Y = null;
                    return;
                }
                return;
            case 16:
                ((pg) obj2).run();
                return;
            case 17:
                ((org.telegram.ui.Components.db) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f22040r2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.Z0.setVisibility(8);
                    cf cfVar = chatActivityEnterView.S0;
                    if (cfVar != null) {
                        cfVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f22040r2 = null;
                    chatActivityEnterView.f22061v2 = 0;
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.unlock();
                ((td) obj).run();
                return;
            case 20:
                ((ld) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((td) obj).run();
                return;
            case 22:
                wi wiVar = (wi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.e3) wiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.e3) wiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (kVar = wiVar.f30016p2) != null && !kVar.f15511f) {
                        ((org.telegram.messenger.video.o) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                su suVar = (su) obj2;
                if (suVar.f28320a.e.getVisibility() == 0) {
                    suVar.f28320a.e.setAlpha(1.0f);
                    suVar.f28320a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                wl0 wl0Var = (wl0) obj;
                lz lzVar = (lz) obj2;
                if (animator.equals(lzVar.M0)) {
                    wl0Var.setTranslationY(0.0f);
                    if (wl0Var == lzVar.D0) {
                        wl0Var.setPadding(0, 0, 0, lzVar.f26269p2);
                    } else if (wl0Var == lzVar.P) {
                        wl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), lzVar.f26269p2);
                    } else if (wl0Var == lzVar.f26244h0) {
                        wl0Var.setPadding(0, lzVar.f26225b1, 0, lzVar.f26269p2);
                    }
                    lzVar.M0 = null;
                    return;
                }
                return;
            case 25:
                f20 f20Var = (f20) obj2;
                f20Var.removeView((n30) obj);
                f20Var.e.clear();
                f20Var.f24037a = null;
                f20Var.f24038b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                f20 f20Var2 = (f20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    f20Var2.removeView((View) arrayList.get(i13));
                }
                f20Var2.e.clear();
                f20Var2.f24037a = null;
                f20Var2.f24038b = false;
                return;
            case 27:
                l70 l70Var = (l70) obj2;
                l70Var.removeView((n30) obj);
                l70Var.f26032c = null;
                l70Var.e.f26371d0 = null;
                l70Var.f26030a = false;
                return;
            case 28:
                wk0 wk0Var = (wk0) obj2;
                zk0 zk0Var = wk0Var.e;
                if (((ValueAnimator) zk0Var.f30913g) != null) {
                    ((wl0) zk0Var.e).X1 = false;
                    ArrayList arrayList2 = wk0Var.f30061b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        View view4 = (View) obj3;
                        if (view4 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) view4).c(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((s4.c0) zk0Var.f30912f).getClass();
                        s4.o0.x0(view4);
                        ((wl0) zk0Var.e).removeView(view4);
                        w7.z5 z5Var = (w7.z5) zk0Var.f30914i;
                        if (z5Var != null) {
                            z5Var.d(view4);
                        }
                    }
                    ((wl0) zk0Var.e).setScrollEnabled(true);
                    ((wl0) zk0Var.e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((wl0) zk0Var.e).e.C() == ((wl0) zk0Var.e).getChildCount()) {
                            if (((ArrayList) ((wl0) zk0Var.e).e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((wl0) zk0Var.e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((wl0) zk0Var.e).getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) childAt).c(false, false);
                        }
                        childAt.setTranslationY(0.0f);
                    }
                    ArrayList arrayList3 = (ArrayList) obj;
                    int size2 = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj4 = arrayList3.get(i16);
                        i16++;
                        View view5 = (View) obj4;
                        if (view5 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) view5).c(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    xk0 xk0Var = wk0Var.d;
                    if (xk0Var != null) {
                        xk0Var.E();
                    }
                    w7.z5 z5Var2 = (w7.z5) zk0Var.f30914i;
                    if (z5Var2 != null) {
                        z5Var2.a();
                    }
                    ((SparseArray) zk0Var.f30915j).clear();
                    zk0Var.f30913g = null;
                    return;
                }
                return;
            default:
                u00 u00Var = (u00) obj;
                u00Var.setAlpha(1.0f);
                s4.o0.x0(u00Var);
                bl0 bl0Var = (bl0) obj2;
                bl0Var.f23015c.remove(u00Var);
                bl0Var.f23013a.removeView(u00Var);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1767a) {
            case 10:
                ((org.telegram.ui.ActionBar.k) this.f1769c).F.setVisibility(0);
                return;
            case 16:
                ((org.telegram.ui.Components.fb) this.f1768b).run();
                return;
            case 17:
                ((org.telegram.ui.Components.fb) this.f1768b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public z(Runnable runnable, Runnable runnable2, int i10) {
        this.f1767a = i10;
        this.f1768b = runnable;
        this.f1769c = runnable2;
    }

    public z(bl0 bl0Var, u00 u00Var, s4.o0 o0Var) {
        this.f1767a = 29;
        this.f1769c = bl0Var;
        this.f1768b = u00Var;
    }
}
