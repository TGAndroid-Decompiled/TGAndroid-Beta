package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.util.ArrayList;
import k7.c6;
import lh.fb;
import lh.gb;
import lh.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bj;
import org.telegram.ui.sn;
import org.telegram.ui.u5;
import org.telegram.ui.vp;
import org.telegram.ui.xq;
import org.telegram.ui.zn;
public final class y2 extends AnimatorListenerAdapter {
    public final int f4865a;
    public final Object f4866b;
    public final Object f4867c;

    public y2(int i10, Object obj, Object obj2) {
        this.f4865a = i10;
        this.f4867c = obj;
        this.f4866b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f4865a) {
            case 7:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f4867c;
                AnimatorSet animatorSet3 = kVar.M;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.M = null;
                    return;
                }
                return;
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f4867c;
                if (animator.equals(actionBarLayout.f19440h0)) {
                    actionBarLayout.f19433e0.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.W.clear();
                    actionBarLayout.f19438g0.clear();
                    j6.sl = null;
                    actionBarLayout.f19436f0 = null;
                    actionBarLayout.f19431d0 = null;
                    actionBarLayout.f19440h0 = null;
                    sn snVar = ((d5) this.f4866b).f19614j;
                    if (snVar != null) {
                        snVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4867c;
                if (animator.equals(chatActivityEnterView.f22780n2)) {
                    chatActivityEnterView.f22780n2 = null;
                    return;
                }
                return;
            case 19:
                li liVar = (li) this.f4867c;
                animatorSet = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType = 0;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                kz kzVar = (kz) this.f4867c;
                if (animator.equals(kzVar.J0)) {
                    kzVar.J0 = null;
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
        o1.j jVar;
        int i10 = this.f4865a;
        int i11 = 0;
        Object obj = this.f4866b;
        Object obj2 = this.f4867c;
        switch (i10) {
            case 0:
                a3 a3Var = (a3) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a3Var.f4370o0.b(a3Var.f4377v0, false);
                }
                a3Var.setRotationY(0.0f);
                a3Var.f4378w0 = 1.0f;
                return;
            case 1:
                ((eg.o1) obj2).f5386w = false;
                ((eg.z0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 2:
                eg.e2 e2Var = (eg.e2) obj2;
                e2Var.E0 = false;
                e2Var.D0 = 1.0f;
                e2Var.f5261p0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new ag.a(2, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 3:
                kg.j jVar2 = (kg.j) obj2;
                jVar2.removeView((o30) obj);
                jVar2.h.clear();
                jVar2.f10541b = null;
                jVar2.f10542c = false;
                ((kg.k) jVar2.f10544n).f10546b.setAllowDrawCursor(true);
                return;
            case 4:
                gb gbVar = (gb) obj2;
                gbVar.f12500b.remove((fb) obj);
                gbVar.M();
                return;
            case 5:
                super.onAnimationEnd(animator);
                ((nh.p) obj2).V.f15745g0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr3 = (boolean[]) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    int i12 = ProfileStoriesView.f32277p0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new lh.b(profileStoriesView, 28), 180L);
                    }
                }
                profileStoriesView.T = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 7:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar.M;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.M = null;
                    k5 k5Var = kVar.f20309n[0];
                    if (k5Var != null) {
                        k5Var.setVisibility(4);
                    }
                    if (kVar.f20317r != null && !TextUtils.isEmpty(kVar.f20327x0)) {
                        kVar.f20317r.setVisibility(4);
                    }
                    org.telegram.ui.ActionBar.z zVar = kVar.B;
                    if (zVar != null) {
                        zVar.setVisibility(4);
                    }
                    if (kVar.N == null) {
                        return;
                    }
                    while (true) {
                        View[] viewArr = kVar.N;
                        if (i11 < viewArr.length) {
                            View view = viewArr[i11];
                            if (view != null && ((zArr = (boolean[]) obj) == null || i11 >= zArr.length || zArr[i11])) {
                                view.setVisibility(4);
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
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.f19442i0.unlock();
                if (animator.equals(actionBarLayout.f19440h0)) {
                    actionBarLayout.f19433e0.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.W.clear();
                    actionBarLayout.f19438g0.clear();
                    j6.sl = null;
                    actionBarLayout.f19436f0 = null;
                    actionBarLayout.f19431d0 = null;
                    actionBarLayout.f19440h0 = null;
                    sn snVar = ((d5) obj).f19614j;
                    if (snVar != null) {
                        snVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((ActionBarLayout) obj2).f19449n = false;
                ((org.telegram.ui.ActionBar.p2) obj).onPreviewOpenAnimationEnd();
                return;
            case 10:
                View view2 = (View) obj;
                zn znVar = (zn) obj2;
                znVar.f40809x9 = 0.0f;
                if (animator == znVar.f40561db) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                    znVar.W2 = null;
                    znVar.f40561db = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) ((hh.f) obj2).f7116b;
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().f21845x0 = false;
                org.telegram.ui.w0 w0Var = new org.telegram.ui.w0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((s50) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s1Var, w0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new u5(this, 20));
                animatorSet4.start();
                return;
            case 12:
                vp vpVar = (vp) obj2;
                vpVar.I = 0.0f;
                vpVar.H = 1.0f;
                ((View) obj).invalidate();
                vpVar.Q.invalidate();
                bj bjVar = vpVar.V;
                if (bjVar != null) {
                    bjVar.run();
                    vpVar.V = null;
                    return;
                }
                return;
            case 13:
                ((fg) obj2).run();
                return;
            case 14:
                ((ua) obj2).run();
                return;
            case 15:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.M0;
                if (animator.equals(chatActivityEnterView.f22780n2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.W0.setVisibility(8);
                    se seVar = chatActivityEnterView.P0;
                    if (seVar != null) {
                        seVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f22780n2 = null;
                    chatActivityEnterView.f22801r2 = 0;
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.S0 = null;
                chatActivityEnterView2.H3.unlock();
                ((id) obj).run();
                return;
            case 17:
                ((ah.b) obj).run();
                ((ChatActivityEnterView) obj2).H3.unlock();
                return;
            case 18:
                ((ChatActivityEnterView) obj2).f22835x3 = null;
                ((id) obj).run();
                return;
            case 19:
                li liVar = (li) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (jVar = liVar.f26716m2) != null && !jVar.f16172f) {
                        ((p6) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ku kuVar = (ku) obj2;
                if (kuVar.f26398a.e.getVisibility() == 0) {
                    kuVar.f26398a.e.setAlpha(1.0f);
                    kuVar.f26398a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 21:
                rl0 rl0Var = (rl0) obj;
                kz kzVar = (kz) obj2;
                if (animator.equals(kzVar.J0)) {
                    rl0Var.setTranslationY(0.0f);
                    if (rl0Var == kzVar.A0) {
                        rl0Var.setPadding(0, 0, 0, kzVar.f26464n2);
                    } else if (rl0Var == kzVar.M) {
                        rl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.f26464n2);
                    } else if (rl0Var == kzVar.f26435e0) {
                        rl0Var.setPadding(0, kzVar.Y0, 0, kzVar.f26464n2);
                    }
                    kzVar.J0 = null;
                    return;
                }
                return;
            case 22:
                g20 g20Var = (g20) obj2;
                g20Var.removeView((o30) obj);
                g20Var.e.clear();
                g20Var.f25019a = null;
                g20Var.f25020b = false;
                return;
            case 23:
                ArrayList arrayList = (ArrayList) obj;
                g20 g20Var2 = (g20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    g20Var2.removeView((View) arrayList.get(i13));
                }
                g20Var2.e.clear();
                g20Var2.f25019a = null;
                g20Var2.f25020b = false;
                return;
            case 24:
                c70 c70Var = (c70) obj2;
                c70Var.removeView((o30) obj);
                c70Var.f23839c = null;
                c70Var.e.f24188a0 = null;
                c70Var.f23837a = false;
                return;
            case 25:
                vk0 vk0Var = (vk0) obj2;
                c2.z zVar2 = vk0Var.e;
                if (((ValueAnimator) zVar2.f2065g) != null) {
                    ((rl0) zVar2.e).U1 = false;
                    ArrayList arrayList2 = vk0Var.f29502b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        View view3 = (View) obj3;
                        if (view3 instanceof n4) {
                            ((n4) view3).c(false, true);
                        }
                        view3.setTranslationY(0.0f);
                        ((f2.i0) zVar2.f2064f).getClass();
                        f2.v0.x0(view3);
                        ((rl0) zVar2.e).removeView(view3);
                        c6 c6Var = (c6) zVar2.f2066i;
                        if (c6Var != null) {
                            c6Var.d(view3);
                        }
                    }
                    ((rl0) zVar2.e).setScrollEnabled(true);
                    ((rl0) zVar2.e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((rl0) zVar2.e).e.p() == ((rl0) zVar2.e).getChildCount()) {
                            if (((ArrayList) ((rl0) zVar2.e).e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((rl0) zVar2.e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((rl0) zVar2.e).getChildAt(i15);
                        if (childAt instanceof n4) {
                            ((n4) childAt).c(false, false);
                        }
                        childAt.setTranslationY(0.0f);
                    }
                    ArrayList arrayList3 = (ArrayList) obj;
                    int size2 = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj4 = arrayList3.get(i16);
                        i16++;
                        View view4 = (View) obj4;
                        if (view4 instanceof n4) {
                            ((n4) view4).c(false, false);
                        }
                        view4.setTranslationY(0.0f);
                    }
                    wk0 wk0Var = vk0Var.d;
                    if (wk0Var != null) {
                        wk0Var.E();
                    }
                    c6 c6Var2 = (c6) zVar2.f2066i;
                    if (c6Var2 != null) {
                        c6Var2.a();
                    }
                    ((SparseArray) zVar2.f2067j).clear();
                    zVar2.f2065g = null;
                    return;
                }
                return;
            case 26:
                u00 u00Var = (u00) obj;
                u00Var.setAlpha(1.0f);
                f2.v0.x0(u00Var);
                yk0 yk0Var = (yk0) obj2;
                yk0Var.f31047c.remove(u00Var);
                yk0Var.f31045a.removeView(u00Var);
                return;
            case 27:
                super.onAnimationEnd(animator);
                xq xqVar = (xq) obj2;
                ((yk0) xqVar.d).f31049g.remove((AnimatorSet) obj);
                if (((yk0) xqVar.d).f31049g.isEmpty()) {
                    ((yk0) xqVar.d).f31046b.clear();
                    yk0 yk0Var2 = (yk0) xqVar.d;
                    yk0Var2.d = true;
                    yk0Var2.f31045a.invalidate();
                    return;
                }
                return;
            case 28:
                yo0 yo0Var = (yo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(yo0Var.B);
                } catch (Exception unused) {
                }
                z80 z80Var = yo0Var.C;
                if (z80Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(z80Var);
                    return;
                }
                return;
            default:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                qv0 qv0Var = (qv0) gVar.f313c;
                qv0Var.f28288c0 = 1.0f;
                qv0Var.P.add((mv0) obj);
                ((qv0) gVar.f313c).U.setShader(null);
                ((qv0) gVar.f313c).W.setShader(null);
                ((qv0) gVar.f313c).N();
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f4865a) {
            case 7:
                ((org.telegram.ui.ActionBar.k) this.f4867c).C.setVisibility(0);
                return;
            case 13:
                ((wa) this.f4866b).run();
                return;
            case 14:
                ((wa) this.f4866b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public y2(Runnable runnable, Runnable runnable2, int i10) {
        this.f4865a = i10;
        this.f4866b = runnable;
        this.f4867c = runnable2;
    }

    public y2(yk0 yk0Var, u00 u00Var, f2.v0 v0Var) {
        this.f4865a = 26;
        this.f4867c = yk0Var;
        this.f4866b = u00Var;
    }
}
