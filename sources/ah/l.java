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
import di.nc;
import di.oc;
import hi.b8;
import hi.e3;
import hi.i3;
import hi.n8;
import hi.t2;
import java.util.ArrayList;
import oi.z1;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.zu;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.ie;
import org.telegram.ui.Components.k7;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bh;
import org.telegram.ui.bn;
import org.telegram.ui.ii;
import org.telegram.ui.il;
import org.telegram.ui.q0;
import org.telegram.ui.um;
import org.telegram.ui.yo;
import tg.r1;
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
                if (animator.equals(actionBarLayout.f28717r0)) {
                    actionBarLayout.f28700i0.clear();
                    actionBarLayout.f28686c0.clear();
                    actionBarLayout.f28688d0.clear();
                    actionBarLayout.f28704k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    n6.mm = null;
                    actionBarLayout.f28702j0 = null;
                    actionBarLayout.f28698h0 = null;
                    actionBarLayout.f28717r0 = null;
                    um umVar = ((r4) this.f1082b).f29963j;
                    if (umVar != null) {
                        umVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1083c;
                if (animator.equals(chatActivityEnterView.f32586f3)) {
                    chatActivityEnterView.f32586f3 = null;
                    return;
                }
                return;
            case 25:
                si siVar = (si) this.f1083c;
                AnimatorSet animatorSet2 = siVar.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    siVar.A0 = null;
                    siVar.B0 = 0;
                    return;
                }
                return;
            case 27:
                ry ryVar = (ry) this.f1083c;
                if (animator.equals(ryVar.N0)) {
                    ryVar.N0 = null;
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
                nVar.removeView((m20) obj);
                nVar.h.clear();
                nVar.f1088b = null;
                nVar.f1089c = false;
                ((o) nVar.f1092n).f1094b.setAllowDrawCursor(true);
                return;
            case 1:
                oc ocVar = (oc) obj2;
                ocVar.f9487b.remove((nc) obj);
                ocVar.f1();
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((fi.p) obj2).f12360c0.f12427k0 = null;
                g0.E2((View) obj);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i11 = ProfileStoriesView.f43797t0;
                    if (bz.o() > 0) {
                        g0.a4(profileStoriesView);
                        g0.h3(new f2.a(profileStoriesView, 9), 180L);
                    }
                }
                profileStoriesView.f43799a0 = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 4:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((e3) ((t2) obj2).f15409c).h.setVisibility(8);
                return;
            case 5:
                i3 i3Var = (i3) obj2;
                i3Var.n1 = null;
                i3Var.f14759p1 = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                hi.q qVar = (hi.q) obj2;
                ((r1) obj).setDraw(true);
                if (qVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qVar.getParent()).removeView(qVar);
                    return;
                }
                return;
            case 7:
                n nVar2 = (n) obj2;
                nVar2.removeView((m20) obj);
                nVar2.h.clear();
                nVar2.f1088b = null;
                nVar2.f1089c = false;
                n8 n8Var = (n8) nVar2.f1092n;
                n8Var.f15109b.setAllowDrawCursor(true);
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
                gVar2.f19788b.clear();
                gVar2.f19788b.add((ng.d) obj);
                return;
            case 9:
                super.onAnimationEnd(animator);
                lg.g gVar3 = (lg.g) obj2;
                gVar3.f19791c.clear();
                gVar3.f19791c.add((ng.b) obj);
                return;
            case 10:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f32889l0 = null;
                return;
            case 11:
                z1 z1Var = (z1) obj2;
                z1Var.F = false;
                z1Var.f22544w.setAlpha(1.0f);
                z1Var.f22544w.f32651o2.setVisibility(0);
                z1Var.f22548y.r(g0.L(22.0f));
                z1Var.f22548y.setAlpha(255);
                jh.f fVar = z1Var.f22539s;
                fVar.f17779e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 12:
                zu zuVar = (zu) obj2;
                zuVar.f28363b = true;
                zuVar.f28366f = null;
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
                    n5 n5Var = kVar.f29086n[0];
                    if (n5Var != null) {
                        n5Var.setVisibility(4);
                    }
                    if (kVar.f29094r != null && !TextUtils.isEmpty(kVar.B0)) {
                        kVar.f29094r.setVisibility(4);
                    }
                    z zVar = kVar.F;
                    if (zVar != null) {
                        zVar.setVisibility(4);
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
                actionBarLayout.f28720s0.e();
                if (animator.equals(actionBarLayout.f28717r0)) {
                    actionBarLayout.f28700i0.clear();
                    actionBarLayout.f28686c0.clear();
                    actionBarLayout.f28688d0.clear();
                    actionBarLayout.f28704k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    n6.mm = null;
                    actionBarLayout.f28702j0 = null;
                    actionBarLayout.f28698h0 = null;
                    actionBarLayout.f28717r0 = null;
                    um umVar = ((r4) obj).f29963j;
                    if (umVar != null) {
                        umVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((ActionBarLayout) obj2).f28708n = false;
                ((h2) obj).onPreviewOpenAnimationEnd();
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
                    bnVar.f46119o3 = null;
                    bnVar.Gb = null;
                    return;
                }
                return;
            case 17:
                q1 q1Var = ((il) obj2).f48748b;
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f32399y0 = false;
                q0 q0Var = new q0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((b50) obj, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(q1Var, q0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new x9(this, 7));
                animatorSet2.start();
                return;
            case 18:
                yo yoVar = (yo) obj2;
                yoVar.M = 0.0f;
                yoVar.L = 1.0f;
                ((View) obj).invalidate();
                yoVar.U.invalidate();
                bh bhVar = yoVar.Z;
                if (bhVar != null) {
                    bhVar.run();
                    yoVar.Z = null;
                    return;
                }
                return;
            case 19:
                ((lg) obj2).run();
                return;
            case 20:
                ((ua) obj2).run();
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.Q0;
                if (animator.equals(chatActivityEnterView.f32586f3)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.f32541a1.setVisibility(8);
                    ie ieVar = chatActivityEnterView.T0;
                    if (ieVar != null) {
                        ieVar.setVisibility(8);
                    }
                    ChatActivityEnterView.i(chatActivityEnterView);
                    chatActivityEnterView.f32586f3 = null;
                    chatActivityEnterView.j3 = 0;
                    return;
                }
                return;
            case 22:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.f32732z4.e();
                ((dd) obj).run();
                return;
            case 23:
                ((ii) obj).run();
                ((ChatActivityEnterView) obj2).f32732z4.e();
                return;
            case 24:
                ((ChatActivityEnterView) obj2).f32659p4 = null;
                ((dd) obj).run();
                return;
            case 25:
                si siVar = (si) obj2;
                AnimatorSet animatorSet3 = siVar.A0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (gVar = siVar.f39699n4) != null && !gVar.f56317f) {
                    ((k7) obj).run();
                    return;
                }
                return;
            case 26:
                du duVar = (du) obj2;
                if (duVar.f34508a.f35647p1.getVisibility() == 0) {
                    duVar.f34508a.f35647p1.setAlpha(1.0f);
                    duVar.f34508a.f35647p1.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 27:
                ck0 ck0Var = (ck0) obj;
                ry ryVar = (ry) obj2;
                if (animator.equals(ryVar.N0)) {
                    ck0Var.setTranslationY(0.0f);
                    if (ck0Var == ryVar.E0) {
                        ck0Var.setPadding(0, 0, 0, ryVar.f39388r2);
                    } else if (ck0Var == ryVar.Q) {
                        ck0Var.setPadding(g0.L(5.0f), 0, g0.L(5.0f), ryVar.f39388r2);
                    } else if (ck0Var == ryVar.f39360i0) {
                        ck0Var.setPadding(0, ryVar.f39342c1, 0, ryVar.f39388r2);
                    }
                    ryVar.N0 = null;
                    return;
                }
                return;
            case 28:
                f10 f10Var = (f10) obj2;
                f10Var.removeView((m20) obj);
                f10Var.f34868e.clear();
                f10Var.f34865a = null;
                f10Var.f34866b = false;
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                f10 f10Var2 = (f10) obj2;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    f10Var2.removeView((View) arrayList.get(i12));
                }
                f10Var2.f34868e.clear();
                f10Var2.f34865a = null;
                f10Var2.f34866b = false;
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
