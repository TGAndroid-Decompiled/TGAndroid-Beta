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
public final class s10 implements i11 {
    public final byte a;
    public final Object b;

    public s10(Object obj, byte b) {
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
                z81 z81Var = (z81) obj;
                z81Var.R = Math.max(0.0f, (f - z81Var.S) - z81Var.Q);
                z81Var.a0();
                return;
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                contactsActivity.k0 = Math.max(0.0f, (f - contactsActivity.l0) - contactsActivity.j0);
                contactsActivity.d0();
                return;
            case 8:
                return;
            case 9:
                cj3 cj3Var = (cj3) obj;
                UndoView undoView = cj3Var.z0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    cj3Var.w1 = Math.max(0.0f, (f - cj3Var.k4) - cj3Var.n4);
                    cj3Var.q5();
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
    public final void c(m21 m21Var) {
        t28 t28Var;
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
                if (m21Var.a == 2 && (t28Var = ((d28) this.b).y.G1) != null) {
                    m8b m8bVar = ((d8b) t28Var).d;
                    m8bVar.Y0 = false;
                    m8bVar.U();
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
                if (((ProfileActivity) this.b).y5 == null) {
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
        o98 o98Var;
        int L;
        float f;
        int[] iArr;
        int[] iArr2;
        byte b = this.a;
        int i4 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((w10) obj).e.x1.getHeight();
            case 1:
                hv0 hv0Var = (hv0) obj;
                if (!(hv0Var.getParent() instanceof r12)) {
                    return 0;
                }
                r12 r12Var = (r12) hv0Var.getParent();
                return (int) ((r12Var.getSwipeOffsetY() + r12Var.getOffsetY()) - r12Var.getTopActionBarOffsetY());
            case 2:
                return 0;
            case 3:
                z81 z81Var = (z81) obj;
                i2 = z81Var.S;
                i3 = z81Var.Q;
                break;
            case 4:
                return ((nh1) obj).P.getMeasuredHeight();
            case 5:
                mu1 mu1Var = (mu1) obj;
                if (i == 1) {
                    return 0;
                }
                return Math.round(mu1Var.U.getInputBubbleHeight() + gl.L(16.0f) + mu1Var.m7(gxb.c) + mu1Var.w.d());
            case 6:
                return ((b52) obj).c.b.P() + gl.L(126.0f);
            case 7:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                i2 = contactsActivity.l0;
                i3 = contactsActivity.j0;
                break;
            case 8:
                return (int) ((m43) ((st) obj).c).u;
            case 9:
                cj3 cj3Var = (cj3) obj;
                if (cj3Var.a3 != 0) {
                    return gl.L(60.0f) + cj3Var.k4;
                }
                return cj3Var.D2();
            case 10:
                return 0;
            case 11:
                i3 = ((ah6) obj).M;
                i2 = gl.L(64.0f);
                break;
            case 12:
                i3 = zj6.Y((zj6) obj).d;
                i2 = gl.L(72.0f);
                break;
            case 13:
                if (((d28) obj).y.n2) {
                    return 0;
                }
                return gl.L(64.0f);
            case 14:
                PhotoViewer photoViewer = ((k98) obj).u0;
                if (photoViewer.Q4) {
                    x78 x78Var = photoViewer.V1;
                    if (x78Var != null) {
                        i4 = x78Var.M.l;
                        if (x78Var.getVisibility() == 0 && ((o98Var = photoViewer.d) == null || !o98Var.z())) {
                            i4 = de9.w(12.0f, photoViewer.V1.getEditTextHeight(), i4);
                        }
                    }
                    jo0 jo0Var = photoViewer.Q0;
                    if (jo0Var != null && jo0Var.getVisibility() == 0) {
                        x78 x78Var2 = photoViewer.V1;
                        if (x78Var2 == null || !x78Var2.M.c()) {
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
                vb5 vb5Var = photoViewer.m1;
                if (vb5Var != null && vb5Var.c()) {
                    if (gl.O1() || photoViewer.f0.getMeasuredHeight() > photoViewer.f0.getMeasuredWidth()) {
                        return (int) ((photoViewer.m1.getAlpha() * photoViewer.m1.getHeight()) + i4);
                    }
                    return i4;
                }
                return i4;
            case 15:
                return ((PremiumPreviewFragment) obj).p0.d;
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (profileActivity.y5 == null) {
                    L = profileActivity.P6 + profileActivity.O6;
                } else {
                    L = ((int) (((gl.L(52.0f) - profileActivity.y5.getTranslationY()) - (((1.0f - profileActivity.z5[1].getAlpha()) * gl.L(72.0f)) * profileActivity.O.b0(9, false))) - (((1.0f - profileActivity.z5[0].getAlpha()) * gl.L(72.0f)) * profileActivity.O.b0(8, true)))) + profileActivity.P6 + profileActivity.O6;
                }
                vn8 vn8Var = profileActivity.O;
                if (vn8Var != null && vn8Var.b0 != null) {
                    f = vn8Var.b0(14, false);
                } else {
                    f = 0.0f;
                }
                if (f > 0.0f) {
                    lca lcaVar = profileActivity.O.b0;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = lcaVar.r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i4 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return gl.U1(Math.min(1.0f, f), L, Math.max(L, i4));
                }
                return L;
            case 17:
                return ((g0a) obj).r.getPaddingBottom();
            case 18:
                return 0;
            case 19:
                FrameLayout frameLayout2 = ((u0b) obj).v1;
                if (frameLayout2 == null) {
                    return 0;
                }
                return frameLayout2.getHeight();
            case 20:
                i3 = ((t7b) obj).d1.getEditTextHeight();
                i2 = gl.L(12.0f);
                break;
            default:
                qvb qvbVar = (qvb) obj;
                ar8 ar8Var = qvbVar.p0;
                if (ar8Var == null || ar8Var.getVisibility() != 0) {
                    return 0;
                }
                return qvbVar.p0.getMeasuredHeight();
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
                if (((oy) this.b) != null) {
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
    public final void g(m21 m21Var) {
        t28 t28Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                q11 q11Var = m21Var.e;
                mu1 mu1Var = (mu1) obj;
                il0 c = mu1Var.L.c(q11Var, null, true);
                c.p(nod.c(mu1Var.Ba));
                c.r(gl.L(16.0f));
                q11Var.setCustomBackground(c);
                return;
            case 6:
            case 7:
            case 8:
                return;
            case 9:
                UndoView[] undoViewArr = ((cj3) obj).z0;
                UndoView undoView = undoViewArr[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    undoViewArr[0].d(2, true);
                    return;
                }
                return;
            case 10:
                q11 q11Var2 = m21Var.e;
                du4 du4Var = (du4) obj;
                il0 c2 = du4Var.o1.c(q11Var2, null, true);
                c2.p(nod.c(du4Var.J0));
                c2.r(gl.L(16.0f));
                q11Var2.setCustomBackground(c2);
                return;
            case 11:
            case 12:
                return;
            case 13:
                if (m21Var.a == 2 && (t28Var = ((d28) obj).y.G1) != null) {
                    m8b m8bVar = ((d8b) t28Var).d;
                    m8bVar.Y0 = true;
                    m8bVar.U();
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
                if (((oy) obj) != null) {
                    return 0;
                }
                return gl.m;
            case 3:
            case 4:
                return 0;
            case 5:
                int currentActionBarHeight = a.getCurrentActionBarHeight() + gl.m;
                mu1 mu1Var = (mu1) obj;
                aVar = ((d) mu1Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((d) mu1Var).actionBar;
                    int measuredHeight = aVar2.getMeasuredHeight();
                    aVar3 = ((d) mu1Var).actionBar;
                    i5 = aVar3.getTop() + measuredHeight;
                }
                max = Math.max(currentActionBarHeight, i5);
                max2 = (int) Math.max(0.0f, mu1Var.Q9);
                break;
            case 6:
            case 7:
            case 8:
                return 0;
            case 9:
                cj3 cj3Var = (cj3) obj;
                aVar4 = ((d) cj3Var).actionBar;
                if (aVar4 != null) {
                    aVar5 = ((d) cj3Var).actionBar;
                    i2 = aVar5.getMeasuredHeight();
                } else {
                    i2 = 0;
                }
                qi3 qi3Var = cj3Var.A0;
                if (qi3Var != null && qi3Var.getVisibility() == 0) {
                    i3 = cj3Var.A0.getMeasuredHeight();
                } else {
                    i3 = 0;
                }
                int i6 = i2 + i3;
                fj3 fj3Var = cj3Var.L1;
                if (fj3Var != null) {
                    i4 = fj3Var.getHeight();
                } else {
                    i4 = 0;
                }
                int i7 = i6 + i4;
                oh3 oh3Var = cj3Var.F0;
                if (oh3Var != null && cj3Var.H0) {
                    i5 = (int) ((1.0f - oh3Var.getCollapsedProgress()) * gl.L(81.0f));
                }
                return gl.L(48.0f) + i7 + i5;
            case 10:
                return gl.m;
            case 11:
            case 12:
                return 0;
            case 13:
                return gl.L(58.0f);
            case 14:
                return a.getCurrentActionBarHeight() + gl.m + ((int) (((k98) obj).u0.W1.getAlpha() * photoViewer.W1.getEditTextHeight()));
            case 15:
                return 0;
            case 16:
                max2 = gl.m;
                max = a.getCurrentActionBarHeight();
                break;
            case 17:
                return 0;
            case 18:
                return (int) (((dya) obj).a + gl.L(58.0f));
            case 19:
            case 20:
            default:
                return 0;
        }
        return max + max2;
    }

    private final void A(float f) {
    }

    private final void B(m21 m21Var) {
    }

    private final void C(m21 m21Var) {
    }

    private final void D(m21 m21Var) {
    }

    private final void E(m21 m21Var) {
    }

    private final void F(m21 m21Var) {
    }

    private final void G(m21 m21Var) {
    }

    private final void H(m21 m21Var) {
    }

    private final void I(m21 m21Var) {
    }

    private final void J(m21 m21Var) {
    }

    private final void K(m21 m21Var) {
    }

    private final void L(m21 m21Var) {
    }

    private final void M(m21 m21Var) {
    }

    private final void N(m21 m21Var) {
    }

    private final void O(m21 m21Var) {
    }

    private final void P(m21 m21Var) {
    }

    private final void Q(m21 m21Var) {
    }

    private final void R(m21 m21Var) {
    }

    private final void S(m21 m21Var) {
    }

    private final void T(m21 m21Var) {
    }

    private final void U(m21 m21Var) {
    }

    private final void V(m21 m21Var) {
    }

    private final void W(m21 m21Var) {
    }

    private final void X(m21 m21Var) {
    }

    private final void Y(m21 m21Var) {
    }

    private final void Z(m21 m21Var) {
    }

    private final void a0(m21 m21Var) {
    }

    private final void b0(m21 m21Var) {
    }

    private final void c0(m21 m21Var) {
    }

    private final void d0(m21 m21Var) {
    }

    private final void e0(m21 m21Var) {
    }

    private final void f0(m21 m21Var) {
    }

    private final void g0(m21 m21Var) {
    }

    private final void h0(m21 m21Var) {
    }

    private final void i(float f) {
    }

    private final void i0(m21 m21Var) {
    }

    private final void j(float f) {
    }

    private final void j0(m21 m21Var) {
    }

    private final void k(float f) {
    }

    private final void k0(m21 m21Var) {
    }

    private final void l(float f) {
    }

    private final void l0(m21 m21Var) {
    }

    private final void m(float f) {
    }

    private final void m0(m21 m21Var) {
    }

    private final void n(float f) {
    }

    private final void n0(m21 m21Var) {
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
