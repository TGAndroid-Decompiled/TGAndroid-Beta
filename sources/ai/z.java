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
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.nd;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.vd;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cj;
import org.telegram.ui.gm;
import org.telegram.ui.sn;
import org.telegram.ui.xp;
import org.telegram.ui.zn;
public final class z extends AnimatorListenerAdapter {
    public final int f1994a;
    public final Object f1995b;
    public final Object f1996c;

    public z(int i10, Object obj, Object obj2) {
        this.f1994a = i10;
        this.f1996c = obj;
        this.f1995b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1994a) {
            case 10:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f1996c;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f1996c;
                if (animator.equals(actionBarLayout.f20338k0)) {
                    actionBarLayout.f20332h0.clear();
                    actionBarLayout.f20317b0.clear();
                    actionBarLayout.f20320c0.clear();
                    actionBarLayout.f20336j0.clear();
                    org.telegram.ui.ActionBar.i6.vl = null;
                    actionBarLayout.f20334i0 = null;
                    actionBarLayout.f20330g0 = null;
                    actionBarLayout.f20338k0 = null;
                    sn snVar = ((org.telegram.ui.ActionBar.c5) this.f1995b).f20518j;
                    if (snVar != null) {
                        snVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1996c;
                if (animator.equals(chatActivityEnterView.f23953r2)) {
                    chatActivityEnterView.f23953r2 = null;
                    return;
                }
                return;
            case 22:
                yi yiVar = (yi) this.f1996c;
                if (yi.X(yiVar) != null && yi.Y(yiVar).equals(animator)) {
                    yi.Z(yiVar);
                    yi.a0(yiVar);
                    return;
                }
                return;
            case 24:
                a00 a00Var = (a00) this.f1996c;
                if (animator.equals(a00Var.M0)) {
                    a00Var.M0 = null;
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
        o1.k kVar;
        int i10 = this.f1994a;
        int i11 = 0;
        Object obj = this.f1995b;
        Object obj2 = this.f1996c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                ((a0) obj2).f623b0.f674j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f34497s0;
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
                ((ci.c3) obj2).h.h.setVisibility(8);
                return;
            case 3:
                ci.z3 z3Var = (ci.z3) obj2;
                z3Var.f6417c = null;
                z3Var.f6418e = null;
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
                baVar.removeView((d40) obj);
                baVar.h.clear();
                baVar.f4797b = null;
                baVar.f4798c = false;
                ci.ca caVar = (ci.ca) baVar.f4801n;
                caVar.f4845a.setAllowDrawCursor(true);
                ci.m9 m9Var = caVar.f4849f;
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
                gVar.f12159b.clear();
                gVar.f12159b.add((kg.d) obj);
                return;
            case 7:
                super.onAnimationEnd(animator);
                ig.g gVar2 = (ig.g) obj2;
                gVar2.f12162c.clear();
                gVar2.f12162c.add((kg.b) obj);
                return;
            case 8:
                ii.e2 e2Var = (ii.e2) obj2;
                e2Var.E = false;
                e2Var.v.setAlpha(1.0f);
                e2Var.v.A1.setVisibility(0);
                e2Var.f12389x.q(AndroidUtilities.dp(22.0f));
                e2Var.f12389x.setAlpha(255);
                hh.f fVar = e2Var.f12382s;
                fVar.f11503e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 9:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f24146k0 = null;
                return;
            case 10:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar2.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar2.P = null;
                    org.telegram.ui.ActionBar.j5 j5Var = kVar2.f21284n[0];
                    if (j5Var != null) {
                        j5Var.setVisibility(4);
                    }
                    if (kVar2.f21293r != null && !TextUtils.isEmpty(kVar2.A0)) {
                        kVar2.f21293r.setVisibility(4);
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
                actionBarLayout.f20340l0.unlock();
                if (animator.equals(actionBarLayout.f20338k0)) {
                    actionBarLayout.f20332h0.clear();
                    actionBarLayout.f20317b0.clear();
                    actionBarLayout.f20320c0.clear();
                    actionBarLayout.f20336j0.clear();
                    org.telegram.ui.ActionBar.i6.vl = null;
                    actionBarLayout.f20334i0 = null;
                    actionBarLayout.f20330g0 = null;
                    actionBarLayout.f20338k0 = null;
                    sn snVar = ((org.telegram.ui.ActionBar.c5) obj).f20518j;
                    if (snVar != null) {
                        snVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).f20342n = false;
                ((org.telegram.ui.ActionBar.n2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                zn znVar = (zn) obj2;
                znVar.A9 = 0.0f;
                if (animator == znVar.f44788gb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    znVar.Z2 = null;
                    znVar.f44788gb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ((gm) obj2).f38049b;
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f23023x0 = false;
                org.telegram.ui.t0 t0Var = new org.telegram.ui.t0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((v60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(u1Var, t0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new org.telegram.ui.t4(this, 21));
                animatorSet2.start();
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
                ((rg) obj2).run();
                return;
            case 17:
                ((org.telegram.ui.Components.gb) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f23953r2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.Z0.setVisibility(8);
                    ef efVar = chatActivityEnterView.S0;
                    if (efVar != null) {
                        efVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f23953r2 = null;
                    chatActivityEnterView.f23974v2 = 0;
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.unlock();
                ((vd) obj).run();
                return;
            case 20:
                ((nd) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((vd) obj).run();
                return;
            case 22:
                yi yiVar = (yi) obj2;
                if (yi.V(yiVar) != null && yi.W(yiVar).equals(animator) && (kVar = yiVar.f33270s2) != null && !kVar.f16931f) {
                    ((org.telegram.messenger.video.f) obj).run();
                    return;
                }
                return;
            case 23:
                hv hvVar = (hv) obj2;
                if (hvVar.f27144a.f28600e.getVisibility() == 0) {
                    hvVar.f27144a.f28600e.setAlpha(1.0f);
                    hvVar.f27144a.f28600e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                qm0 qm0Var = (qm0) obj;
                a00 a00Var = (a00) obj2;
                if (animator.equals(a00Var.M0)) {
                    qm0Var.setTranslationY(0.0f);
                    if (qm0Var == a00Var.D0) {
                        qm0Var.setPadding(0, 0, 0, a00Var.f24442p2);
                    } else if (qm0Var == a00Var.P) {
                        qm0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), a00Var.f24442p2);
                    } else if (qm0Var == a00Var.f24417h0) {
                        qm0Var.setPadding(0, a00Var.f24397b1, 0, a00Var.f24442p2);
                    }
                    a00Var.M0 = null;
                    return;
                }
                return;
            case 25:
                v20 v20Var = (v20) obj2;
                v20Var.removeView((d40) obj);
                v20Var.f31670e.clear();
                v20Var.f31667a = null;
                v20Var.f31668b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                v20 v20Var2 = (v20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    v20Var2.removeView((View) arrayList.get(i13));
                }
                v20Var2.f31670e.clear();
                v20Var2.f31667a = null;
                v20Var2.f31668b = false;
                return;
            case 27:
                c80 c80Var = (c80) obj2;
                c80Var.removeView((d40) obj);
                c80Var.f25288c = null;
                c80Var.f25289e.f25623d0 = null;
                c80Var.f25286a = false;
                return;
            case 28:
                ql0 ql0Var = (ql0) obj2;
                tl0 tl0Var = ql0Var.f30189e;
                if (((ValueAnimator) tl0Var.f31228g) != null) {
                    ((qm0) tl0Var.f31226e).V1 = false;
                    ArrayList arrayList2 = ql0Var.f30187b;
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
                        ((s4.d0) tl0Var.f31227f).getClass();
                        s4.p0.x0(view4);
                        ((qm0) tl0Var.f31226e).removeView(view4);
                        w7.y5 y5Var = (w7.y5) tl0Var.f31229i;
                        if (y5Var != null) {
                            y5Var.d(view4);
                        }
                    }
                    ((qm0) tl0Var.f31226e).setScrollEnabled(true);
                    ((qm0) tl0Var.f31226e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((qm0) tl0Var.f31226e).f3145e.D() == ((qm0) tl0Var.f31226e).getChildCount()) {
                            if (((ArrayList) ((qm0) tl0Var.f31226e).f3145e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((qm0) tl0Var.f31226e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((qm0) tl0Var.f31226e).getChildAt(i15);
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
                    rl0 rl0Var = ql0Var.d;
                    if (rl0Var != null) {
                        rl0Var.E();
                    }
                    w7.y5 y5Var2 = (w7.y5) tl0Var.f31229i;
                    if (y5Var2 != null) {
                        y5Var2.a();
                    }
                    ((SparseArray) tl0Var.f31230j).clear();
                    tl0Var.f31228g = null;
                    return;
                }
                return;
            default:
                j10 j10Var = (j10) obj;
                j10Var.setAlpha(1.0f);
                s4.p0.x0(j10Var);
                vl0 vl0Var = (vl0) obj2;
                vl0Var.f31818c.remove(j10Var);
                vl0Var.f31816a.removeView(j10Var);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1994a) {
            case 10:
                ((org.telegram.ui.ActionBar.k) this.f1996c).F.setVisibility(0);
                return;
            case 16:
                ((org.telegram.ui.Components.ib) this.f1995b).run();
                return;
            case 17:
                ((org.telegram.ui.Components.ib) this.f1995b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public z(Runnable runnable, Runnable runnable2, int i10) {
        this.f1994a = i10;
        this.f1995b = runnable;
        this.f1996c = runnable2;
    }

    public z(vl0 vl0Var, j10 j10Var, s4.p0 p0Var) {
        this.f1994a = 29;
        this.f1996c = vl0Var;
        this.f1995b = j10Var;
    }
}
