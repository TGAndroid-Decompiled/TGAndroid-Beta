package ei;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.tl;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.xv;
import org.telegram.ui.Components.yv;
import org.telegram.ui.ej0;
import org.telegram.ui.ep0;
import org.telegram.ui.th0;
public final class q1 extends s4.m0 {
    public final int f9634a;
    public final Object f9635b;

    public q1(Object obj, int i10) {
        this.f9634a = i10;
        this.f9635b = obj;
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
        switch (this.f9634a) {
            case 0:
                u1 u1Var = ((v1) this.f9635b).e;
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
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f9635b;
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
                    rect.right = tl.B(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                    return;
                } else {
                    rect.right = AndroidUtilities.dp(24.0f);
                    return;
                }
            case 2:
                v vVar = ((yv) this.f9635b).h;
                if (view instanceof xv) {
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
                rz rzVar = (rz) this.f9635b;
                cy cyVar = rzVar.P;
                if (view instanceof org.telegram.ui.Cells.o8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > rzVar.R.E && !UserConfig.getInstance(rzVar.f30310c1).isPremium() && !rzVar.U0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof lm0) && !(view instanceof hy)) {
                    if (view instanceof org.telegram.ui.Components.u9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -cyVar.getPaddingLeft();
                    rect.right = -cyVar.getPaddingRight();
                    if (view instanceof hy) {
                        rect.top = AndroidUtilities.dp(8.0f);
                        return;
                    }
                    return;
                }
            case 4:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.f9635b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((th0) this.f9635b).f42063c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                super.a(rect, view, recyclerView, y0Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                ej0 ej0Var = (ej0) this.f9635b;
                if (R == ej0Var.f36924c0.size()) {
                    rect.bottom = ej0Var.f36933l0;
                    return;
                }
                return;
            case 7:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                ep0 ep0Var = (ep0) this.f9635b;
                int i13 = ep0Var.f36967b0;
                if (R2 >= i13) {
                    int i14 = ep0Var.f36973f0;
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
                ug.x0 x0Var = (ug.x0) this.f9635b;
                if (R3 == x0Var.f48221d0.size()) {
                    rect.bottom = x0Var.f48232p0;
                    return;
                }
                return;
        }
    }
}
