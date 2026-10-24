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
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.ze;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ln;
import org.telegram.ui.np;
import org.telegram.ui.sn;
import org.telegram.ui.ti;
import org.telegram.ui.yl;
public final class ne extends AnimatorListenerAdapter {
    public final int f1921a;
    public final Object f1922b;
    public final Object f1923c;

    public ne(int i10, Object obj, Object obj2) {
        this.f1921a = i10;
        this.f1923c = obj;
        this.f1922b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1921a) {
            case 11:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f1923c;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f1923c;
                if (animator.equals(actionBarLayout.f20649q0)) {
                    actionBarLayout.f20632h0.clear();
                    actionBarLayout.f20618b0.clear();
                    actionBarLayout.f20621c0.clear();
                    actionBarLayout.f20636j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    org.telegram.ui.ActionBar.k6.vl = null;
                    actionBarLayout.f20634i0 = null;
                    actionBarLayout.f20630g0 = null;
                    actionBarLayout.f20649q0 = null;
                    ln lnVar = ((org.telegram.ui.ActionBar.g5) this.f1922b).f20924j;
                    if (lnVar != null) {
                        lnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1923c;
                if (animator.equals(chatActivityEnterView.f24157r2)) {
                    chatActivityEnterView.f24157r2 = null;
                    return;
                }
                return;
            case 23:
                ri riVar = (ri) this.f1923c;
                if (ri.a0(riVar) != null && ri.b0(riVar).equals(animator)) {
                    ri.c0(riVar);
                    ri.d0(riVar);
                    return;
                }
                return;
            case 25:
                rz rzVar = (rz) this.f1923c;
                if (animator.equals(rzVar.M0)) {
                    rzVar.M0 = null;
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
        int i10 = this.f1921a;
        int i11 = 0;
        Object obj = this.f1922b;
        Object obj2 = this.f1923c;
        switch (i10) {
            case 0:
                pe peVar = (pe) obj2;
                peVar.f2033b.remove((oe) obj);
                peVar.f1();
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((ci.q) obj2).f5756b0.f5824j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 2:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f34169s0;
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
                ((ei.y2) obj2).f10145s.h.setVisibility(8);
                return;
            case 4:
                ei.u3 u3Var = (ei.u3) obj2;
                u3Var.f9902c = null;
                u3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ei.p pVar = (ei.p) obj2;
                ((rg.d2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 6:
                ei.n9 n9Var = (ei.n9) obj2;
                n9Var.removeView((t30) obj);
                n9Var.h.clear();
                n9Var.f9535b = null;
                n9Var.f9536c = false;
                ei.o9 o9Var = (ei.o9) n9Var.f9538n;
                o9Var.f9573b.setAllowDrawCursor(true);
                ei.a9 a9Var = o9Var.h;
                if (a9Var != null) {
                    a9Var.run();
                }
                if (o9Var.L) {
                    o9Var.fullScroll(130);
                    o9Var.L = false;
                    return;
                }
                return;
            case 7:
                jg.g gVar = (jg.g) obj2;
                gVar.f14493b.clear();
                gVar.f14493b.add((lg.d) obj);
                return;
            case 8:
                super.onAnimationEnd(animator);
                jg.g gVar2 = (jg.g) obj2;
                gVar2.f14496c.clear();
                gVar2.f14496c.add((lg.b) obj);
                return;
            case 9:
                ki.d2 d2Var = (ki.d2) obj2;
                d2Var.E = false;
                d2Var.v.setAlpha(1.0f);
                d2Var.v.A1.setVisibility(0);
                d2Var.f15284x.q(AndroidUtilities.dp(22.0f));
                d2Var.f15284x.setAlpha(255);
                ih.f fVar = d2Var.f15277s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 10:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f24342k0 = null;
                return;
            case 11:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar2.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar2.P = null;
                    org.telegram.ui.ActionBar.n5 n5Var = kVar2.f21068n[0];
                    if (n5Var != null) {
                        n5Var.setVisibility(4);
                    }
                    if (kVar2.f21077r != null && !TextUtils.isEmpty(kVar2.A0)) {
                        kVar2.f21077r.setVisibility(4);
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
                actionBarLayout.f20652r0.unlock();
                if (animator.equals(actionBarLayout.f20649q0)) {
                    actionBarLayout.f20632h0.clear();
                    actionBarLayout.f20618b0.clear();
                    actionBarLayout.f20621c0.clear();
                    actionBarLayout.f20636j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    org.telegram.ui.ActionBar.k6.vl = null;
                    actionBarLayout.f20634i0 = null;
                    actionBarLayout.f20630g0 = null;
                    actionBarLayout.f20649q0 = null;
                    ln lnVar = ((org.telegram.ui.ActionBar.g5) obj).f20924j;
                    if (lnVar != null) {
                        lnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((ActionBarLayout) obj2).f20642n = false;
                ((org.telegram.ui.ActionBar.o2) obj).onPreviewOpenAnimationEnd();
                return;
            case 14:
                View view3 = (View) obj;
                sn snVar = (sn) obj2;
                snVar.M9 = 0.0f;
                if (animator == snVar.f41693tb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    snVar.f41585l3 = null;
                    snVar.f41693tb = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) ((yl) obj2).f43884b;
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f23228x0 = false;
                org.telegram.ui.u0 u0Var = new org.telegram.ui.u0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((n60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t1Var, u0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new m.a(this, 26));
                animatorSet2.start();
                return;
            case 16:
                np npVar = (np) obj2;
                npVar.L = 0.0f;
                npVar.K = 1.0f;
                ((View) obj).invalidate();
                npVar.T.invalidate();
                ti tiVar = npVar.Y;
                if (tiVar != null) {
                    tiVar.run();
                    npVar.Y = null;
                    return;
                }
                return;
            case 17:
                ((ng) obj2).run();
                return;
            case 18:
                ((org.telegram.ui.Components.bb) obj2).run();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f24157r2)) {
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
                    chatActivityEnterView.f24157r2 = null;
                    chatActivityEnterView.f24178v2 = 0;
                    return;
                }
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.unlock();
                ((org.telegram.ui.Components.pd) obj).run();
                return;
            case 21:
                ((org.telegram.ui.Components.c2) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                return;
            case 22:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((org.telegram.ui.Components.pd) obj).run();
                return;
            case 23:
                ri riVar = (ri) obj2;
                if (ri.Y(riVar) != null && ri.Z(riVar).equals(animator) && (kVar = riVar.f30188s2) != null && !kVar.f17615f) {
                    ((jg) obj).run();
                    return;
                }
                return;
            case 24:
                wu wuVar = (wu) obj2;
                if (wuVar.f32350a.e.getVisibility() == 0) {
                    wuVar.f32350a.e.setAlpha(1.0f);
                    wuVar.f32350a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 25:
                lm0 lm0Var = (lm0) obj;
                rz rzVar = (rz) obj2;
                if (animator.equals(rzVar.M0)) {
                    lm0Var.setTranslationY(0.0f);
                    if (lm0Var == rzVar.D0) {
                        lm0Var.setPadding(0, 0, 0, rzVar.f30353q2);
                    } else if (lm0Var == rzVar.P) {
                        lm0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), rzVar.f30353q2);
                    } else if (lm0Var == rzVar.f30325h0) {
                        lm0Var.setPadding(0, rzVar.f30306b1, 0, rzVar.f30353q2);
                    }
                    rzVar.M0 = null;
                    return;
                }
                return;
            case 26:
                l20 l20Var = (l20) obj2;
                l20Var.removeView((t30) obj);
                l20Var.e.clear();
                l20Var.f28139a = null;
                l20Var.f28140b = false;
                return;
            case 27:
                ArrayList arrayList = (ArrayList) obj;
                l20 l20Var2 = (l20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    l20Var2.removeView((View) arrayList.get(i13));
                }
                l20Var2.e.clear();
                l20Var2.f28139a = null;
                l20Var2.f28140b = false;
                return;
            case 28:
                u70 u70Var = (u70) obj2;
                u70Var.removeView((t30) obj);
                u70Var.f31037c = null;
                u70Var.e.f31349d0 = null;
                u70Var.f31035a = false;
                return;
            default:
                ll0 ll0Var = (ll0) obj2;
                ol0 ol0Var = ll0Var.e;
                if (((ValueAnimator) ol0Var.f29320g) != null) {
                    ((lm0) ol0Var.e).V1 = false;
                    ArrayList arrayList2 = ll0Var.f28368b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        View view4 = (View) obj3;
                        if (view4 instanceof org.telegram.ui.Cells.n4) {
                            ((org.telegram.ui.Cells.n4) view4).d(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((s4.b0) ol0Var.f29319f).getClass();
                        s4.n0.x0(view4);
                        ((lm0) ol0Var.e).removeView(view4);
                        w7.a6 a6Var = (w7.a6) ol0Var.f29321i;
                        if (a6Var != null) {
                            a6Var.d(view4);
                        }
                    }
                    ((lm0) ol0Var.e).setScrollEnabled(true);
                    ((lm0) ol0Var.e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((lm0) ol0Var.e).e.D() == ((lm0) ol0Var.e).getChildCount()) {
                            if (((ArrayList) ((lm0) ol0Var.e).e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((lm0) ol0Var.e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((lm0) ol0Var.e).getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.n4) {
                            ((org.telegram.ui.Cells.n4) childAt).d(false, false);
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
                            ((org.telegram.ui.Cells.n4) view5).d(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    ml0 ml0Var = ll0Var.d;
                    if (ml0Var != null) {
                        ml0Var.E();
                    }
                    w7.a6 a6Var2 = (w7.a6) ol0Var.f29321i;
                    if (a6Var2 != null) {
                        a6Var2.a();
                    }
                    ((SparseArray) ol0Var.f29322j).clear();
                    ol0Var.f29320g = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1921a) {
            case 11:
                ((org.telegram.ui.ActionBar.k) this.f1923c).F.setVisibility(0);
                return;
            case 17:
                ((org.telegram.ui.Components.db) this.f1922b).run();
                return;
            case 18:
                ((org.telegram.ui.Components.db) this.f1922b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ne(Runnable runnable, Runnable runnable2, int i10) {
        this.f1921a = i10;
        this.f1922b = runnable;
        this.f1923c = runnable2;
    }
}
