package ci;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.qk;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ci0;
import org.telegram.ui.nj0;
import org.telegram.ui.qp0;
public final class r1 extends s4.n0 {
    public final int f5421a;
    public final Object f5422b;

    public r1(Object obj, int i10) {
        this.f5421a = i10;
        this.f5422b = obj;
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
        switch (this.f5421a) {
            case 0:
                y1 y1Var = ((z1) this.f5422b).e;
                recyclerView.getClass();
                if (y1Var.E1(RecyclerView.S(view))) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(4.0f);
                }
                rect.right = dp;
                rect.bottom = AndroidUtilities.dp(4.0f);
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f5422b;
                int b10 = recyclerView.U(view).b();
                if (b10 == 0) {
                    rect.left = AndroidUtilities.dp(18.0f);
                }
                if (b10 == tVar.getAdapter().h() - 1) {
                    rect.right = AndroidUtilities.dp(18.0f);
                    return;
                }
                int h = tVar.getAdapter().h();
                if (h == 4) {
                    rect.right = qk.B(58.0f, h, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (h - 1);
                    return;
                } else {
                    rect.right = AndroidUtilities.dp(24.0f);
                    return;
                }
            case 2:
                v vVar = ((uv) this.f5422b).h;
                if (view instanceof tv) {
                    rect.left = -vVar.getPaddingLeft();
                    rect.right = -vVar.getPaddingRight();
                    return;
                }
                vVar.getClass();
                if (RecyclerView.S(view) == 1) {
                    rect.top = AndroidUtilities.dp(14.0f);
                    return;
                }
                return;
            case 3:
                mz mzVar = (mz) this.f5422b;
                xx xxVar = mzVar.P;
                if (view instanceof org.telegram.ui.Cells.o8) {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.S(view) + 1 > mzVar.R.E && !UserConfig.getInstance(mzVar.f26574c1).isPremium() && !mzVar.U0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        return;
                    }
                    return;
                } else if (!(view instanceof yl0) && !(view instanceof dy)) {
                    if (view instanceof org.telegram.ui.Components.w9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                        return;
                    }
                    return;
                } else {
                    rect.left = -xxVar.getPaddingLeft();
                    rect.right = -xxVar.getPaddingRight();
                    if (view instanceof dy) {
                        rect.top = AndroidUtilities.dp(8.0f);
                        return;
                    }
                    return;
                }
            case 4:
                recyclerView.getClass();
                if (RecyclerView.S(view) == ((ArrayList) this.f5422b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.S(view) == ((ci0) this.f5422b).f32728c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    return;
                }
                return;
            case 6:
                super.a(rect, view, recyclerView, z0Var);
                recyclerView.getClass();
                int S = RecyclerView.S(view);
                nj0 nj0Var = (nj0) this.f5422b;
                if (S == nj0Var.f36025c0.size()) {
                    rect.bottom = nj0Var.f36034l0;
                    return;
                }
                return;
            case 7:
                recyclerView.getClass();
                int S2 = RecyclerView.S(view);
                qp0 qp0Var = (qp0) this.f5422b;
                int i13 = qp0Var.f36791b0;
                if (S2 >= i13) {
                    int i14 = qp0Var.f36797f0;
                    if (S2 < i13 + i14) {
                        int i15 = S2 - i13;
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
                int S3 = RecyclerView.S(view);
                tg.z0 z0Var2 = (tg.z0) this.f5422b;
                if (S3 == z0Var2.f43560d0.size()) {
                    rect.bottom = z0Var2.f43571p0;
                    return;
                }
                return;
        }
    }
}
