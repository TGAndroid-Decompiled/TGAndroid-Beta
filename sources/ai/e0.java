package ai;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.k10;
import org.telegram.messenger.o10;
import org.telegram.ui.Cells.k8;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.ty;
import org.telegram.ui.fm0;
import org.telegram.ui.mf0;
import org.telegram.ui.vg0;
public final class e0 extends v4.n0 {
    public final int f1174a;
    public final Object f1175b;

    public e0(Object obj, int i7) {
        this.f1174a = i7;
        this.f1175b = obj;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        int L;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        int i10;
        int i11;
        switch (this.f1174a) {
            case 0:
                k0 k0Var = (k0) this.f1175b;
                if (k0Var.F0 > 0.0f && RecyclerView.R(view) == 0) {
                    rect.bottom += (int) k0Var.F0;
                    return;
                }
                return;
            case 1:
                if (((hi.t1) this.f1175b).f15367e.E1(RecyclerView.R(view))) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(4.0f);
                }
                rect.right = L;
                rect.bottom = org.telegram.messenger.g0.L(4.0f);
                return;
            case 2:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f1175b;
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
                    rect.right = o10.B(58.0f, b11, tVar.getWidth() - org.telegram.messenger.g0.L(36.0f)) / (b11 - 1);
                    return;
                } else {
                    rect.right = org.telegram.messenger.g0.L(24.0f);
                    return;
                }
            case 3:
                hi.v vVar = ((dv) this.f1175b).f34573r1;
                if (view instanceof cv) {
                    rect.left = -vVar.getPaddingLeft();
                    rect.right = -vVar.getPaddingRight();
                    return;
                }
                vVar.getClass();
                if (RecyclerView.R(view) == 1) {
                    rect.top = org.telegram.messenger.g0.L(14.0f);
                    return;
                }
                return;
            case 4:
                ty tyVar = (ty) this.f1175b;
                gx gxVar = tyVar.Q;
                if (view instanceof k8) {
                    rect.left = org.telegram.messenger.g0.L(5.0f);
                    rect.right = org.telegram.messenger.g0.L(5.0f);
                    if (RecyclerView.R(view) + 1 > tyVar.S.F && !k10.i(tyVar.f40074d1).q() && !tyVar.V0) {
                        rect.top = org.telegram.messenger.g0.L(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof ek0) && !(view instanceof lx)) {
                    if (view instanceof q9) {
                        rect.bottom = org.telegram.messenger.g0.L(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -gxVar.getPaddingLeft();
                    rect.right = -gxVar.getPaddingRight();
                    if (view instanceof lx) {
                        rect.top = org.telegram.messenger.g0.L(8.0f);
                        return;
                    }
                    return;
                }
            case 5:
                if (RecyclerView.R(view) == ((ArrayList) this.f1175b).size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    return;
                }
                return;
            case 6:
                if (RecyclerView.R(view) == ((mf0) this.f1175b).f49842c.size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    return;
                }
                return;
            case 7:
                super.e(rect, view, recyclerView, b1Var);
                int R = RecyclerView.R(view);
                vg0 vg0Var = (vg0) this.f1175b;
                if (R == vg0Var.Y1.size()) {
                    rect.bottom = vg0Var.f52804h2;
                    return;
                }
                return;
            case 8:
                int R2 = RecyclerView.R(view);
                fm0 fm0Var = (fm0) this.f1175b;
                int i12 = fm0Var.f47738c0;
                if (R2 >= i12) {
                    int i13 = fm0Var.f47744g0;
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
                super.e(rect, view, recyclerView, b1Var);
                int R3 = RecyclerView.R(view);
                wg.w0 w0Var = (wg.w0) this.f1175b;
                if (R3 == w0Var.Z1.size()) {
                    rect.bottom = w0Var.f59854l2;
                    return;
                }
                return;
            default:
                super.e(rect, view, recyclerView, b1Var);
                int R4 = RecyclerView.R(view);
                wg.e1 e1Var = (wg.e1) this.f1175b;
                if (R4 == e1Var.f59754b2.size()) {
                    rect.bottom = e1Var.f59763l2;
                    return;
                }
                return;
        }
    }
}
