package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class s20 implements q21 {
    public final byte a;
    public final Object b;

    public s20(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                return true;
            case 5:
                return false;
        }
    }

    @Override
    public final void b(float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                ia1 ia1Var = (ia1) obj;
                ia1Var.R = Math.max(0.0f, (f - ia1Var.S) - ia1Var.Q);
                ia1Var.b0();
                return;
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.k0 = Math.max(0.0f, (f - contactsActivity.l0) - contactsActivity.j0);
                contactsActivity.e0();
                return;
            case 8:
                return;
            case 9:
                nk3 nk3Var = (nk3) obj;
                UndoView undoView = nk3Var.z0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    nk3Var.w1 = Math.max(0.0f, (f - nk3Var.m4) - nk3Var.p4);
                    nk3Var.u5();
                    return;
                }
                return;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                return;
        }
    }

    @Override
    public final void c(u31 u31Var) {
        w48 w48Var;
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return;
            case 13:
                if (u31Var.a == 2 && (w48Var = ((g48) this.b).y.G1) != null) {
                    oab oabVar = ((fab) w48Var).d;
                    oabVar.Y0 = false;
                    oabVar.U();
                    return;
                }
                return;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                return;
        }
    }

    @Override
    public final boolean d() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 16:
                if (((ProfileActivity) this.b).D5 == null) {
                    return true;
                }
                return false;
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                return true;
        }
    }

    @Override
    public final int e(int i) {
        int i2;
        int i3;
        pb8 pb8Var;
        int L;
        float f;
        int[] iArr;
        int[] iArr2;
        byte b = this.a;
        int i4 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((w20) obj).e.x1.getHeight();
            case 1:
                qw0 qw0Var = (qw0) obj;
                if (!(qw0Var.getParent() instanceof d32)) {
                    return 0;
                }
                d32 d32Var = (d32) qw0Var.getParent();
                return (int) ((d32Var.getSwipeOffsetY() + d32Var.getOffsetY()) - d32Var.getTopActionBarOffsetY());
            case 2:
                return 0;
            case 3:
                ia1 ia1Var = (ia1) obj;
                i2 = ia1Var.S;
                i3 = ia1Var.Q;
                break;
            case 4:
                return ((vi1) obj).P.getMeasuredHeight();
            case 5:
                yv1 yv1Var = (yv1) obj;
                qr1 qr1Var = yv1Var.w;
                if (i == 1) {
                    return 0;
                }
                if (i == 1313167187 && yv1Var.d1 != null) {
                    return Math.round(qr1Var.d() + gm.L(62.0f));
                }
                return Math.round(yv1Var.U.getInputBubbleHeight() + gm.L(16.0f) + yv1Var.u7(izb.c) + qr1Var.d());
            case 6:
                return ((m62) obj).c.b.O() + gm.L(126.0f);
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                i2 = contactsActivity.l0;
                i3 = contactsActivity.j0;
                break;
            case 8:
                return (int) ((x53) ((su) obj).c).u;
            case 9:
                nk3 nk3Var = (nk3) obj;
                if (nk3Var.a3 != 0) {
                    return gm.L(60.0f) + nk3Var.m4;
                }
                return nk3Var.F2();
            case 10:
                return 0;
            case 11:
                i3 = ((bj6) obj).L;
                i2 = gm.L(64.0f);
                break;
            case 12:
                i3 = cm6.Z((cm6) obj).d;
                i2 = gm.L(72.0f);
                break;
            case 13:
                if (((g48) obj).y.n2) {
                    return 0;
                }
                return gm.L(64.0f);
            case 14:
                PhotoViewer photoViewer = ((lb8) obj).u0;
                if (photoViewer.Q4) {
                    aa8 aa8Var = photoViewer.V1;
                    if (aa8Var != null) {
                        i4 = aa8Var.M.l;
                        if (aa8Var.getVisibility() == 0 && ((pb8Var = photoViewer.d) == null || !pb8Var.z())) {
                            i4 = hg9.v(12.0f, photoViewer.V1.getEditTextHeight(), i4);
                        }
                    }
                    jp0 jp0Var = photoViewer.Q0;
                    if (jp0Var != null && jp0Var.getVisibility() == 0) {
                        aa8 aa8Var2 = photoViewer.V1;
                        if (aa8Var2 == null || !aa8Var2.M.c()) {
                            return i4 + photoViewer.Q0.getHeight();
                        }
                        return i4;
                    }
                    return i4;
                }
                a6 a6Var = photoViewer.j0;
                if (a6Var != null && a6Var.getVisibility() == 0) {
                    i4 = (int) ((photoViewer.j0.getAlpha() * photoViewer.j0.getHeight()) + 0.0f);
                }
                td5 td5Var = photoViewer.m1;
                if (td5Var != null && td5Var.c()) {
                    if (gm.O1() || photoViewer.f0.getMeasuredHeight() > photoViewer.f0.getMeasuredWidth()) {
                        return (int) ((photoViewer.m1.getAlpha() * photoViewer.m1.getHeight()) + i4);
                    }
                    return i4;
                }
                return i4;
            case 15:
                return ((PremiumPreviewFragment) obj).p0.d;
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (profileActivity.D5 == null) {
                    L = profileActivity.U6 + profileActivity.T6;
                } else {
                    L = ((int) (((gm.L(52.0f) - profileActivity.D5.getTranslationY()) - (((1.0f - profileActivity.E5[1].getAlpha()) * gm.L(72.0f)) * profileActivity.O.b0(9, false))) - (((1.0f - profileActivity.E5[0].getAlpha()) * gm.L(72.0f)) * profileActivity.O.b0(8, true)))) + profileActivity.U6 + profileActivity.T6;
                }
                wp8 wp8Var = profileActivity.O;
                if (wp8Var != null && wp8Var.b0 != null) {
                    f = wp8Var.b0(14, false);
                } else {
                    f = 0.0f;
                }
                if (f > 0.0f) {
                    lea leaVar = profileActivity.O.b0;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = leaVar.r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i4 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return gm.U1(Math.min(1.0f, f), L, Math.max(L, i4));
                }
                return L;
            case 17:
                return ((i2a) obj).r.getPaddingBottom();
            case 18:
                return 0;
            case 19:
                FrameLayout frameLayout2 = ((x2b) obj).v1;
                if (frameLayout2 == null) {
                    return 0;
                }
                return frameLayout2.getHeight();
            case 20:
                i3 = ((v9b) obj).d1.getEditTextHeight();
                i2 = gm.L(12.0f);
                break;
            default:
                sxb sxbVar = (sxb) obj;
                ct8 ct8Var = sxbVar.p0;
                if (ct8Var == null || ct8Var.getVisibility() != 0) {
                    return 0;
                }
                return sxbVar.p0.getMeasuredHeight();
        }
        return i2 + i3;
    }

    @Override
    public final boolean f(int i) {
        switch (this.a) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                return false;
            case 2:
                if (((oz) this.b) != null) {
                    return true;
                }
                return false;
            case 13:
                if (i == 1 || i == 2 || i == 3) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void g(u31 u31Var) {
        nm0 c;
        w48 w48Var;
        byte b = this.a;
        float f = 16.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                y21 y21Var = u31Var.e;
                yv1 yv1Var = (yv1) obj;
                im0 c2 = yv1Var.L.c(y21Var, null, true);
                boolean z = u31Var.l;
                wv1 wv1Var = yv1Var.Ba;
                if (z) {
                    c = new nm0(wv1Var);
                    c.e = new qn0((byte) 22);
                    c.f(536870911, 536870911);
                    c.e(536870911, 536870911);
                    float N = gm.N(0.66f);
                    float N2 = gm.N(0.66f);
                    c.f = N;
                    c.h = N2;
                    c.d(536870912, 536870912);
                    c.n = gm.L(6.0f);
                    c.r = gm.L(2.0f);
                } else {
                    c = qqd.c(wv1Var);
                }
                c2.p(c);
                if (u31Var.l) {
                    f = 24.0f;
                }
                c2.r(gm.L(f));
                y21Var.setCustomBackground(c2);
                return;
            case 6:
            case 7:
            case 8:
                return;
            case 9:
                UndoView[] undoViewArr = ((nk3) obj).z0;
                UndoView undoView = undoViewArr[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    undoViewArr[0].d(2, true);
                    return;
                }
                return;
            case 10:
                y21 y21Var2 = u31Var.e;
                fw4 fw4Var = (fw4) obj;
                im0 c3 = fw4Var.o1.c(y21Var2, null, true);
                c3.p(qqd.c(fw4Var.J0));
                c3.r(gm.L(16.0f));
                y21Var2.setCustomBackground(c3);
                return;
            case 11:
            case 12:
                return;
            case 13:
                if (u31Var.a == 2 && (w48Var = ((g48) obj).y.G1) != null) {
                    oab oabVar = ((fab) w48Var).d;
                    oabVar.Y0 = true;
                    oabVar.U();
                    return;
                }
                return;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                return;
        }
    }

    @Override
    public final int h(int i) {
        a aVar;
        int max;
        int max2;
        a aVar2;
        a aVar3;
        a aVar4;
        int i2;
        int i3;
        int i4;
        a aVar5;
        PhotoViewer photoViewer;
        byte b = this.a;
        Object obj = this.b;
        int i5 = 0;
        switch (b) {
            case 0:
            case 1:
                return 0;
            case 2:
                if (((oz) obj) != null) {
                    return 0;
                }
                return gm.m;
            case 3:
            case 4:
                return 0;
            case 5:
                int currentActionBarHeight = a.getCurrentActionBarHeight() + gm.m;
                yv1 yv1Var = (yv1) obj;
                aVar = ((d) yv1Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((d) yv1Var).actionBar;
                    int measuredHeight = aVar2.getMeasuredHeight();
                    aVar3 = ((d) yv1Var).actionBar;
                    i5 = aVar3.getTop() + measuredHeight;
                }
                max = Math.max(currentActionBarHeight, i5);
                max2 = (int) Math.max(0.0f, yv1Var.Q9);
                break;
            case 6:
            case 7:
            case 8:
                return 0;
            case 9:
                nk3 nk3Var = (nk3) obj;
                aVar4 = ((d) nk3Var).actionBar;
                if (aVar4 != null) {
                    aVar5 = ((d) nk3Var).actionBar;
                    i2 = aVar5.getMeasuredHeight();
                } else {
                    i2 = 0;
                }
                ak3 ak3Var = nk3Var.A0;
                if (ak3Var != null && ak3Var.getVisibility() == 0) {
                    i3 = nk3Var.A0.getMeasuredHeight();
                } else {
                    i3 = 0;
                }
                int i6 = i2 + i3;
                qk3 qk3Var = nk3Var.L1;
                if (qk3Var != null) {
                    i4 = qk3Var.getHeight();
                } else {
                    i4 = 0;
                }
                int i7 = i6 + i4;
                aj3 aj3Var = nk3Var.F0;
                if (aj3Var != null && nk3Var.H0) {
                    i5 = (int) ((1.0f - aj3Var.getCollapsedProgress()) * gm.L(81.0f));
                }
                return gm.L(48.0f) + i7 + i5;
            case 10:
                return gm.m;
            case 11:
            case 12:
                return 0;
            case 13:
                return gm.L(58.0f);
            case 14:
                return a.getCurrentActionBarHeight() + gm.m + ((int) (((lb8) obj).u0.W1.getAlpha() * photoViewer.W1.getEditTextHeight()));
            case 15:
                return 0;
            case 16:
                max2 = gm.m;
                max = a.getCurrentActionBarHeight();
                break;
            case 17:
                return 0;
            case 18:
                return (int) (((g0b) obj).a + gm.L(58.0f));
            case 19:
            case 20:
            default:
                return 0;
        }
        return max + max2;
    }

    private final void A(float f) {
    }

    private final void B(u31 u31Var) {
    }

    private final void C(u31 u31Var) {
    }

    private final void D(u31 u31Var) {
    }

    private final void E(u31 u31Var) {
    }

    private final void F(u31 u31Var) {
    }

    private final void G(u31 u31Var) {
    }

    private final void H(u31 u31Var) {
    }

    private final void I(u31 u31Var) {
    }

    private final void J(u31 u31Var) {
    }

    private final void K(u31 u31Var) {
    }

    private final void L(u31 u31Var) {
    }

    private final void M(u31 u31Var) {
    }

    private final void N(u31 u31Var) {
    }

    private final void O(u31 u31Var) {
    }

    private final void P(u31 u31Var) {
    }

    private final void Q(u31 u31Var) {
    }

    private final void R(u31 u31Var) {
    }

    private final void S(u31 u31Var) {
    }

    private final void T(u31 u31Var) {
    }

    private final void U(u31 u31Var) {
    }

    private final void V(u31 u31Var) {
    }

    private final void W(u31 u31Var) {
    }

    private final void X(u31 u31Var) {
    }

    private final void Y(u31 u31Var) {
    }

    private final void Z(u31 u31Var) {
    }

    private final void a0(u31 u31Var) {
    }

    private final void b0(u31 u31Var) {
    }

    private final void c0(u31 u31Var) {
    }

    private final void d0(u31 u31Var) {
    }

    private final void e0(u31 u31Var) {
    }

    private final void f0(u31 u31Var) {
    }

    private final void g0(u31 u31Var) {
    }

    private final void h0(u31 u31Var) {
    }

    private final void i(float f) {
    }

    private final void i0(u31 u31Var) {
    }

    private final void j(float f) {
    }

    private final void j0(u31 u31Var) {
    }

    private final void k(float f) {
    }

    private final void k0(u31 u31Var) {
    }

    private final void l(float f) {
    }

    private final void l0(u31 u31Var) {
    }

    private final void m(float f) {
    }

    private final void m0(u31 u31Var) {
    }

    private final void n(float f) {
    }

    private final void n0(u31 u31Var) {
    }

    private final void o(float f) {
    }

    private final void p(float f) {
    }

    private final void q(float f) {
    }

    private final void r(float f) {
    }

    private final void s(float f) {
    }

    private final void t(float f) {
    }

    private final void u(float f) {
    }

    private final void v(float f) {
    }

    private final void w(float f) {
    }

    private final void x(float f) {
    }

    private final void y(float f) {
    }

    private final void z(float f) {
    }
}
