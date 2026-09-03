package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.hp0;
import org.telegram.ui.ij0;
import org.telegram.ui.k3;
import org.telegram.ui.xh0;
public final class e2 extends f2.v0 {
    public final int f7459a;
    public final Object f7460b;

    public e2(Object obj, int i10) {
        this.f7459a = i10;
        this.f7460b = obj;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int dp;
        switch (this.f7459a) {
            case 0:
                super.a(rect, view, recyclerView, j1Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                f2 f2Var = (f2) this.f7460b;
                if (R == f2Var.f7470a0.size()) {
                    rect.bottom = f2Var.m0;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f7460b;
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
                k3 k3Var = ((ov) this.f7460b).h;
                if (view instanceof nv) {
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
                mz mzVar = (mz) this.f7460b;
                kx kxVar = mzVar.M;
                if (view instanceof m8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > mzVar.O.B && !UserConfig.getInstance(mzVar.Z0).isPremium() && !mzVar.R0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof sl0) && !(view instanceof cy)) {
                    if (view instanceof p9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -kxVar.getPaddingLeft();
                    rect.right = -kxVar.getPaddingRight();
                    if (view instanceof cy) {
                        rect.top = AndroidUtilities.dp(8.0f);
                        return;
                    }
                    return;
                }
            case 4:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.f7460b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((xh0) this.f7460b).f43050c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                super.a(rect, view, recyclerView, j1Var);
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                ij0 ij0Var = (ij0) this.f7460b;
                if (R2 == ij0Var.Z.size()) {
                    rect.bottom = ij0Var.f37727i0;
                    return;
                }
                return;
            case 7:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                hp0 hp0Var = (hp0) this.f7460b;
                int i13 = hp0Var.V;
                if (R3 >= i13) {
                    int i14 = hp0Var.f37446c0;
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
                            i12 = AndroidUtilities.dp(10.0f);
                        } else {
                            i12 = 0;
                        }
                        rect.left = i12;
                        if (z12) {
                            i17 = AndroidUtilities.dp(10.0f);
                        }
                        rect.right = i17;
                        return;
                    }
                    return;
                }
                return;
            default:
                qh.g1 g1Var = ((qh.h1) this.f7460b).f45385e;
                recyclerView.getClass();
                if (g1Var.E1(RecyclerView.R(view))) {
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
