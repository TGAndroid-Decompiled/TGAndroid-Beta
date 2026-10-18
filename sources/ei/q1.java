package ei;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.lk;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.zv;
import org.telegram.ui.cj0;
import org.telegram.ui.ep0;
import org.telegram.ui.rh0;
public final class q1 extends s4.m0 {
    public final int f9619a;
    public final Object f9620b;

    public q1(Object obj, int i10) {
        this.f9619a = i10;
        this.f9620b = obj;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        switch (this.f9619a) {
            case 0:
                u1 u1Var = ((v1) this.f9620b).e;
                recyclerView.getClass();
                if (u1Var.E1(RecyclerView.R(view))) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(4.0f);
                }
                rect.right = dp;
                rect.bottom = AndroidUtilities.dp(4.0f);
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f9620b;
                int b10 = recyclerView.T(view).b();
                if (b10 == 0) {
                    rect.left = AndroidUtilities.dp(18.0f);
                }
                if (b10 == tVar.getAdapter().h() - 1) {
                    rect.right = AndroidUtilities.dp(18.0f);
                    return;
                }
                int h = tVar.getAdapter().h();
                if (h == 4) {
                    rect.right = lk.B(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                    return;
                } else {
                    rect.right = AndroidUtilities.dp(24.0f);
                    return;
                }
            case 2:
                v vVar = ((aw) this.f9620b).h;
                if (view instanceof zv) {
                    rect.left = -vVar.getPaddingLeft();
                    rect.right = -vVar.getPaddingRight();
                    return;
                }
                vVar.getClass();
                if (RecyclerView.R(view) == 1) {
                    rect.top = AndroidUtilities.dp(14.0f);
                    return;
                }
                return;
            case 3:
                tz tzVar = (tz) this.f9620b;
                ey eyVar = tzVar.P;
                if (view instanceof org.telegram.ui.Cells.n8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > tzVar.R.E && !UserConfig.getInstance(tzVar.f30747c1).isPremium() && !tzVar.U0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof im0) && !(view instanceof jy)) {
                    if (view instanceof org.telegram.ui.Components.w9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -eyVar.getPaddingLeft();
                    rect.right = -eyVar.getPaddingRight();
                    if (view instanceof jy) {
                        rect.top = AndroidUtilities.dp(8.0f);
                        return;
                    }
                    return;
                }
            case 4:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.f9620b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((rh0) this.f9620b).f40732c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                super.a(rect, view, recyclerView, y0Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                cj0 cj0Var = (cj0) this.f9620b;
                if (R == cj0Var.f35918c0.size()) {
                    rect.bottom = cj0Var.f35927l0;
                    return;
                }
                return;
            case 7:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                ep0 ep0Var = (ep0) this.f9620b;
                int i13 = ep0Var.f36567b0;
                if (R2 >= i13) {
                    int i14 = ep0Var.f36573f0;
                    if (R2 < i13 + i14) {
                        int i15 = R2 - i13;
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
                            i10 = AndroidUtilities.dp(8.0f);
                        } else {
                            i10 = 0;
                        }
                        rect.top = i10;
                        if (z11) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        rect.bottom = i11;
                        if (z12) {
                            i12 = AndroidUtilities.dp(10.0f);
                        } else {
                            i12 = 0;
                        }
                        rect.left = i12;
                        if (z13) {
                            i17 = AndroidUtilities.dp(10.0f);
                        }
                        rect.right = i17;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.a(rect, view, recyclerView, y0Var);
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                ug.y0 y0Var2 = (ug.y0) this.f9620b;
                if (R3 == y0Var2.f47778d0.size()) {
                    rect.bottom = y0Var2.f47789p0;
                    return;
                }
                return;
        }
    }
}
