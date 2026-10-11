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
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.nd;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.vd;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.wl0;
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
                if (animator.equals(actionBarLayout.f20368k0)) {
                    actionBarLayout.f20362h0.clear();
                    actionBarLayout.f20347b0.clear();
                    actionBarLayout.f20350c0.clear();
                    actionBarLayout.f20366j0.clear();
                    org.telegram.ui.ActionBar.h6.vl = null;
                    actionBarLayout.f20364i0 = null;
                    actionBarLayout.f20360g0 = null;
                    actionBarLayout.f20368k0 = null;
                    sn snVar = ((org.telegram.ui.ActionBar.a5) this.f1995b).f20473j;
                    if (snVar != null) {
                        snVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1996c;
                if (animator.equals(chatActivityEnterView.f23981r2)) {
                    chatActivityEnterView.f23981r2 = null;
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
                b00 b00Var = (b00) this.f1996c;
                if (animator.equals(b00Var.M0)) {
                    b00Var.M0 = null;
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
                    int i12 = ProfileStoriesView.f34559s0;
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
                z3Var.f6416c = null;
                z3Var.f6417e = null;
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
                ci.ba baVar = (ci.ba) obj2;
                baVar.removeView((e40) obj);
                baVar.h.clear();
                baVar.f4796b = null;
                baVar.f4797c = false;
                ci.ca caVar = (ci.ca) baVar.f4800n;
                caVar.f4844a.setAllowDrawCursor(true);
                ci.m9 m9Var = caVar.f4848f;
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
                gVar.f12158b.clear();
                gVar.f12158b.add((kg.d) obj);
                return;
            case 7:
                super.onAnimationEnd(animator);
                ig.g gVar2 = (ig.g) obj2;
                gVar2.f12161c.clear();
                gVar2.f12161c.add((kg.b) obj);
                return;
            case 8:
                ii.e2 e2Var = (ii.e2) obj2;
                e2Var.E = false;
                e2Var.v.setAlpha(1.0f);
                e2Var.v.A1.setVisibility(0);
                e2Var.f12388x.q(AndroidUtilities.dp(22.0f));
                e2Var.f12388x.setAlpha(255);
                hh.f fVar = e2Var.f12381s;
                fVar.f11502e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 9:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f24174k0 = null;
                return;
            case 10:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar2.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar2.P = null;
                    org.telegram.ui.ActionBar.h5 h5Var = kVar2.f21321n[0];
                    if (h5Var != null) {
                        h5Var.setVisibility(4);
                    }
                    if (kVar2.f21330r != null && !TextUtils.isEmpty(kVar2.A0)) {
                        kVar2.f21330r.setVisibility(4);
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
                actionBarLayout.f20370l0.unlock();
                if (animator.equals(actionBarLayout.f20368k0)) {
                    actionBarLayout.f20362h0.clear();
                    actionBarLayout.f20347b0.clear();
                    actionBarLayout.f20350c0.clear();
                    actionBarLayout.f20366j0.clear();
                    org.telegram.ui.ActionBar.h6.vl = null;
                    actionBarLayout.f20364i0 = null;
                    actionBarLayout.f20360g0 = null;
                    actionBarLayout.f20368k0 = null;
                    sn snVar = ((org.telegram.ui.ActionBar.a5) obj).f20473j;
                    if (snVar != null) {
                        snVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).f20372n = false;
                ((org.telegram.ui.ActionBar.m2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                zn znVar = (zn) obj2;
                znVar.A9 = 0.0f;
                if (animator == znVar.f44821gb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    znVar.Z2 = null;
                    znVar.f44821gb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ((gm) obj2).f38167b;
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f23051x0 = false;
                org.telegram.ui.s0 s0Var = new org.telegram.ui.s0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((v60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(u1Var, s0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new org.telegram.ui.s4(this, 21));
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
                ((org.telegram.ui.Components.fb) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f23981r2)) {
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
                    chatActivityEnterView.f23981r2 = null;
                    chatActivityEnterView.f24002v2 = 0;
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
                if (yi.V(yiVar) != null && yi.W(yiVar).equals(animator) && (kVar = yiVar.f33331s2) != null && !kVar.f17017f) {
                    ((org.telegram.messenger.video.f) obj).run();
                    return;
                }
                return;
            case 23:
                iv ivVar = (iv) obj2;
                if (ivVar.f27518a.f28944e.getVisibility() == 0) {
                    ivVar.f27518a.f28944e.setAlpha(1.0f);
                    ivVar.f27518a.f28944e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                rm0 rm0Var = (rm0) obj;
                b00 b00Var = (b00) obj2;
                if (animator.equals(b00Var.M0)) {
                    rm0Var.setTranslationY(0.0f);
                    if (rm0Var == b00Var.D0) {
                        rm0Var.setPadding(0, 0, 0, b00Var.f24772p2);
                    } else if (rm0Var == b00Var.P) {
                        rm0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), b00Var.f24772p2);
                    } else if (rm0Var == b00Var.f24747h0) {
                        rm0Var.setPadding(0, b00Var.f24727b1, 0, b00Var.f24772p2);
                    }
                    b00Var.M0 = null;
                    return;
                }
                return;
            case 25:
                w20 w20Var = (w20) obj2;
                w20Var.removeView((e40) obj);
                w20Var.f32609e.clear();
                w20Var.f32606a = null;
                w20Var.f32607b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                w20 w20Var2 = (w20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    w20Var2.removeView((View) arrayList.get(i13));
                }
                w20Var2.f32609e.clear();
                w20Var2.f32606a = null;
                w20Var2.f32607b = false;
                return;
            case 27:
                c80 c80Var = (c80) obj2;
                c80Var.removeView((e40) obj);
                c80Var.f25260c = null;
                c80Var.f25261e.f25658d0 = null;
                c80Var.f25258a = false;
                return;
            case 28:
                rl0 rl0Var = (rl0) obj2;
                ul0 ul0Var = rl0Var.f30543e;
                if (((ValueAnimator) ul0Var.f31634g) != null) {
                    ((rm0) ul0Var.f31632e).V1 = false;
                    ArrayList arrayList2 = rl0Var.f30541b;
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
                        ((s4.d0) ul0Var.f31633f).getClass();
                        s4.p0.x0(view4);
                        ((rm0) ul0Var.f31632e).removeView(view4);
                        w7.y5 y5Var = (w7.y5) ul0Var.f31635i;
                        if (y5Var != null) {
                            y5Var.d(view4);
                        }
                    }
                    ((rm0) ul0Var.f31632e).setScrollEnabled(true);
                    ((rm0) ul0Var.f31632e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((rm0) ul0Var.f31632e).f3145e.D() == ((rm0) ul0Var.f31632e).getChildCount()) {
                            if (((ArrayList) ((rm0) ul0Var.f31632e).f3145e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((rm0) ul0Var.f31632e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((rm0) ul0Var.f31632e).getChildAt(i15);
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
                    sl0 sl0Var = rl0Var.d;
                    if (sl0Var != null) {
                        sl0Var.E();
                    }
                    w7.y5 y5Var2 = (w7.y5) ul0Var.f31635i;
                    if (y5Var2 != null) {
                        y5Var2.a();
                    }
                    ((SparseArray) ul0Var.f31636j).clear();
                    ul0Var.f31634g = null;
                    return;
                }
                return;
            default:
                k10 k10Var = (k10) obj;
                k10Var.setAlpha(1.0f);
                s4.p0.x0(k10Var);
                wl0 wl0Var = (wl0) obj2;
                wl0Var.f32731c.remove(k10Var);
                wl0Var.f32729a.removeView(k10Var);
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
                ((org.telegram.ui.Components.hb) this.f1995b).run();
                return;
            case 17:
                ((org.telegram.ui.Components.hb) this.f1995b).run();
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

    public z(wl0 wl0Var, k10 k10Var, s4.p0 p0Var) {
        this.f1994a = 29;
        this.f1996c = wl0Var;
        this.f1995b = k10Var;
    }
}
