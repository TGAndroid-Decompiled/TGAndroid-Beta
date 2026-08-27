package ag;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import gh.x5;
import gh.y5;
import hh.i5;
import hh.la;
import jh.c5;
import lh.w3;
import nh.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.ze;
import org.telegram.ui.Components.zi;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.yw;

public final class z2 extends f2.b1 {

    public final int f738a;

    public final Object f739b;

    public z2(Object obj, int i10) {
        this.f738a = i10;
        this.f739b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        lk0 lk0Var;
        lk0 lk0Var2;
        lk0 lk0Var3;
        int top;
        lk0 lk0Var4;
        switch (this.f738a) {
            case 0:
                w1 w1Var = (w1) this.f739b;
                if (i10 == 1) {
                    w1Var.Z2 = true;
                }
                if (i10 == 0) {
                    c3 c3Var = null;
                    for (int i11 = 0; i11 < recyclerView.getChildCount(); i11++) {
                        c3 c3Var2 = (c3) w1Var.getChildAt(i11);
                        if (c3Var == null || c3Var2.f319a > c3Var.f319a) {
                            c3Var = c3Var2;
                        }
                    }
                    if (c3Var != null) {
                        w1Var.w1(c3Var, true);
                        w1Var.Z2 = false;
                        w1Var.v0(0, c3Var.getTop() - ((w1Var.getMeasuredHeight() - c3Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    w1Var.x1();
                } else {
                    AndroidUtilities.cancelRunOnUIThread(w1Var.a3);
                }
                break;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((cg.i2) this.f739b).U.getEditText());
                }
                break;
            case 12:
                c5 c5Var = (c5) this.f739b;
                if (i10 == 0) {
                    c5Var.R = true;
                    c5Var.invalidate();
                }
                if (i10 == 1) {
                    c5Var.R = false;
                    b6.a aVar = c5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.f2033b;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.f2033b).cancel();
                        aVar.f2033b = null;
                    }
                    AndroidUtilities.hideKeyboard(c5Var);
                }
                break;
            case 14:
                lh.z1 z1Var = (lh.z1) this.f739b;
                if (i10 == 0 && z1Var.f17177n >= 0.0f && !z1Var.f17173b.canScrollVertically(-1)) {
                    z1Var.f17177n = -1.0f;
                    break;
                }
                break;
            case 18:
                oh.g0 g0Var = (oh.g0) this.f739b;
                if (i10 == 0) {
                    g0Var.f19489e = !g0Var.d.canScrollVertically(-1);
                    g0Var.d.canScrollVertically(1);
                }
                break;
            case 22:
                b8 b8Var = (b8) this.f739b;
                n7 n7Var = b8Var.f27026n;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AndroidUtilities.hideKeyboard(b8Var.getCurrentFocus());
                    }
                    break;
                } else if (((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop + ((b8Var.f27039w0 - ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && n7Var.canScrollVertically(1) && (lk0Var = (lk0) n7Var.K(b8Var.f27032r0 ? 1 : 0)) != null) {
                    View view = lk0Var.f5789a;
                    if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                        n7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                    }
                    break;
                }
                break;
            case 25:
                ui uiVar = (ui) this.f739b;
                hh.f1 f1Var = uiVar.f33086n;
                gi giVar = uiVar.f34900b;
                if (i10 == 0) {
                    int iDp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = giVar.W0;
                    int iDp2 = iDp + (v0Var != null ? AndroidUtilities.dp(v0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = giVar.getBackgroundPaddingTop();
                    if (((giVar.X1[0] - backgroundPaddingTop) - iDp2) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (lk0Var2 = (lk0) f1Var.K(0)) != null) {
                        View view2 = lk0Var2.f5789a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            f1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                        }
                        break;
                    }
                }
                break;
            case 27:
                bk bkVar = (bk) this.f739b;
                qj qjVar = bkVar.f27115r;
                gi giVar2 = bkVar.f34900b;
                if (i10 == 0) {
                    int iDp3 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = giVar2.getBackgroundPaddingTop();
                    if (((giVar2.X1[0] - backgroundPaddingTop2) - iDp3) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (lk0Var3 = (lk0) qjVar.K(0)) != null && (top = (lk0Var3.f5789a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        qjVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && bkVar.U && qjVar.getAdapter() == bkVar.f27119y) {
                    AndroidUtilities.hideKeyboard(giVar2.getCurrentFocus());
                }
                bkVar.Q = i10 != 0;
                break;
            case 28:
                ck ckVar = (ck) this.f739b;
                zk0 zk0Var = ckVar.f27471r;
                gi giVar3 = ckVar.f34900b;
                if (i10 == 0) {
                    int iDp4 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var2 = giVar3.W0;
                    int iDp5 = iDp4 + (v0Var2 != null ? AndroidUtilities.dp(v0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = giVar3.getBackgroundPaddingTop();
                    if (((giVar3.X1[0] - backgroundPaddingTop3) - iDp5) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (lk0Var4 = (lk0) zk0Var.K(0)) != null) {
                        View view3 = lk0Var4.f5789a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            zk0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                        }
                        break;
                    }
                }
                break;
            case 29:
                if (i10 == 1) {
                    tk tkVar = (tk) this.f739b;
                    if (tkVar.f32805h0 && tkVar.f32806i0) {
                        AndroidUtilities.hideKeyboard(tkVar.f34900b.getCurrentFocus());
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        float f10;
        float y10;
        boolean z10;
        float y11;
        int measuredHeight;
        lh.e2 e2Var;
        int iR;
        lh.e2 e2Var2;
        pf.e0 e0Var;
        switch (this.f738a) {
            case 0:
                w1 w1Var = (w1) this.f739b;
                if (recyclerView.getScrollState() == 1) {
                    w1Var.w1(null, true);
                }
                w1Var.invalidate();
                break;
            case 2:
                ((ch.h) this.f739b).R();
                break;
            case 3:
                f2.k0 k0Var = (f2.k0) recyclerView.getLayoutManager();
                fh.v vVar = (fh.v) this.f739b;
                fh.i iVar = vVar.C;
                if (vVar.f6193x && !vVar.f6192w && k0Var != null) {
                    if (vVar.f6177f.h() - k0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        AndroidUtilities.runOnUIThread(iVar);
                    }
                    break;
                }
                break;
            case 4:
                y5 y5Var = (y5) this.f739b;
                for (int i12 = 0; i12 < y5Var.f7685n.getChildCount(); i12++) {
                    if (y5Var.f7685n.getChildAt(i12) instanceof h00) {
                        y5Var.d.g(false);
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = y5Var.h.animate();
                        if (y5Var.G || !y5Var.f7685n.canScrollVertically(-1)) {
                            f10 = 0.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        rl.o(viewPropertyAnimatorAnimate.alpha(f10), er.h, 320L);
                    }
                    break;
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = y5Var.h.animate();
                if (y5Var.G) {
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                }
                rl.o(viewPropertyAnimatorAnimate2.alpha(f10), er.h, 320L);
                break;
            case 5:
                ((x5) this.f739b).Z();
                break;
            case 6:
                hh.r rVar = (hh.r) this.f739b;
                if (rVar.f9949a == 1) {
                    if (rVar.f9956e.canScrollVertically(1)) {
                        for (int i13 = 0; i13 < rVar.f9956e.getChildCount(); i13++) {
                            if (!(rVar.f9956e.getChildAt(i13) instanceof h00)) {
                            }
                        }
                    }
                    hh.r.e0(rVar);
                }
                break;
            case 7:
                hh.l1 l1Var = (hh.l1) this.f739b;
                jg.e eVar = l1Var.f9651o0;
                View view = l1Var.m0;
                FrameLayout frameLayout = l1Var.f9645h0;
                zk0 zk0Var = l1Var.d;
                int childCount = zk0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = zk0Var.getChildAt(childCount);
                        int iR2 = RecyclerView.R(childAt);
                        if (iR2 >= 0) {
                            if (iR2 == 2) {
                                y11 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            } else {
                                if (iR2 == 1) {
                                    y10 = childAt.getY();
                                } else if (iR2 == 0) {
                                    y11 = childAt.getY();
                                    measuredHeight = frameLayout.getMeasuredHeight();
                                }
                                z10 = true;
                            }
                            y10 = y11 - measuredHeight;
                            z10 = true;
                        }
                        childCount--;
                    } else {
                        y10 = 0.0f;
                        z10 = false;
                    }
                    boolean z11 = !z10 || ((float) frameLayout.getHeight()) + y10 < 0.0f;
                    if (l1Var.f9656t0 != z11) {
                        l1Var.f9656t0 = z11;
                        if (z11) {
                            view.setVisibility(0);
                        }
                        view.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new fh.f(1, l1Var, z11)).start();
                    }
                    l1Var.G = y10 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                    frameLayout.setVisibility(z10 ? 0 : 8);
                    frameLayout.setTranslationY(y10);
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 31 && eVar != null) {
                        eVar.f(i10, i11);
                        if (i14 >= 31 && eVar != null) {
                            l1Var.Q(1);
                            break;
                        }
                    }
                }
                break;
            case 8:
                ((i5) this.f739b).U.e();
                break;
            case 9:
                la laVar = (la) this.f739b;
                k51 k51Var = laVar.f9688a;
                if (k51Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < k51Var.getChildCount(); i15++) {
                        if (!(k51Var.getChildAt(i15) instanceof h00)) {
                        }
                    }
                }
                laVar.h.run();
                break;
            case 10:
                ((ig.v) this.f739b).c(true);
                break;
            case 11:
                yw ywVar = (yw) this.f739b;
                ywVar.invalidate();
                ywVar.c();
                w3 w3Var = ywVar.F;
                if (w3Var != null) {
                    w3Var.e(true);
                }
                break;
            case 12:
                c5 c5Var = (c5) this.f739b;
                c5Var.c();
                c5Var.invalidate();
                break;
            case 13:
                lh.u1 u1Var = (lh.u1) this.f739b;
                lh.s1 s1Var = u1Var.f16897c;
                lh.l2 l2Var = u1Var.f16901r;
                ((org.telegram.ui.ActionBar.e3) l2Var).containerView.invalidate();
                if (((org.telegram.ui.ActionBar.e3) l2Var).keyboardVisible && u1Var.f16896b.G1 && (e2Var = u1Var.d) != null && e2Var.d != null) {
                    l2Var.o0();
                }
                if (u1Var.f16898e.M0() + 7 >= s1Var.h() - 1) {
                    s1Var.G();
                }
                break;
            case 14:
                lh.z1 z1Var = (lh.z1) this.f739b;
                lh.y1 y1Var = z1Var.f17174c;
                lh.o1 o1Var = z1Var.f17173b;
                lh.l2 l2Var2 = z1Var.f17179s;
                ((org.telegram.ui.ActionBar.e3) l2Var2).containerView.invalidate();
                int i16 = -1;
                if (z1Var.f17177n < 0.0f) {
                    iR = z1Var.d.I0();
                } else {
                    int i17 = 0;
                    while (true) {
                        if (i17 < o1Var.getChildCount()) {
                            View childAt2 = o1Var.getChildAt(i17);
                            if (childAt2.getY() + childAt2.getHeight() > z1Var.f17177n + o1Var.getPaddingTop()) {
                                o1Var.getClass();
                                iR = RecyclerView.R(childAt2);
                            } else {
                                i17++;
                            }
                        } else {
                            iR = -1;
                        }
                    }
                    if (iR == -1) {
                    }
                }
                for (int size = y1Var.f17078y.size() - 1; size >= 0; size--) {
                    int iKeyAt = y1Var.f17078y.keyAt(size);
                    int iValueAt = y1Var.f17078y.valueAt(size);
                    if (iR >= iKeyAt) {
                        i16 = iValueAt;
                        if (i16 >= 0) {
                            z1Var.f17175e.j(i16, true);
                        }
                        if (!((org.telegram.ui.ActionBar.e3) l2Var2).keyboardVisible && o1Var.G1 && (e2Var2 = z1Var.f17176f) != null && e2Var2.d != null) {
                            l2Var2.o0();
                            break;
                        }
                    }
                }
                if (i16 >= 0) {
                    z1Var.f17175e.j(i16, true);
                }
                if (!((org.telegram.ui.ActionBar.e3) l2Var2).keyboardVisible) {
                }
                break;
            case 15:
                ze zeVar = (ze) this.f739b;
                View viewM = zeVar.f19010c.getLayoutManager().m(0);
                float y12 = viewM != null ? viewM.getY() : 0.0f;
                zeVar.h = y12 >= 0.0f ? y12 : 0.0f;
                zeVar.b();
                break;
            case 16:
                s3 s3Var = (s3) this.f739b;
                long j10 = s3Var.L;
                for (int i18 = 0; i18 < s3Var.f36342c.getChildCount(); i18++) {
                    if (s3Var.f36342c.getChildAt(i18) instanceof h00) {
                        hh.c0.g(((org.telegram.ui.ActionBar.n2) s3Var).currentAccount).d(j10).a();
                        hh.c0.g(((org.telegram.ui.ActionBar.n2) s3Var).currentAccount).e(j10).a();
                    }
                    break;
                }
                if (recyclerView.canScrollVertically(1)) {
                }
                hh.c0.g(((org.telegram.ui.ActionBar.n2) s3Var).currentAccount).d(j10).a();
                hh.c0.g(((org.telegram.ui.ActionBar.n2) s3Var).currentAccount).e(j10).a();
                break;
            case 17:
                oh.r rVar2 = (oh.r) this.f739b;
                rVar2.v.b(rVar2.d);
                break;
            case 18:
                ((org.telegram.ui.ActionBar.e3) ((oh.g0) this.f739b).f19490f).containerView.invalidate();
                break;
            case 19:
                oh.i0 i0Var = (oh.i0) this.f739b;
                i0Var.h.I.b(i0Var.d);
                break;
            case 20:
                ((org.telegram.messenger.voip.l0) this.f739b).run();
                break;
            case 21:
                ((org.telegram.ui.Components.e0) this.f739b).r0();
                break;
            case 22:
                b8 b8Var = (b8) this.f739b;
                f2.k0 k0Var2 = b8Var.f27031r;
                b8.P(b8Var);
                b8Var.E0();
                if (!b8Var.f27018f) {
                    int iL0 = k0Var2.L0();
                    if (b8Var.f27032r0) {
                        iL0 = Math.max(0, iL0 - 1);
                    }
                    int iAbs = iL0 != -1 ? Math.abs(k0Var2.N0() - iL0) + 1 : 0;
                    int iH = recyclerView.getAdapter().h();
                    MediaController.getInstance().getPlayingMessageObject();
                    if (SharedConfig.playOrderReversed) {
                        if (iL0 < 10) {
                            MediaController.getInstance().loadMoreMusic();
                        }
                    } else if (iL0 + iAbs > iH - 10) {
                        MediaController.getInstance().loadMoreMusic();
                    }
                }
                break;
            case 23:
                ((zu0) this.f739b).invalidate();
                break;
            case 24:
                ri riVar = (ri) this.f739b;
                riVar.f34900b.X1(riVar, i11);
                break;
            case 25:
                ui uiVar = (ui) this.f739b;
                if (uiVar.f33086n.getChildCount() > 0) {
                    uiVar.f34900b.X1(uiVar, i11);
                    break;
                }
                break;
            case 26:
                lj ljVar = (lj) this.f739b;
                ljVar.f34900b.X1(ljVar, i11);
                ljVar.O();
                break;
            case 27:
                bk bkVar = (bk) this.f739b;
                zi ziVar = bkVar.A;
                bkVar.f34900b.X1(bkVar, i11);
                bkVar.U();
                f2.q0 adapter = bkVar.f27115r.getAdapter();
                ak akVar = bkVar.f27119y;
                if (adapter == akVar) {
                    int iL1 = ziVar.L0();
                    int iN0 = ziVar.N0();
                    int iAbs2 = Math.abs(iN0 - iL1) + 1;
                    int iH2 = recyclerView.getAdapter().h();
                    if (iAbs2 > 0 && iN0 >= iH2 - 10) {
                        ak akVar2 = akVar.T.f27119y;
                        if (!akVar2.O && !akVar2.R && (e0Var = akVar.f26758y) != null) {
                            akVar.Z(akVar.f26757x, akVar.A, akVar.B, e0Var, akVar.F, false);
                            break;
                        }
                    }
                }
                break;
            case 28:
                ck ckVar = (ck) this.f739b;
                ckVar.f34900b.X1(ckVar, i11);
                ckVar.v.setTranslationY(Math.max(0, ckVar.getCurrentItemTop()));
                break;
        }
    }
}
