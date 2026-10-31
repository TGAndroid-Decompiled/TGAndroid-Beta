package bg;

import ag.d3;
import ag.p2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import bi.k2;
import java.util.ArrayList;
import jg.h2;
import kg.i1;
import kg.v0;
import kg.v1;
import org.telegram.messenger.i0;
import org.telegram.messenger.qv;
import org.telegram.messenger.v2;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.dm;
import org.telegram.ui.nn;
import org.telegram.ui.rh;
import org.telegram.ui.s0;
import org.telegram.ui.s9;
import org.telegram.ui.tp;
import org.telegram.ui.un;
import org.telegram.ui.uq;
import s4.a0;
import s4.n0;
import w7.d6;
public final class f extends AnimatorListenerAdapter {
    public final int f2681a;
    public final Object f2682b;
    public final Object f2683c;

    public f(int i10, Object obj, Object obj2) {
        this.f2681a = i10;
        this.f2682b = obj;
        this.f2683c = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f2681a) {
            case 8:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) this.f2682b;
                AnimatorSet animatorSet = lVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.P = null;
                    return;
                }
                return;
            case 9:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f2682b;
                if (animator.equals(actionBarLayout.f20104q0)) {
                    actionBarLayout.f20087h0.clear();
                    actionBarLayout.f20073b0.clear();
                    actionBarLayout.f20076c0.clear();
                    actionBarLayout.f20091j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    t6.jm = null;
                    actionBarLayout.f20089i0 = null;
                    actionBarLayout.f20085g0 = null;
                    actionBarLayout.f20104q0 = null;
                    nn nnVar = ((y4) this.f2683c).f21569j;
                    if (nnVar != null) {
                        nnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f2682b;
                if (animator.equals(chatActivityEnterView.f23778r2)) {
                    chatActivityEnterView.f23778r2 = null;
                    return;
                }
                return;
            case 20:
                bi biVar = (bi) this.f2682b;
                AnimatorSet animatorSet2 = biVar.f21624z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    biVar.f21624z0 = null;
                    biVar.A0 = 0;
                    return;
                }
                return;
            case 22:
                vy vyVar = (vy) this.f2682b;
                if (animator.equals(vyVar.M0)) {
                    vyVar.M0 = null;
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
        o1.j jVar;
        int i10 = this.f2681a;
        int i11 = 0;
        Object obj = this.f2683c;
        Object obj2 = this.f2682b;
        switch (i10) {
            case 0:
                i iVar = (i) obj2;
                iVar.f2707b.clear();
                iVar.f2707b.add((dg.e) obj);
                return;
            case 1:
                super.onAnimationEnd(animator);
                i iVar2 = (i) obj2;
                iVar2.f2710c.clear();
                iVar2.f2710c.add((dg.b) obj);
                return;
            case 2:
                k2 k2Var = (k2) obj2;
                k2Var.E = false;
                k2Var.f3162w.setAlpha(1.0f);
                k2Var.f3162w.A1.setVisibility(0);
                k2Var.f3166y.q(i0.L(22.0f));
                k2Var.f3166y.setAlpha(255);
                zg.e eVar = k2Var.f3157s;
                eVar.e = true;
                eVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 3:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f23965k0 = null;
                return;
            case 4:
                h2 h2Var = (h2) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    h2Var.f9997r0.b(h2Var.f10004y0, false);
                }
                h2Var.setRotationY(0.0f);
                h2Var.f10005z0 = 1.0f;
                return;
            case 5:
                ((i1) obj2).f11119s1 = false;
                ((v0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 6:
                v1 v1Var = (v1) obj2;
                v1Var.f11317z2 = false;
                v1Var.f11316y2 = 1.0f;
                v1Var.f11302k2.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new p2(8, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                qv qvVar = (qv) obj2;
                qvVar.f17632b = true;
                qvVar.f17634f = null;
                View view = (View) obj;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj2;
                AnimatorSet animatorSet = lVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.P = null;
                    u5 u5Var = lVar.f20496n[0];
                    if (u5Var != null) {
                        u5Var.setVisibility(4);
                    }
                    if (lVar.f20505r != null && !TextUtils.isEmpty(lVar.A0)) {
                        lVar.f20505r.setVisibility(4);
                    }
                    y yVar = lVar.E;
                    if (yVar != null) {
                        yVar.setVisibility(4);
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
            case 9:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.f20107r0.e();
                if (animator.equals(actionBarLayout.f20104q0)) {
                    actionBarLayout.f20087h0.clear();
                    actionBarLayout.f20073b0.clear();
                    actionBarLayout.f20076c0.clear();
                    actionBarLayout.f20091j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    t6.jm = null;
                    actionBarLayout.f20089i0 = null;
                    actionBarLayout.f20085g0 = null;
                    actionBarLayout.f20104q0 = null;
                    nn nnVar = ((y4) obj).f21569j;
                    if (nnVar != null) {
                        nnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((ActionBarLayout) obj2).f20097n = false;
                ((org.telegram.ui.ActionBar.k2) obj).onPreviewOpenAnimationEnd();
                return;
            case 11:
                View view3 = (View) obj;
                un unVar = (un) obj2;
                unVar.T9 = 0.0f;
                if (animator == unVar.Bb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    unVar.f42344n3 = null;
                    unVar.Bb = null;
                    return;
                }
                return;
            case 12:
                q1 q1Var = ((dm) obj2).f36799b;
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f23558y0 = false;
                s0 s0Var = new s0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((g50) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(q1Var, s0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new s9(this, 18));
                animatorSet2.start();
                return;
            case 13:
                tp tpVar = (tp) obj2;
                tpVar.L = 0.0f;
                tpVar.K = 1.0f;
                ((View) obj).invalidate();
                tpVar.T.invalidate();
                rh rhVar = tpVar.Y;
                if (rhVar != null) {
                    rhVar.run();
                    tpVar.Y = null;
                    return;
                }
                return;
            case 14:
                ((tf) obj2).run();
                return;
            case 15:
                ((ja) obj2).run();
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f23778r2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.Z0.setVisibility(8);
                    fe feVar = chatActivityEnterView.S0;
                    if (feVar != null) {
                        feVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f23778r2 = null;
                    chatActivityEnterView.f23800v2 = 0;
                    return;
                }
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.e();
                ((tc) obj).run();
                return;
            case 18:
                ((d3) obj).run();
                ((ChatActivityEnterView) obj2).L3.e();
                return;
            case 19:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((tc) obj).run();
                return;
            case 20:
                bi biVar = (bi) obj2;
                AnimatorSet animatorSet3 = biVar.f21624z0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (jVar = biVar.f24689j4) != null && !jVar.f13951f) {
                    ((jg) obj).run();
                    return;
                }
                return;
            case 21:
                du duVar = (du) obj2;
                if (duVar.f25534a.l1.getVisibility() == 0) {
                    duVar.f25534a.l1.setAlpha(1.0f);
                    duVar.f25534a.l1.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 22:
                tk0 tk0Var = (tk0) obj;
                vy vyVar = (vy) obj2;
                if (animator.equals(vyVar.M0)) {
                    tk0Var.setTranslationY(0.0f);
                    if (tk0Var == vyVar.D0) {
                        tk0Var.setPadding(0, 0, 0, vyVar.f31908q2);
                    } else if (tk0Var == vyVar.P) {
                        tk0Var.setPadding(i0.L(5.0f), 0, i0.L(5.0f), vyVar.f31908q2);
                    } else if (tk0Var == vyVar.f31880h0) {
                        tk0Var.setPadding(0, vyVar.f31861b1, 0, vyVar.f31908q2);
                    }
                    vyVar.M0 = null;
                    return;
                }
                return;
            case 23:
                k10 k10Var = (k10) obj2;
                k10Var.removeView((s20) obj);
                k10Var.e.clear();
                k10Var.f27599a = null;
                k10Var.f27600b = false;
                return;
            case 24:
                ArrayList arrayList = (ArrayList) obj;
                k10 k10Var2 = (k10) obj2;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    k10Var2.removeView((View) arrayList.get(i12));
                }
                k10Var2.e.clear();
                k10Var2.f27599a = null;
                k10Var2.f27600b = false;
                return;
            case 25:
                l60 l60Var = (l60) obj2;
                l60Var.removeView((s20) obj);
                l60Var.f28022c = null;
                l60Var.e.U1 = null;
                l60Var.f28020a = false;
                return;
            case 26:
                sj0 sj0Var = (sj0) obj2;
                vj0 vj0Var = sj0Var.e;
                if (((ValueAnimator) vj0Var.f31276g) != null) {
                    ((tk0) vj0Var.e).V1 = false;
                    ArrayList arrayList2 = sj0Var.f30258b;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        View view4 = (View) obj3;
                        if (view4 instanceof r4) {
                            ((r4) view4).b(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((a0) vj0Var.f31275f).getClass();
                        n0.x0(view4);
                        ((tk0) vj0Var.e).removeView(view4);
                        d6 d6Var = (d6) vj0Var.f31277i;
                        if (d6Var != null) {
                            d6Var.d(view4);
                        }
                    }
                    ((tk0) vj0Var.e).setScrollEnabled(true);
                    ((tk0) vj0Var.e).setVerticalScrollBarEnabled(true);
                    boolean z10 = v2.f18448a;
                    int childCount = ((tk0) vj0Var.e).getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = ((tk0) vj0Var.e).getChildAt(i14);
                        if (childAt instanceof r4) {
                            ((r4) childAt).b(false, false);
                        }
                        childAt.setTranslationY(0.0f);
                    }
                    ArrayList arrayList3 = (ArrayList) obj;
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj4 = arrayList3.get(i15);
                        i15++;
                        View view5 = (View) obj4;
                        if (view5 instanceof r4) {
                            ((r4) view5).b(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    tj0 tj0Var = sj0Var.d;
                    if (tj0Var != null) {
                        tj0Var.E();
                    }
                    d6 d6Var2 = (d6) vj0Var.f31277i;
                    if (d6Var2 != null) {
                        d6Var2.a();
                    }
                    ((SparseArray) vj0Var.f31278j).clear();
                    vj0Var.f31276g = null;
                    return;
                }
                return;
            case 27:
                zz zzVar = (zz) obj;
                zzVar.setAlpha(1.0f);
                n0.x0(zzVar);
                wj0 wj0Var = (wj0) obj2;
                wj0Var.f32211c.remove(zzVar);
                wj0Var.f32209a.removeView(zzVar);
                return;
            case 28:
                super.onAnimationEnd(animator);
                uq uqVar = (uq) obj2;
                ((wj0) uqVar.d).f32213g.remove((AnimatorSet) obj);
                if (((wj0) uqVar.d).f32213g.isEmpty()) {
                    ((wj0) uqVar.d).f32210b.clear();
                    wj0 wj0Var2 = (wj0) uqVar.d;
                    wj0Var2.d = true;
                    wj0Var2.f32209a.invalidate();
                    return;
                }
                return;
            default:
                co0 co0Var = (co0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(co0Var.B);
                } catch (Exception unused) {
                }
                gi0 gi0Var = co0Var.C;
                if (gi0Var != null) {
                    i0.r(gi0Var);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f2681a) {
            case 8:
                ((org.telegram.ui.ActionBar.l) this.f2682b).F.setVisibility(0);
                return;
            case 14:
                ((la) this.f2683c).run();
                return;
            case 15:
                ((la) this.f2683c).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f(Runnable runnable, Runnable runnable2, int i10) {
        this.f2681a = i10;
        this.f2683c = runnable;
        this.f2682b = runnable2;
    }

    public f(wj0 wj0Var, zz zzVar, n0 n0Var) {
        this.f2681a = 27;
        this.f2682b = wj0Var;
        this.f2683c = zzVar;
    }
}
