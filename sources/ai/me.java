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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.yu;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.jn;
import org.telegram.ui.lp;
import org.telegram.ui.qn;
import org.telegram.ui.xl;
public final class me extends AnimatorListenerAdapter {
    public final int f1856a;
    public final Object f1857b;
    public final Object f1858c;

    public me(int i10, Object obj, Object obj2) {
        this.f1856a = i10;
        this.f1858c = obj;
        this.f1857b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1856a) {
            case 11:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f1858c;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f1858c;
                if (animator.equals(actionBarLayout.f20570k0)) {
                    actionBarLayout.f20564h0.clear();
                    actionBarLayout.f20550b0.clear();
                    actionBarLayout.f20553c0.clear();
                    actionBarLayout.f20568j0.clear();
                    org.telegram.ui.ActionBar.h6.vl = null;
                    actionBarLayout.f20566i0 = null;
                    actionBarLayout.f20562g0 = null;
                    actionBarLayout.f20570k0 = null;
                    jn jnVar = ((org.telegram.ui.ActionBar.c5) this.f1857b).f20734j;
                    if (jnVar != null) {
                        jnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1858c;
                if (animator.equals(chatActivityEnterView.f24011r2)) {
                    chatActivityEnterView.f24011r2 = null;
                    return;
                }
                return;
            case 23:
                ti tiVar = (ti) this.f1858c;
                if (ti.X(tiVar) != null && ti.Y(tiVar).equals(animator)) {
                    ti.Z(tiVar);
                    ti.a0(tiVar);
                    return;
                }
                return;
            case 25:
                tz tzVar = (tz) this.f1858c;
                if (animator.equals(tzVar.M0)) {
                    tzVar.M0 = null;
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
        int i10 = this.f1856a;
        int i11 = 0;
        Object obj = this.f1857b;
        Object obj2 = this.f1858c;
        switch (i10) {
            case 0:
                oe oeVar = (oe) obj2;
                oeVar.f1969b.remove((ne) obj);
                oeVar.f1();
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((ci.q) obj2).f5739b0.f5879j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 2:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f33866s0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(profileStoriesView, 13), 180L);
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
                ((ei.y2) obj2).f10128s.h.setVisibility(8);
                return;
            case 4:
                ei.u3 u3Var = (ei.u3) obj2;
                u3Var.f9886c = null;
                u3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ei.p pVar = (ei.p) obj2;
                ((rg.c2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 6:
                ei.n9 n9Var = (ei.n9) obj2;
                n9Var.removeView((v30) obj);
                n9Var.h.clear();
                n9Var.f9524b = null;
                n9Var.f9525c = false;
                ei.o9 o9Var = (ei.o9) n9Var.f9527n;
                o9Var.f9558a.setAllowDrawCursor(true);
                ei.a9 a9Var = o9Var.f9561f;
                if (a9Var != null) {
                    a9Var.run();
                }
                if (o9Var.K) {
                    o9Var.fullScroll(130);
                    o9Var.K = false;
                    return;
                }
                return;
            case 7:
                jg.g gVar = (jg.g) obj2;
                gVar.f14448b.clear();
                gVar.f14448b.add((lg.d) obj);
                return;
            case 8:
                super.onAnimationEnd(animator);
                jg.g gVar2 = (jg.g) obj2;
                gVar2.f14451c.clear();
                gVar2.f14451c.add((lg.b) obj);
                return;
            case 9:
                ki.d2 d2Var = (ki.d2) obj2;
                d2Var.E = false;
                d2Var.v.setAlpha(1.0f);
                d2Var.v.A1.setVisibility(0);
                d2Var.f15226x.q(AndroidUtilities.dp(22.0f));
                d2Var.f15226x.setAlpha(255);
                ih.f fVar = d2Var.f15219s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 10:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f24196k0 = null;
                return;
            case 11:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar2.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar2.P = null;
                    org.telegram.ui.ActionBar.j5 j5Var = kVar2.f21496n[0];
                    if (j5Var != null) {
                        j5Var.setVisibility(4);
                    }
                    if (kVar2.f21505r != null && !TextUtils.isEmpty(kVar2.A0)) {
                        kVar2.f21505r.setVisibility(4);
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
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.f20572l0.unlock();
                if (animator.equals(actionBarLayout.f20570k0)) {
                    actionBarLayout.f20564h0.clear();
                    actionBarLayout.f20550b0.clear();
                    actionBarLayout.f20553c0.clear();
                    actionBarLayout.f20568j0.clear();
                    org.telegram.ui.ActionBar.h6.vl = null;
                    actionBarLayout.f20566i0 = null;
                    actionBarLayout.f20562g0 = null;
                    actionBarLayout.f20570k0 = null;
                    jn jnVar = ((org.telegram.ui.ActionBar.c5) obj).f20734j;
                    if (jnVar != null) {
                        jnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((ActionBarLayout) obj2).f20574n = false;
                ((org.telegram.ui.ActionBar.n2) obj).onPreviewOpenAnimationEnd();
                return;
            case 14:
                View view3 = (View) obj;
                qn qnVar = (qn) obj2;
                qnVar.A9 = 0.0f;
                if (animator == qnVar.f40699gb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    qnVar.Z2 = null;
                    qnVar.f40699gb = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ((xl) obj2).f43232b;
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f23163x0 = false;
                org.telegram.ui.v0 v0Var = new org.telegram.ui.v0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((o60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(u1Var, v0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new m.a(this, 26));
                animatorSet2.start();
                return;
            case 16:
                lp lpVar = (lp) obj2;
                lpVar.L = 0.0f;
                lpVar.K = 1.0f;
                ((View) obj).invalidate();
                lpVar.T.invalidate();
                org.telegram.ui.ti tiVar = lpVar.Y;
                if (tiVar != null) {
                    tiVar.run();
                    lpVar.Y = null;
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
                if (animator.equals(chatActivityEnterView.f24011r2)) {
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
                    chatActivityEnterView.f24011r2 = null;
                    chatActivityEnterView.f24032v2 = 0;
                    return;
                }
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.unlock();
                ((org.telegram.ui.Components.rd) obj).run();
                return;
            case 21:
                ((org.telegram.ui.Components.e2) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                return;
            case 22:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((org.telegram.ui.Components.rd) obj).run();
                return;
            case 23:
                ti tiVar2 = (ti) obj2;
                if (ti.V(tiVar2) != null && ti.W(tiVar2).equals(animator) && (kVar = tiVar2.f30588s2) != null && !kVar.f17552f) {
                    ((lg) obj).run();
                    return;
                }
                return;
            case 24:
                yu yuVar = (yu) obj2;
                if (yuVar.f32733a.e.getVisibility() == 0) {
                    yuVar.f32733a.e.setAlpha(1.0f);
                    yuVar.f32733a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 25:
                jm0 jm0Var = (jm0) obj;
                tz tzVar = (tz) obj2;
                if (animator.equals(tzVar.M0)) {
                    jm0Var.setTranslationY(0.0f);
                    if (jm0Var == tzVar.D0) {
                        jm0Var.setPadding(0, 0, 0, tzVar.f30763p2);
                    } else if (jm0Var == tzVar.P) {
                        jm0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), tzVar.f30763p2);
                    } else if (jm0Var == tzVar.f30738h0) {
                        jm0Var.setPadding(0, tzVar.f30719b1, 0, tzVar.f30763p2);
                    }
                    tzVar.M0 = null;
                    return;
                }
                return;
            case 26:
                n20 n20Var = (n20) obj2;
                n20Var.removeView((v30) obj);
                n20Var.e.clear();
                n20Var.f28660a = null;
                n20Var.f28661b = false;
                return;
            case 27:
                ArrayList arrayList = (ArrayList) obj;
                n20 n20Var2 = (n20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    n20Var2.removeView((View) arrayList.get(i13));
                }
                n20Var2.e.clear();
                n20Var2.f28660a = null;
                n20Var2.f28661b = false;
                return;
            case 28:
                u70 u70Var = (u70) obj2;
                u70Var.removeView((v30) obj);
                u70Var.f30870c = null;
                u70Var.e.f31171d0 = null;
                u70Var.f30868a = false;
                return;
            default:
                jl0 jl0Var = (jl0) obj2;
                ml0 ml0Var = jl0Var.e;
                if (((ValueAnimator) ml0Var.f28547g) != null) {
                    ((jm0) ml0Var.e).V1 = false;
                    ArrayList arrayList2 = jl0Var.f27550b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        View view4 = (View) obj3;
                        if (view4 instanceof org.telegram.ui.Cells.n4) {
                            ((org.telegram.ui.Cells.n4) view4).e(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((s4.b0) ml0Var.f28546f).getClass();
                        s4.n0.x0(view4);
                        ((jm0) ml0Var.e).removeView(view4);
                        w7.a6 a6Var = (w7.a6) ml0Var.f28548i;
                        if (a6Var != null) {
                            a6Var.d(view4);
                        }
                    }
                    ((jm0) ml0Var.e).setScrollEnabled(true);
                    ((jm0) ml0Var.e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((jm0) ml0Var.e).e.D() == ((jm0) ml0Var.e).getChildCount()) {
                            if (((ArrayList) ((jm0) ml0Var.e).e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((jm0) ml0Var.e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((jm0) ml0Var.e).getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.n4) {
                            ((org.telegram.ui.Cells.n4) childAt).e(false, false);
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
                            ((org.telegram.ui.Cells.n4) view5).e(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    kl0 kl0Var = jl0Var.d;
                    if (kl0Var != null) {
                        kl0Var.E();
                    }
                    w7.a6 a6Var2 = (w7.a6) ml0Var.f28548i;
                    if (a6Var2 != null) {
                        a6Var2.a();
                    }
                    ((SparseArray) ml0Var.f28549j).clear();
                    ml0Var.f28547g = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1856a) {
            case 11:
                ((org.telegram.ui.ActionBar.k) this.f1858c).F.setVisibility(0);
                return;
            case 17:
                ((org.telegram.ui.Components.fb) this.f1857b).run();
                return;
            case 18:
                ((org.telegram.ui.Components.fb) this.f1857b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public me(Runnable runnable, Runnable runnable2, int i10) {
        this.f1856a = i10;
        this.f1857b = runnable;
        this.f1858c = runnable2;
    }
}
