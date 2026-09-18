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
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.rd;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.zk0;
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
                if (animator.equals(actionBarLayout.f18587k0)) {
                    actionBarLayout.f18581h0.clear();
                    actionBarLayout.f18567b0.clear();
                    actionBarLayout.f18570c0.clear();
                    actionBarLayout.f18585j0.clear();
                    org.telegram.ui.ActionBar.j6.sl = null;
                    actionBarLayout.f18583i0 = null;
                    actionBarLayout.f18579g0 = null;
                    actionBarLayout.f18587k0 = null;
                    sn snVar = ((org.telegram.ui.ActionBar.c5) this.f1774b).f18751j;
                    if (snVar != null) {
                        snVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1775c;
                if (animator.equals(chatActivityEnterView.f22012q2)) {
                    chatActivityEnterView.f22012q2 = null;
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
                    int i12 = ProfileStoriesView.f31762s0;
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
                b4Var.f4389c = null;
                b4Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                ci.p pVar = (ci.p) obj2;
                ((qg.b2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 5:
                ci.ea eaVar = (ci.ea) obj2;
                eaVar.removeView((m30) obj);
                eaVar.h.clear();
                eaVar.f4608b = null;
                eaVar.f4609c = false;
                ci.fa faVar = (ci.fa) eaVar.f4611n;
                faVar.f4669a.setAllowDrawCursor(true);
                ci.p9 p9Var = faVar.f4672f;
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
                gVar.f11133b.clear();
                gVar.f11133b.add((kg.d) obj);
                return;
            case 7:
                super.onAnimationEnd(animator);
                ig.g gVar2 = (ig.g) obj2;
                gVar2.f11136c.clear();
                gVar2.f11136c.add((kg.b) obj);
                return;
            case 8:
                ii.d2 d2Var = (ii.d2) obj2;
                d2Var.E = false;
                d2Var.v.setAlpha(1.0f);
                d2Var.v.f22060z1.setVisibility(0);
                d2Var.f11328x.q(AndroidUtilities.dp(22.0f));
                d2Var.f11328x.setAlpha(255);
                hh.g gVar3 = d2Var.f11321s;
                gVar3.e = true;
                gVar3.invalidate();
                ((Runnable) obj).run();
                return;
            case 9:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f22203k0 = null;
                return;
            case 10:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar2.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar2.P = null;
                    org.telegram.ui.ActionBar.j5 j5Var = kVar2.f19504n[0];
                    if (j5Var != null) {
                        j5Var.setVisibility(4);
                    }
                    if (kVar2.f19513r != null && !TextUtils.isEmpty(kVar2.A0)) {
                        kVar2.f19513r.setVisibility(4);
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
                actionBarLayout.f18589l0.unlock();
                if (animator.equals(actionBarLayout.f18587k0)) {
                    actionBarLayout.f18581h0.clear();
                    actionBarLayout.f18567b0.clear();
                    actionBarLayout.f18570c0.clear();
                    actionBarLayout.f18585j0.clear();
                    org.telegram.ui.ActionBar.j6.sl = null;
                    actionBarLayout.f18583i0 = null;
                    actionBarLayout.f18579g0 = null;
                    actionBarLayout.f18587k0 = null;
                    sn snVar = ((org.telegram.ui.ActionBar.c5) obj).f18751j;
                    if (snVar != null) {
                        snVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).f18591n = false;
                ((org.telegram.ui.ActionBar.n2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                zn znVar = (zn) obj2;
                znVar.A9 = 0.0f;
                if (animator == znVar.f40274fb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    znVar.Z2 = null;
                    znVar.f40274fb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ((fm) obj2).f33580b;
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f21138x0 = false;
                org.telegram.ui.s0 s0Var = new org.telegram.ui.s0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((d60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(u1Var, s0Var, 1.0f));
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
                ((org.telegram.ui.Components.db) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f22012q2)) {
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
                    chatActivityEnterView.f22012q2 = null;
                    chatActivityEnterView.f22034u2 = 0;
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.K3.unlock();
                ((rd) obj).run();
                return;
            case 20:
                ((org.telegram.ui.Components.x2) obj).run();
                ((ChatActivityEnterView) obj2).K3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).A3 = null;
                ((rd) obj).run();
                return;
            case 22:
                vi viVar = (vi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (kVar = viVar.f29052p2) != null && !kVar.f15483f) {
                        ((org.telegram.messenger.video.o) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ru ruVar = (ru) obj2;
                if (ruVar.f27969a.e.getVisibility() == 0) {
                    ruVar.f27969a.e.setAlpha(1.0f);
                    ruVar.f27969a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                wl0 wl0Var = (wl0) obj;
                kz kzVar = (kz) obj2;
                if (animator.equals(kzVar.M0)) {
                    wl0Var.setTranslationY(0.0f);
                    if (wl0Var == kzVar.D0) {
                        wl0Var.setPadding(0, 0, 0, kzVar.f25932p2);
                    } else if (wl0Var == kzVar.P) {
                        wl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.f25932p2);
                    } else if (wl0Var == kzVar.f25907h0) {
                        wl0Var.setPadding(0, kzVar.f25888b1, 0, kzVar.f25932p2);
                    }
                    kzVar.M0 = null;
                    return;
                }
                return;
            case 25:
                e20 e20Var = (e20) obj2;
                e20Var.removeView((m30) obj);
                e20Var.e.clear();
                e20Var.f23760a = null;
                e20Var.f23761b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                e20 e20Var2 = (e20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    e20Var2.removeView((View) arrayList.get(i13));
                }
                e20Var2.e.clear();
                e20Var2.f23760a = null;
                e20Var2.f23761b = false;
                return;
            case 27:
                j70 j70Var = (j70) obj2;
                j70Var.removeView((m30) obj);
                j70Var.f25192c = null;
                j70Var.e.f25603d0 = null;
                j70Var.f25190a = false;
                return;
            case 28:
                wk0 wk0Var = (wk0) obj2;
                zk0 zk0Var = wk0Var.e;
                if (((ValueAnimator) zk0Var.f30836g) != null) {
                    ((wl0) zk0Var.e).X1 = false;
                    ArrayList arrayList2 = wk0Var.f30058b;
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
                        ((s4.c0) zk0Var.f30835f).getClass();
                        s4.o0.x0(view4);
                        ((wl0) zk0Var.e).removeView(view4);
                        w7.z5 z5Var = (w7.z5) zk0Var.f30837i;
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
                    w7.z5 z5Var2 = (w7.z5) zk0Var.f30837i;
                    if (z5Var2 != null) {
                        z5Var2.a();
                    }
                    ((SparseArray) zk0Var.f30838j).clear();
                    zk0Var.f30836g = null;
                    return;
                }
                return;
            default:
                t00 t00Var = (t00) obj;
                t00Var.setAlpha(1.0f);
                s4.o0.x0(t00Var);
                bl0 bl0Var = (bl0) obj2;
                bl0Var.f23034c.remove(t00Var);
                bl0Var.f23032a.removeView(t00Var);
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
                ((org.telegram.ui.Components.fb) this.f1774b).run();
                return;
            case 17:
                ((org.telegram.ui.Components.fb) this.f1774b).run();
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

    public z(bl0 bl0Var, t00 t00Var, s4.o0 o0Var) {
        this.f1773a = 29;
        this.f1775c = bl0Var;
        this.f1774b = t00Var;
    }
}
