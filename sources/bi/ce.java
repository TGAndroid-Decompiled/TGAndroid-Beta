package bi;

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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.zu;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.nn;
import org.telegram.ui.rp;
import org.telegram.ui.ui;
import org.telegram.ui.un;
import org.telegram.ui.zl;
public final class ce extends AnimatorListenerAdapter {
    public final int f4471a;
    public final Object f4472b;
    public final Object f4473c;

    public ce(int i10, Object obj, Object obj2) {
        this.f4471a = i10;
        this.f4473c = obj;
        this.f4472b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f4471a) {
            case 11:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.f4473c;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    return;
                }
                return;
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f4473c;
                if (animator.equals(actionBarLayout.f22336q0)) {
                    actionBarLayout.f22319h0.clear();
                    actionBarLayout.f22305b0.clear();
                    actionBarLayout.f22308c0.clear();
                    actionBarLayout.f22323j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    org.telegram.ui.ActionBar.y6.vl = null;
                    actionBarLayout.f22321i0 = null;
                    actionBarLayout.f22317g0 = null;
                    actionBarLayout.f22336q0 = null;
                    nn nnVar = ((org.telegram.ui.ActionBar.i5) this.f4472b).f22722j;
                    if (nnVar != null) {
                        nnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4473c;
                if (animator.equals(chatActivityEnterView.f25947r2)) {
                    chatActivityEnterView.f25947r2 = null;
                    return;
                }
                return;
            case 23:
                ti tiVar = (ti) this.f4473c;
                if (ti.X(tiVar) != null && ti.Y(tiVar).equals(animator)) {
                    ti.Z(tiVar);
                    ti.a0(tiVar);
                    return;
                }
                return;
            case 25:
                sz szVar = (sz) this.f4473c;
                if (animator.equals(szVar.M0)) {
                    szVar.M0 = null;
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
        int i10 = this.f4471a;
        int i11 = 0;
        Object obj = this.f4472b;
        Object obj2 = this.f4473c;
        switch (i10) {
            case 0:
                ee eeVar = (ee) obj2;
                eeVar.f4580b.remove((de) obj);
                eeVar.f1();
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((di.q) obj2).f8938b0.f9084j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 2:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.f36229s0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new u6(profileStoriesView, 20), 180L);
                    }
                }
                profileStoriesView.W = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 3:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((fi.w2) obj2).f11847b.h.setVisibility(8);
                return;
            case 4:
                fi.s3 s3Var = (fi.s3) obj2;
                s3Var.f11582c = null;
                s3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                fi.p pVar = (fi.p) obj2;
                ((sg.d2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 6:
                fi.j9 j9Var = (fi.j9) obj2;
                j9Var.removeView((x30) obj);
                j9Var.h.clear();
                j9Var.f11066b = null;
                j9Var.f11067c = false;
                fi.k9 k9Var = (fi.k9) j9Var.f11069n;
                k9Var.f11124b.setAllowDrawCursor(true);
                fi.w8 w8Var = k9Var.h;
                if (w8Var != null) {
                    w8Var.run();
                }
                if (k9Var.L) {
                    k9Var.fullScroll(130);
                    k9Var.L = false;
                    return;
                }
                return;
            case 7:
                kg.h hVar = (kg.h) obj2;
                hVar.f16586b.clear();
                hVar.f16586b.add((mg.d) obj);
                return;
            case 8:
                super.onAnimationEnd(animator);
                kg.h hVar2 = (kg.h) obj2;
                hVar2.f16589c.clear();
                hVar2.f16589c.add((mg.b) obj);
                return;
            case 9:
                li.b2 b2Var = (li.b2) obj2;
                b2Var.E = false;
                b2Var.v.setAlpha(1.0f);
                b2Var.v.A1.setVisibility(0);
                b2Var.f17149x.x(AndroidUtilities.dp(22.0f));
                b2Var.f17149x.setAlpha(255);
                jh.f fVar = b2Var.f17142s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 10:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f26132k0 = null;
                return;
            case 11:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    org.telegram.ui.ActionBar.b6 b6Var = kVar.f22771n[0];
                    if (b6Var != null) {
                        b6Var.setVisibility(4);
                    }
                    if (kVar.f22780r != null && !TextUtils.isEmpty(kVar.A0)) {
                        kVar.f22780r.setVisibility(4);
                    }
                    org.telegram.ui.ActionBar.z zVar = kVar.E;
                    if (zVar != null) {
                        zVar.setVisibility(4);
                    }
                    if (kVar.Q == null) {
                        return;
                    }
                    while (true) {
                        View[] viewArr = kVar.Q;
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
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.f22339r0.unlock();
                if (animator.equals(actionBarLayout.f22336q0)) {
                    actionBarLayout.f22319h0.clear();
                    actionBarLayout.f22305b0.clear();
                    actionBarLayout.f22308c0.clear();
                    actionBarLayout.f22323j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    org.telegram.ui.ActionBar.y6.vl = null;
                    actionBarLayout.f22321i0 = null;
                    actionBarLayout.f22317g0 = null;
                    actionBarLayout.f22336q0 = null;
                    nn nnVar = ((org.telegram.ui.ActionBar.i5) obj).f22722j;
                    if (nnVar != null) {
                        nnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((ActionBarLayout) obj2).f22329n = false;
                ((org.telegram.ui.ActionBar.r2) obj).onPreviewOpenAnimationEnd();
                return;
            case 14:
                View view3 = (View) obj;
                un unVar = (un) obj2;
                unVar.M9 = 0.0f;
                if (animator == unVar.Cb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    unVar.f44318l3 = null;
                    unVar.Cb = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) ((zl) obj2).f46318b;
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().f24943x0 = false;
                org.telegram.ui.s0 s0Var = new org.telegram.ui.s0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((q60) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s1Var, s0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new kg.e(this, 28));
                animatorSet2.start();
                return;
            case 16:
                rp rpVar = (rp) obj2;
                rpVar.L = 0.0f;
                rpVar.K = 1.0f;
                ((View) obj).invalidate();
                rpVar.T.invalidate();
                ui uiVar = rpVar.Y;
                if (uiVar != null) {
                    uiVar.run();
                    rpVar.Y = null;
                    return;
                }
                return;
            case 17:
                ((pg) obj2).run();
                return;
            case 18:
                ((org.telegram.ui.Components.db) obj2).run();
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f25947r2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.Z0.setVisibility(8);
                    bf bfVar = chatActivityEnterView.S0;
                    if (bfVar != null) {
                        bfVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f25947r2 = null;
                    chatActivityEnterView.f25968v2 = 0;
                    return;
                }
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.unlock();
                ((org.telegram.ui.Components.sd) obj).run();
                return;
            case 21:
                ((org.telegram.ui.Components.h2) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                return;
            case 22:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((org.telegram.ui.Components.sd) obj).run();
                return;
            case 23:
                ti tiVar = (ti) obj2;
                if (ti.V(tiVar) != null && ti.W(tiVar).equals(animator) && (jVar = tiVar.f33060s2) != null && !jVar.f18963f) {
                    ((kg) obj).run();
                    return;
                }
                return;
            case 24:
                zu zuVar = (zu) obj2;
                if (zuVar.f35405a.e.getVisibility() == 0) {
                    zuVar.f35405a.e.setAlpha(1.0f);
                    zuVar.f35405a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 25:
                mm0 mm0Var = (mm0) obj;
                sz szVar = (sz) obj2;
                if (animator.equals(szVar.M0)) {
                    mm0Var.setTranslationY(0.0f);
                    if (mm0Var == szVar.D0) {
                        mm0Var.setPadding(0, 0, 0, szVar.f32759q2);
                    } else if (mm0Var == szVar.P) {
                        mm0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), szVar.f32759q2);
                    } else if (mm0Var == szVar.f32731h0) {
                        mm0Var.setPadding(0, szVar.f32712b1, 0, szVar.f32759q2);
                    }
                    szVar.M0 = null;
                    return;
                }
                return;
            case 26:
                p20 p20Var = (p20) obj2;
                p20Var.removeView((x30) obj);
                p20Var.e.clear();
                p20Var.f31420a = null;
                p20Var.f31421b = false;
                return;
            case 27:
                ArrayList arrayList = (ArrayList) obj;
                p20 p20Var2 = (p20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    p20Var2.removeView((View) arrayList.get(i13));
                }
                p20Var2.e.clear();
                p20Var2.f31420a = null;
                p20Var2.f31421b = false;
                return;
            case 28:
                x70 x70Var = (x70) obj2;
                x70Var.removeView((x30) obj);
                x70Var.f34651c = null;
                x70Var.e.f34944d0 = null;
                x70Var.f34649a = false;
                return;
            default:
                ((qg0) obj2).h = null;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f4471a) {
            case 11:
                ((org.telegram.ui.ActionBar.k) this.f4473c).F.setVisibility(0);
                return;
            case 17:
                ((org.telegram.ui.Components.fb) this.f4472b).run();
                return;
            case 18:
                ((org.telegram.ui.Components.fb) this.f4472b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ce(Runnable runnable, Runnable runnable2, int i10) {
        this.f4471a = i10;
        this.f4472b = runnable;
        this.f4473c = runnable2;
    }
}
