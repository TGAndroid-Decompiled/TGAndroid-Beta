package fi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.tw;
import org.telegram.ui.Components.yw;
import org.telegram.ui.dm0;
import org.telegram.ui.lf0;
import org.telegram.ui.sg0;
public final class o1 extends v4.m0 {
    public final int f12508a;
    public final Object f12509b;

    public o1(Object obj, int i7) {
        this.f12508a = i7;
        this.f12509b = obj;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int L;
        boolean z9;
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        int i11;
        switch (this.f12508a) {
            case 0:
                if (((t1) this.f12509b).f12841e.E1(RecyclerView.R(view))) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(4.0f);
                }
                rect.right = L;
                rect.bottom = org.telegram.messenger.g0.L(4.0f);
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f12509b;
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
                v vVar = ((ru) this.f12509b).n1;
                if (view instanceof qu) {
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
                hy hyVar = (hy) this.f12509b;
                tw twVar = hyVar.P;
                if (view instanceof org.telegram.ui.Cells.j8) {
                    rect.left = org.telegram.messenger.g0.L(5.0f);
                    rect.right = org.telegram.messenger.g0.L(5.0f);
                    if (RecyclerView.R(view) + 1 > hyVar.R.E && !p10.i(hyVar.f34415c1).q() && !hyVar.U0) {
                        rect.top = org.telegram.messenger.g0.L(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof qj0) && !(view instanceof yw)) {
                    if (view instanceof org.telegram.ui.Components.l9) {
                        rect.bottom = org.telegram.messenger.g0.L(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -twVar.getPaddingLeft();
                    rect.right = -twVar.getPaddingRight();
                    if (view instanceof yw) {
                        rect.top = org.telegram.messenger.g0.L(8.0f);
                        return;
                    }
                    return;
                }
            case 4:
                if (RecyclerView.R(view) == ((ArrayList) this.f12509b).size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    return;
                }
                return;
            case 5:
                if (RecyclerView.R(view) == ((lf0) this.f12509b).f47592c.size() - 1) {
                    rect.bottom = org.telegram.messenger.g0.L(4.0f);
                    return;
                }
                return;
            case 6:
                super.e(rect, view, recyclerView, a1Var);
                int R = RecyclerView.R(view);
                sg0 sg0Var = (sg0) this.f12509b;
                if (R == sg0Var.U1.size()) {
                    rect.bottom = sg0Var.d2;
                    return;
                }
                return;
            case 7:
                int R2 = RecyclerView.R(view);
                dm0 dm0Var = (dm0) this.f12509b;
                int i12 = dm0Var.f45061b0;
                if (R2 >= i12) {
                    int i13 = dm0Var.f45068f0;
                    if (R2 < i12 + i13) {
                        int i14 = R2 - i12;
                        int i15 = i14 / 3;
                        boolean z12 = true;
                        int i16 = 0;
                        if (i15 == 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (i15 == (i13 - 1) / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i17 = i14 % 3;
                        if (i17 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i17 != 2) {
                            z12 = false;
                        }
                        if (z9) {
                            i7 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i7 = 0;
                        }
                        rect.top = i7;
                        if (z10) {
                            i10 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i10 = 0;
                        }
                        rect.bottom = i10;
                        if (z11) {
                            i11 = org.telegram.messenger.g0.L(10.0f);
                        } else {
                            i11 = 0;
                        }
                        rect.left = i11;
                        if (z12) {
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
                wg.w0 w0Var = (wg.w0) this.f12509b;
                if (R3 == w0Var.V1.size()) {
                    rect.bottom = w0Var.f57825h2;
                    return;
                }
                return;
            default:
                super.e(rect, view, recyclerView, a1Var);
                int R4 = RecyclerView.R(view);
                wg.f1 f1Var = (wg.f1) this.f12509b;
                if (R4 == f1Var.Y1.size()) {
                    rect.bottom = f1Var.f57733i2;
                    return;
                }
                return;
        }
    }
}
