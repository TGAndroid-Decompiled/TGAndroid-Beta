package bg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ll;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.ww;
import org.telegram.ui.Components.wy;
import org.telegram.ui.bj0;
import org.telegram.ui.ph0;
import org.telegram.ui.uo0;
public final class p2 extends f2.y0 {
    public final int f1917a;
    public final Object f1918b;

    public p2(Object obj, int i9) {
        this.f1917a = i9;
        this.f1918b = obj;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        int dp;
        boolean z10;
        boolean z11;
        boolean z12;
        int i9;
        int i10;
        int i11;
        switch (this.f1917a) {
            case 0:
                super.a(rect, view, recyclerView, n1Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                q2 q2Var = (q2) this.f1918b;
                if (R == q2Var.Z.size()) {
                    rect.bottom = q2Var.f1934l0;
                    return;
                }
                return;
            case 1:
                kh.v1 v1Var = ((kh.w1) this.f1918b).f16230e;
                recyclerView.getClass();
                if (v1Var.E1(RecyclerView.R(view))) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(4.0f);
                }
                rect.right = dp;
                rect.bottom = AndroidUtilities.dp(4.0f);
                return;
            case 2:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f1918b;
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
                    rect.right = ll.A(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                    return;
                } else {
                    rect.right = AndroidUtilities.dp(24.0f);
                    return;
                }
            case 3:
                kh.w wVar = ((dv) this.f1918b).h;
                if (view instanceof cv) {
                    rect.left = -wVar.getPaddingLeft();
                    rect.right = -wVar.getPaddingRight();
                    return;
                }
                wVar.getClass();
                if (RecyclerView.R(view) == 1) {
                    rect.top = AndroidUtilities.dp(14.0f);
                    return;
                }
                return;
            case 4:
                wy wyVar = (wy) this.f1918b;
                ww wwVar = wyVar.L;
                if (view instanceof m8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > wyVar.N.A && !UserConfig.getInstance(wyVar.Y0).isPremium() && !wyVar.Q0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof wk0) && !(view instanceof nx)) {
                    if (view instanceof o9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -wwVar.getPaddingLeft();
                    rect.right = -wwVar.getPaddingRight();
                    if (view instanceof nx) {
                        rect.top = AndroidUtilities.dp(8.0f);
                        return;
                    }
                    return;
                }
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.f1918b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ph0) this.f1918b).f41526c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 7:
                super.a(rect, view, recyclerView, n1Var);
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                bj0 bj0Var = (bj0) this.f1918b;
                if (R2 == bj0Var.Y.size()) {
                    rect.bottom = bj0Var.f36886h0;
                    return;
                }
                return;
            default:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                uo0 uo0Var = (uo0) this.f1918b;
                int i12 = uo0Var.P;
                if (R3 >= i12) {
                    int i13 = uo0Var.T;
                    if (R3 < i12 + i13) {
                        int i14 = R3 - i12;
                        int i15 = i14 / 3;
                        boolean z13 = true;
                        int i16 = 0;
                        if (i15 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i15 == (i13 - 1) / 3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i17 = i14 % 3;
                        if (i17 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i17 != 2) {
                            z13 = false;
                        }
                        if (z10) {
                            i9 = AndroidUtilities.dp(8.0f);
                        } else {
                            i9 = 0;
                        }
                        rect.top = i9;
                        if (z11) {
                            i10 = AndroidUtilities.dp(8.0f);
                        } else {
                            i10 = 0;
                        }
                        rect.bottom = i10;
                        if (z12) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        rect.left = i11;
                        if (z13) {
                            i16 = AndroidUtilities.dp(8.0f);
                        }
                        rect.right = i16;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
