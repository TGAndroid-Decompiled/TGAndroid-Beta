package bi;

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
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.p50;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.aq;
import org.telegram.ui.co;
import org.telegram.ui.dj;
import org.telegram.ui.im;
import org.telegram.ui.vn;
public final class t extends AnimatorListenerAdapter {
    public final int f3712a;
    public final Object f3713b;
    public final Object f3714c;

    public t(int i10, Object obj, Object obj2) {
        this.f3712a = i10;
        this.f3714c = obj;
        this.f3713b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f3712a) {
            case 10:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f3714c;
                AnimatorSet animatorSet3 = kVar.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f3714c;
                if (animator.equals(actionBarLayout.f20162k0)) {
                    actionBarLayout.f20156h0.clear();
                    actionBarLayout.f20141b0.clear();
                    actionBarLayout.f20144c0.clear();
                    actionBarLayout.f20160j0.clear();
                    org.telegram.ui.ActionBar.j6.sl = null;
                    actionBarLayout.f20158i0 = null;
                    actionBarLayout.f20154g0 = null;
                    actionBarLayout.f20162k0 = null;
                    vn vnVar = ((org.telegram.ui.ActionBar.c5) this.f3713b).f20336j;
                    if (vnVar != null) {
                        vnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3714c;
                if (animator.equals(chatActivityEnterView.f23757q2)) {
                    chatActivityEnterView.f23757q2 = null;
                    return;
                }
                return;
            case 22:
                vi viVar = (vi) this.f3714c;
                animatorSet = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimationType = 0;
                        return;
                    }
                    return;
                }
                return;
            case 24:
                kz kzVar = (kz) this.f3714c;
                if (animator.equals(kzVar.M0)) {
                    kzVar.M0 = null;
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
        int i10 = this.f3712a;
        int i11 = 0;
        Object obj = this.f3713b;
        Object obj2 = this.f3714c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                ((u) obj2).f3770b0.f3860j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f34142s0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new a3.c(profileStoriesView, 19), 180L);
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
                ((di.e3) obj2).h.h.setVisibility(8);
                return;
            case 3:
                di.b4 b4Var = (di.b4) obj2;
                b4Var.f6943c = null;
                b4Var.f6944e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                di.p pVar = (di.p) obj2;
                ((rg.d2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 5:
                di.ea eaVar = (di.ea) obj2;
                eaVar.removeView((m30) obj);
                eaVar.h.clear();
                eaVar.f7175b = null;
                eaVar.f7176c = false;
                di.fa faVar = (di.fa) eaVar.f7179n;
                faVar.f7239a.setAllowDrawCursor(true);
                di.o9 o9Var = faVar.f7243f;
                if (o9Var != null) {
                    o9Var.run();
                }
                if (faVar.K) {
                    faVar.fullScroll(130);
                    faVar.K = false;
                    return;
                }
                return;
            case 6:
                jg.g gVar = (jg.g) obj2;
                gVar.f13657b.clear();
                gVar.f13657b.add((lg.d) obj);
                return;
            case 7:
                super.onAnimationEnd(animator);
                jg.g gVar2 = (jg.g) obj2;
                gVar2.f13660c.clear();
                gVar2.f13660c.add((lg.b) obj);
                return;
            case 8:
                ji.c2 c2Var = (ji.c2) obj2;
                c2Var.E = false;
                c2Var.v.setAlpha(1.0f);
                c2Var.v.f23805z1.setVisibility(0);
                c2Var.f13837x.p(AndroidUtilities.dp(22.0f));
                c2Var.f13837x.setAlpha(255);
                ih.g gVar3 = c2Var.f13830s;
                gVar3.f12332e = true;
                gVar3.invalidate();
                ((Runnable) obj).run();
                return;
            case 9:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f23956k0 = null;
                return;
            case 10:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar2.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar2.P = null;
                    org.telegram.ui.ActionBar.j5 j5Var = kVar2.f21102n[0];
                    if (j5Var != null) {
                        j5Var.setVisibility(4);
                    }
                    if (kVar2.f21111r != null && !TextUtils.isEmpty(kVar2.A0)) {
                        kVar2.f21111r.setVisibility(4);
                    }
                    org.telegram.ui.ActionBar.z zVar = kVar2.E;
                    if (zVar != null) {
                        zVar.setVisibility(4);
                    }
                    if (kVar2.Q == null) {
                        return;
                    }
                    while (true) {
                        View[] viewArr = kVar2.Q;
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
                actionBarLayout.f20164l0.unlock();
                if (animator.equals(actionBarLayout.f20162k0)) {
                    actionBarLayout.f20156h0.clear();
                    actionBarLayout.f20141b0.clear();
                    actionBarLayout.f20144c0.clear();
                    actionBarLayout.f20160j0.clear();
                    org.telegram.ui.ActionBar.j6.sl = null;
                    actionBarLayout.f20158i0 = null;
                    actionBarLayout.f20154g0 = null;
                    actionBarLayout.f20162k0 = null;
                    vn vnVar = ((org.telegram.ui.ActionBar.c5) obj).f20336j;
                    if (vnVar != null) {
                        vnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).f20166n = false;
                ((org.telegram.ui.ActionBar.n2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                co coVar = (co) obj2;
                coVar.A9 = 0.0f;
                if (animator == coVar.f35272gb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    coVar.Z2 = null;
                    coVar.f35272gb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) ((im) obj2).f37403b;
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f22806x0 = false;
                org.telegram.ui.t0 t0Var = new org.telegram.ui.t0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((p50) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t1Var, t0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new org.telegram.ui.s0(this, 24));
                animatorSet4.start();
                return;
            case 15:
                aq aqVar = (aq) obj2;
                aqVar.L = 0.0f;
                aqVar.K = 1.0f;
                ((View) obj).invalidate();
                aqVar.T.invalidate();
                dj djVar = aqVar.Y;
                if (djVar != null) {
                    djVar.run();
                    aqVar.Y = null;
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
                if (animator.equals(chatActivityEnterView.f23757q2)) {
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
                    chatActivityEnterView.f23757q2 = null;
                    chatActivityEnterView.f23779u2 = 0;
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.K3.unlock();
                ((sd) obj).run();
                return;
            case 20:
                ((org.telegram.ui.Components.m8) obj).run();
                ((ChatActivityEnterView) obj2).K3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).A3 = null;
                ((sd) obj).run();
                return;
            case 22:
                vi viVar = (vi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) viVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (kVar = viVar.f31310p2) != null && !kVar.f16818f) {
                        ((org.telegram.ui.ActionBar.p) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                pu puVar = (pu) obj2;
                if (puVar.f29490a.f30709e.getVisibility() == 0) {
                    puVar.f29490a.f30709e.setAlpha(1.0f);
                    puVar.f29490a.f30709e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                ll0 ll0Var = (ll0) obj;
                kz kzVar = (kz) obj2;
                if (animator.equals(kzVar.M0)) {
                    ll0Var.setTranslationY(0.0f);
                    if (ll0Var == kzVar.D0) {
                        ll0Var.setPadding(0, 0, 0, kzVar.f27976q2);
                    } else if (ll0Var == kzVar.P) {
                        ll0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.f27976q2);
                    } else if (ll0Var == kzVar.f27948h0) {
                        ll0Var.setPadding(0, kzVar.f27928b1, 0, kzVar.f27976q2);
                    }
                    kzVar.M0 = null;
                    return;
                }
                return;
            case 25:
                e20 e20Var = (e20) obj2;
                e20Var.removeView((m30) obj);
                e20Var.f25523e.clear();
                e20Var.f25520a = null;
                e20Var.f25521b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                e20 e20Var2 = (e20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    e20Var2.removeView((View) arrayList.get(i13));
                }
                e20Var2.f25523e.clear();
                e20Var2.f25520a = null;
                e20Var2.f25521b = false;
                return;
            case 27:
                a70 a70Var = (a70) obj2;
                a70Var.removeView((m30) obj);
                a70Var.f24298c = null;
                a70Var.f24299e.f24570d0 = null;
                a70Var.f24296a = false;
                return;
            case 28:
                lk0 lk0Var = (lk0) obj2;
                ok0 ok0Var = lk0Var.f28192e;
                if (((ValueAnimator) ok0Var.f29102g) != null) {
                    ((ll0) ok0Var.f29100e).X1 = false;
                    ArrayList arrayList2 = lk0Var.f28190b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        View view4 = (View) obj3;
                        if (view4 instanceof org.telegram.ui.Cells.n4) {
                            ((org.telegram.ui.Cells.n4) view4).e(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((s4.c0) ok0Var.f29101f).getClass();
                        s4.o0.x0(view4);
                        ((ll0) ok0Var.f29100e).removeView(view4);
                        w7.y5 y5Var = (w7.y5) ok0Var.f29103i;
                        if (y5Var != null) {
                            y5Var.d(view4);
                        }
                    }
                    ((ll0) ok0Var.f29100e).setScrollEnabled(true);
                    ((ll0) ok0Var.f29100e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((ll0) ok0Var.f29100e).f1872e.y() == ((ll0) ok0Var.f29100e).getChildCount()) {
                            if (((ArrayList) ((ll0) ok0Var.f29100e).f1872e.f15817b).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((ll0) ok0Var.f29100e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((ll0) ok0Var.f29100e).getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.n4) {
                            ((org.telegram.ui.Cells.n4) childAt).e(false, false);
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
                        if (view5 instanceof org.telegram.ui.Cells.n4) {
                            ((org.telegram.ui.Cells.n4) view5).e(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    mk0 mk0Var = lk0Var.d;
                    if (mk0Var != null) {
                        mk0Var.E();
                    }
                    w7.y5 y5Var2 = (w7.y5) ok0Var.f29103i;
                    if (y5Var2 != null) {
                        y5Var2.a();
                    }
                    ((SparseArray) ok0Var.f29104j).clear();
                    ok0Var.f29102g = null;
                    return;
                }
                return;
            default:
                t00 t00Var = (t00) obj;
                t00Var.setAlpha(1.0f);
                s4.o0.x0(t00Var);
                qk0 qk0Var = (qk0) obj2;
                qk0Var.f29755c.remove(t00Var);
                qk0Var.f29753a.removeView(t00Var);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f3712a) {
            case 10:
                ((org.telegram.ui.ActionBar.k) this.f3714c).F.setVisibility(0);
                return;
            case 16:
                ((org.telegram.ui.Components.fb) this.f3713b).run();
                return;
            case 17:
                ((org.telegram.ui.Components.fb) this.f3713b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public t(Runnable runnable, Runnable runnable2, int i10) {
        this.f3712a = i10;
        this.f3713b = runnable;
        this.f3714c = runnable2;
    }

    public t(qk0 qk0Var, t00 t00Var, s4.o0 o0Var) {
        this.f3712a = 29;
        this.f3714c = qk0Var;
        this.f3713b = t00Var;
    }
}
