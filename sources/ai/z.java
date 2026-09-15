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
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.p50;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.ze;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bo;
import org.telegram.ui.dj;
import org.telegram.ui.hm;
import org.telegram.ui.un;
import org.telegram.ui.zp;
public final class z extends AnimatorListenerAdapter {
    public final int f1768a;
    public final Object f1769b;
    public final Object f1770c;

    public z(int i10, Object obj, Object obj2) {
        this.f1768a = i10;
        this.f1770c = obj;
        this.f1769b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f1768a) {
            case 10:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f1770c;
                AnimatorSet animatorSet3 = kVar.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f1770c;
                if (animator.equals(actionBarLayout.f18402k0)) {
                    actionBarLayout.f18396h0.clear();
                    actionBarLayout.f18382b0.clear();
                    actionBarLayout.f18385c0.clear();
                    actionBarLayout.f18400j0.clear();
                    org.telegram.ui.ActionBar.i6.sl = null;
                    actionBarLayout.f18398i0 = null;
                    actionBarLayout.f18394g0 = null;
                    actionBarLayout.f18402k0 = null;
                    un unVar = ((org.telegram.ui.ActionBar.c5) this.f1769b).f18566j;
                    if (unVar != null) {
                        unVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1770c;
                if (animator.equals(chatActivityEnterView.f21826q2)) {
                    chatActivityEnterView.f21826q2 = null;
                    return;
                }
                return;
            case 22:
                vi viVar = (vi) this.f1770c;
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
                kz kzVar = (kz) this.f1770c;
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
        int i10 = this.f1768a;
        int i11 = 0;
        Object obj = this.f1769b;
        Object obj2 = this.f1770c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                ((a0) obj2).f493b0.f548j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f31518s0;
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
                b4Var.f4384c = null;
                b4Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                ci.p pVar = (ci.p) obj2;
                ((qg.e2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 5:
                ci.ea eaVar = (ci.ea) obj2;
                eaVar.removeView((m30) obj);
                eaVar.h.clear();
                eaVar.f4603b = null;
                eaVar.f4604c = false;
                ci.fa faVar = (ci.fa) eaVar.f4606n;
                faVar.f4664a.setAllowDrawCursor(true);
                ci.p9 p9Var = faVar.f4667f;
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
                gVar.f11130b.clear();
                gVar.f11130b.add((kg.d) obj);
                return;
            case 7:
                super.onAnimationEnd(animator);
                ig.g gVar2 = (ig.g) obj2;
                gVar2.f11133c.clear();
                gVar2.f11133c.add((kg.b) obj);
                return;
            case 8:
                ii.d2 d2Var = (ii.d2) obj2;
                d2Var.E = false;
                d2Var.v.setAlpha(1.0f);
                d2Var.v.f21874z1.setVisibility(0);
                d2Var.f11325x.q(AndroidUtilities.dp(22.0f));
                d2Var.f11325x.setAlpha(255);
                hh.g gVar3 = d2Var.f11318s;
                gVar3.e = true;
                gVar3.invalidate();
                ((Runnable) obj).run();
                return;
            case 9:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f22017k0 = null;
                return;
            case 10:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar2.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar2.P = null;
                    org.telegram.ui.ActionBar.j5 j5Var = kVar2.f19315n[0];
                    if (j5Var != null) {
                        j5Var.setVisibility(4);
                    }
                    if (kVar2.f19324r != null && !TextUtils.isEmpty(kVar2.A0)) {
                        kVar2.f19324r.setVisibility(4);
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
                actionBarLayout.f18404l0.unlock();
                if (animator.equals(actionBarLayout.f18402k0)) {
                    actionBarLayout.f18396h0.clear();
                    actionBarLayout.f18382b0.clear();
                    actionBarLayout.f18385c0.clear();
                    actionBarLayout.f18400j0.clear();
                    org.telegram.ui.ActionBar.i6.sl = null;
                    actionBarLayout.f18398i0 = null;
                    actionBarLayout.f18394g0 = null;
                    actionBarLayout.f18402k0 = null;
                    un unVar = ((org.telegram.ui.ActionBar.c5) obj).f18566j;
                    if (unVar != null) {
                        unVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).f18406n = false;
                ((org.telegram.ui.ActionBar.n2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                bo boVar = (bo) obj2;
                boVar.A9 = 0.0f;
                if (animator == boVar.f32323gb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    boVar.Z2 = null;
                    boVar.f32323gb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) ((hm) obj2).f34308b;
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f20925x0 = false;
                org.telegram.ui.s0 s0Var = new org.telegram.ui.s0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((p50) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t1Var, s0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new org.telegram.ui.t4(this, 21));
                animatorSet4.start();
                return;
            case 15:
                zp zpVar = (zp) obj2;
                zpVar.L = 0.0f;
                zpVar.K = 1.0f;
                ((View) obj).invalidate();
                zpVar.T.invalidate();
                dj djVar = zpVar.Y;
                if (djVar != null) {
                    djVar.run();
                    zpVar.Y = null;
                    return;
                }
                return;
            case 16:
                ((ng) obj2).run();
                return;
            case 17:
                ((org.telegram.ui.Components.bb) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f21826q2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.Z0.setVisibility(8);
                    ze zeVar = chatActivityEnterView.S0;
                    if (zeVar != null) {
                        zeVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f21826q2 = null;
                    chatActivityEnterView.f21848u2 = 0;
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.K3.unlock();
                ((qd) obj).run();
                return;
            case 20:
                ((id) obj).run();
                ((ChatActivityEnterView) obj2).K3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).A3 = null;
                ((qd) obj).run();
                return;
            case 22:
                vi viVar = (vi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (kVar = viVar.f28781p2) != null && !kVar.f15344f) {
                        ((org.telegram.ui.ActionBar.p) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ru ruVar = (ru) obj2;
                if (ruVar.f27693a.e.getVisibility() == 0) {
                    ruVar.f27693a.e.setAlpha(1.0f);
                    ruVar.f27693a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                ll0 ll0Var = (ll0) obj;
                kz kzVar = (kz) obj2;
                if (animator.equals(kzVar.M0)) {
                    ll0Var.setTranslationY(0.0f);
                    if (ll0Var == kzVar.D0) {
                        ll0Var.setPadding(0, 0, 0, kzVar.f25743p2);
                    } else if (ll0Var == kzVar.P) {
                        ll0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.f25743p2);
                    } else if (ll0Var == kzVar.f25718h0) {
                        ll0Var.setPadding(0, kzVar.f25699b1, 0, kzVar.f25743p2);
                    }
                    kzVar.M0 = null;
                    return;
                }
                return;
            case 25:
                e20 e20Var = (e20) obj2;
                e20Var.removeView((m30) obj);
                e20Var.e.clear();
                e20Var.f23491a = null;
                e20Var.f23492b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                e20 e20Var2 = (e20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    e20Var2.removeView((View) arrayList.get(i13));
                }
                e20Var2.e.clear();
                e20Var2.f23491a = null;
                e20Var2.f23492b = false;
                return;
            case 27:
                a70 a70Var = (a70) obj2;
                a70Var.removeView((m30) obj);
                a70Var.f22328c = null;
                a70Var.e.f22674d0 = null;
                a70Var.f22326a = false;
                return;
            case 28:
                lk0 lk0Var = (lk0) obj2;
                ok0 ok0Var = lk0Var.e;
                if (((ValueAnimator) ok0Var.f26833g) != null) {
                    ((ll0) ok0Var.e).X1 = false;
                    ArrayList arrayList2 = lk0Var.f25933b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        View view4 = (View) obj3;
                        if (view4 instanceof org.telegram.ui.Cells.n4) {
                            ((org.telegram.ui.Cells.n4) view4).c(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((s4.c0) ok0Var.f26832f).getClass();
                        s4.o0.x0(view4);
                        ((ll0) ok0Var.e).removeView(view4);
                        w7.y5 y5Var = (w7.y5) ok0Var.f26834i;
                        if (y5Var != null) {
                            y5Var.d(view4);
                        }
                    }
                    ((ll0) ok0Var.e).setScrollEnabled(true);
                    ((ll0) ok0Var.e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((ll0) ok0Var.e).e.B() == ((ll0) ok0Var.e).getChildCount()) {
                            if (((ArrayList) ((ll0) ok0Var.e).e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((ll0) ok0Var.e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((ll0) ok0Var.e).getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.n4) {
                            ((org.telegram.ui.Cells.n4) childAt).c(false, false);
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
                        if (view5 instanceof org.telegram.ui.Cells.n4) {
                            ((org.telegram.ui.Cells.n4) view5).c(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    mk0 mk0Var = lk0Var.d;
                    if (mk0Var != null) {
                        mk0Var.E();
                    }
                    w7.y5 y5Var2 = (w7.y5) ok0Var.f26834i;
                    if (y5Var2 != null) {
                        y5Var2.a();
                    }
                    ((SparseArray) ok0Var.f26835j).clear();
                    ok0Var.f26833g = null;
                    return;
                }
                return;
            default:
                t00 t00Var = (t00) obj;
                t00Var.setAlpha(1.0f);
                s4.o0.x0(t00Var);
                qk0 qk0Var = (qk0) obj2;
                qk0Var.f27375c.remove(t00Var);
                qk0Var.f27373a.removeView(t00Var);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1768a) {
            case 10:
                ((org.telegram.ui.ActionBar.k) this.f1770c).F.setVisibility(0);
                return;
            case 16:
                ((org.telegram.ui.Components.db) this.f1769b).run();
                return;
            case 17:
                ((org.telegram.ui.Components.db) this.f1769b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public z(Runnable runnable, Runnable runnable2, int i10) {
        this.f1768a = i10;
        this.f1769b = runnable;
        this.f1770c = runnable2;
    }

    public z(qk0 qk0Var, t00 t00Var, s4.o0 o0Var) {
        this.f1768a = 29;
        this.f1770c = qk0Var;
        this.f1769b = t00Var;
    }
}
