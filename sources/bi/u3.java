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
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.Components.z50;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.bq;
import org.telegram.ui.dr;
import org.telegram.ui.eo;
import org.telegram.ui.fj;
import org.telegram.ui.jm;
import org.telegram.ui.wn;
public final class u3 extends AnimatorListenerAdapter {
    public final int f3712a;
    public final Object f3713b;
    public final Object f3714c;

    public u3(int i10, Object obj, Object obj2) {
        this.f3712a = i10;
        this.f3714c = obj;
        this.f3713b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.f3712a) {
            case 8:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) this.f3714c;
                AnimatorSet animatorSet3 = lVar.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    lVar.P = null;
                    return;
                }
                return;
            case 9:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f3714c;
                if (animator.equals(actionBarLayout.f17493k0)) {
                    actionBarLayout.f17487h0.clear();
                    actionBarLayout.f17473b0.clear();
                    actionBarLayout.f17476c0.clear();
                    actionBarLayout.f17491j0.clear();
                    org.telegram.ui.ActionBar.j6.sl = null;
                    actionBarLayout.f17489i0 = null;
                    actionBarLayout.f17485g0 = null;
                    actionBarLayout.f17493k0 = null;
                    wn wnVar = ((org.telegram.ui.ActionBar.e5) this.f3713b).f17688j;
                    if (wnVar != null) {
                        wnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3714c;
                if (animator.equals(chatActivityEnterView.f20911q2)) {
                    chatActivityEnterView.f20911q2 = null;
                    return;
                }
                return;
            case 20:
                yi yiVar = (yi) this.f3714c;
                animatorSet = ((org.telegram.ui.ActionBar.h3) yiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.h3) yiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.h3) yiVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.h3) yiVar).currentSheetAnimationType = 0;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                rz rzVar = (rz) this.f3714c;
                if (animator.equals(rzVar.M0)) {
                    rzVar.M0 = null;
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
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((v3) obj2).h.h.setVisibility(8);
                return;
            case 1:
                t4 t4Var = (t4) obj2;
                t4Var.f3675c = null;
                t4Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                t tVar = (t) obj2;
                ((pg.b2) obj).setDraw(true);
                if (tVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) tVar.getParent()).removeView(tVar);
                    return;
                }
                return;
            case 3:
                nb nbVar = (nb) obj2;
                nbVar.removeView((w30) obj);
                nbVar.h.clear();
                nbVar.f3248b = null;
                nbVar.f3249c = false;
                ob obVar = (ob) nbVar.f3251n;
                obVar.f3334a.setAllowDrawCursor(true);
                sa saVar = obVar.f3337f;
                if (saVar != null) {
                    saVar.run();
                }
                if (obVar.K) {
                    obVar.fullScroll(130);
                    obVar.K = false;
                    return;
                }
                return;
            case 4:
                hg.g gVar = (hg.g) obj2;
                gVar.f9350b.clear();
                gVar.f9350b.add((jg.d) obj);
                return;
            case 5:
                super.onAnimationEnd(animator);
                hg.g gVar2 = (hg.g) obj2;
                gVar2.f9353c.clear();
                gVar2.f9353c.add((jg.b) obj);
                return;
            case 6:
                hi.g2 g2Var = (hi.g2) obj2;
                g2Var.E = false;
                g2Var.v.setAlpha(1.0f);
                g2Var.v.f20959z1.setVisibility(0);
                g2Var.f9609x.p(AndroidUtilities.dp(22.0f));
                g2Var.f9609x.setAlpha(255);
                gh.g gVar3 = g2Var.f9602s;
                gVar3.e = true;
                gVar3.invalidate();
                ((Runnable) obj).run();
                return;
            case 7:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f21102k0 = null;
                return;
            case 8:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj2;
                AnimatorSet animatorSet3 = lVar.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    lVar.P = null;
                    org.telegram.ui.ActionBar.l5 l5Var = lVar.f18388n[0];
                    if (l5Var != null) {
                        l5Var.setVisibility(4);
                    }
                    if (lVar.f18397r != null && !TextUtils.isEmpty(lVar.A0)) {
                        lVar.f18397r.setVisibility(4);
                    }
                    org.telegram.ui.ActionBar.z zVar = lVar.E;
                    if (zVar != null) {
                        zVar.setVisibility(4);
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
                actionBarLayout.f17495l0.unlock();
                if (animator.equals(actionBarLayout.f17493k0)) {
                    actionBarLayout.f17487h0.clear();
                    actionBarLayout.f17473b0.clear();
                    actionBarLayout.f17476c0.clear();
                    actionBarLayout.f17491j0.clear();
                    org.telegram.ui.ActionBar.j6.sl = null;
                    actionBarLayout.f17489i0 = null;
                    actionBarLayout.f17485g0 = null;
                    actionBarLayout.f17493k0 = null;
                    wn wnVar = ((org.telegram.ui.ActionBar.e5) obj).f17688j;
                    if (wnVar != null) {
                        wnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((ActionBarLayout) obj2).f17497n = false;
                ((org.telegram.ui.ActionBar.p2) obj).onPreviewOpenAnimationEnd();
                return;
            case 11:
                View view3 = (View) obj;
                eo eoVar = (eo) obj2;
                eoVar.A9 = 0.0f;
                if (animator == eoVar.f32341gb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    eoVar.Z2 = null;
                    eoVar.f32341gb = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) ((jm) obj2).f34134b;
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f20016x0 = false;
                org.telegram.ui.t0 t0Var = new org.telegram.ui.t0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((z50) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t1Var, t0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new org.telegram.ui.Cells.v5(this, 11));
                animatorSet4.start();
                return;
            case 13:
                bq bqVar = (bq) obj2;
                bqVar.L = 0.0f;
                bqVar.K = 1.0f;
                ((View) obj).invalidate();
                bqVar.T.invalidate();
                fj fjVar = bqVar.Y;
                if (fjVar != null) {
                    fjVar.run();
                    bqVar.Y = null;
                    return;
                }
                return;
            case 14:
                ((rg) obj2).run();
                return;
            case 15:
                ((org.telegram.ui.Components.cb) obj2).run();
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.f20911q2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.Z0.setVisibility(8);
                    org.telegram.ui.Components.cf cfVar = chatActivityEnterView.S0;
                    if (cfVar != null) {
                        cfVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.f20911q2 = null;
                    chatActivityEnterView.f20933u2 = 0;
                    return;
                }
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.K3.unlock();
                ((org.telegram.ui.Components.qd) obj).run();
                return;
            case 18:
                ((org.telegram.ui.Components.zd) obj).run();
                ((ChatActivityEnterView) obj2).K3.unlock();
                return;
            case 19:
                ((ChatActivityEnterView) obj2).A3 = null;
                ((org.telegram.ui.Components.qd) obj).run();
                return;
            case 20:
                yi yiVar = (yi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.h3) yiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.h3) yiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (kVar = yiVar.f29397p2) != null && !kVar.f14127f) {
                        ((gf) obj).run();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                vu vuVar = (vu) obj2;
                if (vuVar.f28598a.e.getVisibility() == 0) {
                    vuVar.f28598a.e.setAlpha(1.0f);
                    vuVar.f28598a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 22:
                vl0 vl0Var = (vl0) obj;
                rz rzVar = (rz) obj2;
                if (animator.equals(rzVar.M0)) {
                    vl0Var.setTranslationY(0.0f);
                    if (vl0Var == rzVar.D0) {
                        vl0Var.setPadding(0, 0, 0, rzVar.f26848q2);
                    } else if (vl0Var == rzVar.P) {
                        vl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), rzVar.f26848q2);
                    } else if (vl0Var == rzVar.f26820h0) {
                        vl0Var.setPadding(0, rzVar.f26801b1, 0, rzVar.f26848q2);
                    }
                    rzVar.M0 = null;
                    return;
                }
                return;
            case 23:
                n20 n20Var = (n20) obj2;
                n20Var.removeView((w30) obj);
                n20Var.e.clear();
                n20Var.f25377a = null;
                n20Var.f25378b = false;
                return;
            case 24:
                ArrayList arrayList = (ArrayList) obj;
                n20 n20Var2 = (n20) obj2;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    n20Var2.removeView((View) arrayList.get(i12));
                }
                n20Var2.e.clear();
                n20Var2.f25377a = null;
                n20Var2.f25378b = false;
                return;
            case 25:
                j70 j70Var = (j70) obj2;
                j70Var.removeView((w30) obj);
                j70Var.f24260c = null;
                j70Var.e.f24629d0 = null;
                j70Var.f24258a = false;
                return;
            case 26:
                vk0 vk0Var = (vk0) obj2;
                yk0 yk0Var = vk0Var.e;
                if (((ValueAnimator) yk0Var.f29447g) != null) {
                    ((vl0) yk0Var.e).X1 = false;
                    ArrayList arrayList2 = vk0Var.f27954b;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        View view4 = (View) obj3;
                        if (view4 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) view4).c(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((s4.c0) yk0Var.f29446f).getClass();
                        s4.o0.x0(view4);
                        ((vl0) yk0Var.e).removeView(view4);
                        w7.b6 b6Var = (w7.b6) yk0Var.f29448i;
                        if (b6Var != null) {
                            b6Var.d(view4);
                        }
                    }
                    ((vl0) yk0Var.e).setScrollEnabled(true);
                    ((vl0) yk0Var.e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((vl0) yk0Var.e).e.B() == ((vl0) yk0Var.e).getChildCount()) {
                            if (((ArrayList) ((vl0) yk0Var.e).e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((vl0) yk0Var.e).getChildCount();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = ((vl0) yk0Var.e).getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) childAt).c(false, false);
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
                        if (view5 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) view5).c(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    wk0 wk0Var = vk0Var.d;
                    if (wk0Var != null) {
                        wk0Var.E();
                    }
                    w7.b6 b6Var2 = (w7.b6) yk0Var.f29448i;
                    if (b6Var2 != null) {
                        b6Var2.a();
                    }
                    ((SparseArray) yk0Var.f29449j).clear();
                    yk0Var.f29447g = null;
                    return;
                }
                return;
            case 27:
                a10 a10Var = (a10) obj;
                a10Var.setAlpha(1.0f);
                s4.o0.x0(a10Var);
                zk0 zk0Var = (zk0) obj2;
                zk0Var.f29714c.remove(a10Var);
                zk0Var.f29712a.removeView(a10Var);
                return;
            case 28:
                super.onAnimationEnd(animator);
                dr drVar = (dr) obj2;
                ((zk0) drVar.d).f29716g.remove((AnimatorSet) obj);
                if (((zk0) drVar.d).f29716g.isEmpty()) {
                    ((zk0) drVar.d).f29713b.clear();
                    zk0 zk0Var2 = (zk0) drVar.d;
                    zk0Var2.d = true;
                    zk0Var2.f29712a.invalidate();
                    return;
                }
                return;
            default:
                fp0 fp0Var = (fp0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(fp0Var.B);
                } catch (Exception unused) {
                }
                yo0 yo0Var = fp0Var.C;
                if (yo0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(yo0Var);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f3712a) {
            case 8:
                ((org.telegram.ui.ActionBar.l) this.f3714c).F.setVisibility(0);
                return;
            case 14:
                ((org.telegram.ui.Components.eb) this.f3713b).run();
                return;
            case 15:
                ((org.telegram.ui.Components.eb) this.f3713b).run();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public u3(Runnable runnable, Runnable runnable2, int i10) {
        this.f3712a = i10;
        this.f3713b = runnable;
        this.f3714c = runnable2;
    }

    public u3(zk0 zk0Var, a10 a10Var, s4.o0 o0Var) {
        this.f3712a = 27;
        this.f3714c = zk0Var;
        this.f3713b = a10Var;
    }
}
