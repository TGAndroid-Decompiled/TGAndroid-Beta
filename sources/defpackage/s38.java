package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.t;
import org.telegram.ui.u;
public final class s38 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public s38(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                ((PhotoViewer) ((u5) obj).c).B2 = null;
                return;
            case 16:
                ((ih8) obj).q1 = null;
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
                t38 t38Var = (t38) this.b;
                a58 a58Var = t38Var.E7;
                a58Var.invalidate();
                t38Var.setAnimatedTop(0);
                a58Var.L2 = true;
                View view = t38Var.w2;
                if (view != null && view.getVisibility() == 0) {
                    t38Var.w2.setTranslationY(((1.0f - t38Var.getTopViewEnterProgress()) * t38Var.w2.getLayoutParams().height) + t38Var.J2);
                }
                a58Var.U1 = null;
                return;
            case 1:
                TextView[] textViewArr = ((x48) this.b).c;
                textViewArr[1].setVisibility(8);
                textViewArr[0].setAlpha(1.0f);
                textViewArr[0].setTranslationY(0.0f);
                return;
            case 2:
                q68 q68Var = (q68) this.b;
                if (animator.equals(q68Var.n)) {
                    q68Var.n = null;
                    return;
                }
                return;
            case 3:
                z68 z68Var = (z68) ((ei7) this.b).b;
                if (animator.equals(z68Var.d)) {
                    z68Var.d = null;
                    return;
                }
                return;
            case 4:
                gm.d3(((z68) this.b).e, 1000L);
                return;
            case 5:
                b88 b88Var = (b88) this.b;
                d88 d88Var = b88Var.t0;
                d88Var.r = null;
                boolean z5 = d88Var.x;
                c88[] c88VarArr = d88Var.n;
                if (z5) {
                    c88VarArr[1].setVisibility(8);
                } else {
                    c88 c88Var = c88VarArr[0];
                    c88VarArr[0] = c88VarArr[1];
                    c88VarArr[1] = c88Var;
                    c88Var.setVisibility(8);
                    if (d88Var.n[0].b == d88Var.h.getFirstTabId()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    d88Var.e = z;
                    d88Var.h.i(1.0f, d88Var.n[0].b);
                }
                d88Var.s = false;
                b88Var.o0 = false;
                b88Var.n0 = false;
                d88.h0(d88Var).setEnabled(true);
                d88Var.h.setEnabled(true);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) ((u5) this.b).c;
                if (photoViewer.B2 != null) {
                    q78 q78Var = new q78(this, (byte) 5);
                    photoViewer.I2 = q78Var;
                    gm.d3(q78Var, 860L);
                    return;
                }
                return;
            case 7:
                t tVar = (t) this.b;
                PhotoViewer photoViewer2 = tVar.b;
                u43 u43Var = photoViewer2.D1.b;
                u43Var.q();
                CropAreaView cropAreaView = u43Var.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.b.K = true;
                photoViewer2.o6 = null;
                photoViewer2.t4 = tVar.a;
                mx5 mx5Var = photoViewer2.d0().M;
                if (photoViewer2.t4 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mx5Var.b(z2);
                mx5 mx5Var2 = photoViewer2.L1;
                if (mx5Var2 != null) {
                    if (photoViewer2.t4 != 3) {
                        z4 = true;
                    }
                    mx5Var2.b(z4);
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
            case 8:
                u uVar = (u) this.b;
                PhotoViewer photoViewer3 = uVar.b;
                photoViewer3.J1.j0.setVisibility(0);
                photoViewer3.o6 = null;
                photoViewer3.t4 = uVar.a;
                mx5 mx5Var3 = photoViewer3.d0().M;
                if (photoViewer3.t4 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                mx5Var3.b(z3);
                mx5 mx5Var4 = photoViewer3.L1;
                if (mx5Var4 != null) {
                    if (photoViewer3.t4 != 3) {
                        z4 = true;
                    }
                    mx5Var4.b(z4);
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
            case 9:
                ((PhotoViewer) ((ta8) this.b).q0).y3[0].setTag(null);
                return;
            case 10:
                ((ua8) this.b).d.U1.k0 = 1.0f;
                return;
            case 11:
                PhotoViewer photoViewer4 = ((ua8) this.b).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.k0 = 1.0f;
                return;
            case 12:
                gm.c3(new q78(this, (byte) 7));
                return;
            case 13:
                PhotoViewer photoViewer5 = ((pa8) this.b).c;
                if (animator.equals(photoViewer5.Z7)) {
                    photoViewer5.Z7 = null;
                    return;
                }
                return;
            case 14:
                ob8 ob8Var = (ob8) this.b;
                if (ob8Var.e == animator) {
                    ob8Var.c[1].setVisibility(8);
                    ob8Var.e = null;
                    return;
                }
                return;
            case 15:
                pc8 pc8Var = (pc8) this.b;
                if (pc8Var.C != null) {
                    pc8Var.C = null;
                    pc8Var.b();
                    return;
                }
                return;
            case 16:
                return;
            case 17:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.b;
                Runnable runnable = popupNotificationActivity.Z;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Z = null;
                    return;
                }
                return;
            case 18:
                th8 th8Var = (th8) this.b;
                th8Var.f = false;
                th8Var.G = null;
                return;
            case 19:
                cj8 cj8Var = (cj8) this.b;
                if (cj8Var.r) {
                    f = 1.0f;
                }
                cj8Var.s = f;
                cj8Var.e();
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((xk8) this.b).x = null;
                return;
            case 21:
                super.onAnimationEnd(animator);
                om8 om8Var = (om8) this.b;
                if (om8Var.getParent() != null) {
                    ((ViewGroup) om8Var.getParent()).removeView(om8Var);
                    return;
                }
                return;
            case 22:
                cic cicVar = (cic) this.b;
                if (!cicVar.a) {
                    cicVar.W.w.T = true;
                    cicVar.W.w.invalidate();
                    return;
                }
                return;
            case 23:
                ((cp8) this.b).b.a6 = null;
                return;
            case 24:
                mq8 mq8Var = (mq8) this.b;
                if (!mq8Var.F) {
                    mq8Var.setVisibility(8);
                    return;
                }
                return;
            case 25:
                st8 st8Var = (st8) this.b;
                if (animator.equals(st8Var.d)) {
                    st8Var.d = null;
                    return;
                }
                return;
            case 26:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                yo8 yo8Var = profileStoriesView.h;
                profileStoriesView.H = 1.0f;
                yo8Var.S = 1.0f;
                yo8Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 27:
                ((ww8) this.b).b();
                return;
            case 28:
                ((c29) this.b).h.setVisibility(8);
                return;
            default:
                ((Runnable) this.b).run();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
                PhotoViewer photoViewer = ((t) obj).b;
                photoViewer.V0.setVisibility(0);
                photoViewer.D1.setVisibility(0);
                return;
            case 8:
                return;
            case 24:
                ((mq8) obj).setVisibility(0);
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
