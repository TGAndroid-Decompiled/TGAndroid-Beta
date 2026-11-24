package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PhotoViewer;
public final class u5 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;
    public final Object c;

    public u5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                a aVar = (a) obj;
                AnimatorSet animatorSet = aVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    aVar.Q = null;
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                if (animator.equals(actionBarLayout.r0)) {
                    actionBarLayout.i0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.d0.clear();
                    actionBarLayout.k0.clear();
                    actionBarLayout.p0 = 0;
                    actionBarLayout.q0 = null;
                    actionBarLayout.l0 = null;
                    cmb.lm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    qv1 qv1Var = ((sk5) this.b).j;
                    if (qv1Var != null) {
                        qv1Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.h3 = null;
                    return;
                }
                return;
            case 14:
                i22 i22Var = (i22) obj;
                AnimatorSet animatorSet2 = i22Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    i22Var.A0 = null;
                    i22Var.B0 = (byte) 0;
                    return;
                }
                return;
            case 20:
                e34 e34Var = (e34) obj;
                if (animator.equals(e34Var.N0)) {
                    e34Var.N0 = null;
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
        zna znaVar;
        boolean z;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                a aVar = (a) obj2;
                AnimatorSet animatorSet = aVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    aVar.Q = null;
                    lka lkaVar = aVar.n[0];
                    if (lkaVar != null) {
                        lkaVar.setVisibility(4);
                    }
                    if (aVar.r != null && !TextUtils.isEmpty(aVar.B0)) {
                        aVar.r.setVisibility(4);
                    }
                    r6 r6Var = aVar.F;
                    if (r6Var != null) {
                        r6Var.setVisibility(4);
                    }
                    if (aVar.R == null) {
                        return;
                    }
                    while (true) {
                        View[] viewArr = aVar.R;
                        if (i < viewArr.length) {
                            View view = viewArr[i];
                            if (view != null && ((zArr = (boolean[]) obj) == null || i >= zArr.length || zArr[i])) {
                                view.setVisibility(4);
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.s0.e();
                if (animator.equals(actionBarLayout.r0)) {
                    actionBarLayout.i0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.d0.clear();
                    actionBarLayout.k0.clear();
                    actionBarLayout.p0 = 0;
                    actionBarLayout.q0 = null;
                    actionBarLayout.l0 = null;
                    cmb.lm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    qv1 qv1Var = ((sk5) obj).j;
                    if (qv1Var != null) {
                        qv1Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((ActionBarLayout) obj2).n = false;
                ((d) obj).onPreviewOpenAnimationEnd();
                return;
            case 3:
                ArrayList arrayList = ((ng0) obj2).b;
                arrayList.clear();
                arrayList.add((ql1) obj);
                return;
            case 4:
                super.onAnimationEnd(animator);
                ArrayList arrayList2 = ((ng0) obj2).c;
                arrayList2.clear();
                arrayList2.add((ll1) obj);
                return;
            case 5:
                ((yt0) obj2).run();
                return;
            case 6:
                ((h21) obj2).run();
                return;
            case 7:
                cm1 cm1Var = (cm1) obj;
                yv1 yv1Var = (yv1) obj2;
                yv1Var.X9 = 0.0f;
                if (animator == yv1Var.Ob) {
                    ViewGroup viewGroup = (ViewGroup) cm1Var.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(cm1Var);
                    }
                    yv1Var.o3 = null;
                    yv1Var.Ob = null;
                    return;
                }
                return;
            case 8:
                rc2 rc2Var = ((fu1) obj2).b;
                rc2Var.setAlpha(1.0f);
                rc2Var.getTransitionParams().y0 = false;
                pn pnVar = new pn("alpha", (byte) 7);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((wq5) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(rc2Var, pnVar, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new b91(this, (byte) 9));
                animatorSet2.start();
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.Q0;
                if (animator.equals(chatActivityEnterView.h3)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.a1.setVisibility(8);
                    tx1 tx1Var = chatActivityEnterView.T0;
                    if (tx1Var != null) {
                        tx1Var.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.h3 = null;
                    chatActivityEnterView.l3 = (byte) 0;
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView2 = ((ez1) obj2).d;
                m6a m6aVar = chatActivityEnterView2.q0;
                if (m6aVar != null && m6aVar.getTag() == ((ValueAnimator) obj)) {
                    chatActivityEnterView2.q0.setTag(null);
                    return;
                }
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) obj2;
                chatActivityEnterView3.W0 = null;
                chatActivityEnterView3.A4.e();
                ((mw1) obj).run();
                return;
            case 12:
                ((ex1) obj).run();
                ((ChatActivityEnterView) obj2).A4.e();
                return;
            case 13:
                ((ChatActivityEnterView) obj2).r4 = null;
                ((mw1) obj).run();
                return;
            case 14:
                i22 i22Var = (i22) obj2;
                AnimatorSet animatorSet3 = i22Var.A0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (znaVar = i22Var.m4) != null && !znaVar.f) {
                    ((co1) obj).run();
                    return;
                }
                return;
            case 15:
                vd2 vd2Var = (vd2) obj2;
                vd2Var.M = 0.0f;
                vd2Var.L = 1.0f;
                ((vr1) obj).invalidate();
                vd2Var.U.invalidate();
                fo1 fo1Var = vd2Var.Z;
                if (fo1Var != null) {
                    fo1Var.run();
                    vd2Var.Z = null;
                    return;
                }
                return;
            case 16:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.l0 = null;
                return;
            case 17:
                super.onAnimationEnd(animator);
                ((hh3) obj2).c0.k0 = null;
                gm.B2((lka) obj);
                return;
            case 18:
                w93 w93Var = (w93) obj;
                if (w93Var.getParent() != null) {
                    ((ViewGroup) w93Var.getParent()).removeView(w93Var);
                }
                ((nk3) obj2).X3 = null;
                return;
            case 19:
                zv3 zv3Var = ((wv3) obj2).a;
                if (zv3Var.o1.getVisibility() == 0) {
                    zv3Var.o1.setAlpha(1.0f);
                    zv3Var.o1.setVisibility(4);
                }
                ((mvc) obj).run();
                return;
            case 20:
                r59 r59Var = (r59) obj;
                e34 e34Var = (e34) obj2;
                if (animator.equals(e34Var.N0)) {
                    r59Var.setTranslationY(0.0f);
                    if (r59Var == e34Var.E0) {
                        r59Var.setPadding(0, 0, 0, e34Var.q2);
                    } else if (r59Var == e34Var.Q) {
                        r59Var.setPadding(gm.L(5.0f), 0, gm.L(5.0f), e34Var.q2);
                    } else if (r59Var == e34Var.i0) {
                        r59Var.setPadding(0, e34Var.c1, 0, e34Var.q2);
                    }
                    e34Var.N0 = null;
                    return;
                }
                return;
            case 21:
                ((tl4) obj2).f((q78) obj);
                return;
            case 22:
                rq4 rq4Var = (rq4) obj2;
                rq4Var.removeView((wc5) obj);
                rq4Var.e.clear();
                rq4Var.a = null;
                rq4Var.b = false;
                return;
            case 23:
                rq4 rq4Var2 = (rq4) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    rq4Var2.removeView((View) arrayList3.get(i2));
                }
                rq4Var2.e.clear();
                rq4Var2.a = null;
                rq4Var2.b = false;
                return;
            case 24:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setVisibility(4);
                }
                ((tt4) ((cn0) obj2).c).h.setVisibility(8);
                return;
            case 25:
                xt4 xt4Var = (xt4) obj2;
                xt4Var.m1 = null;
                xt4Var.o1 = null;
                ut4 ut4Var = (ut4) obj;
                if (ut4Var != null) {
                    ut4Var.run();
                    return;
                }
                return;
            case 26:
                ds5 ds5Var = (ds5) obj2;
                ds5Var.removeView((wc5) obj);
                ds5Var.d = null;
                ds5Var.a = null;
                ds5Var.b = false;
                return;
            case 27:
                ht5 ht5Var = (ht5) obj2;
                ht5Var.removeView((wc5) obj);
                ht5Var.c = null;
                ht5Var.e.X1 = null;
                ht5Var.a = false;
                return;
            case 28:
                kla klaVar = (kla) obj2;
                klaVar.setVisibility(8);
                klaVar.setX(0.0f);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                x68 x68Var = photoViewer.D1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = x68Var.e;
                if (bitmap != null) {
                    z = true;
                } else {
                    z = false;
                }
                x68Var.f = z;
                imageReceiver.f0(bitmap);
                imageReceiver.o0(0, 0, false);
                AnimatorSet animatorSet4 = x68Var.s;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                }
                AnimatorSet animatorSet5 = x68Var.w;
                if (animatorSet5 != null) {
                    animatorSet5.cancel();
                }
                x68Var.h = true;
                x68Var.n = 1.0f;
                AnimatorSet animatorSet6 = new AnimatorSet();
                x68Var.s = animatorSet6;
                animatorSet6.playTogether(ObjectAnimator.ofFloat(x68Var, x68Var.F, 0.0f, 1.0f));
                x68Var.s.setDuration(250L);
                x68Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                x68Var.s.addListener(new v68(x68Var, (byte) 0));
                x68Var.s.start();
                AnimatorSet animatorSet7 = new AnimatorSet();
                photoViewer.B2 = animatorSet7;
                animatorSet7.playTogether(ObjectAnimator.ofFloat(photoViewer.A2, photoViewer.d4, 0.0f));
                photoViewer.B2.setDuration(85L);
                photoViewer.B2.setInterpolator(d53.g);
                photoViewer.B2.addListener(new s38(this, (byte) 6));
                photoViewer.B2.start();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((a) this.c).G.setVisibility(0);
                return;
            case 5:
                ((j21) obj).run();
                return;
            case 6:
                ((j21) obj).run();
                return;
            case 28:
                ((kla) obj).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public u5(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
