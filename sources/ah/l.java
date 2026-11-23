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
import hi.b3;
import hi.h9;
import hi.m3;
import hi.q3;
import hi.v8;
import oi.b2;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.zu;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.je;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qn0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.yf;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bn;
import org.telegram.ui.ch;
import org.telegram.ui.ii;
import org.telegram.ui.il;
import org.telegram.ui.q0;
import org.telegram.ui.um;
import org.telegram.ui.xo;
import tg.w1;
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
                if (animator.equals(actionBarLayout.f28806r0)) {
                    actionBarLayout.f28789i0.clear();
                    actionBarLayout.f28775c0.clear();
                    actionBarLayout.f28777d0.clear();
                    actionBarLayout.f28793k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    n6.mm = null;
                    actionBarLayout.f28791j0 = null;
                    actionBarLayout.f28787h0 = null;
                    actionBarLayout.f28806r0 = null;
                    um umVar = ((q4) this.f1082b).f30004j;
                    if (umVar != null) {
                        umVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1083c;
                if (animator.equals(chatActivityEnterView.f32697h3)) {
                    chatActivityEnterView.f32697h3 = null;
                    return;
                }
                return;
            case 26:
                ti tiVar = (ti) this.f1083c;
                AnimatorSet animatorSet2 = tiVar.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    tiVar.A0 = null;
                    tiVar.B0 = 0;
                    return;
                }
                return;
            case 28:
                qy qyVar = (qy) this.f1083c;
                if (animator.equals(qyVar.N0)) {
                    qyVar.N0 = null;
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
                nVar.removeView((n20) obj);
                nVar.h.clear();
                nVar.f1088b = null;
                nVar.f1089c = false;
                ((o) nVar.f1092n).f1094b.setAllowDrawCursor(true);
                return;
            case 1:
                oc ocVar = (oc) obj2;
                ocVar.f9464b.remove((nc) obj);
                ocVar.f1();
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((fi.p) obj2).f12364c0.f12429k0 = null;
                g0.E2((View) obj);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i11 = ProfileStoriesView.f43923t0;
                    if (bz.o() > 0) {
                        g0.a4(profileStoriesView);
                        g0.h3(new f2.a(profileStoriesView, 8), 180L);
                    }
                }
                profileStoriesView.f43925a0 = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 4:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((m3) ((b3) obj2).f14223c).h.setVisibility(8);
                return;
            case 5:
                q3 q3Var = (q3) obj2;
                q3Var.n1 = null;
                q3Var.f15217p1 = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                hi.q qVar = (hi.q) obj2;
                ((w1) obj).setDraw(true);
                if (qVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qVar.getParent()).removeView(qVar);
                    return;
                }
                return;
            case 7:
                n nVar2 = (n) obj2;
                nVar2.removeView((n20) obj);
                nVar2.h.clear();
                nVar2.f1088b = null;
                nVar2.f1089c = false;
                h9 h9Var = (h9) nVar2.f1092n;
                h9Var.f14597b.setAllowDrawCursor(true);
                v8 v8Var = h9Var.h;
                if (v8Var != null) {
                    v8Var.run();
                }
                if (h9Var.M) {
                    h9Var.fullScroll(130);
                    h9Var.M = false;
                    return;
                }
                return;
            case 8:
                lg.g gVar2 = (lg.g) obj2;
                gVar2.f19882b.clear();
                gVar2.f19882b.add((ng.d) obj);
                return;
            case 9:
                super.onAnimationEnd(animator);
                lg.g gVar3 = (lg.g) obj2;
                gVar3.f19885c.clear();
                gVar3.f19885c.add((ng.b) obj);
                return;
            case 10:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f32989l0 = null;
                return;
            case 11:
                b2 b2Var = (b2) obj2;
                b2Var.F = false;
                b2Var.f22083w.setAlpha(1.0f);
                b2Var.f22083w.f32762q2.setVisibility(0);
                b2Var.f22087y.r(g0.L(22.0f));
                b2Var.f22087y.setAlpha(255);
                jh.f fVar = b2Var.f22078s;
                fVar.f17872e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 12:
                zu zuVar = (zu) obj2;
                zuVar.f28453b = true;
                zuVar.f28456f = null;
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
                    n5 n5Var = kVar.f29164n[0];
                    if (n5Var != null) {
                        n5Var.setVisibility(4);
                    }
                    if (kVar.f29172r != null && !TextUtils.isEmpty(kVar.B0)) {
                        kVar.f29172r.setVisibility(4);
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
                actionBarLayout.f28809s0.e();
                if (animator.equals(actionBarLayout.f28806r0)) {
                    actionBarLayout.f28789i0.clear();
                    actionBarLayout.f28775c0.clear();
                    actionBarLayout.f28777d0.clear();
                    actionBarLayout.f28793k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    n6.mm = null;
                    actionBarLayout.f28791j0 = null;
                    actionBarLayout.f28787h0 = null;
                    actionBarLayout.f28806r0 = null;
                    um umVar = ((q4) obj).f30004j;
                    if (umVar != null) {
                        umVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((ActionBarLayout) obj2).f28797n = false;
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
                    bnVar.f46305o3 = null;
                    bnVar.Gb = null;
                    return;
                }
                return;
            case 17:
                r1 r1Var = ((il) obj2).f48842b;
                r1Var.setAlpha(1.0f);
                r1Var.getTransitionParams().f32544y0 = false;
                q0 q0Var = new q0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((b50) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(r1Var, q0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new x9(this, 7));
                animatorSet2.start();
                return;
            case 18:
                xo xoVar = (xo) obj2;
                xoVar.M = 0.0f;
                xoVar.L = 1.0f;
                ((View) obj).invalidate();
                xoVar.U.invalidate();
                ch chVar = xoVar.Z;
                if (chVar != null) {
                    chVar.run();
                    xoVar.Z = null;
                    return;
                }
                return;
            case 19:
                ((ng) obj2).run();
                return;
            case 20:
                ((ta) obj2).run();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).f32773r4 = null;
                ((dd) obj).run();
                return;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.Q0;
                if (animator.equals(chatActivityEnterView.f32697h3)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.f32636a1.setVisibility(8);
                    je jeVar = chatActivityEnterView.T0;
                    if (jeVar != null) {
                        jeVar.setVisibility(8);
                    }
                    ChatActivityEnterView.i(chatActivityEnterView);
                    chatActivityEnterView.f32697h3 = null;
                    chatActivityEnterView.f32725l3 = 0;
                    return;
                }
                return;
            case 23:
                yf yfVar = (yf) obj2;
                qn0 qn0Var = yfVar.d.f32760q0;
                if (qn0Var != null && qn0Var.getTag() == ((ValueAnimator) obj)) {
                    yfVar.d.f32760q0.setTag(null);
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
                ti tiVar = (ti) obj2;
                AnimatorSet animatorSet3 = tiVar.A0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (gVar = tiVar.f39996n4) != null && !gVar.f56440f) {
                    ((fa) obj).run();
                    return;
                }
                return;
            case 27:
                du duVar = (du) obj2;
                if (duVar.f34454a.f35538p1.getVisibility() == 0) {
                    duVar.f34454a.f35538p1.setAlpha(1.0f);
                    duVar.f34454a.f35538p1.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 28:
                ek0 ek0Var = (ek0) obj;
                qy qyVar = (qy) obj2;
                if (animator.equals(qyVar.N0)) {
                    ek0Var.setTranslationY(0.0f);
                    if (ek0Var == qyVar.E0) {
                        ek0Var.setPadding(0, 0, 0, qyVar.f39090r2);
                    } else if (ek0Var == qyVar.Q) {
                        ek0Var.setPadding(g0.L(5.0f), 0, g0.L(5.0f), qyVar.f39090r2);
                    } else if (ek0Var == qyVar.f39062i0) {
                        ek0Var.setPadding(0, qyVar.f39044c1, 0, qyVar.f39090r2);
                    }
                    qyVar.N0 = null;
                    return;
                }
                return;
            default:
                g10 g10Var = (g10) obj2;
                g10Var.removeView((n20) obj);
                g10Var.f35274e.clear();
                g10Var.f35271a = null;
                g10Var.f35272b = false;
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
                ((va) this.f1082b).run();
                return;
            case 20:
                ((va) this.f1082b).run();
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
