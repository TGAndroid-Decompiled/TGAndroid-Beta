package bi;

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
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.z30;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dq;
import org.telegram.ui.fo;
import org.telegram.ui.gj;
import org.telegram.ui.lm;
import org.telegram.ui.xn;
public final class t extends AnimatorListenerAdapter {
    public final int f3721a;
    public final Object f3722b;
    public final Object f3723c;

    public t(int i10, Object obj, Object obj2) {
        this.f3721a = i10;
        this.f3723c = obj;
        this.f3722b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f3721a) {
            case 10:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f3723c;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f3723c;
                if (animator.equals(actionBarLayout.f19213k0)) {
                    actionBarLayout.f19207h0.clear();
                    actionBarLayout.f19193b0.clear();
                    actionBarLayout.f19196c0.clear();
                    actionBarLayout.f19211j0.clear();
                    org.telegram.ui.ActionBar.g6.vl = null;
                    actionBarLayout.f19209i0 = null;
                    actionBarLayout.f19205g0 = null;
                    actionBarLayout.f19213k0 = null;
                    xn xnVar = ((org.telegram.ui.ActionBar.a5) this.f3722b).f19314j;
                    if (xnVar != null) {
                        xnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3723c;
                if (animator.equals(chatActivityEnterView.f22652r2)) {
                    chatActivityEnterView.f22652r2 = null;
                    return;
                }
                return;
            case 22:
                vi viVar = (vi) this.f3723c;
                if (vi.X(viVar) != null && vi.Y(viVar).equals(animator)) {
                    vi.Z(viVar);
                    vi.a0(viVar);
                    return;
                }
                return;
            case 24:
                wz wzVar = (wz) this.f3723c;
                if (animator.equals(wzVar.M0)) {
                    wzVar.M0 = null;
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
        int i10 = this.f3721a;
        int i11 = 0;
        Object obj = this.f3722b;
        Object obj2 = this.f3723c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                ((u) obj2).f3765b0.f3828j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f32511s0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new a3.d(profileStoriesView, 20), 180L);
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
                ((di.c3) obj2).h.h.setVisibility(8);
                return;
            case 3:
                di.z3 z3Var = (di.z3) obj2;
                z3Var.f8180c = null;
                z3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                di.p pVar = (di.p) obj2;
                ((rg.d2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 5:
                di.aa aaVar = (di.aa) obj2;
                aaVar.removeView((z30) obj);
                aaVar.h.clear();
                aaVar.f6636b = null;
                aaVar.f6637c = false;
                di.ba baVar = (di.ba) aaVar.f6639n;
                baVar.f6668a.setAllowDrawCursor(true);
                di.l9 l9Var = baVar.f6671f;
                if (l9Var != null) {
                    l9Var.run();
                }
                if (baVar.K) {
                    baVar.fullScroll(130);
                    baVar.K = false;
                    return;
                }
                return;
            case 6:
                jg.g gVar = (jg.g) obj2;
                gVar.f13036b.clear();
                gVar.f13036b.add((lg.d) obj);
                return;
            case 7:
                super.onAnimationEnd(animator);
                jg.g gVar2 = (jg.g) obj2;
                gVar2.f13039c.clear();
                gVar2.f13039c.add((lg.b) obj);
                return;
            case 8:
                ji.d2 d2Var = (ji.d2) obj2;
                d2Var.E = false;
                d2Var.v.setAlpha(1.0f);
                d2Var.v.A1.setVisibility(0);
                d2Var.f13230x.q(AndroidUtilities.dp(22.0f));
                d2Var.f13230x.setAlpha(255);
                ih.f fVar = d2Var.f13223s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 9:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f22837k0 = null;
                return;
            case 10:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar2.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar2.P = null;
                    org.telegram.ui.ActionBar.h5 h5Var = kVar2.f20141n[0];
                    if (h5Var != null) {
                        h5Var.setVisibility(4);
                    }
                    if (kVar2.f20150r != null && !TextUtils.isEmpty(kVar2.A0)) {
                        kVar2.f20150r.setVisibility(4);
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
                actionBarLayout.f19215l0.unlock();
                if (animator.equals(actionBarLayout.f19213k0)) {
                    actionBarLayout.f19207h0.clear();
                    actionBarLayout.f19193b0.clear();
                    actionBarLayout.f19196c0.clear();
                    actionBarLayout.f19211j0.clear();
                    org.telegram.ui.ActionBar.g6.vl = null;
                    actionBarLayout.f19209i0 = null;
                    actionBarLayout.f19205g0 = null;
                    actionBarLayout.f19213k0 = null;
                    xn xnVar = ((org.telegram.ui.ActionBar.a5) obj).f19314j;
                    if (xnVar != null) {
                        xnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).f19217n = false;
                ((org.telegram.ui.ActionBar.m2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                fo foVar = (fo) obj2;
                foVar.A9 = 0.0f;
                if (animator == foVar.f35659gb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    foVar.Z2 = null;
                    foVar.f35659gb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ((lm) obj2).f37785b;
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f21756x0 = false;
                org.telegram.ui.v0 v0Var = new org.telegram.ui.v0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((r60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(u1Var, v0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new org.telegram.ui.u0(this, 24));
                animatorSet2.start();
                return;
            case 15:
                dq dqVar = (dq) obj2;
                dqVar.L = 0.0f;
                dqVar.K = 1.0f;
                ((View) obj).invalidate();
                dqVar.T.invalidate();
                gj gjVar = dqVar.Y;
                if (gjVar != null) {
                    gjVar.run();
                    dqVar.Y = null;
                    return;
                }
                return;
            case 16:
                ((qg) obj2).run();
                return;
            case 17:
                ((org.telegram.ui.Components.fb) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f22652r2)) {
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
                    chatActivityEnterView.f22652r2 = null;
                    chatActivityEnterView.f22673v2 = 0;
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
                ((org.telegram.ui.Components.o8) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((td) obj).run();
                return;
            case 22:
                vi viVar = (vi) obj2;
                if (vi.V(viVar) != null && vi.W(viVar).equals(animator) && (kVar = viVar.f29714s2) != null && !kVar.f16154f) {
                    ((org.telegram.messenger.video.f) obj).run();
                    return;
                }
                return;
            case 23:
                dv dvVar = (dv) obj2;
                if (dvVar.f24189a.e.getVisibility() == 0) {
                    dvVar.f24189a.e.setAlpha(1.0f);
                    dvVar.f24189a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                mm0 mm0Var = (mm0) obj;
                wz wzVar = (wz) obj2;
                if (animator.equals(wzVar.M0)) {
                    mm0Var.setTranslationY(0.0f);
                    if (mm0Var == wzVar.D0) {
                        mm0Var.setPadding(0, 0, 0, wzVar.f30747p2);
                    } else if (mm0Var == wzVar.P) {
                        mm0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), wzVar.f30747p2);
                    } else if (mm0Var == wzVar.f30722h0) {
                        mm0Var.setPadding(0, wzVar.f30703b1, 0, wzVar.f30747p2);
                    }
                    wzVar.M0 = null;
                    return;
                }
                return;
            case 25:
                r20 r20Var = (r20) obj2;
                r20Var.removeView((z30) obj);
                r20Var.e.clear();
                r20Var.f28405a = null;
                r20Var.f28406b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                r20 r20Var2 = (r20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    r20Var2.removeView((View) arrayList.get(i13));
                }
                r20Var2.e.clear();
                r20Var2.f28405a = null;
                r20Var2.f28406b = false;
                return;
            case 27:
                y70 y70Var = (y70) obj2;
                y70Var.removeView((z30) obj);
                y70Var.f31174c = null;
                y70Var.e.f31476d0 = null;
                y70Var.f31172a = false;
                return;
            case 28:
                ml0 ml0Var = (ml0) obj2;
                pl0 pl0Var = ml0Var.e;
                if (((ValueAnimator) pl0Var.f28054g) != null) {
                    ((mm0) pl0Var.e).V1 = false;
                    ArrayList arrayList2 = ml0Var.f27120b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        View view4 = (View) obj3;
                        if (view4 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) view4).e(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((s4.b0) pl0Var.f28053f).getClass();
                        s4.n0.x0(view4);
                        ((mm0) pl0Var.e).removeView(view4);
                        w7.a6 a6Var = (w7.a6) pl0Var.f28055i;
                        if (a6Var != null) {
                            a6Var.d(view4);
                        }
                    }
                    ((mm0) pl0Var.e).setScrollEnabled(true);
                    ((mm0) pl0Var.e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((mm0) pl0Var.e).e.D() == ((mm0) pl0Var.e).getChildCount()) {
                            if (((ArrayList) ((mm0) pl0Var.e).e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((mm0) pl0Var.e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((mm0) pl0Var.e).getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) childAt).e(false, false);
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
                            ((org.telegram.ui.Cells.o4) view5).e(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    nl0 nl0Var = ml0Var.d;
                    if (nl0Var != null) {
                        nl0Var.E();
                    }
                    w7.a6 a6Var2 = (w7.a6) pl0Var.f28055i;
                    if (a6Var2 != null) {
                        a6Var2.a();
                    }
                    ((SparseArray) pl0Var.f28056j).clear();
                    pl0Var.f28054g = null;
                    return;
                }
                return;
            default:
                f10 f10Var = (f10) obj;
                f10Var.setAlpha(1.0f);
                s4.n0.x0(f10Var);
                rl0 rl0Var = (rl0) obj2;
                rl0Var.f28568c.remove(f10Var);
                rl0Var.f28566a.removeView(f10Var);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f3721a) {
            case 10:
                ((org.telegram.ui.ActionBar.k) this.f3723c).F.setVisibility(0);
                return;
            case 16:
                ((org.telegram.ui.Components.hb) this.f3722b).run();
                return;
            case 17:
                ((org.telegram.ui.Components.hb) this.f3722b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public t(Runnable runnable, Runnable runnable2, int i10) {
        this.f3721a = i10;
        this.f3722b = runnable;
        this.f3723c = runnable2;
    }

    public t(rl0 rl0Var, f10 f10Var, s4.n0 n0Var) {
        this.f3721a = 29;
        this.f3723c = rl0Var;
        this.f3722b = f10Var;
    }
}
