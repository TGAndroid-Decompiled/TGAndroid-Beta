package di;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.yh;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.wz;
import org.telegram.ui.aq0;
import org.telegram.ui.li0;
import org.telegram.ui.xj0;
public final class q1 extends s4.m0 {
    public final int f7615a;
    public final Object f7616b;

    public q1(Object obj, int i10) {
        this.f7615a = i10;
        this.f7616b = obj;
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
        switch (this.f7615a) {
            case 0:
                x1 x1Var = ((y1) this.f7616b).e;
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
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f7616b;
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
                    rect.right = yh.C(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                    return;
                } else {
                    rect.right = AndroidUtilities.dp(24.0f);
                    return;
                }
            case 2:
                v vVar = ((ew) this.f7616b).h;
                if (view instanceof dw) {
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
                wz wzVar = (wz) this.f7616b;
                iy iyVar = wzVar.P;
                if (view instanceof org.telegram.ui.Cells.o8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > wzVar.R.E && !UserConfig.getInstance(wzVar.f31014c1).isPremium() && !wzVar.U0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof mm0) && !(view instanceof ny)) {
                    if (view instanceof org.telegram.ui.Components.z9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -iyVar.getPaddingLeft();
                    rect.right = -iyVar.getPaddingRight();
                    if (view instanceof ny) {
                        rect.top = AndroidUtilities.dp(8.0f);
                        return;
                    }
                    return;
                }
            case 4:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.f7616b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((li0) this.f7616b).f38021c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                super.a(rect, view, recyclerView, y0Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                xj0 xj0Var = (xj0) this.f7616b;
                if (R == xj0Var.f41872c0.size()) {
                    rect.bottom = xj0Var.f41881l0;
                    return;
                }
                return;
            case 7:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                aq0 aq0Var = (aq0) this.f7616b;
                int i13 = aq0Var.f34306b0;
                if (R2 >= i13) {
                    int i14 = aq0Var.f34312f0;
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
                ug.z0 z0Var = (ug.z0) this.f7616b;
                if (R3 == z0Var.f46417d0.size()) {
                    rect.bottom = z0Var.f46428p0;
                    return;
                }
                return;
        }
    }
}
