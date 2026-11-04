package bh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import ci.d1;
import ci.vc;
import ci.wc;
import ei.q;
import gi.c8;
import gi.d3;
import gi.h3;
import gi.q8;
import gi.s2;
import java.util.ArrayList;
import mi.c2;
import org.telegram.messenger.az;
import org.telegram.messenger.g0;
import org.telegram.messenger.xu;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.ActionBar.x;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.e7;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ie;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.o2;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dl;
import org.telegram.ui.pm;
import org.telegram.ui.r0;
import org.telegram.ui.to;
import org.telegram.ui.wm;
import org.telegram.ui.xg;
import ug.r1;
public final class j extends AnimatorListenerAdapter {
    public final int f3321a;
    public final Object f3322b;
    public final Object f3323c;

    public j(int i3, Object obj, Object obj2) {
        this.f3321a = i3;
        this.f3323c = obj;
        this.f3322b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f3321a) {
            case 12:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f3323c;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    return;
                }
                return;
            case 13:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f3323c;
                if (animator.equals(actionBarLayout.f27314r0)) {
                    actionBarLayout.f27297i0.clear();
                    actionBarLayout.f27283c0.clear();
                    actionBarLayout.f27285d0.clear();
                    actionBarLayout.f27301k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    k6.jm = null;
                    actionBarLayout.f27299j0 = null;
                    actionBarLayout.f27295h0 = null;
                    actionBarLayout.f27314r0 = null;
                    pm pmVar = ((p4) this.f3322b).f28432j;
                    if (pmVar != null) {
                        pmVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3323c;
                if (animator.equals(chatActivityEnterView.f31194s2)) {
                    chatActivityEnterView.f31194s2 = null;
                    return;
                }
                return;
            case 24:
                bi biVar = (bi) this.f3323c;
                AnimatorSet animatorSet2 = biVar.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    biVar.A0 = null;
                    biVar.B0 = 0;
                    return;
                }
                return;
            case 26:
                ey eyVar = (ey) this.f3323c;
                if (animator.equals(eyVar.N0)) {
                    eyVar.N0 = null;
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
        q1.g gVar;
        int i3 = this.f3321a;
        int i10 = 0;
        Object obj = this.f3322b;
        Object obj2 = this.f3323c;
        switch (i3) {
            case 0:
                l lVar = (l) obj2;
                lVar.removeView((y10) obj);
                lVar.h.clear();
                lVar.f3328b = null;
                lVar.f3329c = false;
                ((m) lVar.f3332n).f3334b.setAllowDrawCursor(true);
                return;
            case 1:
                wc wcVar = (wc) obj2;
                wcVar.f6297b.remove((vc) obj);
                wcVar.f1();
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((q) obj2).f10785c0.f10837k0 = null;
                g0.E2((View) obj);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i11 = ProfileStoriesView.f42008t0;
                    if (az.o() > 0) {
                        g0.c4(profileStoriesView);
                        g0.i3(new d1(profileStoriesView, 27), 180L);
                    }
                }
                profileStoriesView.f42010a0 = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 4:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((d3) ((s2) obj2).f13553c).h.setVisibility(8);
                return;
            case 5:
                h3 h3Var = (h3) obj2;
                h3Var.k1 = null;
                h3Var.m1 = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                gi.p pVar = (gi.p) obj2;
                ((r1) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 7:
                l lVar2 = (l) obj2;
                lVar2.removeView((y10) obj);
                lVar2.h.clear();
                lVar2.f3328b = null;
                lVar2.f3329c = false;
                q8 q8Var = (q8) lVar2.f3332n;
                q8Var.f13440b.setAllowDrawCursor(true);
                c8 c8Var = q8Var.h;
                if (c8Var != null) {
                    c8Var.run();
                }
                if (q8Var.M) {
                    q8Var.fullScroll(130);
                    q8Var.M = false;
                    return;
                }
                return;
            case 8:
                mg.g gVar2 = (mg.g) obj2;
                gVar2.f19328b.clear();
                gVar2.f19328b.add((og.d) obj);
                return;
            case 9:
                super.onAnimationEnd(animator);
                mg.g gVar3 = (mg.g) obj2;
                gVar3.f19331c.clear();
                gVar3.f19331c.add((og.b) obj);
                return;
            case 10:
                c2 c2Var = (c2) obj2;
                c2Var.F = false;
                c2Var.f19536w.setAlpha(1.0f);
                c2Var.f19536w.B1.setVisibility(0);
                c2Var.f19540y.r(g0.L(22.0f));
                c2Var.f19540y.setAlpha(255);
                kh.f fVar = c2Var.f19531s;
                fVar.f17283e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 11:
                xu xuVar = (xu) obj2;
                xuVar.f26446b = true;
                xuVar.f26449f = null;
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    k5 k5Var = kVar.f27725n[0];
                    if (k5Var != null) {
                        k5Var.setVisibility(4);
                    }
                    if (kVar.f27734r != null && !TextUtils.isEmpty(kVar.B0)) {
                        kVar.f27734r.setVisibility(4);
                    }
                    x xVar = kVar.F;
                    if (xVar != null) {
                        xVar.setVisibility(4);
                    }
                    if (kVar.R == null) {
                        return;
                    }
                    while (true) {
                        View[] viewArr = kVar.R;
                        if (i10 < viewArr.length) {
                            View view3 = viewArr[i10];
                            if (view3 != null && ((zArr = (boolean[]) obj) == null || i10 >= zArr.length || zArr[i10])) {
                                view3.setVisibility(4);
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
            case 13:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.f27317s0.e();
                if (animator.equals(actionBarLayout.f27314r0)) {
                    actionBarLayout.f27297i0.clear();
                    actionBarLayout.f27283c0.clear();
                    actionBarLayout.f27285d0.clear();
                    actionBarLayout.f27301k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    k6.jm = null;
                    actionBarLayout.f27299j0 = null;
                    actionBarLayout.f27295h0 = null;
                    actionBarLayout.f27314r0 = null;
                    pm pmVar = ((p4) obj).f28432j;
                    if (pmVar != null) {
                        pmVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((ActionBarLayout) obj2).f27304n = false;
                ((d2) obj).onPreviewOpenAnimationEnd();
                return;
            case 15:
                View view4 = (View) obj;
                wm wmVar = (wm) obj2;
                wmVar.U9 = 0.0f;
                if (animator == wmVar.Db) {
                    ViewGroup viewGroup = (ViewGroup) view4.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view4);
                    }
                    wmVar.f51422o3 = null;
                    wmVar.Db = null;
                    return;
                }
                return;
            case 16:
                q1 q1Var = ((dl) obj2).f44732b;
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f30940y0 = false;
                r0 r0Var = new r0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((m40) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(q1Var, r0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new w9(this, 7));
                animatorSet2.start();
                return;
            case 17:
                to toVar = (to) obj2;
                toVar.M = 0.0f;
                toVar.L = 1.0f;
                ((View) obj).invalidate();
                toVar.U.invalidate();
                xg xgVar = toVar.Z;
                if (xgVar != null) {
                    xgVar.run();
                    toVar.Z = null;
                    return;
                }
                return;
            case 18:
                ((vf) obj2).run();
                return;
            case 19:
                ((oa) obj2).run();
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.Q0;
                if (animator.equals(chatActivityEnterView.f31194s2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.f31085a1.setVisibility(8);
                    ie ieVar = chatActivityEnterView.T0;
                    if (ieVar != null) {
                        ieVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f31194s2 = null;
                    chatActivityEnterView.f31216w2 = 0;
                    return;
                }
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.M3.e();
                ((yc) obj).run();
                return;
            case 22:
                ((o2) obj).run();
                ((ChatActivityEnterView) obj2).M3.e();
                return;
            case 23:
                ((ChatActivityEnterView) obj2).C3 = null;
                ((yc) obj).run();
                return;
            case 24:
                bi biVar = (bi) obj2;
                AnimatorSet animatorSet3 = biVar.A0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (gVar = biVar.f32243k4) != null && !gVar.f53647f) {
                    ((e7) obj).run();
                    return;
                }
                return;
            case 25:
                qt qtVar = (qt) obj2;
                if (qtVar.f37524a.m1.getVisibility() == 0) {
                    qtVar.f37524a.m1.setAlpha(1.0f);
                    qtVar.f37524a.m1.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 26:
                tj0 tj0Var = (tj0) obj;
                ey eyVar = (ey) obj2;
                if (animator.equals(eyVar.N0)) {
                    tj0Var.setTranslationY(0.0f);
                    if (tj0Var == eyVar.E0) {
                        tj0Var.setPadding(0, 0, 0, eyVar.f33573r2);
                    } else if (tj0Var == eyVar.Q) {
                        tj0Var.setPadding(g0.L(5.0f), 0, g0.L(5.0f), eyVar.f33573r2);
                    } else if (tj0Var == eyVar.f33545i0) {
                        tj0Var.setPadding(0, eyVar.f33527c1, 0, eyVar.f33573r2);
                    }
                    eyVar.N0 = null;
                    return;
                }
                return;
            case 27:
                q00 q00Var = (q00) obj2;
                q00Var.removeView((y10) obj);
                q00Var.f37303e.clear();
                q00Var.f37300a = null;
                q00Var.f37301b = false;
                return;
            case 28:
                ArrayList arrayList = (ArrayList) obj;
                q00 q00Var2 = (q00) obj2;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    q00Var2.removeView((View) arrayList.get(i12));
                }
                q00Var2.f37303e.clear();
                q00Var2.f37300a = null;
                q00Var2.f37301b = false;
                return;
            default:
                s50 s50Var = (s50) obj2;
                s50Var.removeView((y10) obj);
                s50Var.f37911c = null;
                s50Var.f37912e.V1 = null;
                s50Var.f37909a = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f3321a) {
            case 12:
                ((org.telegram.ui.ActionBar.k) this.f3323c).G.setVisibility(0);
                return;
            case 18:
                ((qa) this.f3322b).run();
                return;
            case 19:
                ((qa) this.f3322b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j(Runnable runnable, Runnable runnable2, int i3) {
        this.f3321a = i3;
        this.f3322b = runnable;
        this.f3323c = runnable2;
    }
}
