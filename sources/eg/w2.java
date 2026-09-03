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
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zo0;
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
                if (animator.equals(actionBarLayout.f21129h0)) {
                    actionBarLayout.f21122e0.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.W.clear();
                    actionBarLayout.f21127g0.clear();
                    k6.sl = null;
                    actionBarLayout.f21125f0 = null;
                    actionBarLayout.f21119d0 = null;
                    actionBarLayout.f21129h0 = null;
                    qn qnVar = ((e5) this.f5527b).f21332j;
                    if (qnVar != null) {
                        qnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f5528c;
                if (animator.equals(chatActivityEnterView.f24649n2)) {
                    chatActivityEnterView.f24649n2 = null;
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
                jVar2.f12555b = null;
                jVar2.f12556c = false;
                ((lg.k) jVar2.f12559n).f12561b.setAllowDrawCursor(true);
                return;
            case 4:
                gb gbVar = (gb) obj2;
                gbVar.f14136b.remove((fb) obj);
                gbVar.M();
                return;
            case 5:
                super.onAnimationEnd(animator);
                ((oh.o) obj2).V.f17587g0 = null;
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
                    l5 l5Var = kVar.f21552n[0];
                    if (l5Var != null) {
                        l5Var.setVisibility(4);
                    }
                    if (kVar.f21560r != null && !TextUtils.isEmpty(kVar.f21570x0)) {
                        kVar.f21560r.setVisibility(4);
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
                actionBarLayout.f21131i0.unlock();
                if (animator.equals(actionBarLayout.f21129h0)) {
                    actionBarLayout.f21122e0.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.W.clear();
                    actionBarLayout.f21127g0.clear();
                    k6.sl = null;
                    actionBarLayout.f21125f0 = null;
                    actionBarLayout.f21119d0 = null;
                    actionBarLayout.f21129h0 = null;
                    qn qnVar = ((e5) obj).f21332j;
                    if (qnVar != null) {
                        qnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((ActionBarLayout) obj2).f21138n = false;
                ((org.telegram.ui.ActionBar.p2) obj).onPreviewOpenAnimationEnd();
                return;
            case 10:
                View view2 = (View) obj;
                xn xnVar = (xn) obj2;
                xnVar.f43390x9 = 0.0f;
                if (animator == xnVar.f43141db) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                    xnVar.W2 = null;
                    xnVar.f43141db = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) ((ih.f) obj2).f8133b;
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f23712x0 = false;
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
                if (animator.equals(chatActivityEnterView.f24649n2)) {
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
                    chatActivityEnterView.f24649n2 = null;
                    chatActivityEnterView.f24670r2 = 0;
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
                ((ChatActivityEnterView) obj2).f24704x3 = null;
                ((id) obj).run();
                return;
            case 19:
                mi miVar = (mi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (jVar = miVar.f29090m2) != null && !jVar.f16332f) {
                        ((p6) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                nu nuVar = (nu) obj2;
                if (nuVar.f29579a.f30896e.getVisibility() == 0) {
                    nuVar.f29579a.f30896e.setAlpha(1.0f);
                    nuVar.f29579a.f30896e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 21:
                sl0 sl0Var = (sl0) obj;
                mz mzVar = (mz) obj2;
                if (animator.equals(mzVar.J0)) {
                    sl0Var.setTranslationY(0.0f);
                    if (sl0Var == mzVar.A0) {
                        sl0Var.setPadding(0, 0, 0, mzVar.f29309n2);
                    } else if (sl0Var == mzVar.M) {
                        sl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), mzVar.f29309n2);
                    } else if (sl0Var == mzVar.f29280e0) {
                        sl0Var.setPadding(0, mzVar.Y0, 0, mzVar.f29309n2);
                    }
                    mzVar.J0 = null;
                    return;
                }
                return;
            case 22:
                g20 g20Var = (g20) obj2;
                g20Var.removeView((p30) obj);
                g20Var.f27067e.clear();
                g20Var.f27064a = null;
                g20Var.f27065b = false;
                return;
            case 23:
                ArrayList arrayList = (ArrayList) obj;
                g20 g20Var2 = (g20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    g20Var2.removeView((View) arrayList.get(i13));
                }
                g20Var2.f27067e.clear();
                g20Var2.f27064a = null;
                g20Var2.f27065b = false;
                return;
            case 24:
                d70 d70Var = (d70) obj2;
                d70Var.removeView((p30) obj);
                d70Var.f26209c = null;
                d70Var.f26210e.f26467a0 = null;
                d70Var.f26207a = false;
                return;
            case 25:
                wk0 wk0Var = (wk0) obj2;
                c2.y yVar = wk0Var.f32787e;
                if (((ValueAnimator) yVar.f2210g) != null) {
                    ((sl0) yVar.f2208e).U1 = false;
                    ArrayList arrayList2 = wk0Var.f32785b;
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
                        ((sl0) yVar.f2208e).removeView(view3);
                        d6 d6Var = (d6) yVar.f2211i;
                        if (d6Var != null) {
                            d6Var.d(view3);
                        }
                    }
                    ((sl0) yVar.f2208e).setScrollEnabled(true);
                    ((sl0) yVar.f2208e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((sl0) yVar.f2208e).f1325e.p() == ((sl0) yVar.f2208e).getChildCount()) {
                            if (((ArrayList) ((sl0) yVar.f2208e).f1325e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((sl0) yVar.f2208e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((sl0) yVar.f2208e).getChildAt(i15);
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
                zk0 zk0Var = (zk0) obj2;
                zk0Var.f33964c.remove(u00Var);
                zk0Var.f33962a.removeView(u00Var);
                return;
            case 27:
                super.onAnimationEnd(animator);
                wq wqVar = (wq) obj2;
                ((zk0) wqVar.d).f33967g.remove((AnimatorSet) obj);
                if (((zk0) wqVar.d).f33967g.isEmpty()) {
                    ((zk0) wqVar.d).f33963b.clear();
                    zk0 zk0Var2 = (zk0) wqVar.d;
                    zk0Var2.d = true;
                    zk0Var2.f33962a.invalidate();
                    return;
                }
                return;
            case 28:
                zo0 zo0Var = (zo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(zo0Var.B);
                } catch (Exception unused) {
                }
                b90 b90Var = zo0Var.C;
                if (b90Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(b90Var);
                    return;
                }
                return;
            default:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                pv0 pv0Var = (pv0) gVar.f335c;
                pv0Var.f30201c0 = 1.0f;
                pv0Var.P.add((lv0) obj);
                ((pv0) gVar.f335c).U.setShader(null);
                ((pv0) gVar.f335c).W.setShader(null);
                ((pv0) gVar.f335c).N();
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

    public w2(zk0 zk0Var, u00 u00Var, f2.w0 w0Var) {
        this.f5526a = 26;
        this.f5528c = zk0Var;
        this.f5527b = u00Var;
    }
}
