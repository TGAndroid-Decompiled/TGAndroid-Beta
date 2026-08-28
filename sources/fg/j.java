package fg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import c2.y;
import f2.m0;
import f2.z0;
import gh.kb;
import gh.lb;
import ih.q;
import java.util.ArrayList;
import kh.c9;
import kh.q9;
import kh.u3;
import kh.y2;
import mh.x;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.jn;
import org.telegram.ui.kp;
import org.telegram.ui.nq;
import org.telegram.ui.qn;
import org.telegram.ui.ri;
import org.telegram.ui.v0;
import yf.b2;
public final class j extends AnimatorListenerAdapter {
    public final int f6297a;
    public final Object f6298b;
    public final Object f6299c;

    public j(int i9, Object obj, Object obj2) {
        this.f6297a = i9;
        this.f6299c = obj;
        this.f6298b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f6297a) {
            case 8:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f6299c;
                AnimatorSet animatorSet3 = kVar.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.L = null;
                    return;
                }
                return;
            case 9:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f6299c;
                if (animator.equals(actionBarLayout.f22661g0)) {
                    actionBarLayout.f22653d0.clear();
                    actionBarLayout.U.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.f22659f0.clear();
                    f6.sl = null;
                    actionBarLayout.f22656e0 = null;
                    actionBarLayout.f22651c0 = null;
                    actionBarLayout.f22661g0 = null;
                    jn jnVar = ((a5) this.f6298b).f22734j;
                    if (jnVar != null) {
                        jnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f6299c;
                if (animator.equals(chatActivityEnterView.f26146m2)) {
                    chatActivityEnterView.f26146m2 = null;
                    return;
                }
                return;
            case 20:
                ki kiVar = (ki) this.f6299c;
                animatorSet = ((f3) kiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((f3) kiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((f3) kiVar).currentSheetAnimation = null;
                        ((f3) kiVar).currentSheetAnimationType = 0;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                wy wyVar = (wy) this.f6299c;
                if (animator.equals(wyVar.I0)) {
                    wyVar.I0 = null;
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
        int i9 = this.f6297a;
        int i10 = 0;
        Object obj = this.f6298b;
        Object obj2 = this.f6299c;
        switch (i9) {
            case 0:
                l lVar = (l) obj2;
                lVar.removeView((w20) obj);
                lVar.h.clear();
                lVar.f6304b = null;
                lVar.f6305c = false;
                ((m) lVar.f6308n).f6310b.setAllowDrawCursor(true);
                return;
            case 1:
                lb lbVar = (lb) obj2;
                lbVar.f8520b.remove((kb) obj);
                lbVar.R();
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((q) obj2).U.f12028f0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i11 = ProfileStoriesView.f36197o0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new ih.g(profileStoriesView, 7), 180L);
                    }
                }
                profileStoriesView.S = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 4:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((y2) obj2).h.h.setVisibility(8);
                return;
            case 5:
                u3 u3Var = (u3) obj2;
                u3Var.f16139c = null;
                u3Var.f16140e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                kh.q qVar = (kh.q) obj2;
                ((b2) obj).setDraw(true);
                if (qVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qVar.getParent()).removeView(qVar);
                    return;
                }
                return;
            case 7:
                l lVar2 = (l) obj2;
                lVar2.removeView((w20) obj);
                lVar2.h.clear();
                lVar2.f6304b = null;
                lVar2.f6305c = false;
                q9 q9Var = (q9) lVar2.f6308n;
                q9Var.f15889a.setAllowDrawCursor(true);
                c9 c9Var = q9Var.f15893f;
                if (c9Var != null) {
                    c9Var.run();
                }
                if (q9Var.G) {
                    q9Var.fullScroll(130);
                    q9Var.G = false;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.L = null;
                    h5 h5Var = kVar.f23583n[0];
                    if (h5Var != null) {
                        h5Var.setVisibility(4);
                    }
                    if (kVar.f23590r != null && !TextUtils.isEmpty(kVar.f23598w0)) {
                        kVar.f23590r.setVisibility(4);
                    }
                    z zVar = kVar.A;
                    if (zVar != null) {
                        zVar.setVisibility(4);
                    }
                    if (kVar.M == null) {
                        return;
                    }
                    while (true) {
                        View[] viewArr = kVar.M;
                        if (i10 < viewArr.length) {
                            View view2 = viewArr[i10];
                            if (view2 != null && ((zArr = (boolean[]) obj) == null || i10 >= zArr.length || zArr[i10])) {
                                view2.setVisibility(4);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 9:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.f22663h0.unlock();
                if (animator.equals(actionBarLayout.f22661g0)) {
                    actionBarLayout.f22653d0.clear();
                    actionBarLayout.U.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.f22659f0.clear();
                    f6.sl = null;
                    actionBarLayout.f22656e0 = null;
                    actionBarLayout.f22651c0 = null;
                    actionBarLayout.f22661g0 = null;
                    jn jnVar = ((a5) obj).f22734j;
                    if (jnVar != null) {
                        jnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((ActionBarLayout) obj2).f22672n = false;
                ((o2) obj).onPreviewOpenAnimationEnd();
                return;
            case 11:
                View view3 = (View) obj;
                qn qnVar = (qn) obj2;
                qnVar.f42122w9 = 0.0f;
                if (animator == qnVar.f41876cb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    qnVar.V2 = null;
                    qnVar.f41876cb = null;
                    return;
                }
                return;
            case 12:
                t1 t1Var = (t1) ((ch.f) obj2).f2452b;
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f25239x0 = false;
                v0 v0Var = new v0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((y40) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t1Var, v0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new x(this, 27));
                animatorSet4.start();
                return;
            case 13:
                kp kpVar = (kp) obj2;
                kpVar.H = 0.0f;
                kpVar.G = 1.0f;
                ((View) obj).invalidate();
                kpVar.P.invalidate();
                ri riVar = kpVar.U;
                if (riVar != null) {
                    riVar.run();
                    kpVar.U = null;
                    return;
                }
                return;
            case 14:
                ((fg) obj2).run();
                return;
            case 15:
                ((ua) obj2).run();
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.L0;
                if (animator.equals(chatActivityEnterView.f26146m2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    se seVar = chatActivityEnterView.O0;
                    if (seVar != null) {
                        seVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f26146m2 = null;
                    chatActivityEnterView.f26167q2 = 0;
                    return;
                }
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.R0 = null;
                chatActivityEnterView2.G3.unlock();
                ((hd) obj).run();
                return;
            case 18:
                ((qd) obj).run();
                ((ChatActivityEnterView) obj2).G3.unlock();
                return;
            case 19:
                ((ChatActivityEnterView) obj2).f26200w3 = null;
                ((hd) obj).run();
                return;
            case 20:
                ki kiVar = (ki) obj2;
                animatorSet = ((f3) kiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((f3) kiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (jVar = kiVar.f30133l2) != null && !jVar.f18794f) {
                        ((org.telegram.messenger.video.e) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                cu cuVar = (cu) obj2;
                if (cuVar.f27568a.f28870e.getVisibility() == 0) {
                    cuVar.f27568a.f28870e.setAlpha(1.0f);
                    cuVar.f27568a.f28870e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 22:
                wk0 wk0Var = (wk0) obj;
                wy wyVar = (wy) obj2;
                if (animator.equals(wyVar.I0)) {
                    wk0Var.setTranslationY(0.0f);
                    if (wk0Var == wyVar.f34466z0) {
                        wk0Var.setPadding(0, 0, 0, wyVar.f34423m2);
                    } else if (wk0Var == wyVar.L) {
                        wk0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), wyVar.f34423m2);
                    } else if (wk0Var == wyVar.f34394d0) {
                        wk0Var.setPadding(0, wyVar.X0, 0, wyVar.f34423m2);
                    }
                    wyVar.I0 = null;
                    return;
                }
                return;
            case 23:
                p10 p10Var = (p10) obj2;
                p10Var.removeView((w20) obj);
                p10Var.f31505e.clear();
                p10Var.f31502a = null;
                p10Var.f31503b = false;
                return;
            case 24:
                ArrayList arrayList = (ArrayList) obj;
                p10 p10Var2 = (p10) obj2;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    p10Var2.removeView((View) arrayList.get(i12));
                }
                p10Var2.f31505e.clear();
                p10Var2.f31502a = null;
                p10Var2.f31503b = false;
                return;
            case 25:
                j60 j60Var = (j60) obj2;
                j60Var.removeView((w20) obj);
                j60Var.f29654c = null;
                j60Var.f29655e.Z = null;
                j60Var.f29652a = false;
                return;
            case 26:
                ak0 ak0Var = (ak0) obj2;
                y yVar = ak0Var.f26852e;
                if (((ValueAnimator) yVar.f2259g) != null) {
                    ((wk0) yVar.f2257e).T1 = false;
                    ArrayList arrayList2 = ak0Var.f26850b;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        View view4 = (View) obj3;
                        if (view4 instanceof o4) {
                            ((o4) view4).c(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((m0) yVar.f2258f).getClass();
                        z0.x0(view4);
                        ((wk0) yVar.f2257e).removeView(view4);
                        g7.f6 f6Var = (g7.f6) yVar.f2260i;
                        if (f6Var != null) {
                            f6Var.d(view4);
                        }
                    }
                    ((wk0) yVar.f2257e).setScrollEnabled(true);
                    ((wk0) yVar.f2257e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((wk0) yVar.f2257e).f1344e.q() == ((wk0) yVar.f2257e).getChildCount()) {
                            if (((ArrayList) ((wk0) yVar.f2257e).f1344e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((wk0) yVar.f2257e).getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = ((wk0) yVar.f2257e).getChildAt(i14);
                        if (childAt instanceof o4) {
                            ((o4) childAt).c(false, false);
                        }
                        childAt.setTranslationY(0.0f);
                    }
                    ArrayList arrayList3 = (ArrayList) obj;
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj4 = arrayList3.get(i15);
                        i15++;
                        View view5 = (View) obj4;
                        if (view5 instanceof o4) {
                            ((o4) view5).c(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    bk0 bk0Var = ak0Var.d;
                    if (bk0Var != null) {
                        bk0Var.E();
                    }
                    g7.f6 f6Var2 = (g7.f6) yVar.f2260i;
                    if (f6Var2 != null) {
                        f6Var2.a();
                    }
                    ((SparseArray) yVar.f2261j).clear();
                    yVar.f2259g = null;
                    return;
                }
                return;
            case 27:
                e00 e00Var = (e00) obj;
                e00Var.setAlpha(1.0f);
                z0.x0(e00Var);
                dk0 dk0Var = (dk0) obj2;
                dk0Var.f27747c.remove(e00Var);
                dk0Var.f27745a.removeView(e00Var);
                return;
            case 28:
                super.onAnimationEnd(animator);
                nq nqVar = (nq) obj2;
                ((dk0) nqVar.d).f27750g.remove((AnimatorSet) obj);
                if (((dk0) nqVar.d).f27750g.isEmpty()) {
                    ((dk0) nqVar.d).f27746b.clear();
                    dk0 dk0Var2 = (dk0) nqVar.d;
                    dk0Var2.d = true;
                    dk0Var2.f27745a.invalidate();
                    return;
                }
                return;
            default:
                eo0 eo0Var = (eo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(eo0Var.B);
                } catch (Exception unused) {
                }
                jg0 jg0Var = eo0Var.C;
                if (jg0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(jg0Var);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f6297a) {
            case 8:
                ((org.telegram.ui.ActionBar.k) this.f6299c).B.setVisibility(0);
                return;
            case 14:
                ((wa) this.f6298b).run();
                return;
            case 15:
                ((wa) this.f6298b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j(Runnable runnable, Runnable runnable2, int i9) {
        this.f6297a = i9;
        this.f6298b = runnable;
        this.f6299c = runnable2;
    }

    public j(dk0 dk0Var, e00 e00Var, z0 z0Var) {
        this.f6297a = 27;
        this.f6299c = dk0Var;
        this.f6298b = e00Var;
    }
}
