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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PhotoViewer;
public final class v5 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;
    public final Object c;

    public v5(Object obj, Object obj2, byte b) {
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
                    aob.mm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    ru1 ru1Var = ((vk5) this.b).j;
                    if (ru1Var != null) {
                        ru1Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (animator.equals(chatActivityEnterView.g3)) {
                    chatActivityEnterView.g3 = null;
                    return;
                }
                return;
            case 14:
                n12 n12Var = (n12) obj;
                AnimatorSet animatorSet2 = n12Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    n12Var.A0 = null;
                    n12Var.B0 = (byte) 0;
                    return;
                }
                return;
            case 20:
                o24 o24Var = (o24) obj;
                if (animator.equals(o24Var.N0)) {
                    o24Var.N0 = null;
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
        vpa vpaVar;
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
                    ema emaVar = aVar.n[0];
                    if (emaVar != null) {
                        emaVar.setVisibility(4);
                    }
                    if (aVar.r != null && !TextUtils.isEmpty(aVar.B0)) {
                        aVar.r.setVisibility(4);
                    }
                    s6 s6Var = aVar.F;
                    if (s6Var != null) {
                        s6Var.setVisibility(4);
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
                    aob.mm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    ru1 ru1Var = ((vk5) obj).j;
                    if (ru1Var != null) {
                        ru1Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((ActionBarLayout) obj2).n = false;
                ((e) obj).onPreviewOpenAnimationEnd();
                return;
            case 3:
                ArrayList arrayList = ((pf0) obj2).b;
                arrayList.clear();
                arrayList.add((rk1) obj);
                return;
            case 4:
                super.onAnimationEnd(animator);
                ArrayList arrayList2 = ((pf0) obj2).c;
                arrayList2.clear();
                arrayList2.add((mk1) obj);
                return;
            case 5:
                ((fv0) obj2).run();
                return;
            case 6:
                ((k11) obj2).run();
                return;
            case 7:
                dl1 dl1Var = (dl1) obj;
                zu1 zu1Var = (zu1) obj2;
                zu1Var.X9 = 0.0f;
                if (animator == zu1Var.Rb) {
                    ViewGroup viewGroup = (ViewGroup) dl1Var.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(dl1Var);
                    }
                    zu1Var.o3 = null;
                    zu1Var.Rb = null;
                    return;
                }
                return;
            case 8:
                wb2 wb2Var = ((gt1) obj2).b;
                wb2Var.setAlpha(1.0f);
                wb2Var.getTransitionParams().y0 = false;
                qm qmVar = new qm("alpha", (byte) 7);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((zq5) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(wb2Var, qmVar, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new jb1(this, (byte) 7));
                animatorSet2.start();
                return;
            case 9:
                ((ChatActivityEnterView) obj2).q4 = null;
                ((mv1) obj).run();
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.Q0;
                if (animator.equals(chatActivityEnterView.g3)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.a1.setVisibility(8);
                    vw1 vw1Var = chatActivityEnterView.T0;
                    if (vw1Var != null) {
                        vw1Var.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.g3 = null;
                    chatActivityEnterView.k3 = (byte) 0;
                    return;
                }
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = ((hy1) obj2).d;
                c8a c8aVar = chatActivityEnterView2.q0;
                if (c8aVar != null && c8aVar.getTag() == ((ValueAnimator) obj)) {
                    chatActivityEnterView2.q0.setTag(null);
                    return;
                }
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) obj2;
                chatActivityEnterView3.W0 = null;
                chatActivityEnterView3.z4.e();
                ((fw1) obj).run();
                return;
            case 13:
                ((gw1) obj).run();
                ((ChatActivityEnterView) obj2).z4.e();
                return;
            case 14:
                n12 n12Var = (n12) obj2;
                AnimatorSet animatorSet3 = n12Var.A0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (vpaVar = n12Var.m4) != null && !vpaVar.f) {
                    ((on1) obj).run();
                    return;
                }
                return;
            case 15:
                ad2 ad2Var = (ad2) obj2;
                ad2Var.M = 0.0f;
                ad2Var.L = 1.0f;
                ((wq1) obj).invalidate();
                ad2Var.U.invalidate();
                go1 go1Var = ad2Var.Z;
                if (go1Var != null) {
                    go1Var.run();
                    ad2Var.Z = null;
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
                ((og3) obj2).c0.k0 = null;
                hl.B2((ema) obj);
                return;
            case 18:
                d93 d93Var = (d93) obj;
                if (d93Var.getParent() != null) {
                    ((ViewGroup) d93Var.getParent()).removeView(d93Var);
                }
                ((uj3) obj2).X3 = null;
                return;
            case 19:
                iv3 iv3Var = ((fv3) obj2).a;
                if (iv3Var.o1.getVisibility() == 0) {
                    iv3Var.o1.setAlpha(1.0f);
                    iv3Var.o1.setVisibility(4);
                }
                ((ayc) obj).run();
                return;
            case 20:
                d79 d79Var = (d79) obj;
                o24 o24Var = (o24) obj2;
                if (animator.equals(o24Var.N0)) {
                    d79Var.setTranslationY(0.0f);
                    if (d79Var == o24Var.E0) {
                        d79Var.setPadding(0, 0, 0, o24Var.q2);
                    } else if (d79Var == o24Var.Q) {
                        d79Var.setPadding(hl.L(5.0f), 0, hl.L(5.0f), o24Var.q2);
                    } else if (d79Var == o24Var.i0) {
                        d79Var.setPadding(0, o24Var.c1, 0, o24Var.q2);
                    }
                    o24Var.N0 = null;
                    return;
                }
                return;
            case 21:
                ((xl4) obj2).f((x38) obj);
                return;
            case 22:
                uq4 uq4Var = (uq4) obj2;
                uq4Var.removeView((zc5) obj);
                uq4Var.e.clear();
                uq4Var.a = null;
                uq4Var.b = false;
                return;
            case 23:
                uq4 uq4Var2 = (uq4) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    uq4Var2.removeView((View) arrayList3.get(i2));
                }
                uq4Var2.e.clear();
                uq4Var2.a = null;
                uq4Var2.b = false;
                return;
            case 24:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setVisibility(4);
                }
                ((wt4) ((cm0) obj2).c).h.setVisibility(8);
                return;
            case 25:
                au4 au4Var = (au4) obj2;
                au4Var.m1 = null;
                au4Var.o1 = null;
                xt4 xt4Var = (xt4) obj;
                if (xt4Var != null) {
                    xt4Var.run();
                    return;
                }
                return;
            case 26:
                gs5 gs5Var = (gs5) obj2;
                gs5Var.removeView((zc5) obj);
                gs5Var.d = null;
                gs5Var.a = null;
                gs5Var.b = false;
                return;
            case 27:
                kt5 kt5Var = (kt5) obj2;
                kt5Var.removeView((zc5) obj);
                kt5Var.c = null;
                kt5Var.e.X1 = null;
                kt5Var.a = false;
                return;
            case 28:
                cna cnaVar = (cna) obj2;
                cnaVar.setVisibility(8);
                cnaVar.setX(0.0f);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                k88 k88Var = photoViewer.D1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = k88Var.e;
                if (bitmap != null) {
                    z = true;
                } else {
                    z = false;
                }
                k88Var.f = z;
                imageReceiver.f0(bitmap);
                imageReceiver.o0(0, 0, false);
                AnimatorSet animatorSet4 = k88Var.s;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                }
                AnimatorSet animatorSet5 = k88Var.w;
                if (animatorSet5 != null) {
                    animatorSet5.cancel();
                }
                k88Var.h = true;
                k88Var.n = 1.0f;
                AnimatorSet animatorSet6 = new AnimatorSet();
                k88Var.s = animatorSet6;
                animatorSet6.playTogether(ObjectAnimator.ofFloat(k88Var, k88Var.F, 0.0f, 1.0f));
                k88Var.s.setDuration(250L);
                k88Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                k88Var.s.addListener(new i88(k88Var, (byte) 0));
                k88Var.s.start();
                AnimatorSet animatorSet7 = new AnimatorSet();
                photoViewer.B2 = animatorSet7;
                animatorSet7.playTogether(ObjectAnimator.ofFloat(photoViewer.A2, photoViewer.d4, 0.0f));
                photoViewer.B2.setDuration(85L);
                photoViewer.B2.setInterpolator(k43.g);
                photoViewer.B2.addListener(new n88(this, (byte) 3));
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
                ((j11) obj).run();
                return;
            case 6:
                ((j11) obj).run();
                return;
            case 28:
                ((cna) obj).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public v5(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
