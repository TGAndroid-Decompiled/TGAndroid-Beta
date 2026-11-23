package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import di.nc;
import di.oc;
import hi.b8;
import hi.d3;
import hi.h3;
import hi.n8;
import hi.s2;
import oi.a2;
import org.telegram.messenger.av;
import org.telegram.messenger.cz;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.ie;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.yf;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bh;
import org.telegram.ui.bn;
import org.telegram.ui.ii;
import org.telegram.ui.il;
import org.telegram.ui.q0;
import org.telegram.ui.um;
import org.telegram.ui.xo;
import tg.t1;
public final class l extends AnimatorListenerAdapter {
    public final int f1081a;
    public final Object f1082b;
    public final Object f1083c;

    public l(int i7, Object obj, Object obj2) {
        this.f1081a = i7;
        this.f1083c = obj;
        this.f1082b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1081a) {
            case 13:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f1083c;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    return;
                }
                return;
            case 14:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f1083c;
                if (animator.equals(actionBarLayout.f28714r0)) {
                    actionBarLayout.f28697i0.clear();
                    actionBarLayout.f28683c0.clear();
                    actionBarLayout.f28685d0.clear();
                    actionBarLayout.f28701k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    m6.mm = null;
                    actionBarLayout.f28699j0 = null;
                    actionBarLayout.f28695h0 = null;
                    actionBarLayout.f28714r0 = null;
                    um umVar = ((q4) this.f1082b).f29913j;
                    if (umVar != null) {
                        umVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1083c;
                if (animator.equals(chatActivityEnterView.f32599h3)) {
                    chatActivityEnterView.f32599h3 = null;
                    return;
                }
                return;
            case 26:
                ui uiVar = (ui) this.f1083c;
                AnimatorSet animatorSet2 = uiVar.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    uiVar.A0 = null;
                    uiVar.B0 = 0;
                    return;
                }
                return;
            case 28:
                ty tyVar = (ty) this.f1083c;
                if (animator.equals(tyVar.N0)) {
                    tyVar.N0 = null;
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
        int i7 = this.f1081a;
        int i10 = 0;
        Object obj = this.f1082b;
        Object obj2 = this.f1083c;
        switch (i7) {
            case 0:
                n nVar = (n) obj2;
                nVar.removeView((p20) obj);
                nVar.h.clear();
                nVar.f1088b = null;
                nVar.f1089c = false;
                ((o) nVar.f1092n).f1094b.setAllowDrawCursor(true);
                return;
            case 1:
                oc ocVar = (oc) obj2;
                ocVar.f9469b.remove((nc) obj);
                ocVar.f1();
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((fi.p) obj2).f12352c0.f12419k0 = null;
                g0.E2((View) obj);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i11 = ProfileStoriesView.f43807t0;
                    if (cz.o() > 0) {
                        g0.a4(profileStoriesView);
                        g0.h3(new f2.a(profileStoriesView, 8), 180L);
                    }
                }
                profileStoriesView.f43809a0 = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 4:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((d3) ((s2) obj2).f15323c).h.setVisibility(8);
                return;
            case 5:
                h3 h3Var = (h3) obj2;
                h3Var.n1 = null;
                h3Var.f14677p1 = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                hi.p pVar = (hi.p) obj2;
                ((t1) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 7:
                n nVar2 = (n) obj2;
                nVar2.removeView((p20) obj);
                nVar2.h.clear();
                nVar2.f1088b = null;
                nVar2.f1089c = false;
                n8 n8Var = (n8) nVar2.f1092n;
                n8Var.f15079b.setAllowDrawCursor(true);
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
                gVar2.f19782b.clear();
                gVar2.f19782b.add((ng.d) obj);
                return;
            case 9:
                super.onAnimationEnd(animator);
                lg.g gVar3 = (lg.g) obj2;
                gVar3.f19785c.clear();
                gVar3.f19785c.add((ng.b) obj);
                return;
            case 10:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f32891l0 = null;
                return;
            case 11:
                a2 a2Var = (a2) obj2;
                a2Var.F = false;
                a2Var.f21954w.setAlpha(1.0f);
                a2Var.f21954w.f32664q2.setVisibility(0);
                a2Var.f21958y.r(g0.L(22.0f));
                a2Var.f21958y.setAlpha(255);
                jh.f fVar = a2Var.f21949s;
                fVar.f17770e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 12:
                av avVar = (av) obj2;
                avVar.f22944b = true;
                avVar.f22947f = null;
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
                    m5 m5Var = kVar.f29114n[0];
                    if (m5Var != null) {
                        m5Var.setVisibility(4);
                    }
                    if (kVar.f29122r != null && !TextUtils.isEmpty(kVar.B0)) {
                        kVar.f29122r.setVisibility(4);
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
                actionBarLayout.f28717s0.e();
                if (animator.equals(actionBarLayout.f28714r0)) {
                    actionBarLayout.f28697i0.clear();
                    actionBarLayout.f28683c0.clear();
                    actionBarLayout.f28685d0.clear();
                    actionBarLayout.f28701k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    m6.mm = null;
                    actionBarLayout.f28699j0 = null;
                    actionBarLayout.f28695h0 = null;
                    actionBarLayout.f28714r0 = null;
                    um umVar = ((q4) obj).f29913j;
                    if (umVar != null) {
                        umVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((ActionBarLayout) obj2).f28705n = false;
                ((g2) obj).onPreviewOpenAnimationEnd();
                return;
            case 16:
                View view4 = (View) obj;
                bn bnVar = (bn) obj2;
                bnVar.X9 = 0.0f;
                if (animator == bnVar.Gb) {
                    ViewGroup viewGroup = (ViewGroup) view4.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view4);
                    }
                    bnVar.f46090o3 = null;
                    bnVar.Gb = null;
                    return;
                }
                return;
            case 17:
                r1 r1Var = ((il) obj2).f48756b;
                r1Var.setAlpha(1.0f);
                r1Var.getTransitionParams().f32443y0 = false;
                q0 q0Var = new q0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((e50) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(r1Var, q0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new y9(this, 7));
                animatorSet2.start();
                return;
            case 18:
                xo xoVar = (xo) obj2;
                xoVar.M = 0.0f;
                xoVar.L = 1.0f;
                ((View) obj).invalidate();
                xoVar.U.invalidate();
                bh bhVar = xoVar.Z;
                if (bhVar != null) {
                    bhVar.run();
                    xoVar.Z = null;
                    return;
                }
                return;
            case 19:
                ((ng) obj2).run();
                return;
            case 20:
                ((ua) obj2).run();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).f32675r4 = null;
                ((dd) obj).run();
                return;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.Q0;
                if (animator.equals(chatActivityEnterView.f32599h3)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.f32538a1.setVisibility(8);
                    ie ieVar = chatActivityEnterView.T0;
                    if (ieVar != null) {
                        ieVar.setVisibility(8);
                    }
                    ChatActivityEnterView.i(chatActivityEnterView);
                    chatActivityEnterView.f32599h3 = null;
                    chatActivityEnterView.f32627l3 = 0;
                    return;
                }
                return;
            case 23:
                yf yfVar = (yf) obj2;
                rn0 rn0Var = yfVar.d.f32662q0;
                if (rn0Var != null && rn0Var.getTag() == ((ValueAnimator) obj)) {
                    yfVar.d.f32662q0.setTag(null);
                    return;
                }
                return;
            case 24:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.B4.e();
                ((dd) obj).run();
                return;
            case 25:
                ((ii) obj).run();
                ((ChatActivityEnterView) obj2).B4.e();
                return;
            case 26:
                ui uiVar = (ui) obj2;
                AnimatorSet animatorSet3 = uiVar.A0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (gVar = uiVar.f40392n4) != null && !gVar.f56327f) {
                    ((org.telegram.ui.Components.g) obj).run();
                    return;
                }
                return;
            case 27:
                fu fuVar = (fu) obj2;
                if (fuVar.f35272a.f36272p1.getVisibility() == 0) {
                    fuVar.f35272a.f36272p1.setAlpha(1.0f);
                    fuVar.f35272a.f36272p1.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 28:
                ek0 ek0Var = (ek0) obj;
                ty tyVar = (ty) obj2;
                if (animator.equals(tyVar.N0)) {
                    ek0Var.setTranslationY(0.0f);
                    if (ek0Var == tyVar.E0) {
                        ek0Var.setPadding(0, 0, 0, tyVar.f40117r2);
                    } else if (ek0Var == tyVar.Q) {
                        ek0Var.setPadding(g0.L(5.0f), 0, g0.L(5.0f), tyVar.f40117r2);
                    } else if (ek0Var == tyVar.f40089i0) {
                        ek0Var.setPadding(0, tyVar.f40071c1, 0, tyVar.f40117r2);
                    }
                    tyVar.N0 = null;
                    return;
                }
                return;
            default:
                i10 i10Var = (i10) obj2;
                i10Var.removeView((p20) obj);
                i10Var.f36063e.clear();
                i10Var.f36060a = null;
                i10Var.f36061b = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1081a) {
            case 13:
                ((org.telegram.ui.ActionBar.k) this.f1083c).G.setVisibility(0);
                return;
            case 19:
                ((wa) this.f1082b).run();
                return;
            case 20:
                ((wa) this.f1082b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public l(Runnable runnable, Runnable runnable2, int i7) {
        this.f1081a = i7;
        this.f1082b = runnable;
        this.f1083c = runnable2;
    }
}
