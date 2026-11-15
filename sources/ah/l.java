package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import di.jc;
import di.kc;
import fi.c1;
import hi.b8;
import hi.d3;
import hi.h3;
import hi.n8;
import hi.s2;
import java.util.ArrayList;
import oi.z1;
import org.telegram.messenger.dv;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n4;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.a2;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.yf;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.zd;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.an;
import org.telegram.ui.bh;
import org.telegram.ui.hl;
import org.telegram.ui.q0;
import org.telegram.ui.tm;
import org.telegram.ui.wo;
import tg.r1;
public final class l extends AnimatorListenerAdapter {
    public final int f1082a;
    public final Object f1083b;
    public final Object f1084c;

    public l(int i7, Object obj, Object obj2) {
        this.f1082a = i7;
        this.f1084c = obj;
        this.f1083b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1082a) {
            case 13:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f1084c;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    return;
                }
                return;
            case 14:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f1084c;
                if (animator.equals(actionBarLayout.f28363r0)) {
                    actionBarLayout.f28346i0.clear();
                    actionBarLayout.f28332c0.clear();
                    actionBarLayout.f28334d0.clear();
                    actionBarLayout.f28350k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    j6.mm = null;
                    actionBarLayout.f28348j0 = null;
                    actionBarLayout.f28344h0 = null;
                    actionBarLayout.f28363r0 = null;
                    tm tmVar = ((n4) this.f1083b).f29414j;
                    if (tmVar != null) {
                        tmVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1084c;
                if (animator.equals(chatActivityEnterView.Z2)) {
                    chatActivityEnterView.Z2 = null;
                    return;
                }
                return;
            case 25:
                ki kiVar = (ki) this.f1084c;
                AnimatorSet animatorSet2 = kiVar.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kiVar.A0 = null;
                    kiVar.B0 = 0;
                    return;
                }
                return;
            case 27:
                ly lyVar = (ly) this.f1084c;
                if (animator.equals(lyVar.N0)) {
                    lyVar.N0 = null;
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
        r1.g gVar;
        int i7 = this.f1082a;
        int i10 = 0;
        Object obj = this.f1083b;
        Object obj2 = this.f1084c;
        switch (i7) {
            case 0:
                n nVar = (n) obj2;
                nVar.removeView((f20) obj);
                nVar.h.clear();
                nVar.f1089b = null;
                nVar.f1090c = false;
                ((o) nVar.f1093n).f1095b.setAllowDrawCursor(true);
                return;
            case 1:
                kc kcVar = (kc) obj2;
                kcVar.f8934b.remove((jc) obj);
                kcVar.f1();
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((fi.p) obj2).f12148c0.f12199k0 = null;
                g0.E2((View) obj);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i11 = ProfileStoriesView.f43351t0;
                    if (gz.o() > 0) {
                        g0.b4(profileStoriesView);
                        g0.i3(new c1(profileStoriesView, 5), 180L);
                    }
                }
                profileStoriesView.f43353a0 = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 4:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((d3) ((s2) obj2).f15018c).h.setVisibility(8);
                return;
            case 5:
                h3 h3Var = (h3) obj2;
                h3Var.n1 = null;
                h3Var.f14370p1 = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                hi.p pVar = (hi.p) obj2;
                ((r1) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 7:
                n nVar2 = (n) obj2;
                nVar2.removeView((f20) obj);
                nVar2.h.clear();
                nVar2.f1089b = null;
                nVar2.f1090c = false;
                n8 n8Var = (n8) nVar2.f1093n;
                n8Var.f14769b.setAllowDrawCursor(true);
                b8 b8Var = n8Var.h;
                if (b8Var != null) {
                    b8Var.run();
                }
                if (n8Var.M) {
                    n8Var.fullScroll(130);
                    n8Var.M = false;
                    return;
                }
                return;
            case 8:
                lg.g gVar2 = (lg.g) obj2;
                gVar2.f19421b.clear();
                gVar2.f19421b.add((ng.d) obj);
                return;
            case 9:
                super.onAnimationEnd(animator);
                lg.g gVar3 = (lg.g) obj2;
                gVar3.f19424c.clear();
                gVar3.f19424c.add((ng.b) obj);
                return;
            case 10:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f32492l0 = null;
                return;
            case 11:
                z1 z1Var = (z1) obj2;
                z1Var.F = false;
                z1Var.f22185w.setAlpha(1.0f);
                z1Var.f22185w.f32215i2.setVisibility(0);
                z1Var.f22189y.r(g0.L(22.0f));
                z1Var.f22189y.setAlpha(255);
                jh.f fVar = z1Var.f22180s;
                fVar.f17393e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 12:
                dv dvVar = (dv) obj2;
                dvVar.f23165b = true;
                dvVar.f23168f = null;
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    j5 j5Var = kVar.f29302n[0];
                    if (j5Var != null) {
                        j5Var.setVisibility(4);
                    }
                    if (kVar.f29310r != null && !TextUtils.isEmpty(kVar.B0)) {
                        kVar.f29310r.setVisibility(4);
                    }
                    y yVar = kVar.F;
                    if (yVar != null) {
                        yVar.setVisibility(4);
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
            case 14:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.f28366s0.e();
                if (animator.equals(actionBarLayout.f28363r0)) {
                    actionBarLayout.f28346i0.clear();
                    actionBarLayout.f28332c0.clear();
                    actionBarLayout.f28334d0.clear();
                    actionBarLayout.f28350k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    j6.mm = null;
                    actionBarLayout.f28348j0 = null;
                    actionBarLayout.f28344h0 = null;
                    actionBarLayout.f28363r0 = null;
                    tm tmVar = ((n4) obj).f29414j;
                    if (tmVar != null) {
                        tmVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((ActionBarLayout) obj2).f28354n = false;
                ((e2) obj).onPreviewOpenAnimationEnd();
                return;
            case 16:
                View view4 = (View) obj;
                an anVar = (an) obj2;
                anVar.W9 = 0.0f;
                if (animator == anVar.Fb) {
                    ViewGroup viewGroup = (ViewGroup) view4.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view4);
                    }
                    anVar.f45303o3 = null;
                    anVar.Fb = null;
                    return;
                }
                return;
            case 17:
                q1 q1Var = ((hl) obj2).f47727b;
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f32016y0 = false;
                q0 q0Var = new q0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((t40) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(q1Var, q0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new w9(this, 7));
                animatorSet2.start();
                return;
            case 18:
                wo woVar = (wo) obj2;
                woVar.M = 0.0f;
                woVar.L = 1.0f;
                ((View) obj).invalidate();
                woVar.U.invalidate();
                bh bhVar = woVar.Z;
                if (bhVar != null) {
                    bhVar.run();
                    woVar.Z = null;
                    return;
                }
                return;
            case 19:
                ((dg) obj2).run();
                return;
            case 20:
                ((la) obj2).run();
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.Q0;
                if (animator.equals(chatActivityEnterView.Z2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.f32155a1.setVisibility(8);
                    zd zdVar = chatActivityEnterView.T0;
                    if (zdVar != null) {
                        zdVar.setVisibility(8);
                    }
                    ChatActivityEnterView.h(chatActivityEnterView);
                    chatActivityEnterView.Z2 = null;
                    chatActivityEnterView.f32179d3 = 0;
                    return;
                }
                return;
            case 22:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.f32291t4.e();
                ((uc) obj).run();
                return;
            case 23:
                ((a2) obj).run();
                ((ChatActivityEnterView) obj2).f32291t4.e();
                return;
            case 24:
                ((ChatActivityEnterView) obj2).f32223j4 = null;
                ((uc) obj).run();
                return;
            case 25:
                ki kiVar = (ki) obj2;
                AnimatorSet animatorSet3 = kiVar.A0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (gVar = kiVar.f36464n4) != null && !gVar.f55742f) {
                    ((yf) obj).run();
                    return;
                }
                return;
            case 26:
                yt ytVar = (yt) obj2;
                if (ytVar.f42155a.f33381p1.getVisibility() == 0) {
                    ytVar.f42155a.f33381p1.setAlpha(1.0f);
                    ytVar.f42155a.f33381p1.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 27:
                uj0 uj0Var = (uj0) obj;
                ly lyVar = (ly) obj2;
                if (animator.equals(lyVar.N0)) {
                    uj0Var.setTranslationY(0.0f);
                    if (uj0Var == lyVar.E0) {
                        uj0Var.setPadding(0, 0, 0, lyVar.f36984r2);
                    } else if (uj0Var == lyVar.Q) {
                        uj0Var.setPadding(g0.L(5.0f), 0, g0.L(5.0f), lyVar.f36984r2);
                    } else if (uj0Var == lyVar.f36956i0) {
                        uj0Var.setPadding(0, lyVar.f36938c1, 0, lyVar.f36984r2);
                    }
                    lyVar.N0 = null;
                    return;
                }
                return;
            case 28:
                y00 y00Var = (y00) obj2;
                y00Var.removeView((f20) obj);
                y00Var.f41826e.clear();
                y00Var.f41823a = null;
                y00Var.f41824b = false;
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                y00 y00Var2 = (y00) obj2;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    y00Var2.removeView((View) arrayList.get(i12));
                }
                y00Var2.f41826e.clear();
                y00Var2.f41823a = null;
                y00Var2.f41824b = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1082a) {
            case 13:
                ((org.telegram.ui.ActionBar.k) this.f1084c).G.setVisibility(0);
                return;
            case 19:
                ((na) this.f1083b).run();
                return;
            case 20:
                ((na) this.f1083b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public l(Runnable runnable, Runnable runnable2, int i7) {
        this.f1082a = i7;
        this.f1083b = runnable;
        this.f1084c = runnable2;
    }
}
