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
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cj;
import org.telegram.ui.em;
import org.telegram.ui.qn;
import org.telegram.ui.vp;
import org.telegram.ui.xn;
public final class z extends AnimatorListenerAdapter {
    public final int f1769a;
    public final Object f1770b;
    public final Object f1771c;

    public z(int i10, Object obj, Object obj2) {
        this.f1769a = i10;
        this.f1771c = obj;
        this.f1770b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f1769a) {
            case 10:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) this.f1771c;
                AnimatorSet animatorSet3 = lVar.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    lVar.P = null;
                    return;
                }
                return;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f1771c;
                if (animator.equals(actionBarLayout.f18620k0)) {
                    actionBarLayout.f18614h0.clear();
                    actionBarLayout.f18600b0.clear();
                    actionBarLayout.f18603c0.clear();
                    actionBarLayout.f18618j0.clear();
                    org.telegram.ui.ActionBar.i6.sl = null;
                    actionBarLayout.f18616i0 = null;
                    actionBarLayout.f18612g0 = null;
                    actionBarLayout.f18620k0 = null;
                    qn qnVar = ((org.telegram.ui.ActionBar.c5) this.f1770b).f18774j;
                    if (qnVar != null) {
                        qnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1771c;
                if (animator.equals(chatActivityEnterView.f22057r2)) {
                    chatActivityEnterView.f22057r2 = null;
                    return;
                }
                return;
            case 22:
                wi wiVar = (wi) this.f1771c;
                animatorSet = ((org.telegram.ui.ActionBar.g3) wiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.g3) wiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.g3) wiVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.g3) wiVar).currentSheetAnimationType = 0;
                        return;
                    }
                    return;
                }
                return;
            case 24:
                mz mzVar = (mz) this.f1771c;
                if (animator.equals(mzVar.M0)) {
                    mzVar.M0 = null;
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
        int i10 = this.f1769a;
        int i11 = 0;
        Object obj = this.f1770b;
        Object obj2 = this.f1771c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                ((a0) obj2).f498b0.f560j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f31806s0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new a3.d(profileStoriesView, 9), 180L);
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
                ((ci.d3) obj2).h.h.setVisibility(8);
                return;
            case 3:
                ci.a4 a4Var = (ci.a4) obj2;
                a4Var.f4342c = null;
                a4Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                ci.p pVar = (ci.p) obj2;
                ((qg.b2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 5:
                ci.aa aaVar = (ci.aa) obj2;
                aaVar.removeView((p30) obj);
                aaVar.h.clear();
                aaVar.f4357b = null;
                aaVar.f4358c = false;
                ci.ba baVar = (ci.ba) aaVar.f4360n;
                baVar.f4420a.setAllowDrawCursor(true);
                ci.l9 l9Var = baVar.f4423f;
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
                ig.g gVar = (ig.g) obj2;
                gVar.f11123b.clear();
                gVar.f11123b.add((kg.d) obj);
                return;
            case 7:
                super.onAnimationEnd(animator);
                ig.g gVar2 = (ig.g) obj2;
                gVar2.f11126c.clear();
                gVar2.f11126c.add((kg.b) obj);
                return;
            case 8:
                ii.e2 e2Var = (ii.e2) obj2;
                e2Var.E = false;
                e2Var.v.setAlpha(1.0f);
                e2Var.v.A1.setVisibility(0);
                e2Var.f11340x.w(AndroidUtilities.dp(22.0f));
                e2Var.f11340x.setAlpha(255);
                hh.g gVar3 = e2Var.f11333s;
                gVar3.e = true;
                gVar3.invalidate();
                ((Runnable) obj).run();
                return;
            case 9:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f22242k0 = null;
                return;
            case 10:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj2;
                AnimatorSet animatorSet3 = lVar.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    lVar.P = null;
                    org.telegram.ui.ActionBar.j5 j5Var = lVar.f19569n[0];
                    if (j5Var != null) {
                        j5Var.setVisibility(4);
                    }
                    if (lVar.f19578r != null && !TextUtils.isEmpty(lVar.A0)) {
                        lVar.f19578r.setVisibility(4);
                    }
                    org.telegram.ui.ActionBar.a0 a0Var = lVar.E;
                    if (a0Var != null) {
                        a0Var.setVisibility(4);
                    }
                    if (lVar.Q == null) {
                        return;
                    }
                    while (true) {
                        View[] viewArr = lVar.Q;
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
                actionBarLayout.f18622l0.unlock();
                if (animator.equals(actionBarLayout.f18620k0)) {
                    actionBarLayout.f18614h0.clear();
                    actionBarLayout.f18600b0.clear();
                    actionBarLayout.f18603c0.clear();
                    actionBarLayout.f18618j0.clear();
                    org.telegram.ui.ActionBar.i6.sl = null;
                    actionBarLayout.f18616i0 = null;
                    actionBarLayout.f18612g0 = null;
                    actionBarLayout.f18620k0 = null;
                    qn qnVar = ((org.telegram.ui.ActionBar.c5) obj).f18774j;
                    if (qnVar != null) {
                        qnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).f18624n = false;
                ((org.telegram.ui.ActionBar.o2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                xn xnVar = (xn) obj2;
                xnVar.A9 = 0.0f;
                if (animator == xnVar.f39763fb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    xnVar.Z2 = null;
                    xnVar.f39763fb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ((em) obj2).f33286b;
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f21176x0 = false;
                org.telegram.ui.u0 u0Var = new org.telegram.ui.u0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((g60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(u1Var, u0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new org.telegram.ui.v4(this, 21));
                animatorSet4.start();
                return;
            case 15:
                vp vpVar = (vp) obj2;
                vpVar.L = 0.0f;
                vpVar.K = 1.0f;
                ((View) obj).invalidate();
                vpVar.T.invalidate();
                cj cjVar = vpVar.Y;
                if (cjVar != null) {
                    cjVar.run();
                    vpVar.Y = null;
                    return;
                }
                return;
            case 16:
                ((pg) obj2).run();
                return;
            case 17:
                ((org.telegram.ui.Components.db) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f22057r2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.Z0.setVisibility(8);
                    cf cfVar = chatActivityEnterView.S0;
                    if (cfVar != null) {
                        cfVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f22057r2 = null;
                    chatActivityEnterView.f22078v2 = 0;
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.unlock();
                ((sd) obj).run();
                return;
            case 20:
                ((kd) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((sd) obj).run();
                return;
            case 22:
                wi wiVar = (wi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.g3) wiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.g3) wiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (kVar = wiVar.f29993p2) != null && !kVar.f15565f) {
                        ((org.telegram.messenger.video.o) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                tu tuVar = (tu) obj2;
                if (tuVar.f28690a.e.getVisibility() == 0) {
                    tuVar.f28690a.e.setAlpha(1.0f);
                    tuVar.f28690a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                yl0 yl0Var = (yl0) obj;
                mz mzVar = (mz) obj2;
                if (animator.equals(mzVar.M0)) {
                    yl0Var.setTranslationY(0.0f);
                    if (yl0Var == mzVar.D0) {
                        yl0Var.setPadding(0, 0, 0, mzVar.f26614p2);
                    } else if (yl0Var == mzVar.P) {
                        yl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), mzVar.f26614p2);
                    } else if (yl0Var == mzVar.f26589h0) {
                        yl0Var.setPadding(0, mzVar.f26570b1, 0, mzVar.f26614p2);
                    }
                    mzVar.M0 = null;
                    return;
                }
                return;
            case 25:
                h20 h20Var = (h20) obj2;
                h20Var.removeView((p30) obj);
                h20Var.e.clear();
                h20Var.f24693a = null;
                h20Var.f24694b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                h20 h20Var2 = (h20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    h20Var2.removeView((View) arrayList.get(i13));
                }
                h20Var2.e.clear();
                h20Var2.f24693a = null;
                h20Var2.f24694b = false;
                return;
            case 27:
                n70 n70Var = (n70) obj2;
                n70Var.removeView((p30) obj);
                n70Var.f26745c = null;
                n70Var.e.f27015d0 = null;
                n70Var.f26743a = false;
                return;
            case 28:
                yk0 yk0Var = (yk0) obj2;
                bl0 bl0Var = yk0Var.e;
                if (((ValueAnimator) bl0Var.f23067g) != null) {
                    ((yl0) bl0Var.e).X1 = false;
                    ArrayList arrayList2 = yk0Var.f30677b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        View view4 = (View) obj3;
                        if (view4 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) view4).c(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((s4.c0) bl0Var.f23066f).getClass();
                        s4.o0.x0(view4);
                        ((yl0) bl0Var.e).removeView(view4);
                        w7.z5 z5Var = (w7.z5) bl0Var.f23068i;
                        if (z5Var != null) {
                            z5Var.d(view4);
                        }
                    }
                    ((yl0) bl0Var.e).setScrollEnabled(true);
                    ((yl0) bl0Var.e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((yl0) bl0Var.e).e.C() == ((yl0) bl0Var.e).getChildCount()) {
                            if (((ArrayList) ((yl0) bl0Var.e).e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((yl0) bl0Var.e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((yl0) bl0Var.e).getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) childAt).c(false, false);
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
                            ((org.telegram.ui.Cells.o4) view5).c(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    zk0 zk0Var = yk0Var.d;
                    if (zk0Var != null) {
                        zk0Var.E();
                    }
                    w7.z5 z5Var2 = (w7.z5) bl0Var.f23068i;
                    if (z5Var2 != null) {
                        z5Var2.a();
                    }
                    ((SparseArray) bl0Var.f23069j).clear();
                    bl0Var.f23067g = null;
                    return;
                }
                return;
            default:
                v00 v00Var = (v00) obj;
                v00Var.setAlpha(1.0f);
                s4.o0.x0(v00Var);
                dl0 dl0Var = (dl0) obj2;
                dl0Var.f23688c.remove(v00Var);
                dl0Var.f23686a.removeView(v00Var);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1769a) {
            case 10:
                ((org.telegram.ui.ActionBar.l) this.f1771c).F.setVisibility(0);
                return;
            case 16:
                ((org.telegram.ui.Components.fb) this.f1770b).run();
                return;
            case 17:
                ((org.telegram.ui.Components.fb) this.f1770b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public z(Runnable runnable, Runnable runnable2, int i10) {
        this.f1769a = i10;
        this.f1770b = runnable;
        this.f1771c = runnable2;
    }

    public z(dl0 dl0Var, v00 v00Var, s4.o0 o0Var) {
        this.f1769a = 29;
        this.f1771c = dl0Var;
        this.f1770b = v00Var;
    }
}
