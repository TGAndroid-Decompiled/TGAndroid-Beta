package gg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.zx;
import org.telegram.ui.hp0;
import org.telegram.ui.jj0;
import org.telegram.ui.m3;
import org.telegram.ui.yh0;
public final class e2 extends f2.u0 {
    public final int f6602a;
    public final Object f6603b;

    public e2(Object obj, int i10) {
        this.f6602a = i10;
        this.f6603b = obj;
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
        switch (this.f6602a) {
            case 0:
                super.a(rect, view, recyclerView, i1Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                f2 f2Var = (f2) this.f6603b;
                if (R == f2Var.f6613a0.size()) {
                    rect.bottom = f2Var.m0;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f6603b;
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
                m3 m3Var = ((lv) this.f6603b).h;
                if (view instanceof kv) {
                    rect.left = -m3Var.getPaddingLeft();
                    rect.right = -m3Var.getPaddingRight();
                    return;
                }
                m3Var.getClass();
                if (RecyclerView.R(view) == 1) {
                    rect.top = AndroidUtilities.dp(14.0f);
                    return;
                }
                return;
            case 3:
                kz kzVar = (kz) this.f6603b;
                ix ixVar = kzVar.M;
                if (view instanceof l8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > kzVar.O.B && !UserConfig.getInstance(kzVar.Z0).isPremium() && !kzVar.R0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof rl0) && !(view instanceof zx)) {
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
                if (RecyclerView.R(view) == ((ArrayList) this.f6603b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((yh0) this.f6603b).f40278c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                super.a(rect, view, recyclerView, i1Var);
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                jj0 jj0Var = (jj0) this.f6603b;
                if (R2 == jj0Var.Z.size()) {
                    rect.bottom = jj0Var.f35306i0;
                    return;
                }
                return;
            case 7:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                hp0 hp0Var = (hp0) this.f6603b;
                int i13 = hp0Var.V;
                if (R3 >= i13) {
                    int i14 = hp0Var.f34723c0;
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
                ph.g1 g1Var = ((ph.h1) this.f6603b).e;
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
