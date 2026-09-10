package bi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.em;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vv;
import org.telegram.ui.Components.wv;
import org.telegram.ui.gi0;
import org.telegram.ui.sj0;
import org.telegram.ui.up0;
public final class z1 extends s4.n0 {
    public final int f3995a;
    public final Object f3996b;

    public z1(Object obj, int i10) {
        this.f3995a = i10;
        this.f3996b = obj;
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
        switch (this.f3995a) {
            case 0:
                j2 j2Var = ((k2) this.f3996b).e;
                recyclerView.getClass();
                if (j2Var.E1(RecyclerView.R(view))) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(4.0f);
                }
                rect.right = dp;
                rect.bottom = AndroidUtilities.dp(4.0f);
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f3996b;
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
                    rect.right = em.A(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                    return;
                } else {
                    rect.right = AndroidUtilities.dp(24.0f);
                    return;
                }
            case 2:
                z zVar = ((wv) this.f3996b).h;
                if (view instanceof vv) {
                    rect.left = -zVar.getPaddingLeft();
                    rect.right = -zVar.getPaddingRight();
                    return;
                }
                zVar.getClass();
                if (RecyclerView.R(view) == 1) {
                    rect.top = AndroidUtilities.dp(14.0f);
                    return;
                }
                return;
            case 3:
                rz rzVar = (rz) this.f3996b;
                px pxVar = rzVar.P;
                if (view instanceof org.telegram.ui.Cells.p8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > rzVar.R.E && !UserConfig.getInstance(rzVar.f26805c1).isPremium() && !rzVar.U0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof vl0) && !(view instanceof iy)) {
                    if (view instanceof org.telegram.ui.Components.w9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -pxVar.getPaddingLeft();
                    rect.right = -pxVar.getPaddingRight();
                    if (view instanceof iy) {
                        rect.top = AndroidUtilities.dp(8.0f);
                        return;
                    }
                    return;
                }
            case 4:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.f3996b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((gi0) this.f3996b).f33110c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                super.a(rect, view, recyclerView, z0Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                sj0 sj0Var = (sj0) this.f3996b;
                if (R == sj0Var.f36696c0.size()) {
                    rect.bottom = sj0Var.f36705l0;
                    return;
                }
                return;
            case 7:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                up0 up0Var = (up0) this.f3996b;
                int i13 = up0Var.f37308b0;
                if (R2 >= i13) {
                    int i14 = up0Var.f37314f0;
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
                sg.c1 c1Var = (sg.c1) this.f3996b;
                if (R3 == c1Var.f41882d0.size()) {
                    rect.bottom = c1Var.f41893p0;
                    return;
                }
                return;
        }
    }
}
