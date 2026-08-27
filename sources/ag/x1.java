package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import h7.a6;
import hh.kb;
import hh.lb;
import hh.y9;
import java.util.ArrayList;
import lh.h9;
import lh.n9;
import lh.t3;
import lh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.kn;
import org.telegram.ui.mp;
import org.telegram.ui.rn;
import org.telegram.ui.ti;

public final class x1 extends AnimatorListenerAdapter {

    public final int f697a;

    public final Object f698b;

    public final Object f699c;

    public x1(int i10, Object obj, Object obj2) {
        this.f697a = i10;
        this.f699c = obj;
        this.f698b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f697a) {
            case 10:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f699c;
                AnimatorSet animatorSet = kVar.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.L = null;
                    break;
                }
                break;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f699c;
                if (animator.equals(actionBarLayout.f22661g0)) {
                    actionBarLayout.f22653d0.clear();
                    actionBarLayout.U.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.f22659f0.clear();
                    g6.sl = null;
                    actionBarLayout.f22656e0 = null;
                    actionBarLayout.f22651c0 = null;
                    actionBarLayout.f22661g0 = null;
                    kn knVar = ((a5) this.f698b).f22730j;
                    if (knVar != null) {
                        knVar.run();
                    }
                }
                break;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f699c;
                if (animator.equals(chatActivityEnterView.f26142m2)) {
                    chatActivityEnterView.f26142m2 = null;
                }
                break;
            case 22:
                gi giVar = (gi) this.f699c;
                if (((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimation != null && ((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimation.equals(animator)) {
                    ((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimation = null;
                    ((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimationType = 0;
                    break;
                }
                break;
            case 24:
                yy yyVar = (yy) this.f699c;
                if (animator.equals(yyVar.I0)) {
                    yyVar.I0 = null;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean[] zArr;
        o1.j jVar;
        int i10 = this.f697a;
        int i11 = 0;
        Object obj = this.f698b;
        Object obj2 = this.f699c;
        switch (i10) {
            case 0:
                ((g2) obj2).f397w = false;
                ((n1) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 1:
                y2 y2Var = (y2) obj2;
                y2Var.D0 = false;
                y2Var.C0 = 1.0f;
                y2Var.f721o0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
                    valueAnimatorOfInt.addUpdateListener(new t2(i11, this, drawable));
                    valueAnimatorOfInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 2:
                gg.k kVar = (gg.k) obj2;
                kVar.removeView((a30) obj);
                kVar.h.clear();
                kVar.f7101b = null;
                kVar.f7102c = false;
                ((gg.l) kVar.f7105n).f7107b.setAllowDrawCursor(true);
                return;
            case 3:
                lb lbVar = (lb) obj2;
                lbVar.f9693b.remove((kb) obj);
                lbVar.R();
                return;
            case 4:
                super.onAnimationEnd(animator);
                ((jh.o) obj2).U.f13781f0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 5:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f36200o0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new y9(profileStoriesView, 14), 180L);
                    }
                }
                profileStoriesView.S = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 6:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((lh.x2) obj2).h.h.setVisibility(8);
                return;
            case 7:
                t3 t3Var = (t3) obj2;
                t3Var.f16845c = null;
                t3Var.f16846e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 8:
                lh.q qVar = (lh.q) obj2;
                ((zf.c2) obj).setDraw(true);
                if (qVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qVar.getParent()).removeView(qVar);
                    return;
                }
                return;
            case 9:
                gg.k kVar2 = (gg.k) obj2;
                kVar2.removeView((a30) obj);
                kVar2.h.clear();
                kVar2.f7101b = null;
                kVar2.f7102c = false;
                n9 n9Var = (n9) kVar2.f7105n;
                n9Var.f16440a.setAllowDrawCursor(true);
                z8 z8Var = n9Var.f16444f;
                if (z8Var != null) {
                    z8Var.run();
                }
                if (n9Var.G) {
                    n9Var.fullScroll(130);
                    n9Var.G = false;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar3.L;
                if (animatorSet == null || !animatorSet.equals(animator)) {
                    return;
                }
                kVar3.L = null;
                h5 h5Var = kVar3.f23584n[0];
                if (h5Var != null) {
                    h5Var.setVisibility(4);
                }
                if (kVar3.f23591r != null && !TextUtils.isEmpty(kVar3.f23599w0)) {
                    kVar3.f23591r.setVisibility(4);
                }
                org.telegram.ui.ActionBar.z zVar = kVar3.A;
                if (zVar != null) {
                    zVar.setVisibility(4);
                }
                if (kVar3.M == null) {
                    return;
                }
                while (true) {
                    View[] viewArr = kVar3.M;
                    if (i11 >= viewArr.length) {
                        return;
                    }
                    View view2 = viewArr[i11];
                    if (view2 != null && ((zArr = (boolean[]) obj) == null || i11 >= zArr.length || zArr[i11])) {
                        view2.setVisibility(4);
                    }
                    i11++;
                }
                break;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.f22663h0.unlock();
                if (animator.equals(actionBarLayout.f22661g0)) {
                    actionBarLayout.f22653d0.clear();
                    actionBarLayout.U.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.f22659f0.clear();
                    g6.sl = null;
                    actionBarLayout.f22656e0 = null;
                    actionBarLayout.f22651c0 = null;
                    actionBarLayout.f22661g0 = null;
                    kn knVar = ((a5) obj).f22730j;
                    if (knVar != null) {
                        knVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).f22672n = false;
                ((org.telegram.ui.ActionBar.n2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                rn rnVar = (rn) obj2;
                rnVar.f42261w9 = 0.0f;
                if (animator == rnVar.f42011cb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    rnVar.V2 = null;
                    rnVar.f42011cb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) ((dh.f) obj2).f4996b;
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().f25190x0 = false;
                org.telegram.ui.w0 w0Var = new org.telegram.ui.w0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((d50) obj, (Property<d50, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s1Var, w0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new h9(this, 29));
                animatorSet2.start();
                return;
            case 15:
                mp mpVar = (mp) obj2;
                mpVar.H = 0.0f;
                mpVar.G = 1.0f;
                ((View) obj).invalidate();
                mpVar.P.invalidate();
                ti tiVar = mpVar.U;
                if (tiVar != null) {
                    tiVar.run();
                    mpVar.U = null;
                    return;
                }
                return;
            case 16:
                ((bg) obj2).run();
                return;
            case 17:
                ((sa) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.L0;
                if (animator.equals(chatActivityEnterView.f26142m2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    oe oeVar = chatActivityEnterView.O0;
                    if (oeVar != null) {
                        oeVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f26142m2 = null;
                    chatActivityEnterView.f26163q2 = 0;
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.R0 = null;
                chatActivityEnterView2.G3.unlock();
                ((ed) obj).run();
                return;
            case 20:
                ((cg.w1) obj).run();
                ((ChatActivityEnterView) obj2).G3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).f26196w3 = null;
                ((ed) obj).run();
                return;
            case 22:
                gi giVar = (gi) obj2;
                if (((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimation == null || !((org.telegram.ui.ActionBar.e3) giVar).currentSheetAnimation.equals(animator) || (jVar = giVar.f28669l2) == null || jVar.f19141f) {
                    return;
                }
                ((org.telegram.ui.ActionBar.i3) obj).run();
                return;
            case 23:
                bu buVar = (bu) obj2;
                if (buVar.f27212a.f28452e.getVisibility() == 0) {
                    buVar.f27212a.f28452e.setAlpha(1.0f);
                    buVar.f27212a.f28452e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                zk0 zk0Var = (zk0) obj;
                yy yyVar = (yy) obj2;
                if (animator.equals(yyVar.I0)) {
                    zk0Var.setTranslationY(0.0f);
                    if (zk0Var == yyVar.f35059z0) {
                        zk0Var.setPadding(0, 0, 0, yyVar.f35016m2);
                    } else if (zk0Var == yyVar.L) {
                        zk0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), yyVar.f35016m2);
                    } else if (zk0Var == yyVar.f34987d0) {
                        zk0Var.setPadding(0, yyVar.X0, 0, yyVar.f35016m2);
                    }
                    yyVar.I0 = null;
                    return;
                }
                return;
            case 25:
                s10 s10Var = (s10) obj2;
                s10Var.removeView((a30) obj);
                s10Var.f32295e.clear();
                s10Var.f32292a = null;
                s10Var.f32293b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                s10 s10Var2 = (s10) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    s10Var2.removeView((View) arrayList.get(i13));
                }
                s10Var2.f32295e.clear();
                s10Var2.f32292a = null;
                s10Var2.f32293b = false;
                return;
            case 27:
                o60 o60Var = (o60) obj2;
                o60Var.removeView((a30) obj);
                o60Var.f31175c = null;
                o60Var.f31176e.Z = null;
                o60Var.f31173a = false;
                return;
            case 28:
                ck0 ck0Var = (ck0) obj2;
                c2.x xVar = ck0Var.f27477e;
                if (((ValueAnimator) xVar.f2371g) == null) {
                    return;
                }
                ((zk0) xVar.f2369e).T1 = false;
                ArrayList arrayList2 = ck0Var.f27475b;
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList2.get(i14);
                    i14++;
                    View view4 = (View) obj3;
                    if (view4 instanceof l4) {
                        ((l4) view4).c(false, true);
                    }
                    view4.setTranslationY(0.0f);
                    ((f2.k0) xVar.f2370f).getClass();
                    f2.x0.x0(view4);
                    ((zk0) xVar.f2369e).removeView(view4);
                    a6 a6Var = (a6) xVar.f2372i;
                    if (a6Var != null) {
                        a6Var.d(view4);
                    }
                }
                ((zk0) xVar.f2369e).setScrollEnabled(true);
                ((zk0) xVar.f2369e).setVerticalScrollBarEnabled(true);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    if (((zk0) xVar.f2369e).f1840e.o() != ((zk0) xVar.f2369e).getChildCount()) {
                        throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                    }
                    if (((ArrayList) ((zk0) xVar.f2369e).f1840e.d).size() != 0) {
                        throw new RuntimeException("hidden child count must be 0");
                    }
                }
                int childCount = ((zk0) xVar.f2369e).getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = ((zk0) xVar.f2369e).getChildAt(i15);
                    if (childAt instanceof l4) {
                        ((l4) childAt).c(false, false);
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
                    if (view5 instanceof l4) {
                        ((l4) view5).c(false, false);
                    }
                    view5.setTranslationY(0.0f);
                }
                dk0 dk0Var = ck0Var.d;
                if (dk0Var != null) {
                    dk0Var.E();
                }
                a6 a6Var2 = (a6) xVar.f2372i;
                if (a6Var2 != null) {
                    a6Var2.a();
                }
                ((SparseArray) xVar.f2373j).clear();
                xVar.f2371g = null;
                return;
            default:
                h00 h00Var = (h00) obj;
                h00Var.setAlpha(1.0f);
                f2.x0.x0(h00Var);
                gk0 gk0Var = (gk0) obj2;
                gk0Var.f28739c.remove(h00Var);
                gk0Var.f28737a.removeView(h00Var);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f697a) {
            case 10:
                ((org.telegram.ui.ActionBar.k) this.f699c).B.setVisibility(0);
                break;
            case 16:
                ((ua) this.f698b).run();
                break;
            case 17:
                ((ua) this.f698b).run();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public x1(Runnable runnable, Runnable runnable2, int i10) {
        this.f697a = i10;
        this.f698b = runnable;
        this.f699c = runnable2;
    }

    public x1(gk0 gk0Var, h00 h00Var, f2.x0 x0Var) {
        this.f697a = 29;
        this.f699c = gk0Var;
        this.f698b = h00Var;
    }
}
