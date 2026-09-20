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
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cj;
import org.telegram.ui.fm;
import org.telegram.ui.sn;
import org.telegram.ui.xp;
import org.telegram.ui.zn;
public final class z extends AnimatorListenerAdapter {
    public final int f1773a;
    public final Object f1774b;
    public final Object f1775c;

    public z(int i10, Object obj, Object obj2) {
        this.f1773a = i10;
        this.f1775c = obj;
        this.f1774b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f1773a) {
            case 10:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f1775c;
                AnimatorSet animatorSet3 = kVar.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f1775c;
                if (animator.equals(actionBarLayout.f18619k0)) {
                    actionBarLayout.f18613h0.clear();
                    actionBarLayout.f18599b0.clear();
                    actionBarLayout.f18602c0.clear();
                    actionBarLayout.f18617j0.clear();
                    org.telegram.ui.ActionBar.j6.sl = null;
                    actionBarLayout.f18615i0 = null;
                    actionBarLayout.f18611g0 = null;
                    actionBarLayout.f18619k0 = null;
                    sn snVar = ((org.telegram.ui.ActionBar.c5) this.f1774b).f18783j;
                    if (snVar != null) {
                        snVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1775c;
                if (animator.equals(chatActivityEnterView.f22047q2)) {
                    chatActivityEnterView.f22047q2 = null;
                    return;
                }
                return;
            case 22:
                vi viVar = (vi) this.f1775c;
                animatorSet = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimationType = 0;
                        return;
                    }
                    return;
                }
                return;
            case 24:
                kz kzVar = (kz) this.f1775c;
                if (animator.equals(kzVar.M0)) {
                    kzVar.M0 = null;
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
        int i10 = this.f1773a;
        int i11 = 0;
        Object obj = this.f1774b;
        Object obj2 = this.f1775c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                ((a0) obj2).f498b0.f553j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f31802s0;
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
                ((ci.e3) obj2).h.h.setVisibility(8);
                return;
            case 3:
                ci.b4 b4Var = (ci.b4) obj2;
                b4Var.f4390c = null;
                b4Var.e = null;
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
                ci.ea eaVar = (ci.ea) obj2;
                eaVar.removeView((m30) obj);
                eaVar.h.clear();
                eaVar.f4609b = null;
                eaVar.f4610c = false;
                ci.fa faVar = (ci.fa) eaVar.f4612n;
                faVar.f4670a.setAllowDrawCursor(true);
                ci.p9 p9Var = faVar.f4673f;
                if (p9Var != null) {
                    p9Var.run();
                }
                if (faVar.K) {
                    faVar.fullScroll(130);
                    faVar.K = false;
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
                ii.d2 d2Var = (ii.d2) obj2;
                d2Var.E = false;
                d2Var.v.setAlpha(1.0f);
                d2Var.v.f22095z1.setVisibility(0);
                d2Var.f11329x.q(AndroidUtilities.dp(22.0f));
                d2Var.f11329x.setAlpha(255);
                hh.g gVar3 = d2Var.f11322s;
                gVar3.e = true;
                gVar3.invalidate();
                ((Runnable) obj).run();
                return;
            case 9:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f22238k0 = null;
                return;
            case 10:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar2.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar2.P = null;
                    org.telegram.ui.ActionBar.j5 j5Var = kVar2.f19536n[0];
                    if (j5Var != null) {
                        j5Var.setVisibility(4);
                    }
                    if (kVar2.f19545r != null && !TextUtils.isEmpty(kVar2.A0)) {
                        kVar2.f19545r.setVisibility(4);
                    }
                    org.telegram.ui.ActionBar.z zVar = kVar2.E;
                    if (zVar != null) {
                        zVar.setVisibility(4);
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
                actionBarLayout.f18621l0.unlock();
                if (animator.equals(actionBarLayout.f18619k0)) {
                    actionBarLayout.f18613h0.clear();
                    actionBarLayout.f18599b0.clear();
                    actionBarLayout.f18602c0.clear();
                    actionBarLayout.f18617j0.clear();
                    org.telegram.ui.ActionBar.j6.sl = null;
                    actionBarLayout.f18615i0 = null;
                    actionBarLayout.f18611g0 = null;
                    actionBarLayout.f18619k0 = null;
                    sn snVar = ((org.telegram.ui.ActionBar.c5) obj).f18783j;
                    if (snVar != null) {
                        snVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).f18623n = false;
                ((org.telegram.ui.ActionBar.n2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                zn znVar = (zn) obj2;
                znVar.A9 = 0.0f;
                if (animator == znVar.f40316fb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    znVar.Z2 = null;
                    znVar.f40316fb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ((fm) obj2).f33691b;
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f21177x0 = false;
                org.telegram.ui.s0 s0Var = new org.telegram.ui.s0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((c60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(u1Var, s0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new org.telegram.ui.t4(this, 21));
                animatorSet4.start();
                return;
            case 15:
                xp xpVar = (xp) obj2;
                xpVar.L = 0.0f;
                xpVar.K = 1.0f;
                ((View) obj).invalidate();
                xpVar.T.invalidate();
                cj cjVar = xpVar.Y;
                if (cjVar != null) {
                    cjVar.run();
                    xpVar.Y = null;
                    return;
                }
                return;
            case 16:
                ((og) obj2).run();
                return;
            case 17:
                ((org.telegram.ui.Components.cb) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f22047q2)) {
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
                    chatActivityEnterView.f22047q2 = null;
                    chatActivityEnterView.f22069u2 = 0;
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.K3.unlock();
                ((sd) obj).run();
                return;
            case 20:
                ((kd) obj).run();
                ((ChatActivityEnterView) obj2).K3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).A3 = null;
                ((sd) obj).run();
                return;
            case 22:
                vi viVar = (vi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (kVar = viVar.f29129p2) != null && !kVar.f15515f) {
                        ((org.telegram.messenger.video.o) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ru ruVar = (ru) obj2;
                if (ruVar.f27957a.e.getVisibility() == 0) {
                    ruVar.f27957a.e.setAlpha(1.0f);
                    ruVar.f27957a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                vl0 vl0Var = (vl0) obj;
                kz kzVar = (kz) obj2;
                if (animator.equals(kzVar.M0)) {
                    vl0Var.setTranslationY(0.0f);
                    if (vl0Var == kzVar.D0) {
                        vl0Var.setPadding(0, 0, 0, kzVar.f25938p2);
                    } else if (vl0Var == kzVar.P) {
                        vl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.f25938p2);
                    } else if (vl0Var == kzVar.f25913h0) {
                        vl0Var.setPadding(0, kzVar.f25894b1, 0, kzVar.f25938p2);
                    }
                    kzVar.M0 = null;
                    return;
                }
                return;
            case 25:
                e20 e20Var = (e20) obj2;
                e20Var.removeView((m30) obj);
                e20Var.e.clear();
                e20Var.f23713a = null;
                e20Var.f23714b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                e20 e20Var2 = (e20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    e20Var2.removeView((View) arrayList.get(i13));
                }
                e20Var2.e.clear();
                e20Var2.f23713a = null;
                e20Var2.f23714b = false;
                return;
            case 27:
                i70 i70Var = (i70) obj2;
                i70Var.removeView((m30) obj);
                i70Var.f24901c = null;
                i70Var.e.f25252d0 = null;
                i70Var.f24899a = false;
                return;
            case 28:
                vk0 vk0Var = (vk0) obj2;
                yk0 yk0Var = vk0Var.e;
                if (((ValueAnimator) yk0Var.f30574g) != null) {
                    ((vl0) yk0Var.e).X1 = false;
                    ArrayList arrayList2 = vk0Var.f29174b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        View view4 = (View) obj3;
                        if (view4 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) view4).c(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((s4.c0) yk0Var.f30573f).getClass();
                        s4.o0.x0(view4);
                        ((vl0) yk0Var.e).removeView(view4);
                        w7.z5 z5Var = (w7.z5) yk0Var.f30575i;
                        if (z5Var != null) {
                            z5Var.d(view4);
                        }
                    }
                    ((vl0) yk0Var.e).setScrollEnabled(true);
                    ((vl0) yk0Var.e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((vl0) yk0Var.e).e.C() == ((vl0) yk0Var.e).getChildCount()) {
                            if (((ArrayList) ((vl0) yk0Var.e).e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((vl0) yk0Var.e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((vl0) yk0Var.e).getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt).c(false, false);
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
                        if (view5 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) view5).c(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    wk0 wk0Var = vk0Var.d;
                    if (wk0Var != null) {
                        wk0Var.E();
                    }
                    w7.z5 z5Var2 = (w7.z5) yk0Var.f30575i;
                    if (z5Var2 != null) {
                        z5Var2.a();
                    }
                    ((SparseArray) yk0Var.f30576j).clear();
                    yk0Var.f30574g = null;
                    return;
                }
                return;
            default:
                t00 t00Var = (t00) obj;
                t00Var.setAlpha(1.0f);
                s4.o0.x0(t00Var);
                al0 al0Var = (al0) obj2;
                al0Var.f22712c.remove(t00Var);
                al0Var.f22710a.removeView(t00Var);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1773a) {
            case 10:
                ((org.telegram.ui.ActionBar.k) this.f1775c).F.setVisibility(0);
                return;
            case 16:
                ((org.telegram.ui.Components.eb) this.f1774b).run();
                return;
            case 17:
                ((org.telegram.ui.Components.eb) this.f1774b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public z(Runnable runnable, Runnable runnable2, int i10) {
        this.f1773a = i10;
        this.f1774b = runnable;
        this.f1775c = runnable2;
    }

    public z(al0 al0Var, t00 t00Var, s4.o0 o0Var) {
        this.f1773a = 29;
        this.f1775c = al0Var;
        this.f1774b = t00Var;
    }
}
