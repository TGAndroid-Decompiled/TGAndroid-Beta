package eg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.k8;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.vx;
import org.telegram.ui.oh0;
import org.telegram.ui.to0;
import org.telegram.ui.zi0;
public final class f2 extends f2.v0 {
    public final int f5991a;
    public final Object f5992b;

    public f2(Object obj, int i10) {
        this.f5991a = i10;
        this.f5992b = obj;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        switch (this.f5991a) {
            case 0:
                super.a(rect, view, recyclerView, k1Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                g2 g2Var = (g2) this.f5992b;
                if (R == g2Var.Z.size()) {
                    rect.bottom = g2Var.f6014l0;
                    return;
                }
                return;
            case 1:
                nh.s1 s1Var = ((nh.t1) this.f5992b).f18581e;
                recyclerView.getClass();
                if (s1Var.E1(RecyclerView.R(view))) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(4.0f);
                }
                rect.right = dp;
                rect.bottom = AndroidUtilities.dp(4.0f);
                return;
            case 2:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f5992b;
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
            case 3:
                nh.v vVar = ((jv) this.f5992b).h;
                if (view instanceof iv) {
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
            case 4:
                fz fzVar = (fz) this.f5992b;
                dx dxVar = fzVar.L;
                if (view instanceof k8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > fzVar.N.A && !UserConfig.getInstance(fzVar.Y0).isPremium() && !fzVar.Q0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof jl0) && !(view instanceof vx)) {
                    if (view instanceof t9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -dxVar.getPaddingLeft();
                    rect.right = -dxVar.getPaddingRight();
                    if (view instanceof vx) {
                        rect.top = AndroidUtilities.dp(8.0f);
                        return;
                    }
                    return;
                }
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.f5992b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((oh0) this.f5992b).f41129c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 7:
                super.a(rect, view, recyclerView, k1Var);
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                zi0 zi0Var = (zi0) this.f5992b;
                if (R2 == zi0Var.Y.size()) {
                    rect.bottom = zi0Var.f45244h0;
                    return;
                }
                return;
            default:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                to0 to0Var = (to0) this.f5992b;
                int i13 = to0Var.P;
                if (R3 >= i13) {
                    int i14 = to0Var.T;
                    if (R3 < i13 + i14) {
                        int i15 = R3 - i13;
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
                            i12 = AndroidUtilities.dp(8.0f);
                        } else {
                            i12 = 0;
                        }
                        rect.left = i12;
                        if (z13) {
                            i17 = AndroidUtilities.dp(8.0f);
                        }
                        rect.right = i17;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
