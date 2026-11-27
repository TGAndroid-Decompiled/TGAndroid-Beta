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
public final class n88 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public n88(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                ((PhotoViewer) ((v5) obj).c).B2 = null;
                return;
            case 13:
                ((ui8) obj).q1 = null;
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
                o88 o88Var = (o88) ((ki7) this.b).b;
                if (animator.equals(o88Var.d)) {
                    o88Var.d = null;
                    return;
                }
                return;
            case 1:
                hl.d3(((o88) this.b).e, 1000L);
                return;
            case 2:
                q98 q98Var = (q98) this.b;
                s98 s98Var = q98Var.n0;
                s98Var.r = null;
                boolean z5 = s98Var.x;
                r98[] r98VarArr = s98Var.n;
                if (z5) {
                    r98VarArr[1].setVisibility(8);
                } else {
                    r98 r98Var = r98VarArr[0];
                    r98VarArr[0] = r98VarArr[1];
                    r98VarArr[1] = r98Var;
                    r98Var.setVisibility(8);
                    if (s98Var.n[0].b == s98Var.h.getFirstTabId()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    s98Var.e = z;
                    s98Var.h.i(1.0f, s98Var.n[0].b);
                }
                s98Var.s = false;
                q98Var.i0 = false;
                q98Var.h0 = false;
                s98.k0(s98Var).setEnabled(true);
                s98Var.h.setEnabled(true);
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) ((v5) this.b).c;
                if (photoViewer.B2 != null) {
                    x38 x38Var = new x38(this, (byte) 13);
                    photoViewer.I2 = x38Var;
                    hl.d3(x38Var, 860L);
                    return;
                }
                return;
            case 4:
                t tVar = (t) this.b;
                PhotoViewer photoViewer2 = tVar.b;
                b43 b43Var = photoViewer2.D1.b;
                b43Var.q();
                CropAreaView cropAreaView = b43Var.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.b.K = true;
                photoViewer2.o6 = null;
                photoViewer2.t4 = tVar.a;
                rx5 rx5Var = photoViewer2.c0().M;
                if (photoViewer2.t4 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                rx5Var.b(z2);
                rx5 rx5Var2 = photoViewer2.L1;
                if (rx5Var2 != null) {
                    if (photoViewer2.t4 != 3) {
                        z4 = true;
                    }
                    rx5Var2.b(z4);
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
            case 5:
                u uVar = (u) this.b;
                PhotoViewer photoViewer3 = uVar.b;
                photoViewer3.J1.j0.setVisibility(0);
                photoViewer3.o6 = null;
                photoViewer3.t4 = uVar.a;
                rx5 rx5Var3 = photoViewer3.c0().M;
                if (photoViewer3.t4 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                rx5Var3.b(z3);
                rx5 rx5Var4 = photoViewer3.L1;
                if (rx5Var4 != null) {
                    if (photoViewer3.t4 != 3) {
                        z4 = true;
                    }
                    rx5Var4.b(z4);
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
            case 6:
                ((PhotoViewer) ((ic8) this.b).q0).y3[0].setTag(null);
                return;
            case 7:
                ((jc8) this.b).d.U1.k0 = 1.0f;
                return;
            case 8:
                PhotoViewer photoViewer4 = ((jc8) this.b).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.k0 = 1.0f;
                return;
            case 9:
                hl.c3(new x38(this, (byte) 15));
                return;
            case 10:
                PhotoViewer photoViewer5 = ((ec8) this.b).c;
                if (animator.equals(photoViewer5.Z7)) {
                    photoViewer5.Z7 = null;
                    return;
                }
                return;
            case 11:
                dd8 dd8Var = (dd8) this.b;
                if (dd8Var.e == animator) {
                    dd8Var.c[1].setVisibility(8);
                    dd8Var.e = null;
                    return;
                }
                return;
            case 12:
                de8 de8Var = (de8) this.b;
                if (de8Var.C != null) {
                    de8Var.C = null;
                    de8Var.b();
                    return;
                }
                return;
            case 13:
                return;
            case 14:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                Runnable runnable = popupNotificationActivity.Z;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Z = null;
                    return;
                }
                return;
            case 15:
                fj8 fj8Var = (fj8) this.b;
                fj8Var.f = false;
                fj8Var.G = null;
                return;
            case 16:
                ok8 ok8Var = (ok8) this.b;
                if (ok8Var.r) {
                    f = 1.0f;
                }
                ok8Var.s = f;
                ok8Var.e();
                return;
            case 17:
                super.onAnimationEnd(animator);
                ((hm8) this.b).x = null;
                return;
            case 18:
                super.onAnimationEnd(animator);
                zn8 zn8Var = (zn8) this.b;
                if (zn8Var.getParent() != null) {
                    ((ViewGroup) zn8Var.getParent()).removeView(zn8Var);
                    return;
                }
                return;
            case 19:
                gkc gkcVar = (gkc) this.b;
                if (!gkcVar.a) {
                    gkcVar.W.w.T = true;
                    gkcVar.W.w.invalidate();
                    return;
                }
                return;
            case 20:
                ((mq8) this.b).b.V5 = null;
                return;
            case 21:
                xr8 xr8Var = (xr8) this.b;
                if (!xr8Var.F) {
                    xr8Var.setVisibility(8);
                    return;
                }
                return;
            case 22:
                zu8 zu8Var = (zu8) this.b;
                if (animator.equals(zu8Var.d)) {
                    zu8Var.d = null;
                    return;
                }
                return;
            case 23:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                iq8 iq8Var = profileStoriesView.h;
                profileStoriesView.H = 1.0f;
                iq8Var.S = 1.0f;
                iq8Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 24:
                ((ey8) this.b).b();
                return;
            case 25:
                ((o39) this.b).h.setVisibility(8);
                return;
            case 26:
                ((Runnable) this.b).run();
                return;
            case 27:
                ((p49) this.b).y.c();
                return;
            case 28:
                d79 d79Var = (d79) this.b;
                View view = d79Var.b1;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (d79Var.d1()) {
                    d79Var.invalidate();
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                ((ek9) this.b).w = null;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                PhotoViewer photoViewer = ((t) obj).b;
                photoViewer.V0.setVisibility(0);
                photoViewer.D1.setVisibility(0);
                return;
            case 5:
                return;
            case 21:
                ((xr8) obj).setVisibility(0);
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
