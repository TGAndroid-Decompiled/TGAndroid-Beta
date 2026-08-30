package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import kh.a2;
public class w extends i0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public v O;
    public final Rect P;

    public w(int i10) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new t(0);
        this.P = new Rect();
        y1(i10);
    }

    @Override
    public final void A0(i1 i1Var, g0 g0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && g0Var.b(i1Var) && i10 > 0; i11++) {
            int i12 = g0Var.d;
            iVar.a(i12, Math.max(0, g0Var.f5706g));
            i10 -= this.O.i(i12);
            g0Var.d += g0Var.e;
        }
    }

    public final void A1() {
        int C;
        int F;
        if (this.f5731o == 1) {
            C = this.f5856m - E();
            F = D();
        } else {
            C = this.f5857n - C();
            F = F();
        }
        int i10 = C - F;
        this.K = q1(this.J, i10, this.K);
    }

    @Override
    public int I(bf.f fVar, i1 i1Var) {
        if (this.f5731o == 0) {
            return this.J;
        }
        if (i1Var.b() < 1) {
            return 0;
        }
        return t1(i1Var.b() - 1, fVar, i1Var) + 1;
    }

    @Override
    public final View Q0(bf.f fVar, i1 i1Var, int i10, int i11, int i12) {
        int i13;
        G0();
        int j10 = this.f5733q.j();
        int f10 = this.f5733q.f();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q10 = q(i10);
            int H = v0.H(q10);
            if (H >= 0 && H < i12 && u1(H, fVar, i1Var) == 0) {
                if (((w0) q10.getLayoutParams()).f5858a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else if (this.f5733q.d(q10) < f10 && this.f5733q.a(q10) >= j10) {
                    return q10;
                } else {
                    if (view == null) {
                        view = q10;
                    }
                }
            }
            i10 += i13;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override
    public final android.view.View R(android.view.View r23, int r24, bf.f r25, f2.i1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: f2.w.R(android.view.View, int, bf.f, f2.i1):android.view.View");
    }

    @Override
    public void U(bf.f fVar, i1 i1Var, View view, s0.e eVar) {
        boolean z4;
        boolean z10;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f43904a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof u)) {
            T(view, eVar);
            return;
        }
        u uVar = (u) layoutParams;
        int t12 = t1(uVar.b(), fVar, i1Var);
        if (this.f5731o == 0) {
            int i10 = uVar.e;
            int i11 = uVar.f5844f;
            int i12 = this.J;
            if (i12 > 1 && i11 == i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, t12, 1, z10, false));
            return;
        }
        int i13 = uVar.e;
        int i14 = uVar.f5844f;
        int i15 = this.J;
        if (i15 > 1 && i14 == i15) {
            z4 = true;
        } else {
            z4 = false;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(t12, 1, i13, i14, z4, false));
    }

    @Override
    public void V(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f5846b).clear();
    }

    @Override
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.f5846b).clear();
    }

    @Override
    public void X(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f5846b).clear();
    }

    @Override
    public void Y(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f5846b).clear();
    }

    @Override
    public void Z0(bf.f r18, f2.i1 r19, f2.g0 r20, f2.f0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: f2.w.Z0(bf.f, f2.i1, f2.g0, f2.f0):void");
    }

    @Override
    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.f5846b).clear();
    }

    @Override
    public final void a1(bf.f fVar, i1 i1Var, b4.v vVar, int i10) {
        boolean z4;
        A1();
        if (i1Var.b() > 0 && !i1Var.f5746g) {
            if (i10 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            int u12 = u1(vVar.f1528b, fVar, i1Var);
            if (z4) {
                while (u12 > 0) {
                    int i11 = vVar.f1528b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    vVar.f1528b = i12;
                    u12 = u1(i12, fVar, i1Var);
                }
            } else {
                int b10 = i1Var.b() - 1;
                int i13 = vVar.f1528b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int u13 = u1(i14, fVar, i1Var);
                    if (u13 <= u12) {
                        break;
                    }
                    i13 = i14;
                    u12 = u13;
                }
                vVar.f1528b = i13;
            }
        }
        r1();
    }

    @Override
    public void b0(bf.f fVar, i1 i1Var) {
        boolean z4 = i1Var.f5746g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z4) {
            int r10 = r();
            for (int i10 = 0; i10 < r10; i10++) {
                u uVar = (u) q(i10).getLayoutParams();
                int b10 = uVar.b();
                sparseIntArray2.put(b10, uVar.f5844f);
                sparseIntArray.put(b10, uVar.e);
            }
        }
        super.b0(fVar, i1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override
    public final void c0(i1 i1Var) {
        super.c0(i1Var);
        this.I = false;
    }

    @Override
    public final boolean f(w0 w0Var) {
        return w0Var instanceof u;
    }

    @Override
    public final int h(i1 i1Var) {
        return C0(i1Var);
    }

    @Override
    public final int i(i1 i1Var) {
        return D0(i1Var);
    }

    @Override
    public int k(i1 i1Var) {
        return C0(i1Var);
    }

    @Override
    public int l(i1 i1Var) {
        return D0(i1Var);
    }

    @Override
    public final void l1(boolean z4) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override
    public final int m0(int i10, bf.f fVar, i1 i1Var) {
        A1();
        r1();
        return super.m0(i10, fVar, i1Var);
    }

    @Override
    public final w0 n() {
        if (this.f5731o == 0) {
            return new u(-2, -1);
        }
        return new u(-1, -2);
    }

    @Override
    public final w0 o(Context context, AttributeSet attributeSet) {
        ?? w0Var = new w0(context, attributeSet);
        w0Var.e = -1;
        w0Var.f5844f = 0;
        return w0Var;
    }

    @Override
    public int o0(int i10, bf.f fVar, i1 i1Var) {
        A1();
        r1();
        return super.o0(i10, fVar, i1Var);
    }

    @Override
    public final w0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? w0Var = new w0((ViewGroup.MarginLayoutParams) layoutParams);
            w0Var.e = -1;
            w0Var.f5844f = 0;
            return w0Var;
        }
        ?? w0Var2 = new w0(layoutParams);
        w0Var2.e = -1;
        w0Var2.f5844f = 0;
        return w0Var2;
    }

    public final void p1(int i10, bf.f fVar, i1 i1Var, boolean z4) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z4) {
            i12 = i10;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.L[i11];
            u uVar = (u) view.getLayoutParams();
            int v12 = v1(((w0) view.getLayoutParams()).b(), fVar, i1Var);
            uVar.f5844f = v12;
            uVar.e = i14;
            i14 += v12;
            i11 += i13;
        }
    }

    public int[] q1(int i10, int i11, int[] iArr) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 > 0 && i10 - i13 < i15) {
                i12 = i14 + 1;
                i13 -= i10;
            } else {
                i12 = i14;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    @Override
    public final void r0(Rect rect, int i10, int i11) {
        int g10;
        int g11;
        if (this.K == null) {
            super.r0(rect, i10, i11);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.f5731o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f5848b;
            WeakHashMap weakHashMap = r0.j0.f43118a;
            g11 = v0.g(i11, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g10 = v0.g(i10, iArr[iArr.length - 1] + E, this.f5848b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f5848b;
            WeakHashMap weakHashMap2 = r0.j0.f43118a;
            g10 = v0.g(i10, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g11 = v0.g(i11, iArr2[iArr2.length - 1] + C, this.f5848b.getMinimumHeight());
        }
        this.f5848b.setMeasuredDimension(g10, g11);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr != null && viewArr.length == this.J) {
            return;
        }
        this.L = new View[this.J];
    }

    public final int s1(int i10, int i11) {
        if (this.f5731o == 1 && Y0()) {
            int[] iArr = this.K;
            int i12 = this.J;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.K;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    public final int t1(int i10, bf.f fVar, i1 i1Var) {
        if (!i1Var.f5746g) {
            return this.O.g(i10, this.J);
        }
        int b10 = fVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.O.g(b10, this.J);
    }

    @Override
    public int u(bf.f fVar, i1 i1Var) {
        if (this.f5731o == 1) {
            return this.J;
        }
        if (i1Var.b() < 1) {
            return 0;
        }
        return t1(i1Var.b() - 1, fVar, i1Var) + 1;
    }

    public final int u1(int i10, bf.f fVar, i1 i1Var) {
        if (!i1Var.f5746g) {
            return this.O.h(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = fVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return this.O.h(b10, this.J);
    }

    public final int v1(int i10, bf.f fVar, i1 i1Var) {
        if (!i1Var.f5746g) {
            return this.O.i(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = fVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.O.i(b10);
    }

    public void w1(View view, int i10, boolean z4) {
        int i11;
        int i12;
        u uVar = (u) view.getLayoutParams();
        Rect rect = uVar.f5859b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) uVar).topMargin + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) uVar).leftMargin + ((ViewGroup.MarginLayoutParams) uVar).rightMargin;
        int s12 = s1(uVar.e, uVar.f5844f);
        if (this.f5731o == 1) {
            i12 = v0.s(false, s12, i10, i14, ((ViewGroup.MarginLayoutParams) uVar).width);
            i11 = v0.s(true, this.f5733q.k(), this.f5855l, i13, ((ViewGroup.MarginLayoutParams) uVar).height);
        } else {
            int s6 = v0.s(false, s12, i10, i13, ((ViewGroup.MarginLayoutParams) uVar).height);
            int s9 = v0.s(true, this.f5733q.k(), this.f5854k, i14, ((ViewGroup.MarginLayoutParams) uVar).width);
            i11 = s6;
            i12 = s9;
        }
        x1(i12, i11, view, z4);
    }

    public final void x1(int i10, int i11, View view, boolean z4) {
        boolean u02;
        w0 w0Var = (w0) view.getLayoutParams();
        if (z4) {
            if (this.f5851g && v0.N(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) w0Var).width) && v0.N(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) w0Var).height)) {
                u02 = false;
            } else {
                u02 = true;
            }
        } else {
            u02 = u0(view, i10, i11, w0Var);
        }
        if (u02) {
            view.measure(i10, i11);
        }
    }

    @Override
    public boolean y0() {
        if (this.B == null && !this.I) {
            return true;
        }
        return false;
    }

    public void y1(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 >= 1) {
            this.J = i10;
            this.O.j();
            l0();
            return;
        }
        throw new IllegalArgumentException(a2.j(i10, "Span count should be at least 1. Provided "));
    }

    public final void z1(v vVar) {
        this.O = vVar;
    }

    public w(int i10, boolean z4) {
        super(1, z4);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new t(0);
        this.P = new Rect();
        y1(i10);
    }
}
