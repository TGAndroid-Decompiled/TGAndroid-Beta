package fi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.zv;
import org.telegram.ui.cj0;
import org.telegram.ui.lp0;
import org.telegram.ui.rh0;
public final class p1 extends s4.n0 {
    public final int f11432a;
    public final Object f11433b;

    public p1(Object obj, int i10) {
        this.f11432a = i10;
        this.f11433b = obj;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        switch (this.f11432a) {
            case 0:
                if (((u1) this.f11433b).e.F1(RecyclerView.R(view))) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(4.0f);
                }
                rect.right = dp;
                rect.bottom = AndroidUtilities.dp(4.0f);
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f11433b;
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
                    rect.right = vh.C(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                    return;
                } else {
                    rect.right = AndroidUtilities.dp(24.0f);
                    return;
                }
            case 2:
                v vVar = ((aw) this.f11433b).h;
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
                sz szVar = (sz) this.f11433b;
                dy dyVar = szVar.P;
                if (view instanceof org.telegram.ui.Cells.s8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    if (RecyclerView.R(view) + 1 > szVar.R.E && !UserConfig.getInstance(szVar.f32719c1).isPremium() && !szVar.U0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof mm0) && !(view instanceof iy)) {
                    if (view instanceof org.telegram.ui.Components.y9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -dyVar.getPaddingLeft();
                    rect.right = -dyVar.getPaddingRight();
                    if (view instanceof iy) {
                        rect.top = AndroidUtilities.dp(8.0f);
                        return;
                    }
                    return;
                }
            case 4:
                if (RecyclerView.R(view) == ((ArrayList) this.f11433b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 5:
                if (RecyclerView.R(view) == ((rh0) this.f11433b).f43163c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                super.d(rect, view, recyclerView, b1Var);
                int R = RecyclerView.R(view);
                cj0 cj0Var = (cj0) this.f11433b;
                if (R == cj0Var.f38477c0.size()) {
                    rect.bottom = cj0Var.f38486l0;
                    return;
                }
                return;
            case 7:
                int R2 = RecyclerView.R(view);
                lp0 lp0Var = (lp0) this.f11433b;
                int i13 = lp0Var.f41317b0;
                if (R2 >= i13) {
                    int i14 = lp0Var.f41323f0;
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
                super.d(rect, view, recyclerView, b1Var);
                int R3 = RecyclerView.R(view);
                vg.z0 z0Var = (vg.z0) this.f11433b;
                if (R3 == z0Var.f50284d0.size()) {
                    rect.bottom = z0Var.f50295p0;
                    return;
                }
                return;
        }
    }
}
