package ai;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.ui.Cells.j8;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qy;
import org.telegram.ui.dm0;
import org.telegram.ui.lf0;
import org.telegram.ui.tg0;
public final class f0 extends v4.o0 {
    public final int f1188a;
    public final Object f1189b;

    public f0(Object obj, int i7) {
        this.f1188a = i7;
        this.f1189b = obj;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int L;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        int i10;
        int i11;
        switch (this.f1188a) {
            case 0:
                l0 l0Var = (l0) this.f1189b;
                if (l0Var.F0 > 0.0f && RecyclerView.R(view) == 0) {
                    rect.bottom += (int) l0Var.F0;
                    return;
                }
                return;
            case 1:
                if (((hi.b2) this.f1189b).f14217e.E1(RecyclerView.R(view))) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(4.0f);
                }
                rect.right = L;
                rect.bottom = org.telegram.messenger.g0.L(4.0f);
                return;
            case 2:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f1189b;
                int b10 = recyclerView.T(view).b();
                if (b10 == 0) {
                    rect.left = org.telegram.messenger.g0.L(18.0f);
                }
                if (b10 == tVar.getAdapter().b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(18.0f);
                    return;
                }
                int b11 = tVar.getAdapter().b();
                if (b11 == 4) {
                    rect.right = m10.B(58.0f, b11, tVar.getWidth() - org.telegram.messenger.g0.L(36.0f)) / (b11 - 1);
                    return;
                } else {
                    rect.right = org.telegram.messenger.g0.L(24.0f);
                    return;
                }
            case 3:
                hi.e0 e0Var = ((bv) this.f1189b).f33820r1;
                if (view instanceof av) {
                    rect.left = -e0Var.getPaddingLeft();
                    rect.right = -e0Var.getPaddingRight();
                    return;
                }
                e0Var.getClass();
                if (RecyclerView.R(view) == 1) {
                    rect.top = org.telegram.messenger.g0.L(14.0f);
                    return;
                }
                return;
            case 4:
                qy qyVar = (qy) this.f1189b;
                dx dxVar = qyVar.Q;
                if (view instanceof j8) {
                    rect.left = org.telegram.messenger.g0.L(5.0f);
                    rect.right = org.telegram.messenger.g0.L(5.0f);
                    if (RecyclerView.R(view) + 1 > qyVar.S.F && !i10.i(qyVar.f39047d1).q() && !qyVar.V0) {
                        rect.top = org.telegram.messenger.g0.L(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof ek0) && !(view instanceof ix)) {
                    if (view instanceof p9) {
                        rect.bottom = org.telegram.messenger.g0.L(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -dxVar.getPaddingLeft();
                    rect.right = -dxVar.getPaddingRight();
                    if (view instanceof ix) {
                        rect.top = org.telegram.messenger.g0.L(8.0f);
                        return;
                    }
                    return;
                }
            case 5:
                if (RecyclerView.R(view) == ((ArrayList) this.f1189b).size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    return;
                }
                return;
            case 6:
                if (RecyclerView.R(view) == ((lf0) this.f1189b).f49746c.size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    return;
                }
                return;
            case 7:
                super.e(rect, view, recyclerView, c1Var);
                int R = RecyclerView.R(view);
                tg0 tg0Var = (tg0) this.f1189b;
                if (R == tg0Var.Y1.size()) {
                    rect.bottom = tg0Var.f52397h2;
                    return;
                }
                return;
            case 8:
                int R2 = RecyclerView.R(view);
                dm0 dm0Var = (dm0) this.f1189b;
                int i12 = dm0Var.f47169c0;
                if (R2 >= i12) {
                    int i13 = dm0Var.f47175g0;
                    if (R2 < i12 + i13) {
                        int i14 = R2 - i12;
                        int i15 = i14 / 3;
                        boolean z13 = true;
                        int i16 = 0;
                        if (i15 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i15 == (i13 - 1) / 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i17 = i14 % 3;
                        if (i17 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i17 != 2) {
                            z13 = false;
                        }
                        if (z10) {
                            i7 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i7 = 0;
                        }
                        rect.top = i7;
                        if (z11) {
                            i10 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i10 = 0;
                        }
                        rect.bottom = i10;
                        if (z12) {
                            i11 = org.telegram.messenger.g0.L(10.0f);
                        } else {
                            i11 = 0;
                        }
                        rect.left = i11;
                        if (z13) {
                            i16 = org.telegram.messenger.g0.L(10.0f);
                        }
                        rect.right = i16;
                        return;
                    }
                    return;
                }
                return;
            case 9:
                super.e(rect, view, recyclerView, c1Var);
                int R3 = RecyclerView.R(view);
                wg.v0 v0Var = (wg.v0) this.f1189b;
                if (R3 == v0Var.Z1.size()) {
                    rect.bottom = v0Var.f59949l2;
                    return;
                }
                return;
            default:
                super.e(rect, view, recyclerView, c1Var);
                int R4 = RecyclerView.R(view);
                wg.d1 d1Var = (wg.d1) this.f1189b;
                if (R4 == d1Var.f59849b2.size()) {
                    rect.bottom = d1Var.f59858l2;
                    return;
                }
                return;
        }
    }
}
