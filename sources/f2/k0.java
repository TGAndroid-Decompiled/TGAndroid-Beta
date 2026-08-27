package f2;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class k0 extends x0 {
    public int A;
    public j0 B;
    public final g0 C;
    public final h0 D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;

    public int f5720o;

    public i0 f5721p;

    public androidx.emoji2.text.g f5722q;

    public boolean f5723r;

    public boolean f5724s;

    public boolean f5725t;

    public boolean f5726u;
    public boolean v;

    public boolean f5727w;

    public final boolean f5728x;

    public int f5729y;

    public boolean f5730z;

    public k0() {
        this(1, false);
    }

    public void A0(l1 l1Var, i0 i0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i10 = i0Var.d;
        if (i10 < 0 || i10 >= l1Var.b()) {
            return;
        }
        iVar.a(i10, Math.max(0, i0Var.f5696g));
    }

    public final int B0(l1 l1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.f5722q;
        boolean z10 = this.f5728x;
        boolean z11 = !z10;
        View viewK0 = K0(z11);
        View viewJ0 = J0(z11);
        if (r() == 0 || l1Var.b() == 0 || viewK0 == null || viewJ0 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(((y0) viewK0.getLayoutParams()).b() - ((y0) viewJ0.getLayoutParams()).b()) + 1;
        }
        return Math.min(gVar.k(), gVar.a(viewJ0) - gVar.d(viewK0));
    }

    public final int C0(l1 l1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f5722q;
            boolean z10 = this.f5728x;
            boolean z11 = !z10;
            View viewK0 = K0(z11);
            View viewJ0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && l1Var.b() != 0 && viewK0 != null && viewJ0 != null) {
                int iMax = z12 ? Math.max(0, (l1Var.b() - Math.max(((y0) viewK0.getLayoutParams()).b(), ((y0) viewJ0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((y0) viewK0.getLayoutParams()).b(), ((y0) viewJ0.getLayoutParams()).b()));
                if (z10) {
                    return Math.round((iMax * (Math.abs(gVar.a(viewJ0) - gVar.d(viewK0)) / (Math.abs(((y0) viewK0.getLayoutParams()).b() - ((y0) viewJ0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(viewK0)));
                }
                return iMax;
            }
        }
        return 0;
    }

    public final int D0(l1 l1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.f5722q;
        boolean z10 = this.f5728x;
        boolean z11 = !z10;
        View viewK0 = K0(z11);
        View viewJ0 = J0(z11);
        if (r() == 0 || l1Var.b() == 0 || viewK0 == null || viewJ0 == null) {
            return 0;
        }
        if (!z10) {
            return l1Var.b();
        }
        return (int) (((gVar.a(viewJ0) - gVar.d(viewK0)) / (Math.abs(((y0) viewK0.getLayoutParams()).b() - ((y0) viewJ0.getLayoutParams()).b()) + 1)) * l1Var.b());
    }

    public final PointF E0(int i10) {
        if (r() == 0) {
            return null;
        }
        int i11 = (i10 < x0.H(q(0))) != this.v ? -1 : 1;
        return this.f5720o == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public final int F0(int i10) {
        if (i10 == 1) {
            return (this.f5720o != 1 && Y0()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f5720o != 1 && Y0()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f5720o == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f5720o == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f5720o == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f5720o == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void G0() {
        if (this.f5721p == null) {
            i0 i0Var = new i0();
            i0Var.f5691a = true;
            i0Var.h = 0;
            i0Var.f5697i = 0;
            i0Var.f5699k = null;
            this.f5721p = i0Var;
        }
    }

    public final int H0(e1 e1Var, i0 i0Var, l1 l1Var, boolean z10) {
        int i10 = i0Var.f5693c;
        int i11 = i0Var.f5696g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                i0Var.f5696g = i11 + i10;
            }
            c1(e1Var, i0Var);
        }
        int i12 = i0Var.f5693c + i0Var.h;
        while (true) {
            if ((!i0Var.f5700l && i12 <= 0) || !i0Var.b(l1Var)) {
                break;
            }
            h0 h0Var = this.D;
            h0Var.f5683a = 0;
            h0Var.f5684b = false;
            h0Var.f5685c = false;
            h0Var.d = false;
            Z0(e1Var, l1Var, i0Var, h0Var);
            if (!h0Var.f5684b) {
                int i13 = i0Var.f5692b;
                int i14 = h0Var.f5683a;
                i0Var.f5692b = (i0Var.f5695f * i14) + i13;
                if (!h0Var.f5685c || i0Var.f5699k != null || !l1Var.f5762g) {
                    i0Var.f5693c -= i14;
                    i12 -= i14;
                }
                int i15 = i0Var.f5696g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    i0Var.f5696g = i16;
                    int i17 = i0Var.f5693c;
                    if (i17 < 0) {
                        i0Var.f5696g = i16 + i17;
                    }
                    c1(e1Var, i0Var);
                }
                if (z10 && h0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - i0Var.f5693c;
    }

    public final int I0() {
        View viewP0 = P0(0, r(), true, false);
        if (viewP0 == null) {
            return -1;
        }
        return ((y0) viewP0.getLayoutParams()).b();
    }

    public final View J0(boolean z10) {
        return this.v ? P0(0, r(), z10, true) : P0(r() - 1, -1, z10, true);
    }

    public final View K0(boolean z10) {
        return this.v ? P0(r() - 1, -1, z10, true) : P0(0, r(), z10, true);
    }

    public final int L0() {
        View viewP0 = P0(0, r(), false, true);
        if (viewP0 == null) {
            return -1;
        }
        return ((y0) viewP0.getLayoutParams()).b();
    }

    public final int M0() {
        View viewP0 = P0(r() - 1, -1, true, false);
        if (viewP0 == null) {
            return -1;
        }
        return ((y0) viewP0.getLayoutParams()).b();
    }

    public final int N0() {
        View viewP0 = P0(r() - 1, -1, false, true);
        if (viewP0 == null) {
            return -1;
        }
        return ((y0) viewP0.getLayoutParams()).b();
    }

    public final View O0(int i10, int i11) {
        int i12;
        int i13;
        G0();
        if (i11 <= i10 && i11 >= i10) {
            return q(i10);
        }
        if (this.f5722q.d(q(i10)) < this.f5722q.j()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f5720o == 0 ? this.f5854c.B(i10, i11, i12, i13) : this.d.B(i10, i11, i12, i13);
    }

    public final View P0(int i10, int i11, boolean z10, boolean z11) {
        G0();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f5720o == 0 ? this.f5854c.B(i10, i11, i12, i13) : this.d.B(i10, i11, i12, i13);
    }

    public View Q0(e1 e1Var, l1 l1Var, int i10, int i11, int i12) {
        G0();
        int iJ = this.f5723r ? 0 : this.f5722q.j();
        int iF = this.f5722q.f();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewQ = q(i10);
            int iH = x0.H(viewQ);
            if (iH >= 0 && iH < i12) {
                if (((y0) viewQ.getLayoutParams()).f5864a.j()) {
                    if (view2 == null) {
                        view2 = viewQ;
                    }
                } else {
                    if (this.f5722q.d(viewQ) < iF && this.f5722q.a(viewQ) >= iJ) {
                        return viewQ;
                    }
                    if (view == null) {
                        view = viewQ;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    @Override
    public View R(View view, int i10, e1 e1Var, l1 l1Var) {
        int iF0;
        View viewO0;
        f1();
        if (r() != 0 && (iF0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(iF0, (int) (this.f5722q.k() * 0.33333334f), false, l1Var);
            i0 i0Var = this.f5721p;
            i0Var.f5696g = Integer.MIN_VALUE;
            i0Var.f5691a = false;
            H0(e1Var, i0Var, l1Var, true);
            if (iF0 == -1) {
                viewO0 = this.v ? O0(r() - 1, -1) : O0(0, r());
            } else {
                viewO0 = this.v ? O0(0, r()) : O0(r() - 1, -1);
            }
            View viewV0 = iF0 == -1 ? V0() : U0();
            if (!viewV0.hasFocusable()) {
                return viewO0;
            }
            if (viewO0 != null) {
                return viewV0;
            }
        }
        return null;
    }

    public int R0() {
        return 0;
    }

    public final int S0(int i10, e1 e1Var, l1 l1Var, boolean z10) {
        int iF;
        int iF2;
        if (!this.G || !this.H || (iF = this.f5722q.f() - i10) <= 0) {
            return 0;
        }
        int i11 = -g1(-iF, e1Var, l1Var);
        int i12 = i10 + i11;
        if (!z10 || (iF2 = this.f5722q.f() - i12) <= 0) {
            return i11;
        }
        this.f5722q.n(iF2);
        return iF2 + i11;
    }

    public final int T0(int i10, e1 e1Var, l1 l1Var, boolean z10) {
        int iX0;
        int iJ;
        if (!this.G || (iX0 = i10 - X0()) <= 0) {
            return 0;
        }
        int i11 = -g1(iX0, e1Var, l1Var);
        int i12 = i10 + i11;
        if (!z10 || (iJ = i12 - this.f5722q.j()) <= 0) {
            return i11;
        }
        this.f5722q.n(-iJ);
        return i11 - iJ;
    }

    public final View U0() {
        return q(this.v ? 0 : r() - 1);
    }

    public final View V0() {
        return q(this.v ? r() - 1 : 0);
    }

    public int W0(l1 l1Var) {
        if (l1Var.f5757a != -1) {
            return this.f5722q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f5722q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f5853b;
        WeakHashMap weakHashMap = r0.j0.f46605a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public void Z0(e1 e1Var, l1 l1Var, i0 i0Var, h0 h0Var) {
        int iD;
        int i10;
        int i11;
        int iC;
        View viewC = i0Var.c(e1Var);
        if (viewC == null) {
            h0Var.f5684b = true;
            return;
        }
        y0 y0Var = (y0) viewC.getLayoutParams();
        if (i0Var.f5699k == null) {
            if (this.v == (i0Var.f5695f == -1)) {
                a(viewC, -1, false);
            } else {
                a(viewC, 0, false);
            }
        } else {
            if (this.v == (i0Var.f5695f == -1)) {
                a(viewC, -1, true);
            } else {
                a(viewC, 0, true);
            }
        }
        P(viewC);
        h0Var.f5683a = this.f5722q.b(viewC);
        if (this.f5720o == 1) {
            if (Y0()) {
                iC = this.f5862m - E();
                iD = iC - this.f5722q.c(viewC);
            } else {
                iD = D();
                iC = this.f5722q.c(viewC) + iD;
            }
            if (i0Var.f5695f == -1) {
                i10 = i0Var.f5692b;
                i11 = i10 - h0Var.f5683a;
            } else {
                i11 = i0Var.f5692b;
                i10 = h0Var.f5683a + i11;
            }
        } else {
            int iF = F();
            int iC2 = this.f5722q.c(viewC) + iF;
            if (i0Var.f5695f == -1) {
                int i12 = i0Var.f5692b;
                int i13 = i12 - h0Var.f5683a;
                iC = i12;
                i10 = iC2;
                iD = i13;
                i11 = iF;
            } else {
                int i14 = i0Var.f5692b;
                int i15 = h0Var.f5683a + i14;
                iD = i14;
                i10 = iC2;
                i11 = iF;
                iC = i15;
            }
        }
        x0.O(viewC, iD, i11, iC, i10);
        if (y0Var.f5864a.j() || y0Var.f5864a.m()) {
            h0Var.f5685c = true;
        }
        h0Var.d = viewC.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.f5853b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    @Override
    public void b0(e1 e1Var, l1 l1Var) {
        View focusedChild;
        RecyclerView recyclerView;
        View focusedChild2;
        e1 e1Var2;
        View viewQ0;
        int iJ;
        y0 y0Var;
        int iR0;
        int i10;
        int iD;
        int i11;
        int i12;
        List list;
        int i13;
        int i14;
        int iS0;
        int i15;
        View viewM;
        int iD2;
        int iF;
        int i16;
        k0 k0Var = this;
        l1 l1Var2 = l1Var;
        int i17 = -1;
        if (!(k0Var.B == null && k0Var.f5729y == -1) && l1Var2.b() == 0) {
            g0(e1Var);
            return;
        }
        j0 j0Var = k0Var.B;
        if (j0Var != null && (i16 = j0Var.f5707a) >= 0) {
            k0Var.f5729y = i16;
        }
        k0Var.G0();
        k0Var.f5721p.f5691a = false;
        k0Var.f1();
        RecyclerView recyclerView2 = k0Var.f5853b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) k0Var.f5852a.d).contains(focusedChild)) {
            focusedChild = null;
        }
        g0 g0Var = k0Var.C;
        if (g0Var.d && k0Var.f5729y == -1 && k0Var.B == null) {
            if (focusedChild != null && (k0Var.f5722q.d(focusedChild) >= k0Var.f5722q.f() || k0Var.f5722q.a(focusedChild) <= k0Var.f5722q.j())) {
                g0Var.d(((y0) focusedChild.getLayoutParams()).b(), focusedChild);
            }
            e1Var2 = e1Var;
        } else {
            g0Var.f();
            g0Var.f5673c = k0Var.v ^ k0Var.f5727w;
            if (!l1Var2.f5762g && (i10 = k0Var.f5729y) != -1) {
                if (i10 < 0 || i10 >= l1Var2.b()) {
                    k0Var.f5729y = -1;
                    k0Var.A = Integer.MIN_VALUE;
                    if (k0Var.r() != 0) {
                        recyclerView = k0Var.f5853b;
                        if (recyclerView != null) {
                            focusedChild2 = null;
                        } else {
                            focusedChild2 = null;
                        }
                        if (focusedChild2 != null) {
                            y0Var = (y0) focusedChild2.getLayoutParams();
                            if (y0Var.f5864a.j()) {
                            }
                        }
                        if (k0Var.f5724s != k0Var.f5727w) {
                            e1Var2 = e1Var;
                        } else {
                            if (g0Var.f5673c) {
                                if (k0Var.v) {
                                    viewQ0 = k0Var.Q0(e1Var, l1Var2, 0, k0Var.r(), l1Var2.b());
                                    k0Var = this;
                                } else {
                                    k0Var = this;
                                    viewQ0 = k0Var.Q0(e1Var, l1Var, r() - 1, -1, l1Var.b());
                                }
                                e1Var2 = e1Var;
                                l1Var2 = l1Var;
                            } else if (k0Var.v) {
                                e1Var2 = e1Var;
                                l1Var2 = l1Var;
                                viewQ0 = k0Var.Q0(e1Var2, l1Var2, k0Var.r() - 1, -1, l1Var.b());
                                k0Var = this;
                            } else {
                                k0Var = this;
                                e1Var2 = e1Var;
                                l1Var2 = l1Var;
                                viewQ0 = k0Var.Q0(e1Var2, l1Var2, 0, r(), l1Var.b());
                            }
                            if (viewQ0 != null) {
                                g0Var.c(((y0) viewQ0.getLayoutParams()).b(), viewQ0);
                                if (!l1Var2.f5762g) {
                                    if (g0Var.f5673c) {
                                        iJ = k0Var.f5722q.f();
                                    } else {
                                        iJ = k0Var.f5722q.j();
                                    }
                                    g0Var.f5674e = iJ;
                                }
                            }
                        }
                        g0Var.b();
                        if (k0Var.f5727w) {
                            iR0 = l1Var2.b() - 1;
                        } else {
                            iR0 = k0Var.R0();
                        }
                        g0Var.f5672b = iR0;
                    } else {
                        e1Var2 = e1Var;
                        g0Var.b();
                        if (k0Var.f5727w) {
                            iR0 = l1Var2.b() - 1;
                        } else {
                            iR0 = k0Var.R0();
                        }
                        g0Var.f5672b = iR0;
                    }
                } else {
                    int i18 = k0Var.f5729y;
                    g0Var.f5672b = i18;
                    j0 j0Var2 = k0Var.B;
                    if (j0Var2 != null && j0Var2.f5707a >= 0) {
                        boolean z10 = j0Var2.f5709c;
                        g0Var.f5673c = z10;
                        if (z10) {
                            g0Var.f5674e = k0Var.f5722q.f() - k0Var.B.f5708b;
                        } else {
                            g0Var.f5674e = k0Var.f5722q.j() + k0Var.B.f5708b;
                        }
                    } else if (k0Var.A == Integer.MIN_VALUE) {
                        View viewM2 = k0Var.m(i18);
                        if (viewM2 == null) {
                            if (k0Var.r() > 0) {
                                g0Var.f5673c = (k0Var.f5729y < x0.H(k0Var.q(0))) == k0Var.f5730z;
                            }
                            g0Var.b();
                        } else if (k0Var.f5722q.b(viewM2) > k0Var.f5722q.k()) {
                            g0Var.b();
                        } else if (k0Var.f5722q.d(viewM2) - k0Var.f5722q.j() < 0) {
                            g0Var.f5674e = k0Var.f5722q.j();
                            g0Var.f5673c = false;
                        } else if (k0Var.f5722q.f() - k0Var.f5722q.a(viewM2) < 0) {
                            g0Var.f5674e = k0Var.f5722q.f();
                            g0Var.f5673c = true;
                        } else {
                            if (g0Var.f5673c) {
                                int iA = k0Var.f5722q.a(viewM2);
                                androidx.emoji2.text.g gVar = k0Var.f5722q;
                                iD = (Integer.MIN_VALUE == gVar.f1351a ? 0 : gVar.k() - gVar.f1351a) + iA;
                            } else {
                                iD = k0Var.f5722q.d(viewM2);
                            }
                            g0Var.f5674e = iD;
                        }
                    } else {
                        boolean z11 = k0Var.f5730z;
                        g0Var.f5673c = z11;
                        if (z11) {
                            g0Var.f5674e = k0Var.f5722q.f() - k0Var.A;
                        } else {
                            g0Var.f5674e = k0Var.f5722q.j() + k0Var.A;
                        }
                    }
                }
                e1Var2 = e1Var;
            } else if (k0Var.r() != 0) {
                recyclerView = k0Var.f5853b;
                if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) k0Var.f5852a.d).contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    y0Var = (y0) focusedChild2.getLayoutParams();
                    if (y0Var.f5864a.j() && y0Var.b() >= 0 && y0Var.b() < l1Var2.b()) {
                        g0Var.d(((y0) focusedChild2.getLayoutParams()).b(), focusedChild2);
                        e1Var2 = e1Var;
                    }
                }
                if (k0Var.f5724s != k0Var.f5727w) {
                    e1Var2 = e1Var;
                } else {
                    if (g0Var.f5673c) {
                        if (k0Var.v) {
                            viewQ0 = k0Var.Q0(e1Var, l1Var2, 0, k0Var.r(), l1Var2.b());
                            k0Var = this;
                        } else {
                            k0Var = this;
                            viewQ0 = k0Var.Q0(e1Var, l1Var, r() - 1, -1, l1Var.b());
                        }
                        e1Var2 = e1Var;
                        l1Var2 = l1Var;
                    } else if (k0Var.v) {
                        e1Var2 = e1Var;
                        l1Var2 = l1Var;
                        viewQ0 = k0Var.Q0(e1Var2, l1Var2, k0Var.r() - 1, -1, l1Var.b());
                        k0Var = this;
                    } else {
                        k0Var = this;
                        e1Var2 = e1Var;
                        l1Var2 = l1Var;
                        viewQ0 = k0Var.Q0(e1Var2, l1Var2, 0, r(), l1Var.b());
                    }
                    if (viewQ0 != null) {
                        g0Var.c(((y0) viewQ0.getLayoutParams()).b(), viewQ0);
                        if (!l1Var2.f5762g && k0Var.y0() && (k0Var.f5722q.d(viewQ0) >= k0Var.f5722q.f() || k0Var.f5722q.a(viewQ0) < k0Var.f5722q.j())) {
                            if (g0Var.f5673c) {
                                iJ = k0Var.f5722q.f();
                            } else {
                                iJ = k0Var.f5722q.j();
                            }
                            g0Var.f5674e = iJ;
                        }
                    }
                }
                g0Var.b();
                if (k0Var.f5727w) {
                    iR0 = l1Var2.b() - 1;
                } else {
                    iR0 = k0Var.R0();
                }
                g0Var.f5672b = iR0;
            } else {
                e1Var2 = e1Var;
                g0Var.b();
                if (k0Var.f5727w) {
                    iR0 = l1Var2.b() - 1;
                } else {
                    iR0 = k0Var.R0();
                }
                g0Var.f5672b = iR0;
            }
            g0Var.d = true;
        }
        i0 i0Var = k0Var.f5721p;
        i0Var.f5695f = i0Var.f5698j >= 0 ? 1 : -1;
        int[] iArr = k0Var.F;
        iArr[0] = 0;
        iArr[1] = 0;
        k0Var.z0(l1Var2, iArr);
        int iJ2 = k0Var.f5722q.j() + Math.max(0, iArr[0]);
        int iG = k0Var.f5722q.g() + Math.max(0, iArr[1]);
        if (l1Var2.f5762g && (i15 = k0Var.f5729y) != -1 && k0Var.A != Integer.MIN_VALUE && (viewM = k0Var.m(i15)) != null) {
            if (k0Var.f5730z) {
                iF = k0Var.f5722q.f() - k0Var.f5722q.a(viewM);
                iD2 = k0Var.A;
            } else {
                iD2 = k0Var.f5722q.d(viewM) - k0Var.f5722q.j();
                iF = k0Var.A;
            }
            int i19 = iF - iD2;
            if (i19 > 0) {
                iJ2 += i19;
            } else {
                iG -= i19;
            }
        }
        if (!g0Var.f5673c ? !k0Var.v : k0Var.v) {
            i17 = 1;
        }
        k0Var.a1(e1Var2, l1Var2, g0Var, i17);
        for (int iR = k0Var.r() - 1; iR >= 0; iR--) {
            View viewQ = k0Var.q(iR);
            o1 o1VarU = RecyclerView.U(viewQ);
            if (o1VarU != null && !o1VarU.r()) {
                if (!o1VarU.h() || o1VarU.j() || k0Var.f5853b.f1862w.f5815b) {
                    k0Var.q(iR);
                    k0Var.f5852a.k(iR);
                    e1Var2.i(viewQ);
                    k0Var.f5853b.f1842f.N(o1VarU);
                } else {
                    k0Var.j0(iR);
                    e1Var2.h(o1VarU);
                }
            }
        }
        k0Var.f5721p.f5700l = k0Var.f5722q.h() == 0 && k0Var.f5722q.e() == 0;
        k0Var.f5721p.getClass();
        k0Var.f5721p.f5697i = 0;
        if (g0Var.f5673c) {
            k0Var.o1(g0Var.f5672b, g0Var.f5674e);
            i0 i0Var2 = k0Var.f5721p;
            i0Var2.h = iJ2;
            k0Var.H0(e1Var2, i0Var2, l1Var2, false);
            i0 i0Var3 = k0Var.f5721p;
            i12 = i0Var3.f5692b;
            int i20 = i0Var3.d;
            int i21 = i0Var3.f5693c;
            if (i21 > 0) {
                iG += i21;
            }
            k0Var.n1(g0Var.f5672b, g0Var.f5674e);
            i0 i0Var4 = k0Var.f5721p;
            i0Var4.h = iG;
            i0Var4.d += i0Var4.f5694e;
            k0Var.H0(e1Var2, i0Var4, l1Var2, false);
            i0 i0Var5 = k0Var.f5721p;
            i11 = i0Var5.f5692b;
            int i22 = i0Var5.f5693c;
            if (i22 > 0) {
                k0Var.o1(i20, i12);
                i0 i0Var6 = k0Var.f5721p;
                i0Var6.h = i22;
                k0Var.H0(e1Var2, i0Var6, l1Var2, false);
                i12 = k0Var.f5721p.f5692b;
            }
        } else {
            k0Var.n1(g0Var.f5672b, g0Var.f5674e);
            i0 i0Var7 = k0Var.f5721p;
            i0Var7.h = iG;
            k0Var.H0(e1Var2, i0Var7, l1Var2, false);
            i0 i0Var8 = k0Var.f5721p;
            i11 = i0Var8.f5692b;
            int i23 = i0Var8.d;
            int i24 = i0Var8.f5693c;
            if (i24 > 0) {
                iJ2 += i24;
            }
            k0Var.o1(g0Var.f5672b, g0Var.f5674e);
            i0 i0Var9 = k0Var.f5721p;
            i0Var9.h = iJ2;
            i0Var9.d += i0Var9.f5694e;
            k0Var.H0(e1Var2, i0Var9, l1Var2, false);
            i0 i0Var10 = k0Var.f5721p;
            i12 = i0Var10.f5692b;
            int i25 = i0Var10.f5693c;
            if (i25 > 0) {
                k0Var.n1(i23, i11);
                i0 i0Var11 = k0Var.f5721p;
                i0Var11.h = i25;
                k0Var.H0(e1Var2, i0Var11, l1Var2, false);
                i11 = k0Var.f5721p.f5692b;
            }
        }
        if (k0Var.r() > 0) {
            if (k0Var.v ^ k0Var.f5727w) {
                int iS1 = k0Var.S0(i11, e1Var2, l1Var2, true);
                i13 = i12 + iS1;
                i14 = i11 + iS1;
                iS0 = k0Var.T0(i13, e1Var2, l1Var2, false);
            } else {
                int iT0 = k0Var.T0(i12, e1Var2, l1Var2, true);
                i13 = i12 + iT0;
                i14 = i11 + iT0;
                iS0 = k0Var.S0(i14, e1Var2, l1Var2, false);
            }
            i12 = i13 + iS0;
            i11 = i14 + iS0;
        }
        if (l1Var2.f5765k && k0Var.r() != 0 && !l1Var2.f5762g && k0Var.y0()) {
            List list2 = (List) e1Var2.f5651f;
            int size = list2.size();
            int iH = x0.H(k0Var.q(0));
            int iB = 0;
            int iB2 = 0;
            for (int i26 = 0; i26 < size; i26++) {
                o1 o1Var = (o1) list2.get(i26);
                boolean zJ = o1Var.j();
                View view = o1Var.f5789a;
                if (!zJ) {
                    if ((o1Var.c() < iH) != k0Var.v) {
                        iB += k0Var.f5722q.b(view);
                    } else {
                        iB2 += k0Var.f5722q.b(view);
                    }
                }
            }
            k0Var.f5721p.f5699k = list2;
            if (iB > 0) {
                k0Var.o1(x0.H(k0Var.V0()), i12);
                i0 i0Var12 = k0Var.f5721p;
                i0Var12.h = iB;
                i0Var12.f5693c = 0;
                i0Var12.a(null);
                k0Var.H0(e1Var2, k0Var.f5721p, l1Var2, false);
            }
            if (iB2 > 0) {
                k0Var.n1(x0.H(k0Var.U0()), i11);
                i0 i0Var13 = k0Var.f5721p;
                i0Var13.h = iB2;
                i0Var13.f5693c = 0;
                list = null;
                i0Var13.a(null);
                k0Var.H0(e1Var2, k0Var.f5721p, l1Var2, false);
            } else {
                list = null;
            }
            k0Var.f5721p.f5699k = list;
        }
        if (l1Var2.f5762g) {
            g0Var.f();
        } else {
            androidx.emoji2.text.g gVar2 = k0Var.f5722q;
            gVar2.f1351a = gVar2.k();
        }
        k0Var.f5724s = k0Var.f5727w;
    }

    public void b1(View view, View view2, int i10, int i11) {
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int iH = x0.H(view);
        int iH2 = x0.H(view2);
        byte b10 = iH < iH2 ? (byte) 1 : (byte) -1;
        if (this.v) {
            if (b10 == 1) {
                h1(iH2, this.f5722q.f() - (this.f5722q.b(view) + this.f5722q.d(view2)));
                return;
            } else {
                h1(iH2, this.f5722q.f() - this.f5722q.a(view2));
                return;
            }
        }
        if (b10 == -1) {
            h1(iH2, this.f5722q.d(view2));
        } else {
            h1(iH2, this.f5722q.a(view2) - this.f5722q.b(view));
        }
    }

    @Override
    public void c0(l1 l1Var) {
        this.B = null;
        this.f5729y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.f();
    }

    public final void c1(e1 e1Var, i0 i0Var) {
        o1 o1VarT;
        o1 o1VarT2;
        if (!i0Var.f5691a || i0Var.f5700l) {
            return;
        }
        int i10 = i0Var.f5696g;
        int i11 = i0Var.f5697i;
        if (i0Var.f5695f != -1) {
            e1(e1Var, i10, i11);
            return;
        }
        int iR = r();
        if (i10 < 0) {
            return;
        }
        int iE = (this.f5722q.e() - i10) + i11;
        if (this.v) {
            for (int i12 = 0; i12 < iR; i12++) {
                View viewQ = q(i12);
                if (viewQ != null && (o1VarT2 = this.f5853b.T(viewQ)) != null && !o1VarT2.r() && (this.f5722q.d(viewQ) < iE || this.f5722q.m(viewQ) < iE)) {
                    d1(e1Var, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iR - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewQ2 = q(i14);
            if (viewQ2 != null && (o1VarT = this.f5853b.T(viewQ2)) != null && !o1VarT.r() && (this.f5722q.d(viewQ2) < iE || this.f5722q.m(viewQ2) < iE)) {
                d1(e1Var, i13, i14);
                return;
            }
        }
    }

    @Override
    public final boolean d() {
        return !this.f5726u && this.f5720o == 0;
    }

    public final void d1(e1 e1Var, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                i0(i10, e1Var);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                i0(i12, e1Var);
            }
        }
    }

    @Override
    public boolean e() {
        return !this.f5726u && this.f5720o == 1;
    }

    @Override
    public final j0 e0() {
        j0 j0Var = this.B;
        if (j0Var != null) {
            j0 j0Var2 = new j0();
            j0Var2.f5707a = j0Var.f5707a;
            j0Var2.f5708b = j0Var.f5708b;
            j0Var2.f5709c = j0Var.f5709c;
            return j0Var2;
        }
        j0 j0Var3 = new j0();
        if (r() <= 0) {
            j0Var3.f5707a = -1;
            return j0Var3;
        }
        G0();
        boolean z10 = this.f5724s ^ this.v;
        j0Var3.f5709c = z10;
        if (z10) {
            View viewU0 = U0();
            j0Var3.f5708b = this.f5722q.f() - this.f5722q.a(viewU0);
            j0Var3.f5707a = ((y0) viewU0.getLayoutParams()).b();
            return j0Var3;
        }
        View viewV0 = V0();
        j0Var3.f5707a = x0.H(viewV0);
        j0Var3.f5708b = this.f5722q.d(viewV0) - this.f5722q.j();
        return j0Var3;
    }

    public void e1(e1 e1Var, int i10, int i11) {
        o1 o1VarT;
        o1 o1VarT2;
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iR = r();
        if (!this.v) {
            for (int i13 = 0; i13 < iR; i13++) {
                View viewQ = q(i13);
                if (viewQ != null && (o1VarT = this.f5853b.T(viewQ)) != null && !o1VarT.r() && (this.f5722q.a(viewQ) > i12 || this.f5722q.l(viewQ) > i12)) {
                    d1(e1Var, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iR - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewQ2 = q(i15);
            if (viewQ2 != null && (o1VarT2 = this.f5853b.T(viewQ2)) != null && !o1VarT2.r() && (this.f5722q.a(viewQ2) > i12 || this.f5722q.l(viewQ2) > i12)) {
                d1(e1Var, i14, i15);
                return;
            }
        }
    }

    public final void f1() {
        if (this.f5720o == 1 || !Y0()) {
            this.v = this.f5725t;
        } else {
            this.v = !this.f5725t;
        }
    }

    public final int g1(int i10, e1 e1Var, l1 l1Var) {
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.f5721p.f5691a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        m1(i11, iAbs, true, l1Var);
        i0 i0Var = this.f5721p;
        int iH0 = H0(e1Var, i0Var, l1Var, false) + i0Var.f5696g;
        if (iH0 < 0) {
            return 0;
        }
        if (iAbs > iH0) {
            i10 = i11 * iH0;
        }
        this.f5722q.n(-i10);
        this.f5721p.f5698j = i10;
        return i10;
    }

    @Override
    public int h(l1 l1Var) {
        return C0(l1Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override
    public int i(l1 l1Var) {
        return D0(l1Var);
    }

    public void i1(int i10, int i11, boolean z10) {
        if (this.f5729y == i10 && this.A == i11 && this.f5730z == z10) {
            return;
        }
        this.f5729y = i10;
        this.A = i11;
        this.f5730z = z10;
        j0 j0Var = this.B;
        if (j0Var != null) {
            j0Var.f5707a = -1;
        }
        l0();
    }

    @Override
    public int j(l1 l1Var) {
        return B0(l1Var);
    }

    public final void j1(int i10) {
        n0 n0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(i0.a.k(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 != this.f5720o || this.f5722q == null) {
            if (i10 == 0) {
                n0Var = new n0(this, 0);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                n0Var = new n0(this, 1);
            }
            this.f5722q = n0Var;
            this.C.f5675f = n0Var;
            this.f5720o = i10;
            l0();
        }
    }

    @Override
    public int k(l1 l1Var) {
        return C0(l1Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.f5725t) {
            return;
        }
        this.f5725t = z10;
        l0();
    }

    @Override
    public int l(l1 l1Var) {
        return D0(l1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.f5727w == z10) {
            return;
        }
        this.f5727w = z10;
        l0();
    }

    @Override
    public final View m(int i10) {
        int iR = r();
        if (iR == 0) {
            return null;
        }
        int iH = i10 - x0.H(q(0));
        if (iH >= 0 && iH < iR) {
            View viewQ = q(iH);
            if (x0.H(viewQ) == i10) {
                return viewQ;
            }
        }
        int iR2 = r();
        for (int i11 = 0; i11 < iR2; i11++) {
            View viewQ2 = q(i11);
            o1 o1VarU = RecyclerView.U(viewQ2);
            if (o1VarU != null && o1VarU.c() == i10 && !o1VarU.r() && (this.f5853b.f1853p0.f5762g || !o1VarU.j())) {
                return viewQ2;
            }
        }
        return null;
    }

    @Override
    public int m0(int i10, e1 e1Var, l1 l1Var) {
        if (this.f5720o == 1) {
            return 0;
        }
        return g1(i10, e1Var, l1Var);
    }

    public final void m1(int i10, int i11, boolean z10, l1 l1Var) {
        int iJ;
        this.f5721p.f5700l = this.f5722q.h() == 0 && this.f5722q.e() == 0;
        this.f5721p.f5695f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(l1Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        i0 i0Var = this.f5721p;
        int i12 = z11 ? iMax2 : iMax;
        i0Var.h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        i0Var.f5697i = iMax;
        if (z11) {
            i0Var.h = this.f5722q.g() + i12;
            View viewU0 = U0();
            i0 i0Var2 = this.f5721p;
            i0Var2.f5694e = this.v ? -1 : 1;
            int iH = x0.H(viewU0);
            i0 i0Var3 = this.f5721p;
            i0Var2.d = iH + i0Var3.f5694e;
            i0Var3.f5692b = this.f5722q.a(viewU0);
            iJ = this.f5722q.a(viewU0) - this.f5722q.f();
        } else {
            View viewV0 = V0();
            i0 i0Var4 = this.f5721p;
            i0Var4.h = this.f5722q.j() + i0Var4.h;
            i0 i0Var5 = this.f5721p;
            i0Var5.f5694e = this.v ? 1 : -1;
            int iH2 = x0.H(viewV0);
            i0 i0Var6 = this.f5721p;
            i0Var5.d = iH2 + i0Var6.f5694e;
            i0Var6.f5692b = this.f5722q.d(viewV0);
            iJ = (-this.f5722q.d(viewV0)) + this.f5722q.j();
        }
        i0 i0Var7 = this.f5721p;
        i0Var7.f5693c = i11;
        if (z10) {
            i0Var7.f5693c = i11 - iJ;
        }
        i0Var7.f5696g = iJ;
    }

    @Override
    public y0 n() {
        return new y0(-2, -2);
    }

    @Override
    public void n0(int i10) {
        this.f5729y = i10;
        this.A = Integer.MIN_VALUE;
        j0 j0Var = this.B;
        if (j0Var != null) {
            j0Var.f5707a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        this.f5721p.f5693c = this.f5722q.f() - i11;
        i0 i0Var = this.f5721p;
        i0Var.f5694e = this.v ? -1 : 1;
        i0Var.d = i10;
        i0Var.f5695f = 1;
        i0Var.f5692b = i11;
        i0Var.f5696g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i10, e1 e1Var, l1 l1Var) {
        if (this.f5720o == 0) {
            return 0;
        }
        return g1(i10, e1Var, l1Var);
    }

    public final void o1(int i10, int i11) {
        this.f5721p.f5693c = i11 - this.f5722q.j();
        i0 i0Var = this.f5721p;
        i0Var.d = i10;
        i0Var.f5694e = this.v ? 1 : -1;
        i0Var.f5695f = -1;
        i0Var.f5692b = i11;
        i0Var.f5696g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, l1 l1Var, int i10) {
        l0 l0Var = new l0(recyclerView.getContext());
        l0Var.f5731a = i10;
        w0(l0Var);
    }

    @Override
    public boolean y0() {
        return this.B == null && this.f5724s == this.f5727w;
    }

    public void z0(l1 l1Var, int[] iArr) {
        int i10;
        int iW0 = W0(l1Var);
        if (this.f5721p.f5695f == -1) {
            i10 = 0;
        } else {
            i10 = iW0;
            iW0 = 0;
        }
        iArr[0] = iW0;
        iArr[1] = i10;
    }

    public k0(int i10, boolean z10) {
        this.f5720o = 1;
        this.f5723r = false;
        this.f5725t = false;
        this.f5726u = false;
        this.v = false;
        this.f5727w = false;
        this.f5728x = true;
        this.f5729y = -1;
        this.f5730z = true;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        g0 g0Var = new g0();
        g0Var.f();
        this.C = g0Var;
        this.D = new h0();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z10);
    }

    public void a1(e1 e1Var, l1 l1Var, g0 g0Var, int i10) {
    }
}
