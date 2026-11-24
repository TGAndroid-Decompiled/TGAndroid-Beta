package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.t;
import org.telegram.ui.u;
public final class l48 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public l48(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ((PhotoViewer) ((u5) obj).c).B2 = null;
                return;
            case 14:
                ((gf8) obj).q1 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        boolean z2;
        boolean z3;
        float f = 0.0f;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                o48 o48Var = (o48) this.b;
                if (animator.equals(o48Var.n)) {
                    o48Var.n = null;
                    return;
                }
                return;
            case 1:
                x48 x48Var = (x48) ((bg7) this.b).b;
                if (animator.equals(x48Var.d)) {
                    x48Var.d = null;
                    return;
                }
                return;
            case 2:
                gl.d3(((x48) this.b).e, 1000L);
                return;
            case 3:
                z58 z58Var = (z58) this.b;
                b68 b68Var = z58Var.t0;
                b68Var.r = null;
                boolean z5 = b68Var.x;
                a68[] a68VarArr = b68Var.n;
                if (z5) {
                    a68VarArr[1].setVisibility(8);
                } else {
                    a68 a68Var = a68VarArr[0];
                    a68VarArr[0] = a68VarArr[1];
                    a68VarArr[1] = a68Var;
                    a68Var.setVisibility(8);
                    if (b68Var.n[0].b == b68Var.h.getFirstTabId()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    b68Var.e = z;
                    b68Var.h.i(1.0f, b68Var.n[0].b);
                }
                b68Var.s = false;
                z58Var.o0 = false;
                z58Var.n0 = false;
                b68.g0(b68Var).setEnabled(true);
                b68Var.h.setEnabled(true);
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) ((u5) this.b).c;
                if (photoViewer.B2 != null) {
                    oq7 oq7Var = new oq7(this, (byte) 28);
                    photoViewer.I2 = oq7Var;
                    gl.d3(oq7Var, 860L);
                    return;
                }
                return;
            case 5:
                t tVar = (t) this.b;
                PhotoViewer photoViewer2 = tVar.b;
                j33 j33Var = photoViewer2.D1.b;
                j33Var.q();
                CropAreaView cropAreaView = j33Var.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.b.K = true;
                photoViewer2.o6 = null;
                photoViewer2.t4 = tVar.a;
                mv5 mv5Var = photoViewer2.d0().M;
                if (photoViewer2.t4 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mv5Var.b(z2);
                mv5 mv5Var2 = photoViewer2.L1;
                if (mv5Var2 != null) {
                    if (photoViewer2.t4 != 3) {
                        z4 = true;
                    }
                    mv5Var2.b(z4);
                }
                if (photoViewer2.t4 != 3) {
                    photoViewer2.Y5 = 0.0f;
                }
                photoViewer2.n6 = -1;
                photoViewer2.d6 = 1.0f;
                photoViewer2.Z5 = 1.0f;
                photoViewer2.b6 = 0.0f;
                photoViewer2.c6 = 0.0f;
                photoViewer2.I2(1.0f);
                photoViewer2.u2 = true;
                photoViewer2.f0.invalidate();
                return;
            case 6:
                u uVar = (u) this.b;
                PhotoViewer photoViewer3 = uVar.b;
                photoViewer3.J1.j0.setVisibility(0);
                photoViewer3.o6 = null;
                photoViewer3.t4 = uVar.a;
                mv5 mv5Var3 = photoViewer3.d0().M;
                if (photoViewer3.t4 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                mv5Var3.b(z3);
                mv5 mv5Var4 = photoViewer3.L1;
                if (mv5Var4 != null) {
                    if (photoViewer3.t4 != 3) {
                        z4 = true;
                    }
                    mv5Var4.b(z4);
                }
                if (photoViewer3.t4 != 3) {
                    photoViewer3.Y5 = 0.0f;
                }
                photoViewer3.n6 = -1;
                photoViewer3.d6 = 1.0f;
                photoViewer3.Z5 = 1.0f;
                photoViewer3.b6 = 0.0f;
                photoViewer3.c6 = 0.0f;
                photoViewer3.I2(1.0f);
                photoViewer3.u2 = true;
                photoViewer3.f0.invalidate();
                return;
            case 7:
                ((PhotoViewer) ((r88) this.b).q0).y3[0].setTag(null);
                return;
            case 8:
                ((s88) this.b).d.U1.k0 = 1.0f;
                return;
            case 9:
                PhotoViewer photoViewer4 = ((s88) this.b).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.k0 = 1.0f;
                return;
            case 10:
                gl.c3(new w88(this, (byte) 0));
                return;
            case 11:
                PhotoViewer photoViewer5 = ((n88) this.b).c;
                if (animator.equals(photoViewer5.Z7)) {
                    photoViewer5.Z7 = null;
                    return;
                }
                return;
            case 12:
                n98 n98Var = (n98) this.b;
                if (n98Var.e == animator) {
                    n98Var.c[1].setVisibility(8);
                    n98Var.e = null;
                    return;
                }
                return;
            case 13:
                ma8 ma8Var = (ma8) this.b;
                if (ma8Var.C != null) {
                    ma8Var.C = null;
                    ma8Var.b();
                    return;
                }
                return;
            case 14:
                return;
            case 15:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                Runnable runnable = popupNotificationActivity.Z;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Z = null;
                    return;
                }
                return;
            case 16:
                rf8 rf8Var = (rf8) this.b;
                rf8Var.f = false;
                rf8Var.G = null;
                return;
            case 17:
                ah8 ah8Var = (ah8) this.b;
                if (ah8Var.r) {
                    f = 1.0f;
                }
                ah8Var.s = f;
                ah8Var.e();
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((ui8) this.b).x = null;
                return;
            case 19:
                super.onAnimationEnd(animator);
                mk8 mk8Var = (mk8) this.b;
                if (mk8Var.getParent() != null) {
                    ((ViewGroup) mk8Var.getParent()).removeView(mk8Var);
                    return;
                }
                return;
            case 20:
                bgc bgcVar = (bgc) this.b;
                if (!bgcVar.a) {
                    bgcVar.W.w.T = true;
                    bgcVar.W.w.invalidate();
                    return;
                }
                return;
            case 21:
                ((bn8) this.b).b.V5 = null;
                return;
            case 22:
                lo8 lo8Var = (lo8) this.b;
                if (!lo8Var.F) {
                    lo8Var.setVisibility(8);
                    return;
                }
                return;
            case 23:
                pr8 pr8Var = (pr8) this.b;
                if (animator.equals(pr8Var.d)) {
                    pr8Var.d = null;
                    return;
                }
                return;
            case 24:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                xm8 xm8Var = profileStoriesView.h;
                profileStoriesView.H = 1.0f;
                xm8Var.S = 1.0f;
                xm8Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 25:
                ((vu8) this.b).b();
                return;
            case 26:
                ((a09) this.b).h.setVisibility(8);
                return;
            case 27:
                ((Runnable) this.b).run();
                return;
            case 28:
                ((a19) this.b).y.c();
                return;
            default:
                o39 o39Var = (o39) this.b;
                View view = o39Var.b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (o39Var.c1()) {
                    o39Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                PhotoViewer photoViewer = ((t) obj).b;
                photoViewer.V0.setVisibility(0);
                photoViewer.D1.setVisibility(0);
                return;
            case 6:
                return;
            case 22:
                ((lo8) obj).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
