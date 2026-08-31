package eg;

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
import k7.d6;
import mh.fb;
import mh.gb;
import mh.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.qn;
import org.telegram.ui.s5;
import org.telegram.ui.up;
import org.telegram.ui.wq;
import org.telegram.ui.xn;
import org.telegram.ui.zi;
public final class w2 extends AnimatorListenerAdapter {
    public final int f5526a;
    public final Object f5527b;
    public final Object f5528c;

    public w2(int i10, Object obj, Object obj2) {
        this.f5526a = i10;
        this.f5528c = obj;
        this.f5527b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f5526a) {
            case 7:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f5528c;
                AnimatorSet animatorSet3 = kVar.M;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.M = null;
                    return;
                }
                return;
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f5528c;
                if (animator.equals(actionBarLayout.f21127h0)) {
                    actionBarLayout.f21120e0.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.W.clear();
                    actionBarLayout.f21125g0.clear();
                    k6.sl = null;
                    actionBarLayout.f21123f0 = null;
                    actionBarLayout.f21117d0 = null;
                    actionBarLayout.f21127h0 = null;
                    qn qnVar = ((e5) this.f5527b).f21330j;
                    if (qnVar != null) {
                        qnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f5528c;
                if (animator.equals(chatActivityEnterView.f24647n2)) {
                    chatActivityEnterView.f24647n2 = null;
                    return;
                }
                return;
            case 19:
                mi miVar = (mi) this.f5528c;
                animatorSet = ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimationType = 0;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                mz mzVar = (mz) this.f5528c;
                if (animator.equals(mzVar.J0)) {
                    mzVar.J0 = null;
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
        int i10 = this.f5526a;
        int i11 = 0;
        Object obj = this.f5527b;
        Object obj2 = this.f5528c;
        switch (i10) {
            case 0:
                y2 y2Var = (y2) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    y2Var.f5566o0.b(y2Var.f5573v0, false);
                }
                y2Var.setRotationY(0.0f);
                y2Var.f5574w0 = 1.0f;
                return;
            case 1:
                ((fg.n1) obj2).f6418w = false;
                ((fg.z0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 2:
                fg.d2 d2Var = (fg.d2) obj2;
                d2Var.E0 = false;
                d2Var.D0 = 1.0f;
                d2Var.f6288p0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new bg.a(3, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 3:
                lg.j jVar2 = (lg.j) obj2;
                jVar2.removeView((p30) obj);
                jVar2.h.clear();
                jVar2.f12553b = null;
                jVar2.f12554c = false;
                ((lg.k) jVar2.f12557n).f12559b.setAllowDrawCursor(true);
                return;
            case 4:
                gb gbVar = (gb) obj2;
                gbVar.f14134b.remove((fb) obj);
                gbVar.M();
                return;
            case 5:
                super.onAnimationEnd(animator);
                ((oh.o) obj2).V.f17585g0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr3 = (boolean[]) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    int i12 = ProfileStoriesView.f34841p0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new oh.t3(profileStoriesView, 1), 180L);
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
                    l5 l5Var = kVar.f21550n[0];
                    if (l5Var != null) {
                        l5Var.setVisibility(4);
                    }
                    if (kVar.f21558r != null && !TextUtils.isEmpty(kVar.f21568x0)) {
                        kVar.f21558r.setVisibility(4);
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
                actionBarLayout.f21129i0.unlock();
                if (animator.equals(actionBarLayout.f21127h0)) {
                    actionBarLayout.f21120e0.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.W.clear();
                    actionBarLayout.f21125g0.clear();
                    k6.sl = null;
                    actionBarLayout.f21123f0 = null;
                    actionBarLayout.f21117d0 = null;
                    actionBarLayout.f21127h0 = null;
                    qn qnVar = ((e5) obj).f21330j;
                    if (qnVar != null) {
                        qnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((ActionBarLayout) obj2).f21136n = false;
                ((org.telegram.ui.ActionBar.p2) obj).onPreviewOpenAnimationEnd();
                return;
            case 10:
                View view2 = (View) obj;
                xn xnVar = (xn) obj2;
                xnVar.f43412x9 = 0.0f;
                if (animator == xnVar.f43163db) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                    xnVar.W2 = null;
                    xnVar.f43163db = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) ((ih.f) obj2).f8133b;
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f23710x0 = false;
                org.telegram.ui.u0 u0Var = new org.telegram.ui.u0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((t50) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t1Var, u0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new s5(this, 20));
                animatorSet4.start();
                return;
            case 12:
                up upVar = (up) obj2;
                upVar.I = 0.0f;
                upVar.H = 1.0f;
                ((View) obj).invalidate();
                upVar.Q.invalidate();
                zi ziVar = upVar.V;
                if (ziVar != null) {
                    ziVar.run();
                    upVar.V = null;
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
                if (animator.equals(chatActivityEnterView.f24647n2)) {
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
                    chatActivityEnterView.f24647n2 = null;
                    chatActivityEnterView.f24668r2 = 0;
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
                ((ChatActivityEnterView) obj2).f24702x3 = null;
                ((id) obj).run();
                return;
            case 19:
                mi miVar = (mi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (jVar = miVar.f29072m2) != null && !jVar.f16330f) {
                        ((p6) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                nu nuVar = (nu) obj2;
                if (nuVar.f29627a.f30857e.getVisibility() == 0) {
                    nuVar.f29627a.f30857e.setAlpha(1.0f);
                    nuVar.f29627a.f30857e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 21:
                tl0 tl0Var = (tl0) obj;
                mz mzVar = (mz) obj2;
                if (animator.equals(mzVar.J0)) {
                    tl0Var.setTranslationY(0.0f);
                    if (tl0Var == mzVar.A0) {
                        tl0Var.setPadding(0, 0, 0, mzVar.f29307n2);
                    } else if (tl0Var == mzVar.M) {
                        tl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), mzVar.f29307n2);
                    } else if (tl0Var == mzVar.f29278e0) {
                        tl0Var.setPadding(0, mzVar.Y0, 0, mzVar.f29307n2);
                    }
                    mzVar.J0 = null;
                    return;
                }
                return;
            case 22:
                g20 g20Var = (g20) obj2;
                g20Var.removeView((p30) obj);
                g20Var.f27079e.clear();
                g20Var.f27076a = null;
                g20Var.f27077b = false;
                return;
            case 23:
                ArrayList arrayList = (ArrayList) obj;
                g20 g20Var2 = (g20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    g20Var2.removeView((View) arrayList.get(i13));
                }
                g20Var2.f27079e.clear();
                g20Var2.f27076a = null;
                g20Var2.f27077b = false;
                return;
            case 24:
                d70 d70Var = (d70) obj2;
                d70Var.removeView((p30) obj);
                d70Var.f26206c = null;
                d70Var.f26207e.f26456a0 = null;
                d70Var.f26204a = false;
                return;
            case 25:
                xk0 xk0Var = (xk0) obj2;
                c2.y yVar = xk0Var.f33132e;
                if (((ValueAnimator) yVar.f2210g) != null) {
                    ((tl0) yVar.f2208e).U1 = false;
                    ArrayList arrayList2 = xk0Var.f33130b;
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
                        ((f2.j0) yVar.f2209f).getClass();
                        f2.w0.x0(view3);
                        ((tl0) yVar.f2208e).removeView(view3);
                        d6 d6Var = (d6) yVar.f2211i;
                        if (d6Var != null) {
                            d6Var.d(view3);
                        }
                    }
                    ((tl0) yVar.f2208e).setScrollEnabled(true);
                    ((tl0) yVar.f2208e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((tl0) yVar.f2208e).f1325e.p() == ((tl0) yVar.f2208e).getChildCount()) {
                            if (((ArrayList) ((tl0) yVar.f2208e).f1325e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((tl0) yVar.f2208e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((tl0) yVar.f2208e).getChildAt(i15);
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
                    yk0 yk0Var = xk0Var.d;
                    if (yk0Var != null) {
                        yk0Var.E();
                    }
                    d6 d6Var2 = (d6) yVar.f2211i;
                    if (d6Var2 != null) {
                        d6Var2.a();
                    }
                    ((SparseArray) yVar.f2212j).clear();
                    yVar.f2210g = null;
                    return;
                }
                return;
            case 26:
                u00 u00Var = (u00) obj;
                u00Var.setAlpha(1.0f);
                f2.w0.x0(u00Var);
                al0 al0Var = (al0) obj2;
                al0Var.f25287c.remove(u00Var);
                al0Var.f25285a.removeView(u00Var);
                return;
            case 27:
                super.onAnimationEnd(animator);
                wq wqVar = (wq) obj2;
                ((al0) wqVar.d).f25290g.remove((AnimatorSet) obj);
                if (((al0) wqVar.d).f25290g.isEmpty()) {
                    ((al0) wqVar.d).f25286b.clear();
                    al0 al0Var2 = (al0) wqVar.d;
                    al0Var2.d = true;
                    al0Var2.f25285a.invalidate();
                    return;
                }
                return;
            case 28:
                ap0 ap0Var = (ap0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(ap0Var.B);
                } catch (Exception unused) {
                }
                a90 a90Var = ap0Var.C;
                if (a90Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(a90Var);
                    return;
                }
                return;
            default:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                qv0 qv0Var = (qv0) gVar.f335c;
                qv0Var.f30492c0 = 1.0f;
                qv0Var.P.add((mv0) obj);
                ((qv0) gVar.f335c).U.setShader(null);
                ((qv0) gVar.f335c).W.setShader(null);
                ((qv0) gVar.f335c).N();
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f5526a) {
            case 7:
                ((org.telegram.ui.ActionBar.k) this.f5528c).C.setVisibility(0);
                return;
            case 13:
                ((wa) this.f5527b).run();
                return;
            case 14:
                ((wa) this.f5527b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public w2(Runnable runnable, Runnable runnable2, int i10) {
        this.f5526a = i10;
        this.f5527b = runnable;
        this.f5528c = runnable2;
    }

    public w2(al0 al0Var, u00 u00Var, f2.w0 w0Var) {
        this.f5526a = 26;
        this.f5528c = al0Var;
        this.f5527b = u00Var;
    }
}
