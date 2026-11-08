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
import bi.ab;
import bi.ee;
import bi.fe;
import fi.d8;
import fi.f3;
import fi.j3;
import fi.p8;
import fi.u2;
import java.util.ArrayList;
import li.b2;
import org.telegram.messenger.fv;
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.ke;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.r2;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.xf;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.an;
import org.telegram.ui.bh;
import org.telegram.ui.hl;
import org.telegram.ui.q0;
import org.telegram.ui.tm;
import org.telegram.ui.va;
import org.telegram.ui.vo;
import tg.r1;
public final class l extends AnimatorListenerAdapter {
    public final int f1084a;
    public final Object f1085b;
    public final Object f1086c;

    public l(int i7, Object obj, Object obj2) {
        this.f1084a = i7;
        this.f1086c = obj;
        this.f1085b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1084a) {
            case 13:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f1086c;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 14:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f1086c;
                if (animator.equals(actionBarLayout.f27265q0)) {
                    actionBarLayout.f27249h0.clear();
                    actionBarLayout.f27234b0.clear();
                    actionBarLayout.f27237c0.clear();
                    actionBarLayout.f27253j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    k6.jm = null;
                    actionBarLayout.f27251i0 = null;
                    actionBarLayout.f27247g0 = null;
                    actionBarLayout.f27265q0 = null;
                    tm tmVar = ((p4) this.f1085b).f28378j;
                    if (tmVar != null) {
                        tmVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1086c;
                if (animator.equals(chatActivityEnterView.f31118r2)) {
                    chatActivityEnterView.f31118r2 = null;
                    return;
                }
                return;
            case 25:
                di diVar = (di) this.f1086c;
                AnimatorSet animatorSet2 = diVar.f28658z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    diVar.f28658z0 = null;
                    diVar.A0 = 0;
                    return;
                }
                return;
            case 27:
                hy hyVar = (hy) this.f1086c;
                if (animator.equals(hyVar.M0)) {
                    hyVar.M0 = null;
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
        int i7 = this.f1084a;
        int i10 = 0;
        Object obj = this.f1085b;
        Object obj2 = this.f1086c;
        switch (i7) {
            case 0:
                n nVar = (n) obj2;
                nVar.removeView((c20) obj);
                nVar.h.clear();
                nVar.f1091b = null;
                nVar.f1092c = false;
                ((o) nVar.f1095n).f1097b.setAllowDrawCursor(true);
                return;
            case 1:
                fe feVar = (fe) obj2;
                feVar.f3898b.remove((ee) obj);
                feVar.f1();
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((di.p) obj2).f9485b0.f9599j0 = null;
                g0.E2((View) obj);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i11 = ProfileStoriesView.f41979s0;
                    if (iz.o() > 0) {
                        g0.c4(profileStoriesView);
                        g0.i3(new ab(profileStoriesView, 22), 180L);
                    }
                }
                profileStoriesView.W = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 4:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((f3) ((u2) obj2).f12884c).h.setVisibility(8);
                return;
            case 5:
                j3 j3Var = (j3) obj2;
                j3Var.f12222j1 = null;
                j3Var.l1 = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                fi.p pVar = (fi.p) obj2;
                ((r1) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 7:
                n nVar2 = (n) obj2;
                nVar2.removeView((c20) obj);
                nVar2.h.clear();
                nVar2.f1091b = null;
                nVar2.f1092c = false;
                p8 p8Var = (p8) nVar2.f1095n;
                p8Var.f12612b.setAllowDrawCursor(true);
                d8 d8Var = p8Var.h;
                if (d8Var != null) {
                    d8Var.run();
                }
                if (p8Var.L) {
                    p8Var.fullScroll(130);
                    p8Var.L = false;
                    return;
                }
                return;
            case 8:
                lg.g gVar2 = (lg.g) obj2;
                gVar2.f18289b.clear();
                gVar2.f18289b.add((ng.d) obj);
                return;
            case 9:
                super.onAnimationEnd(animator);
                lg.g gVar3 = (lg.g) obj2;
                gVar3.f18292c.clear();
                gVar3.f18292c.add((ng.b) obj);
                return;
            case 10:
                b2 b2Var = (b2) obj2;
                b2Var.E = false;
                b2Var.f18470w.setAlpha(1.0f);
                b2Var.f18470w.A1.setVisibility(0);
                b2Var.f18474y.r(g0.L(22.0f));
                b2Var.f18474y.setAlpha(255);
                jh.f fVar = b2Var.f18465s;
                fVar.f17041e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 11:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f31313k0 = null;
                return;
            case 12:
                fv fvVar = (fv) obj2;
                fvVar.f22481b = true;
                fvVar.f22484f = null;
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    k5 k5Var = kVar.f27679n[0];
                    if (k5Var != null) {
                        k5Var.setVisibility(4);
                    }
                    if (kVar.f27687r != null && !TextUtils.isEmpty(kVar.A0)) {
                        kVar.f27687r.setVisibility(4);
                    }
                    y yVar = kVar.E;
                    if (yVar != null) {
                        yVar.setVisibility(4);
                    }
                    if (kVar.Q == null) {
                        return;
                    }
                    while (true) {
                        View[] viewArr = kVar.Q;
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
                actionBarLayout.f27268r0.e();
                if (animator.equals(actionBarLayout.f27265q0)) {
                    actionBarLayout.f27249h0.clear();
                    actionBarLayout.f27234b0.clear();
                    actionBarLayout.f27237c0.clear();
                    actionBarLayout.f27253j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    k6.jm = null;
                    actionBarLayout.f27251i0 = null;
                    actionBarLayout.f27247g0 = null;
                    actionBarLayout.f27265q0 = null;
                    tm tmVar = ((p4) obj).f28378j;
                    if (tmVar != null) {
                        tmVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((ActionBarLayout) obj2).f27259n = false;
                ((f2) obj).onPreviewOpenAnimationEnd();
                return;
            case 16:
                View view4 = (View) obj;
                an anVar = (an) obj2;
                anVar.T9 = 0.0f;
                if (animator == anVar.Cb) {
                    ViewGroup viewGroup = (ViewGroup) view4.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view4);
                    }
                    anVar.f43892n3 = null;
                    anVar.Cb = null;
                    return;
                }
                return;
            case 17:
                q1 q1Var = ((hl) obj2).f46401b;
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f30867y0 = false;
                q0 q0Var = new q0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((q40) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(q1Var, q0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new va(this, 6));
                animatorSet2.start();
                return;
            case 18:
                vo voVar = (vo) obj2;
                voVar.L = 0.0f;
                voVar.K = 1.0f;
                ((View) obj).invalidate();
                voVar.T.invalidate();
                bh bhVar = voVar.Y;
                if (bhVar != null) {
                    bhVar.run();
                    voVar.Y = null;
                    return;
                }
                return;
            case 19:
                ((xf) obj2).run();
                return;
            case 20:
                ((pa) obj2).run();
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f31118r2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.Z0.setVisibility(8);
                    ke keVar = chatActivityEnterView.S0;
                    if (keVar != null) {
                        keVar.setVisibility(8);
                    }
                    ChatActivityEnterView.g(chatActivityEnterView);
                    chatActivityEnterView.f31118r2 = null;
                    chatActivityEnterView.f31140v2 = 0;
                    return;
                }
                return;
            case 22:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.e();
                ((ad) obj).run();
                return;
            case 23:
                ((r2) obj).run();
                ((ChatActivityEnterView) obj2).L3.e();
                return;
            case 24:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((ad) obj).run();
                return;
            case 25:
                di diVar = (di) obj2;
                AnimatorSet animatorSet3 = diVar.f28658z0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (gVar = diVar.f32961j4) != null && !gVar.f54261f) {
                    ((ng) obj).run();
                    return;
                }
                return;
            case 26:
                tt ttVar = (tt) obj2;
                if (ttVar.f38419a.l1.getVisibility() == 0) {
                    ttVar.f38419a.l1.setAlpha(1.0f);
                    ttVar.f38419a.l1.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 27:
                pj0 pj0Var = (pj0) obj;
                hy hyVar = (hy) obj2;
                if (animator.equals(hyVar.M0)) {
                    pj0Var.setTranslationY(0.0f);
                    if (pj0Var == hyVar.D0) {
                        pj0Var.setPadding(0, 0, 0, hyVar.f34442q2);
                    } else if (pj0Var == hyVar.P) {
                        pj0Var.setPadding(g0.L(5.0f), 0, g0.L(5.0f), hyVar.f34442q2);
                    } else if (pj0Var == hyVar.f34415h0) {
                        pj0Var.setPadding(0, hyVar.f34396b1, 0, hyVar.f34442q2);
                    }
                    hyVar.M0 = null;
                    return;
                }
                return;
            case 28:
                v00 v00Var = (v00) obj2;
                v00Var.removeView((c20) obj);
                v00Var.f38803e.clear();
                v00Var.f38800a = null;
                v00Var.f38801b = false;
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                v00 v00Var2 = (v00) obj2;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    v00Var2.removeView((View) arrayList.get(i12));
                }
                v00Var2.f38803e.clear();
                v00Var2.f38800a = null;
                v00Var2.f38801b = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1084a) {
            case 13:
                ((org.telegram.ui.ActionBar.k) this.f1086c).F.setVisibility(0);
                return;
            case 19:
                ((ra) this.f1085b).run();
                return;
            case 20:
                ((ra) this.f1085b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public l(Runnable runnable, Runnable runnable2, int i7) {
        this.f1084a = i7;
        this.f1085b = runnable;
        this.f1086c = runnable2;
    }
}
