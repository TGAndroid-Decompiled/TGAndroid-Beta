package ci;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.am;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.kw;
import org.telegram.ui.Components.lw;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.ii0;
import org.telegram.ui.tj0;
import org.telegram.ui.wp0;
public final class q1 extends s4.o0 {
    public final int f5754a;
    public final Object f5755b;

    public q1(Object obj, int i10) {
        this.f5754a = i10;
        this.f5755b = obj;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        switch (this.f5754a) {
            case 0:
                x1 x1Var = ((y1) this.f5755b).f6341e;
                recyclerView.getClass();
                if (x1Var.E1(RecyclerView.R(view))) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(4.0f);
                }
                rect.right = dp;
                rect.bottom = AndroidUtilities.dp(4.0f);
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f5755b;
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
                    rect.right = am.B(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                    return;
                } else {
                    rect.right = AndroidUtilities.dp(24.0f);
                    return;
                }
            case 2:
                v vVar = ((lw) this.f5755b).h;
                if (view instanceof kw) {
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
                d00 d00Var = (d00) this.f5755b;
                py pyVar = d00Var.P;
                if (view instanceof org.telegram.ui.Cells.o8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > d00Var.R.E && !UserConfig.getInstance(d00Var.f25072c1).isPremium() && !d00Var.U0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof wm0) && !(view instanceof uy)) {
                    if (view instanceof org.telegram.ui.Components.y9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -pyVar.getPaddingLeft();
                    rect.right = -pyVar.getPaddingRight();
                    if (view instanceof uy) {
                        rect.top = AndroidUtilities.dp(8.0f);
                        return;
                    }
                    return;
                }
            case 4:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.f5755b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ii0) this.f5755b).f38917c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                super.a(rect, view, recyclerView, a1Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                tj0 tj0Var = (tj0) this.f5755b;
                if (R == tj0Var.f42218c0.size()) {
                    rect.bottom = tj0Var.f42227l0;
                    return;
                }
                return;
            case 7:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                wp0 wp0Var = (wp0) this.f5755b;
                int i13 = wp0Var.f43585b0;
                if (R2 >= i13) {
                    int i14 = wp0Var.f43592f0;
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
                super.a(rect, view, recyclerView, a1Var);
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                tg.z0 z0Var = (tg.z0) this.f5755b;
                if (R3 == z0Var.f48676d0.size()) {
                    rect.bottom = z0Var.f48687p0;
                    return;
                }
                return;
        }
    }
}
