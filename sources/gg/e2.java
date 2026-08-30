package gg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.zx;
import org.telegram.ui.bp0;
import org.telegram.ui.hj0;
import org.telegram.ui.k3;
import org.telegram.ui.wh0;
public final class e2 extends f2.u0 {
    public final int f6615a;
    public final Object f6616b;

    public e2(Object obj, int i10) {
        this.f6615a = i10;
        this.f6616b = obj;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int dp;
        switch (this.f6615a) {
            case 0:
                super.a(rect, view, recyclerView, i1Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                f2 f2Var = (f2) this.f6616b;
                if (R == f2Var.f6626a0.size()) {
                    rect.bottom = f2Var.m0;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f6616b;
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
                    rect.right = org.telegram.ui.b.z(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                    return;
                } else {
                    rect.right = AndroidUtilities.dp(24.0f);
                    return;
                }
            case 2:
                k3 k3Var = ((mv) this.f6616b).h;
                if (view instanceof lv) {
                    rect.left = -k3Var.getPaddingLeft();
                    rect.right = -k3Var.getPaddingRight();
                    return;
                }
                k3Var.getClass();
                if (RecyclerView.R(view) == 1) {
                    rect.top = AndroidUtilities.dp(14.0f);
                    return;
                }
                return;
            case 3:
                kz kzVar = (kz) this.f6616b;
                ix ixVar = kzVar.M;
                if (view instanceof m8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > kzVar.O.B && !UserConfig.getInstance(kzVar.Z0).isPremium() && !kzVar.R0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof sl0) && !(view instanceof zx)) {
                    if (view instanceof p9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -ixVar.getPaddingLeft();
                    rect.right = -ixVar.getPaddingRight();
                    if (view instanceof zx) {
                        rect.top = AndroidUtilities.dp(8.0f);
                        return;
                    }
                    return;
                }
            case 4:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.f6616b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((wh0) this.f6616b).f39743c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                super.a(rect, view, recyclerView, i1Var);
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                hj0 hj0Var = (hj0) this.f6616b;
                if (R2 == hj0Var.Z.size()) {
                    rect.bottom = hj0Var.f34899i0;
                    return;
                }
                return;
            case 7:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                bp0 bp0Var = (bp0) this.f6616b;
                int i13 = bp0Var.Q;
                if (R3 >= i13) {
                    int i14 = bp0Var.U;
                    if (R3 < i13 + i14) {
                        int i15 = R3 - i13;
                        int i16 = i15 / 3;
                        boolean z12 = true;
                        int i17 = 0;
                        if (i16 == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i16 == (i14 - 1) / 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i18 = i15 % 3;
                        if (i18 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i18 != 2) {
                            z12 = false;
                        }
                        if (z4) {
                            i10 = AndroidUtilities.dp(8.0f);
                        } else {
                            i10 = 0;
                        }
                        rect.top = i10;
                        if (z10) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        rect.bottom = i11;
                        if (z11) {
                            i12 = AndroidUtilities.dp(8.0f);
                        } else {
                            i12 = 0;
                        }
                        rect.left = i12;
                        if (z12) {
                            i17 = AndroidUtilities.dp(8.0f);
                        }
                        rect.right = i17;
                        return;
                    }
                    return;
                }
                return;
            default:
                ph.h1 h1Var = ((ph.i1) this.f6616b).e;
                recyclerView.getClass();
                if (h1Var.E1(RecyclerView.R(view))) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(4.0f);
                }
                rect.right = dp;
                rect.bottom = AndroidUtilities.dp(4.0f);
                return;
        }
    }
}
