package mg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.z20;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.g3;
import org.telegram.ui.nn0;
import org.telegram.ui.rg0;
import org.telegram.ui.wh0;
public final class u1 extends s4.m0 {
    public final int f13244a;
    public final Object f13245b;

    public u1(Object obj, int i10) {
        this.f13244a = i10;
        this.f13245b = obj;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int L;
        switch (this.f13244a) {
            case 0:
                super.c(rect, view, recyclerView, z0Var);
                int R = RecyclerView.R(view);
                v1 v1Var = (v1) this.f13245b;
                if (R == v1Var.V1.size()) {
                    rect.bottom = v1Var.f13255h2;
                    return;
                }
                return;
            case 1:
                super.c(rect, view, recyclerView, z0Var);
                int R2 = RecyclerView.R(view);
                i2 i2Var = (i2) this.f13245b;
                if (R2 == i2Var.Y1.size()) {
                    rect.bottom = i2Var.f13145i2;
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f13245b;
                int b10 = recyclerView.T(view).b();
                if (b10 == 0) {
                    rect.left = org.telegram.messenger.i0.L(18.0f);
                }
                if (b10 == tVar.getAdapter().b() - 1) {
                    rect.right = org.telegram.messenger.i0.L(18.0f);
                    return;
                }
                int b11 = tVar.getAdapter().b();
                if (b11 == 4) {
                    rect.right = z20.A(58.0f, b11, tVar.getWidth() - org.telegram.messenger.i0.L(36.0f)) / (b11 - 1);
                    return;
                } else {
                    rect.right = org.telegram.messenger.i0.L(24.0f);
                    return;
                }
            case 3:
                g3 g3Var = ((cv) this.f13245b).f25165n1;
                if (view instanceof bv) {
                    rect.left = -g3Var.getPaddingLeft();
                    rect.right = -g3Var.getPaddingRight();
                    return;
                }
                g3Var.getClass();
                if (RecyclerView.R(view) == 1) {
                    rect.top = org.telegram.messenger.i0.L(14.0f);
                    return;
                }
                return;
            case 4:
                vy vyVar = (vy) this.f13245b;
                hx hxVar = vyVar.P;
                if (view instanceof n8) {
                    rect.left = org.telegram.messenger.i0.L(5.0f);
                    rect.right = org.telegram.messenger.i0.L(5.0f);
                    if (RecyclerView.R(view) + 1 > vyVar.R.E && !d20.i(vyVar.f31865c1).q() && !vyVar.U0) {
                        rect.top = org.telegram.messenger.i0.L(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof tk0) && !(view instanceof mx)) {
                    if (view instanceof g9) {
                        rect.bottom = org.telegram.messenger.i0.L(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -hxVar.getPaddingLeft();
                    rect.right = -hxVar.getPaddingRight();
                    if (view instanceof mx) {
                        rect.top = org.telegram.messenger.i0.L(8.0f);
                        return;
                    }
                    return;
                }
            case 5:
                if (RecyclerView.R(view) == ((ArrayList) this.f13245b).size() - 1) {
                    rect.bottom = org.telegram.messenger.i0.L(4.0f);
                    return;
                }
                return;
            case 6:
                if (RecyclerView.R(view) == ((rg0) this.f13245b).f41223c.size() - 1) {
                    rect.bottom = org.telegram.messenger.i0.L(4.0f);
                    return;
                }
                return;
            case 7:
                super.c(rect, view, recyclerView, z0Var);
                int R3 = RecyclerView.R(view);
                wh0 wh0Var = (wh0) this.f13245b;
                if (R3 == wh0Var.U1.size()) {
                    rect.bottom = wh0Var.f43308d2;
                    return;
                }
                return;
            case 8:
                int R4 = RecyclerView.R(view);
                nn0 nn0Var = (nn0) this.f13245b;
                int i13 = nn0Var.f39985b0;
                if (R4 >= i13) {
                    int i14 = nn0Var.f39991f0;
                    if (R4 < i13 + i14) {
                        int i15 = R4 - i13;
                        int i16 = i15 / 3;
                        boolean z13 = true;
                        int i17 = 0;
                        if (i16 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i16 == (i14 - 1) / 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i18 = i15 % 3;
                        if (i18 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i18 != 2) {
                            z13 = false;
                        }
                        if (z10) {
                            i10 = org.telegram.messenger.i0.L(8.0f);
                        } else {
                            i10 = 0;
                        }
                        rect.top = i10;
                        if (z11) {
                            i11 = org.telegram.messenger.i0.L(8.0f);
                        } else {
                            i11 = 0;
                        }
                        rect.bottom = i11;
                        if (z12) {
                            i12 = org.telegram.messenger.i0.L(10.0f);
                        } else {
                            i12 = 0;
                        }
                        rect.left = i12;
                        if (z13) {
                            i17 = org.telegram.messenger.i0.L(10.0f);
                        }
                        rect.right = i17;
                        return;
                    }
                    return;
                }
                return;
            default:
                if (((vh.g1) this.f13245b).e.E1(RecyclerView.R(view))) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.i0.L(4.0f);
                }
                rect.right = L;
                rect.bottom = org.telegram.messenger.i0.L(4.0f);
                return;
        }
    }
}
