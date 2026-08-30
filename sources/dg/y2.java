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
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.qn;
import org.telegram.ui.s5;
import org.telegram.ui.tp;
import org.telegram.ui.vq;
import org.telegram.ui.xn;
import org.telegram.ui.zi;
public final class y2 extends AnimatorListenerAdapter {
    public final int f4859a;
    public final Object f4860b;
    public final Object f4861c;

    public y2(int i10, Object obj, Object obj2) {
        this.f4859a = i10;
        this.f4861c = obj;
        this.f4860b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f4859a) {
            case 7:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f4861c;
                AnimatorSet animatorSet3 = kVar.M;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.M = null;
                    return;
                }
                return;
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f4861c;
                if (animator.equals(actionBarLayout.f19465h0)) {
                    actionBarLayout.f19458e0.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.W.clear();
                    actionBarLayout.f19463g0.clear();
                    j6.sl = null;
                    actionBarLayout.f19461f0 = null;
                    actionBarLayout.f19456d0 = null;
                    actionBarLayout.f19465h0 = null;
                    qn qnVar = ((d5) this.f4860b).f19639j;
                    if (qnVar != null) {
                        qnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4861c;
                if (animator.equals(chatActivityEnterView.f22807n2)) {
                    chatActivityEnterView.f22807n2 = null;
                    return;
                }
                return;
            case 19:
                li liVar = (li) this.f4861c;
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
                kz kzVar = (kz) this.f4861c;
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
        int i10 = this.f4859a;
        int i11 = 0;
        Object obj = this.f4860b;
        Object obj2 = this.f4861c;
        switch (i10) {
            case 0:
                a3 a3Var = (a3) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a3Var.f4364o0.b(a3Var.f4371v0, false);
                }
                a3Var.setRotationY(0.0f);
                a3Var.f4372w0 = 1.0f;
                return;
            case 1:
                ((eg.o1) obj2).f5397w = false;
                ((eg.z0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 2:
                eg.e2 e2Var = (eg.e2) obj2;
                e2Var.E0 = false;
                e2Var.D0 = 1.0f;
                e2Var.f5272p0.invalidate();
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
                jVar2.removeView((n30) obj);
                jVar2.h.clear();
                jVar2.f10431b = null;
                jVar2.f10432c = false;
                ((kg.k) jVar2.f10434n).f10436b.setAllowDrawCursor(true);
                return;
            case 4:
                gb gbVar = (gb) obj2;
                gbVar.f12516b.remove((fb) obj);
                gbVar.M();
                return;
            case 5:
                super.onAnimationEnd(animator);
                ((nh.p) obj2).V.f15765g0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr3 = (boolean[]) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    int i12 = ProfileStoriesView.f32303p0;
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
                    k5 k5Var = kVar.f20334n[0];
                    if (k5Var != null) {
                        k5Var.setVisibility(4);
                    }
                    if (kVar.f20342r != null && !TextUtils.isEmpty(kVar.f20352x0)) {
                        kVar.f20342r.setVisibility(4);
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
                actionBarLayout.f19467i0.unlock();
                if (animator.equals(actionBarLayout.f19465h0)) {
                    actionBarLayout.f19458e0.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.W.clear();
                    actionBarLayout.f19463g0.clear();
                    j6.sl = null;
                    actionBarLayout.f19461f0 = null;
                    actionBarLayout.f19456d0 = null;
                    actionBarLayout.f19465h0 = null;
                    qn qnVar = ((d5) obj).f19639j;
                    if (qnVar != null) {
                        qnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((ActionBarLayout) obj2).f19474n = false;
                ((org.telegram.ui.ActionBar.p2) obj).onPreviewOpenAnimationEnd();
                return;
            case 10:
                View view2 = (View) obj;
                xn xnVar = (xn) obj2;
                xnVar.f40243x9 = 0.0f;
                if (animator == xnVar.f39995db) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                    xnVar.W2 = null;
                    xnVar.f39995db = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) ((hh.f) obj2).f7133b;
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f21914x0 = false;
                org.telegram.ui.u0 u0Var = new org.telegram.ui.u0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((r50) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t1Var, u0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new s5(this, 20));
                animatorSet4.start();
                return;
            case 12:
                tp tpVar = (tp) obj2;
                tpVar.I = 0.0f;
                tpVar.H = 1.0f;
                ((View) obj).invalidate();
                tpVar.Q.invalidate();
                zi ziVar = tpVar.V;
                if (ziVar != null) {
                    ziVar.run();
                    tpVar.V = null;
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
                if (animator.equals(chatActivityEnterView.f22807n2)) {
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
                    chatActivityEnterView.f22807n2 = null;
                    chatActivityEnterView.f22828r2 = 0;
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
                ((af.b) obj).run();
                ((ChatActivityEnterView) obj2).H3.unlock();
                return;
            case 18:
                ((ChatActivityEnterView) obj2).f22862x3 = null;
                ((id) obj).run();
                return;
            case 19:
                li liVar = (li) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (jVar = liVar.f26720m2) != null && !jVar.f16192f) {
                        ((p6) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                lu luVar = (lu) obj2;
                if (luVar.f26886a.e.getVisibility() == 0) {
                    luVar.f26886a.e.setAlpha(1.0f);
                    luVar.f26886a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 21:
                sl0 sl0Var = (sl0) obj;
                kz kzVar = (kz) obj2;
                if (animator.equals(kzVar.J0)) {
                    sl0Var.setTranslationY(0.0f);
                    if (sl0Var == kzVar.A0) {
                        sl0Var.setPadding(0, 0, 0, kzVar.f26452n2);
                    } else if (sl0Var == kzVar.M) {
                        sl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.f26452n2);
                    } else if (sl0Var == kzVar.f26423e0) {
                        sl0Var.setPadding(0, kzVar.Y0, 0, kzVar.f26452n2);
                    }
                    kzVar.J0 = null;
                    return;
                }
                return;
            case 22:
                f20 f20Var = (f20) obj2;
                f20Var.removeView((n30) obj);
                f20Var.e.clear();
                f20Var.f24753a = null;
                f20Var.f24754b = false;
                return;
            case 23:
                ArrayList arrayList = (ArrayList) obj;
                f20 f20Var2 = (f20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    f20Var2.removeView((View) arrayList.get(i13));
                }
                f20Var2.e.clear();
                f20Var2.f24753a = null;
                f20Var2.f24754b = false;
                return;
            case 24:
                b70 b70Var = (b70) obj2;
                b70Var.removeView((n30) obj);
                b70Var.f23588c = null;
                b70Var.e.f23863a0 = null;
                b70Var.f23586a = false;
                return;
            case 25:
                wk0 wk0Var = (wk0) obj2;
                c2.y yVar = wk0Var.e;
                if (((ValueAnimator) yVar.f2034g) != null) {
                    ((sl0) yVar.e).U1 = false;
                    ArrayList arrayList2 = wk0Var.f30383b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        View view3 = (View) obj3;
                        if (view3 instanceof o4) {
                            ((o4) view3).c(false, true);
                        }
                        view3.setTranslationY(0.0f);
                        ((f2.i0) yVar.f2033f).getClass();
                        f2.v0.x0(view3);
                        ((sl0) yVar.e).removeView(view3);
                        c6 c6Var = (c6) yVar.f2035i;
                        if (c6Var != null) {
                            c6Var.d(view3);
                        }
                    }
                    ((sl0) yVar.e).setScrollEnabled(true);
                    ((sl0) yVar.e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((sl0) yVar.e).e.r() == ((sl0) yVar.e).getChildCount()) {
                            if (((ArrayList) ((sl0) yVar.e).e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((sl0) yVar.e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((sl0) yVar.e).getChildAt(i15);
                        if (childAt instanceof o4) {
                            ((o4) childAt).c(false, false);
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
                        if (view4 instanceof o4) {
                            ((o4) view4).c(false, false);
                        }
                        view4.setTranslationY(0.0f);
                    }
                    xk0 xk0Var = wk0Var.d;
                    if (xk0Var != null) {
                        xk0Var.E();
                    }
                    c6 c6Var2 = (c6) yVar.f2035i;
                    if (c6Var2 != null) {
                        c6Var2.a();
                    }
                    ((SparseArray) yVar.f2036j).clear();
                    yVar.f2034g = null;
                    return;
                }
                return;
            case 26:
                t00 t00Var = (t00) obj;
                t00Var.setAlpha(1.0f);
                f2.v0.x0(t00Var);
                zk0 zk0Var = (zk0) obj2;
                zk0Var.f31376c.remove(t00Var);
                zk0Var.f31374a.removeView(t00Var);
                return;
            case 27:
                super.onAnimationEnd(animator);
                vq vqVar = (vq) obj2;
                ((zk0) vqVar.d).f31378g.remove((AnimatorSet) obj);
                if (((zk0) vqVar.d).f31378g.isEmpty()) {
                    ((zk0) vqVar.d).f31375b.clear();
                    zk0 zk0Var2 = (zk0) vqVar.d;
                    zk0Var2.d = true;
                    zk0Var2.f31374a.invalidate();
                    return;
                }
                return;
            case 28:
                zo0 zo0Var = (zo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(zo0Var.B);
                } catch (Exception unused) {
                }
                i80 i80Var = zo0Var.C;
                if (i80Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(i80Var);
                    return;
                }
                return;
            default:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                qv0 qv0Var = (qv0) gVar.f298c;
                qv0Var.f28274c0 = 1.0f;
                qv0Var.P.add((mv0) obj);
                ((qv0) gVar.f298c).U.setShader(null);
                ((qv0) gVar.f298c).W.setShader(null);
                ((qv0) gVar.f298c).N();
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f4859a) {
            case 7:
                ((org.telegram.ui.ActionBar.k) this.f4861c).C.setVisibility(0);
                return;
            case 13:
                ((wa) this.f4860b).run();
                return;
            case 14:
                ((wa) this.f4860b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public y2(Runnable runnable, Runnable runnable2, int i10) {
        this.f4859a = i10;
        this.f4860b = runnable;
        this.f4861c = runnable2;
    }

    public y2(zk0 zk0Var, t00 t00Var, f2.v0 v0Var) {
        this.f4859a = 26;
        this.f4861c = zk0Var;
        this.f4860b = t00Var;
    }
}
