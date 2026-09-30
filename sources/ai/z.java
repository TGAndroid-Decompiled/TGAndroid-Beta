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
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.i20;
import org.telegram.ui.Components.md;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.ud;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.aj;
import org.telegram.ui.dm;
import org.telegram.ui.pn;
import org.telegram.ui.up;
import org.telegram.ui.wn;
public final class z extends AnimatorListenerAdapter {
    public final int f1774a;
    public final Object f1775b;
    public final Object f1776c;

    public z(int i10, Object obj, Object obj2) {
        this.f1774a = i10;
        this.f1776c = obj;
        this.f1775b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f1774a) {
            case 10:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f1776c;
                AnimatorSet animatorSet3 = kVar.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f1776c;
                if (animator.equals(actionBarLayout.f18643k0)) {
                    actionBarLayout.f18637h0.clear();
                    actionBarLayout.f18623b0.clear();
                    actionBarLayout.f18626c0.clear();
                    actionBarLayout.f18641j0.clear();
                    org.telegram.ui.ActionBar.h6.sl = null;
                    actionBarLayout.f18639i0 = null;
                    actionBarLayout.f18635g0 = null;
                    actionBarLayout.f18643k0 = null;
                    pn pnVar = ((org.telegram.ui.ActionBar.a5) this.f1775b).f18744j;
                    if (pnVar != null) {
                        pnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1776c;
                if (animator.equals(chatActivityEnterView.f22076r2)) {
                    chatActivityEnterView.f22076r2 = null;
                    return;
                }
                return;
            case 22:
                xi xiVar = (xi) this.f1776c;
                animatorSet = ((org.telegram.ui.ActionBar.e3) xiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.e3) xiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.e3) xiVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.e3) xiVar).currentSheetAnimationType = 0;
                        return;
                    }
                    return;
                }
                return;
            case 24:
                nz nzVar = (nz) this.f1776c;
                if (animator.equals(nzVar.M0)) {
                    nzVar.M0 = null;
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
        int i10 = this.f1774a;
        int i11 = 0;
        Object obj = this.f1775b;
        Object obj2 = this.f1776c;
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
                    int i12 = ProfileStoriesView.f31878s0;
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
                a4Var.f4347c = null;
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
                baVar.removeView((q30) obj);
                baVar.h.clear();
                baVar.f4424b = null;
                baVar.f4425c = false;
                ci.ca caVar = (ci.ca) baVar.f4427n;
                caVar.f4454a.setAllowDrawCursor(true);
                ci.m9 m9Var = caVar.f4457f;
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
                gVar.f11134b.clear();
                gVar.f11134b.add((kg.d) obj);
                return;
            case 7:
                super.onAnimationEnd(animator);
                ig.g gVar2 = (ig.g) obj2;
                gVar2.f11137c.clear();
                gVar2.f11137c.add((kg.b) obj);
                return;
            case 8:
                ii.e2 e2Var = (ii.e2) obj2;
                e2Var.E = false;
                e2Var.v.setAlpha(1.0f);
                e2Var.v.A1.setVisibility(0);
                e2Var.f11351x.q(AndroidUtilities.dp(22.0f));
                e2Var.f11351x.setAlpha(255);
                hh.g gVar3 = e2Var.f11344s;
                gVar3.e = true;
                gVar3.invalidate();
                ((Runnable) obj).run();
                return;
            case 9:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f22261k0 = null;
                return;
            case 10:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar2.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar2.P = null;
                    org.telegram.ui.ActionBar.h5 h5Var = kVar2.f19571n[0];
                    if (h5Var != null) {
                        h5Var.setVisibility(4);
                    }
                    if (kVar2.f19580r != null && !TextUtils.isEmpty(kVar2.A0)) {
                        kVar2.f19580r.setVisibility(4);
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
                actionBarLayout.f18645l0.unlock();
                if (animator.equals(actionBarLayout.f18643k0)) {
                    actionBarLayout.f18637h0.clear();
                    actionBarLayout.f18623b0.clear();
                    actionBarLayout.f18626c0.clear();
                    actionBarLayout.f18641j0.clear();
                    org.telegram.ui.ActionBar.h6.sl = null;
                    actionBarLayout.f18639i0 = null;
                    actionBarLayout.f18635g0 = null;
                    actionBarLayout.f18643k0 = null;
                    pn pnVar = ((org.telegram.ui.ActionBar.a5) obj).f18744j;
                    if (pnVar != null) {
                        pnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).f18647n = false;
                ((org.telegram.ui.ActionBar.m2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                wn wnVar = (wn) obj2;
                wnVar.A9 = 0.0f;
                if (animator == wnVar.f39575fb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    wnVar.Z2 = null;
                    wnVar.f39575fb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ((dm) obj2).f33235b;
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f21196x0 = false;
                org.telegram.ui.t0 t0Var = new org.telegram.ui.t0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((h60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(u1Var, t0Var, 1.0f));
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
                ((qg) obj2).run();
                return;
            case 17:
                ((org.telegram.ui.Components.eb) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f22076r2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.Z0.setVisibility(8);
                    df dfVar = chatActivityEnterView.S0;
                    if (dfVar != null) {
                        dfVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f22076r2 = null;
                    chatActivityEnterView.f22097v2 = 0;
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.unlock();
                ((ud) obj).run();
                return;
            case 20:
                ((md) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((ud) obj).run();
                return;
            case 22:
                xi xiVar = (xi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.e3) xiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.e3) xiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (kVar = xiVar.f30301p2) != null && !kVar.f15542f) {
                        ((org.telegram.messenger.video.o) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                uu uuVar = (uu) obj2;
                if (uuVar.f28927a.e.getVisibility() == 0) {
                    uuVar.f28927a.e.setAlpha(1.0f);
                    uuVar.f28927a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                zl0 zl0Var = (zl0) obj;
                nz nzVar = (nz) obj2;
                if (animator.equals(nzVar.M0)) {
                    zl0Var.setTranslationY(0.0f);
                    if (zl0Var == nzVar.D0) {
                        zl0Var.setPadding(0, 0, 0, nzVar.f26858p2);
                    } else if (zl0Var == nzVar.P) {
                        zl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), nzVar.f26858p2);
                    } else if (zl0Var == nzVar.f26833h0) {
                        zl0Var.setPadding(0, nzVar.f26814b1, 0, nzVar.f26858p2);
                    }
                    nzVar.M0 = null;
                    return;
                }
                return;
            case 25:
                i20 i20Var = (i20) obj2;
                i20Var.removeView((q30) obj);
                i20Var.e.clear();
                i20Var.f24983a = null;
                i20Var.f24984b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                i20 i20Var2 = (i20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    i20Var2.removeView((View) arrayList.get(i13));
                }
                i20Var2.e.clear();
                i20Var2.f24983a = null;
                i20Var2.f24984b = false;
                return;
            case 27:
                o70 o70Var = (o70) obj2;
                o70Var.removeView((q30) obj);
                o70Var.f27020c = null;
                o70Var.e.f27266d0 = null;
                o70Var.f27018a = false;
                return;
            case 28:
                zk0 zk0Var = (zk0) obj2;
                cl0 cl0Var = zk0Var.e;
                if (((ValueAnimator) cl0Var.f23359g) != null) {
                    ((zl0) cl0Var.e).X1 = false;
                    ArrayList arrayList2 = zk0Var.f30979b;
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
                        ((s4.c0) cl0Var.f23358f).getClass();
                        s4.o0.x0(view4);
                        ((zl0) cl0Var.e).removeView(view4);
                        w7.z5 z5Var = (w7.z5) cl0Var.f23360i;
                        if (z5Var != null) {
                            z5Var.d(view4);
                        }
                    }
                    ((zl0) cl0Var.e).setScrollEnabled(true);
                    ((zl0) cl0Var.e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((zl0) cl0Var.e).e.C() == ((zl0) cl0Var.e).getChildCount()) {
                            if (((ArrayList) ((zl0) cl0Var.e).e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((zl0) cl0Var.e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((zl0) cl0Var.e).getChildAt(i15);
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
                    al0 al0Var = zk0Var.d;
                    if (al0Var != null) {
                        al0Var.E();
                    }
                    w7.z5 z5Var2 = (w7.z5) cl0Var.f23360i;
                    if (z5Var2 != null) {
                        z5Var2.a();
                    }
                    ((SparseArray) cl0Var.f23361j).clear();
                    cl0Var.f23359g = null;
                    return;
                }
                return;
            default:
                w00 w00Var = (w00) obj;
                w00Var.setAlpha(1.0f);
                s4.o0.x0(w00Var);
                el0 el0Var = (el0) obj2;
                el0Var.f24006c.remove(w00Var);
                el0Var.f24004a.removeView(w00Var);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1774a) {
            case 10:
                ((org.telegram.ui.ActionBar.k) this.f1776c).F.setVisibility(0);
                return;
            case 16:
                ((org.telegram.ui.Components.gb) this.f1775b).run();
                return;
            case 17:
                ((org.telegram.ui.Components.gb) this.f1775b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public z(Runnable runnable, Runnable runnable2, int i10) {
        this.f1774a = i10;
        this.f1775b = runnable;
        this.f1776c = runnable2;
    }

    public z(el0 el0Var, w00 w00Var, s4.o0 o0Var) {
        this.f1774a = 29;
        this.f1776c = el0Var;
        this.f1775b = w00Var;
    }
}
