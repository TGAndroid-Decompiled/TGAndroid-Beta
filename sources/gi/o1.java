package gi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.rw;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.ww;
import org.telegram.ui.df0;
import org.telegram.ui.kg0;
import org.telegram.ui.wl0;
public final class o1 extends u4.n0 {
    public final int f13323a;
    public final Object f13324b;

    public o1(Object obj, int i3) {
        this.f13323a = i3;
        this.f13324b = obj;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        int L;
        boolean z10;
        boolean z11;
        boolean z12;
        int i3;
        int i10;
        int i11;
        switch (this.f13323a) {
            case 0:
                if (((t1) this.f13324b).f13603e.E1(RecyclerView.R(view))) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(4.0f);
                }
                rect.right = L;
                rect.bottom = org.telegram.messenger.g0.L(4.0f);
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f13324b;
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
                    rect.right = org.telegram.messenger.camera.q.A(58.0f, b11, tVar.getWidth() - org.telegram.messenger.g0.L(36.0f)) / (b11 - 1);
                    return;
                } else {
                    rect.right = org.telegram.messenger.g0.L(24.0f);
                    return;
                }
            case 2:
                v vVar = ((pu) this.f13324b).f37243o1;
                if (view instanceof ou) {
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
            case 3:
                ey eyVar = (ey) this.f13324b;
                rw rwVar = eyVar.Q;
                if (view instanceof org.telegram.ui.Cells.i8) {
                    rect.left = org.telegram.messenger.g0.L(5.0f);
                    rect.right = org.telegram.messenger.g0.L(5.0f);
                    if (RecyclerView.R(view) + 1 > eyVar.S.F && !h10.i(eyVar.f33529d1).q() && !eyVar.V0) {
                        rect.top = org.telegram.messenger.g0.L(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof tj0) && !(view instanceof ww)) {
                    if (view instanceof org.telegram.ui.Components.k9) {
                        rect.bottom = org.telegram.messenger.g0.L(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -rwVar.getPaddingLeft();
                    rect.right = -rwVar.getPaddingRight();
                    if (view instanceof ww) {
                        rect.top = org.telegram.messenger.g0.L(8.0f);
                        return;
                    }
                    return;
                }
            case 4:
                if (RecyclerView.R(view) == ((ArrayList) this.f13324b).size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    return;
                }
                return;
            case 5:
                if (RecyclerView.R(view) == ((df0) this.f13324b).f44677c.size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    return;
                }
                return;
            case 6:
                super.e(rect, view, recyclerView, a1Var);
                int R = RecyclerView.R(view);
                kg0 kg0Var = (kg0) this.f13324b;
                if (R == kg0Var.V1.size()) {
                    rect.bottom = kg0Var.f46927e2;
                    return;
                }
                return;
            case 7:
                int R2 = RecyclerView.R(view);
                wl0 wl0Var = (wl0) this.f13324b;
                int i12 = wl0Var.f51205c0;
                if (R2 >= i12) {
                    int i13 = wl0Var.f51211g0;
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
                            i3 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i3 = 0;
                        }
                        rect.top = i3;
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
            case 8:
                super.e(rect, view, recyclerView, a1Var);
                int R3 = RecyclerView.R(view);
                xg.w0 w0Var = (xg.w0) this.f13324b;
                if (R3 == w0Var.W1.size()) {
                    rect.bottom = w0Var.f58778i2;
                    return;
                }
                return;
            default:
                super.e(rect, view, recyclerView, a1Var);
                int R4 = RecyclerView.R(view);
                xg.e1 e1Var = (xg.e1) this.f13324b;
                if (R4 == e1Var.Z1.size()) {
                    rect.bottom = e1Var.f58681j2;
                    return;
                }
                return;
        }
    }
}
