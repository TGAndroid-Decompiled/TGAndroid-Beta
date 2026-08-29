package bg;

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
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.util.ArrayList;
import jh.eb;
import jh.fb;
import nh.b9;
import nh.o8;
import nh.q5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.za;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.mn;
import org.telegram.ui.np;
import org.telegram.ui.tn;
import org.telegram.ui.ui;
public final class c3 extends AnimatorListenerAdapter {
    public final int f2123a;
    public final Object f2124b;
    public final Object f2125c;

    public c3(int i10, Object obj, Object obj2) {
        this.f2123a = i10;
        this.f2125c = obj;
        this.f2124b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f2123a) {
            case 11:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) this.f2125c;
                AnimatorSet animatorSet3 = lVar.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    lVar.L = null;
                    return;
                }
                return;
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f2125c;
                if (animator.equals(actionBarLayout.f22673g0)) {
                    actionBarLayout.f22665d0.clear();
                    actionBarLayout.U.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.f22671f0.clear();
                    g6.sl = null;
                    actionBarLayout.f22668e0 = null;
                    actionBarLayout.f22663c0 = null;
                    actionBarLayout.f22673g0 = null;
                    mn mnVar = ((a5) this.f2124b).f22750j;
                    if (mnVar != null) {
                        mnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f2125c;
                if (animator.equals(chatActivityEnterView.f26157m2)) {
                    chatActivityEnterView.f26157m2 = null;
                    return;
                }
                return;
            case 23:
                ni niVar = (ni) this.f2125c;
                animatorSet = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType = 0;
                        return;
                    }
                    return;
                }
                return;
            case 25:
                fz fzVar = (fz) this.f2125c;
                if (animator.equals(fzVar.I0)) {
                    fzVar.I0 = null;
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
        int i10 = this.f2123a;
        int i11 = 0;
        Object obj = this.f2124b;
        Object obj2 = this.f2125c;
        switch (i10) {
            case 0:
                e3 e3Var = (e3) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    e3Var.f2178n0.b(e3Var.f2185u0, false);
                }
                e3Var.setRotationY(0.0f);
                e3Var.f2186v0 = 1.0f;
                return;
            case 1:
                ((cg.p1) obj2).f3270w = false;
                ((cg.a1) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 2:
                cg.f2 f2Var = (cg.f2) obj2;
                f2Var.D0 = false;
                f2Var.C0 = 1.0f;
                f2Var.f3135o0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new b3(1, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 3:
                ig.j jVar = (ig.j) obj2;
                jVar.removeView((j30) obj);
                jVar.h.clear();
                jVar.f8988b = null;
                jVar.f8989c = false;
                ((ig.k) jVar.f8992n).f8994b.setAllowDrawCursor(true);
                return;
            case 4:
                fb fbVar = (fb) obj2;
                fbVar.f12078b.remove((eb) obj);
                fbVar.R();
                return;
            case 5:
                super.onAnimationEnd(animator);
                ((lh.o) obj2).U.f16052f0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr3 = (boolean[]) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    int i12 = ProfileStoriesView.f36262o0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new jh.o(profileStoriesView, 28), 180L);
                    }
                }
                profileStoriesView.S = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 7:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((nh.v2) obj2).h.h.setVisibility(8);
                return;
            case 8:
                nh.r3 r3Var = (nh.r3) obj2;
                r3Var.f18509c = null;
                r3Var.f18510e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 9:
                nh.p pVar = (nh.p) obj2;
                ((f3) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 10:
                ig.j jVar2 = (ig.j) obj2;
                jVar2.removeView((j30) obj);
                jVar2.h.clear();
                jVar2.f8988b = null;
                jVar2.f8989c = false;
                b9 b9Var = (b9) jVar2.f8992n;
                b9Var.f17430a.setAllowDrawCursor(true);
                o8 o8Var = b9Var.f17434f;
                if (o8Var != null) {
                    o8Var.run();
                }
                if (b9Var.G) {
                    b9Var.fullScroll(130);
                    b9Var.G = false;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj2;
                AnimatorSet animatorSet3 = lVar.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    lVar.L = null;
                    h5 h5Var = lVar.f23618n[0];
                    if (h5Var != null) {
                        h5Var.setVisibility(4);
                    }
                    if (lVar.f23625r != null && !TextUtils.isEmpty(lVar.f23633w0)) {
                        lVar.f23625r.setVisibility(4);
                    }
                    org.telegram.ui.ActionBar.a0 a0Var = lVar.A;
                    if (a0Var != null) {
                        a0Var.setVisibility(4);
                    }
                    if (lVar.M == null) {
                        return;
                    }
                    while (true) {
                        View[] viewArr = lVar.M;
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
                actionBarLayout.f22675h0.unlock();
                if (animator.equals(actionBarLayout.f22673g0)) {
                    actionBarLayout.f22665d0.clear();
                    actionBarLayout.U.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.f22671f0.clear();
                    g6.sl = null;
                    actionBarLayout.f22668e0 = null;
                    actionBarLayout.f22663c0 = null;
                    actionBarLayout.f22673g0 = null;
                    mn mnVar = ((a5) obj).f22750j;
                    if (mnVar != null) {
                        mnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((ActionBarLayout) obj2).f22684n = false;
                ((org.telegram.ui.ActionBar.o2) obj).onPreviewOpenAnimationEnd();
                return;
            case 14:
                View view3 = (View) obj;
                tn tnVar = (tn) obj2;
                tnVar.f43022w9 = 0.0f;
                if (animator == tnVar.f42773cb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    tnVar.V2 = null;
                    tnVar.f42773cb = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) ((fh.f) obj2).f6791b;
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().f25195x0 = false;
                org.telegram.ui.w0 w0Var = new org.telegram.ui.w0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((m50) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s1Var, w0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new q5(this, 29));
                animatorSet4.start();
                return;
            case 16:
                np npVar = (np) obj2;
                npVar.H = 0.0f;
                npVar.G = 1.0f;
                ((View) obj).invalidate();
                npVar.P.invalidate();
                ui uiVar = npVar.U;
                if (uiVar != null) {
                    uiVar.run();
                    npVar.U = null;
                    return;
                }
                return;
            case 17:
                ((ig) obj2).run();
                return;
            case 18:
                ((za) obj2).run();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.L0;
                if (animator.equals(chatActivityEnterView.f26157m2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    ve veVar = chatActivityEnterView.O0;
                    if (veVar != null) {
                        veVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f26157m2 = null;
                    chatActivityEnterView.f26178q2 = 0;
                    return;
                }
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.R0 = null;
                chatActivityEnterView2.G3.unlock();
                ((ld) obj).run();
                return;
            case 21:
                ((i8) obj).run();
                ((ChatActivityEnterView) obj2).G3.unlock();
                return;
            case 22:
                ((ChatActivityEnterView) obj2).f26212w3 = null;
                ((ld) obj).run();
                return;
            case 23:
                ni niVar = (ni) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (kVar = niVar.f31024l2) != null && !kVar.f19039f) {
                        ((org.telegram.ui.Components.g) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                iu iuVar = (iu) obj2;
                if (iuVar.f29474a.f30766e.getVisibility() == 0) {
                    iuVar.f29474a.f30766e.setAlpha(1.0f);
                    iuVar.f29474a.f30766e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 25:
                jl0 jl0Var = (jl0) obj;
                fz fzVar = (fz) obj2;
                if (animator.equals(fzVar.I0)) {
                    jl0Var.setTranslationY(0.0f);
                    if (jl0Var == fzVar.f28657z0) {
                        jl0Var.setPadding(0, 0, 0, fzVar.f28614m2);
                    } else if (jl0Var == fzVar.L) {
                        jl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), fzVar.f28614m2);
                    } else if (jl0Var == fzVar.f28585d0) {
                        jl0Var.setPadding(0, fzVar.X0, 0, fzVar.f28614m2);
                    }
                    fzVar.I0 = null;
                    return;
                }
                return;
            case 26:
                a20 a20Var = (a20) obj2;
                a20Var.removeView((j30) obj);
                a20Var.f26626e.clear();
                a20Var.f26623a = null;
                a20Var.f26624b = false;
                return;
            case 27:
                ArrayList arrayList = (ArrayList) obj;
                a20 a20Var2 = (a20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    a20Var2.removeView((View) arrayList.get(i13));
                }
                a20Var2.f26626e.clear();
                a20Var2.f26623a = null;
                a20Var2.f26624b = false;
                return;
            case 28:
                w60 w60Var = (w60) obj2;
                w60Var.removeView((j30) obj);
                w60Var.f34334c = null;
                w60Var.f34335e.Z = null;
                w60Var.f34332a = false;
                return;
            default:
                lk0 lk0Var = (lk0) obj2;
                c2.z zVar = lk0Var.f30358e;
                if (((ValueAnimator) zVar.f2937g) != null) {
                    ((jl0) zVar.f2935e).T1 = false;
                    ArrayList arrayList2 = lk0Var.f30356b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        View view4 = (View) obj3;
                        if (view4 instanceof m4) {
                            ((m4) view4).b(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((f2.j0) zVar.f2936f).getClass();
                        f2.w0.x0(view4);
                        ((jl0) zVar.f2935e).removeView(view4);
                        i7.g6 g6Var = (i7.g6) zVar.f2938i;
                        if (g6Var != null) {
                            g6Var.d(view4);
                        }
                    }
                    ((jl0) zVar.f2935e).setScrollEnabled(true);
                    ((jl0) zVar.f2935e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((jl0) zVar.f2935e).f1834e.p() == ((jl0) zVar.f2935e).getChildCount()) {
                            if (((ArrayList) ((jl0) zVar.f2935e).f1834e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((jl0) zVar.f2935e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((jl0) zVar.f2935e).getChildAt(i15);
                        if (childAt instanceof m4) {
                            ((m4) childAt).b(false, false);
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
                        if (view5 instanceof m4) {
                            ((m4) view5).b(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    mk0 mk0Var = lk0Var.d;
                    if (mk0Var != null) {
                        mk0Var.E();
                    }
                    i7.g6 g6Var2 = (i7.g6) zVar.f2938i;
                    if (g6Var2 != null) {
                        g6Var2.a();
                    }
                    ((SparseArray) zVar.f2939j).clear();
                    zVar.f2937g = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f2123a) {
            case 11:
                ((org.telegram.ui.ActionBar.l) this.f2125c).B.setVisibility(0);
                return;
            case 17:
                ((bb) this.f2124b).run();
                return;
            case 18:
                ((bb) this.f2124b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public c3(Runnable runnable, Runnable runnable2, int i10) {
        this.f2123a = i10;
        this.f2124b = runnable;
        this.f2125c = runnable2;
    }
}
