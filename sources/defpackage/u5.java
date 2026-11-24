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
                    bkb.lm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    eu1 eu1Var = ((ti5) this.b).j;
                    if (eu1Var != null) {
                        eu1Var.run();
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
                x02 x02Var = (x02) obj;
                AnimatorSet animatorSet2 = x02Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x02Var.A0 = null;
                    x02Var.B0 = (byte) 0;
                    return;
                }
                return;
            case 20:
                t14 t14Var = (t14) obj;
                if (animator.equals(t14Var.N0)) {
                    t14Var.N0 = null;
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
        yla ylaVar;
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
                    jia jiaVar = aVar.n[0];
                    if (jiaVar != null) {
                        jiaVar.setVisibility(4);
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
                    bkb.lm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    eu1 eu1Var = ((ti5) obj).j;
                    if (eu1Var != null) {
                        eu1Var.run();
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
                ArrayList arrayList = ((nf0) obj2).b;
                arrayList.clear();
                arrayList.add((ik1) obj);
                return;
            case 4:
                super.onAnimationEnd(animator);
                ArrayList arrayList2 = ((nf0) obj2).c;
                arrayList2.clear();
                arrayList2.add((dk1) obj);
                return;
            case 5:
                ((nv0) obj2).run();
                return;
            case 6:
                ((z01) obj2).run();
                return;
            case 7:
                uk1 uk1Var = (uk1) obj;
                mu1 mu1Var = (mu1) obj2;
                mu1Var.X9 = 0.0f;
                if (animator == mu1Var.Gb) {
                    ViewGroup viewGroup = (ViewGroup) uk1Var.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(uk1Var);
                    }
                    mu1Var.o3 = null;
                    mu1Var.Gb = null;
                    return;
                }
                return;
            case 8:
                gb2 gb2Var = ((ts1) obj2).b;
                gb2Var.setAlpha(1.0f);
                gb2Var.getTransitionParams().y0 = false;
                pm pmVar = new pm("alpha", (byte) 7);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((wo5) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(gb2Var, pmVar, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new bb1(this, (byte) 7));
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
                    gw1 gw1Var = chatActivityEnterView.T0;
                    if (gw1Var != null) {
                        gw1Var.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.h3 = null;
                    chatActivityEnterView.l3 = (byte) 0;
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView2 = ((rx1) obj2).d;
                k4a k4aVar = chatActivityEnterView2.q0;
                if (k4aVar != null && k4aVar.getTag() == ((ValueAnimator) obj)) {
                    chatActivityEnterView2.q0.setTag(null);
                    return;
                }
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) obj2;
                chatActivityEnterView3.W0 = null;
                chatActivityEnterView3.A4.e();
                ((av1) obj).run();
                return;
            case 12:
                ((sv1) obj).run();
                ((ChatActivityEnterView) obj2).A4.e();
                return;
            case 13:
                ((ChatActivityEnterView) obj2).r4 = null;
                ((av1) obj).run();
                return;
            case 14:
                x02 x02Var = (x02) obj2;
                AnimatorSet animatorSet3 = x02Var.A0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (ylaVar = x02Var.m4) != null && !ylaVar.f) {
                    ((jn1) obj).run();
                    return;
                }
                return;
            case 15:
                kc2 kc2Var = (kc2) obj2;
                kc2Var.M = 0.0f;
                kc2Var.L = 1.0f;
                ((jq1) obj).invalidate();
                kc2Var.U.invalidate();
                hq1 hq1Var = kc2Var.Z;
                if (hq1Var != null) {
                    hq1Var.run();
                    kc2Var.Z = null;
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
                ((uf3) obj2).c0.k0 = null;
                gl.B2((jia) obj);
                return;
            case 18:
                k83 k83Var = (k83) obj;
                if (k83Var.getParent() != null) {
                    ((ViewGroup) k83Var.getParent()).removeView(k83Var);
                }
                ((cj3) obj2).V3 = null;
                return;
            case 19:
                ou3 ou3Var = ((lu3) obj2).a;
                if (ou3Var.o1.getVisibility() == 0) {
                    ou3Var.o1.setAlpha(1.0f);
                    ou3Var.o1.setVisibility(4);
                }
                ((ltc) obj).run();
                return;
            case 20:
                o39 o39Var = (o39) obj;
                t14 t14Var = (t14) obj2;
                if (animator.equals(t14Var.N0)) {
                    o39Var.setTranslationY(0.0f);
                    if (o39Var == t14Var.E0) {
                        o39Var.setPadding(0, 0, 0, t14Var.q2);
                    } else if (o39Var == t14Var.Q) {
                        o39Var.setPadding(gl.L(5.0f), 0, gl.L(5.0f), t14Var.q2);
                    } else if (o39Var == t14Var.i0) {
                        o39Var.setPadding(0, t14Var.c1, 0, t14Var.q2);
                    }
                    t14Var.N0 = null;
                    return;
                }
                return;
            case 21:
                ((sj4) obj2).f((w88) obj);
                return;
            case 22:
                qo4 qo4Var = (qo4) obj2;
                qo4Var.removeView((ya5) obj);
                qo4Var.e.clear();
                qo4Var.a = null;
                qo4Var.b = false;
                return;
            case 23:
                qo4 qo4Var2 = (qo4) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    qo4Var2.removeView((View) arrayList3.get(i2));
                }
                qo4Var2.e.clear();
                qo4Var2.a = null;
                qo4Var2.b = false;
                return;
            case 24:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setVisibility(4);
                }
                ((sr4) ((cm0) obj2).c).h.setVisibility(8);
                return;
            case 25:
                wr4 wr4Var = (wr4) obj2;
                wr4Var.m1 = null;
                wr4Var.o1 = null;
                tr4 tr4Var = (tr4) obj;
                if (tr4Var != null) {
                    tr4Var.run();
                    return;
                }
                return;
            case 26:
                fq5 fq5Var = (fq5) obj2;
                fq5Var.removeView((ya5) obj);
                fq5Var.d = null;
                fq5Var.a = null;
                fq5Var.b = false;
                return;
            case 27:
                ir5 ir5Var = (ir5) obj2;
                ir5Var.removeView((ya5) obj);
                ir5Var.c = null;
                ir5Var.e.X1 = null;
                ir5Var.a = false;
                return;
            case 28:
                jja jjaVar = (jja) obj2;
                jjaVar.setVisibility(8);
                jjaVar.setX(0.0f);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                v48 v48Var = photoViewer.D1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = v48Var.e;
                if (bitmap != null) {
                    z = true;
                } else {
                    z = false;
                }
                v48Var.f = z;
                imageReceiver.f0(bitmap);
                imageReceiver.o0(0, 0, false);
                AnimatorSet animatorSet4 = v48Var.s;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                }
                AnimatorSet animatorSet5 = v48Var.w;
                if (animatorSet5 != null) {
                    animatorSet5.cancel();
                }
                v48Var.h = true;
                v48Var.n = 1.0f;
                AnimatorSet animatorSet6 = new AnimatorSet();
                v48Var.s = animatorSet6;
                animatorSet6.playTogether(ObjectAnimator.ofFloat(v48Var, v48Var.F, 0.0f, 1.0f));
                v48Var.s.setDuration(250L);
                v48Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                v48Var.s.addListener(new t48(v48Var, (byte) 0));
                v48Var.s.start();
                AnimatorSet animatorSet7 = new AnimatorSet();
                photoViewer.B2 = animatorSet7;
                animatorSet7.playTogether(ObjectAnimator.ofFloat(photoViewer.A2, photoViewer.d4, 0.0f));
                photoViewer.B2.setDuration(85L);
                photoViewer.B2.setInterpolator(s33.g);
                photoViewer.B2.addListener(new l48(this, (byte) 4));
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
                ((b11) obj).run();
                return;
            case 6:
                ((b11) obj).run();
                return;
            case 28:
                ((jja) obj).setVisibility(0);
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
