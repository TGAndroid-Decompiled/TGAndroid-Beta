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
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.nd;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.ud;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.aq;
import org.telegram.ui.eo;
import org.telegram.ui.gj;
import org.telegram.ui.km;
import org.telegram.ui.wn;
public final class z extends AnimatorListenerAdapter {
    public final int f1992a;
    public final Object f1993b;
    public final Object f1994c;

    public z(int i10, Object obj, Object obj2) {
        this.f1992a = i10;
        this.f1994c = obj;
        this.f1993b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1992a) {
            case 10:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f1994c;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f1994c;
                if (animator.equals(actionBarLayout.f20105k0)) {
                    actionBarLayout.f20099h0.clear();
                    actionBarLayout.f20084b0.clear();
                    actionBarLayout.f20087c0.clear();
                    actionBarLayout.f20103j0.clear();
                    org.telegram.ui.ActionBar.h6.vl = null;
                    actionBarLayout.f20101i0 = null;
                    actionBarLayout.f20097g0 = null;
                    actionBarLayout.f20105k0 = null;
                    wn wnVar = ((org.telegram.ui.ActionBar.a5) this.f1993b).f20210j;
                    if (wnVar != null) {
                        wnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1994c;
                if (animator.equals(chatActivityEnterView.f23721r2)) {
                    chatActivityEnterView.f23721r2 = null;
                    return;
                }
                return;
            case 22:
                aj ajVar = (aj) this.f1994c;
                if (aj.X(ajVar) != null && aj.Y(ajVar).equals(animator)) {
                    aj.Z(ajVar);
                    aj.a0(ajVar);
                    return;
                }
                return;
            case 24:
                d00 d00Var = (d00) this.f1994c;
                if (animator.equals(d00Var.M0)) {
                    d00Var.M0 = null;
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
        int i10 = this.f1992a;
        int i11 = 0;
        Object obj = this.f1993b;
        Object obj2 = this.f1994c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                ((a0) obj2).f625b0.f676j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f34334s0;
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
                z3Var.f6415c = null;
                z3Var.f6416e = null;
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
                baVar.removeView((g40) obj);
                baVar.h.clear();
                baVar.f4795b = null;
                baVar.f4796c = false;
                ci.ca caVar = (ci.ca) baVar.f4799n;
                caVar.f4843a.setAllowDrawCursor(true);
                ci.m9 m9Var = caVar.f4847f;
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
                gVar.f12157b.clear();
                gVar.f12157b.add((kg.d) obj);
                return;
            case 7:
                super.onAnimationEnd(animator);
                ig.g gVar2 = (ig.g) obj2;
                gVar2.f12160c.clear();
                gVar2.f12160c.add((kg.b) obj);
                return;
            case 8:
                ii.e2 e2Var = (ii.e2) obj2;
                e2Var.E = false;
                e2Var.v.setAlpha(1.0f);
                e2Var.v.A1.setVisibility(0);
                e2Var.f12391x.q(AndroidUtilities.dp(22.0f));
                e2Var.f12391x.setAlpha(255);
                hh.f fVar = e2Var.f12384s;
                fVar.f11501e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 9:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f23923k0 = null;
                return;
            case 10:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar2.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar2.P = null;
                    org.telegram.ui.ActionBar.h5 h5Var = kVar2.f21059n[0];
                    if (h5Var != null) {
                        h5Var.setVisibility(4);
                    }
                    if (kVar2.f21068r != null && !TextUtils.isEmpty(kVar2.A0)) {
                        kVar2.f21068r.setVisibility(4);
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
                actionBarLayout.f20107l0.unlock();
                if (animator.equals(actionBarLayout.f20105k0)) {
                    actionBarLayout.f20099h0.clear();
                    actionBarLayout.f20084b0.clear();
                    actionBarLayout.f20087c0.clear();
                    actionBarLayout.f20103j0.clear();
                    org.telegram.ui.ActionBar.h6.vl = null;
                    actionBarLayout.f20101i0 = null;
                    actionBarLayout.f20097g0 = null;
                    actionBarLayout.f20105k0 = null;
                    wn wnVar = ((org.telegram.ui.ActionBar.a5) obj).f20210j;
                    if (wnVar != null) {
                        wnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).f20109n = false;
                ((org.telegram.ui.ActionBar.m2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                eo eoVar = (eo) obj2;
                eoVar.A9 = 0.0f;
                if (animator == eoVar.f37276gb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    eoVar.Z2 = null;
                    eoVar.f37276gb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ((km) obj2).f39554b;
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f22786x0 = false;
                org.telegram.ui.t0 t0Var = new org.telegram.ui.t0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((y60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(u1Var, t0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new org.telegram.ui.w4(this, 21));
                animatorSet2.start();
                return;
            case 15:
                aq aqVar = (aq) obj2;
                aqVar.L = 0.0f;
                aqVar.K = 1.0f;
                ((View) obj).invalidate();
                aqVar.T.invalidate();
                gj gjVar = aqVar.Y;
                if (gjVar != null) {
                    gjVar.run();
                    aqVar.Y = null;
                    return;
                }
                return;
            case 16:
                ((tg) obj2).run();
                return;
            case 17:
                ((org.telegram.ui.Components.fb) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f23721r2)) {
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
                    chatActivityEnterView.f23721r2 = null;
                    chatActivityEnterView.f23746v2 = 0;
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.f23699n4.unlock();
                ((ud) obj).run();
                return;
            case 20:
                ((nd) obj).run();
                ((ChatActivityEnterView) obj2).f23699n4.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).f23640d4 = null;
                ((ud) obj).run();
                return;
            case 22:
                aj ajVar = (aj) obj2;
                if (aj.V(ajVar) != null && aj.W(ajVar).equals(animator) && (kVar = ajVar.f24384s2) != null && !kVar.f16683f) {
                    ((org.telegram.tgnet.h) obj).run();
                    return;
                }
                return;
            case 23:
                kv kvVar = (kv) obj2;
                if (kvVar.f27951a.f29298e.getVisibility() == 0) {
                    kvVar.f27951a.f29298e.setAlpha(1.0f);
                    kvVar.f27951a.f29298e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                wm0 wm0Var = (wm0) obj;
                d00 d00Var = (d00) obj2;
                if (animator.equals(d00Var.M0)) {
                    wm0Var.setTranslationY(0.0f);
                    if (wm0Var == d00Var.D0) {
                        wm0Var.setPadding(0, 0, 0, d00Var.f25121p2);
                    } else if (wm0Var == d00Var.P) {
                        wm0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), d00Var.f25121p2);
                    } else if (wm0Var == d00Var.f25096h0) {
                        wm0Var.setPadding(0, d00Var.f25076b1, 0, d00Var.f25121p2);
                    }
                    d00Var.M0 = null;
                    return;
                }
                return;
            case 25:
                y20 y20Var = (y20) obj2;
                y20Var.removeView((g40) obj);
                y20Var.f32932e.clear();
                y20Var.f32929a = null;
                y20Var.f32930b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                y20 y20Var2 = (y20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    y20Var2.removeView((View) arrayList.get(i13));
                }
                y20Var2.f32932e.clear();
                y20Var2.f32929a = null;
                y20Var2.f32930b = false;
                return;
            case 27:
                f80 f80Var = (f80) obj2;
                f80Var.removeView((g40) obj);
                f80Var.f25961c = null;
                f80Var.f25962e.f26326d0 = null;
                f80Var.f25959a = false;
                return;
            case 28:
                wl0 wl0Var = (wl0) obj2;
                zl0 zl0Var = wl0Var.f32438e;
                if (((ValueAnimator) zl0Var.f33434g) != null) {
                    ((wm0) zl0Var.f33432e).V1 = false;
                    ArrayList arrayList2 = wl0Var.f32436b;
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
                        ((s4.d0) zl0Var.f33433f).getClass();
                        s4.p0.x0(view4);
                        ((wm0) zl0Var.f33432e).removeView(view4);
                        w7.x5 x5Var = (w7.x5) zl0Var.f33435i;
                        if (x5Var != null) {
                            x5Var.d(view4);
                        }
                    }
                    ((wm0) zl0Var.f33432e).setScrollEnabled(true);
                    ((wm0) zl0Var.f33432e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((wm0) zl0Var.f33432e).f3143e.C() == ((wm0) zl0Var.f33432e).getChildCount()) {
                            if (((ArrayList) ((wm0) zl0Var.f33432e).f3143e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((wm0) zl0Var.f33432e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((wm0) zl0Var.f33432e).getChildAt(i15);
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
                    xl0 xl0Var = wl0Var.d;
                    if (xl0Var != null) {
                        xl0Var.E();
                    }
                    w7.x5 x5Var2 = (w7.x5) zl0Var.f33435i;
                    if (x5Var2 != null) {
                        x5Var2.a();
                    }
                    ((SparseArray) zl0Var.f33436j).clear();
                    zl0Var.f33434g = null;
                    return;
                }
                return;
            default:
                m10 m10Var = (m10) obj;
                m10Var.setAlpha(1.0f);
                s4.p0.x0(m10Var);
                bm0 bm0Var = (bm0) obj2;
                bm0Var.f24686c.remove(m10Var);
                bm0Var.f24684a.removeView(m10Var);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1992a) {
            case 10:
                ((org.telegram.ui.ActionBar.k) this.f1994c).F.setVisibility(0);
                return;
            case 16:
                ((org.telegram.ui.Components.hb) this.f1993b).run();
                return;
            case 17:
                ((org.telegram.ui.Components.hb) this.f1993b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public z(Runnable runnable, Runnable runnable2, int i10) {
        this.f1992a = i10;
        this.f1993b = runnable;
        this.f1994c = runnable2;
    }

    public z(bm0 bm0Var, m10 m10Var, s4.p0 p0Var) {
        this.f1992a = 29;
        this.f1994c = bm0Var;
        this.f1993b = m10Var;
    }
}
