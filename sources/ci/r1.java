package ci;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ul;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.wx;
import org.telegram.ui.ai0;
import org.telegram.ui.lj0;
import org.telegram.ui.op0;
public final class r1 extends s4.n0 {
    public final int f5424a;
    public final Object f5425b;

    public r1(Object obj, int i10) {
        this.f5424a = i10;
        this.f5425b = obj;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        switch (this.f5424a) {
            case 0:
                y1 y1Var = ((z1) this.f5425b).e;
                recyclerView.getClass();
                if (y1Var.E1(RecyclerView.R(view))) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(4.0f);
                }
                rect.right = dp;
                rect.bottom = AndroidUtilities.dp(4.0f);
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f5425b;
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
                    rect.right = ul.A(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                    return;
                } else {
                    rect.right = AndroidUtilities.dp(24.0f);
                    return;
                }
            case 2:
                v vVar = ((tv) this.f5425b).h;
                if (view instanceof sv) {
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
                lz lzVar = (lz) this.f5425b;
                wx wxVar = lzVar.P;
                if (view instanceof org.telegram.ui.Cells.p8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > lzVar.R.E && !UserConfig.getInstance(lzVar.f25968c1).isPremium() && !lzVar.U0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof ml0) && !(view instanceof cy)) {
                    if (view instanceof org.telegram.ui.Components.w9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -wxVar.getPaddingLeft();
                    rect.right = -wxVar.getPaddingRight();
                    if (view instanceof cy) {
                        rect.top = AndroidUtilities.dp(8.0f);
                        return;
                    }
                    return;
                }
            case 4:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.f5425b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ai0) this.f5425b).f31801c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                super.a(rect, view, recyclerView, z0Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                lj0 lj0Var = (lj0) this.f5425b;
                if (R == lj0Var.f35003c0.size()) {
                    rect.bottom = lj0Var.f35012l0;
                    return;
                }
                return;
            case 7:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                op0 op0Var = (op0) this.f5425b;
                int i13 = op0Var.f35922b0;
                if (R2 >= i13) {
                    int i14 = op0Var.f35928f0;
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
                super.a(rect, view, recyclerView, z0Var);
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                tg.a1 a1Var = (tg.a1) this.f5425b;
                if (R3 == a1Var.f43018d0.size()) {
                    rect.bottom = a1Var.f43029p0;
                    return;
                }
                return;
        }
    }
}
