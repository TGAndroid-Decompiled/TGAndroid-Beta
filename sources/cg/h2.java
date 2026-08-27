package cg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rl;
import org.telegram.ui.Cells.j8;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.ww;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.dj0;
import org.telegram.ui.rh0;
import org.telegram.ui.vo0;

public final class h2 extends f2.w0 {

    public final int f2701a;

    public final Object f2702b;

    public h2(Object obj, int i10) {
        this.f2701a = i10;
        this.f2702b = obj;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        switch (this.f2701a) {
            case 0:
                super.a(rect, view, recyclerView, l1Var);
                recyclerView.getClass();
                int iR = RecyclerView.R(view);
                i2 i2Var = (i2) this.f2702b;
                if (iR == i2Var.Z.size()) {
                    rect.bottom = i2Var.f2720l0;
                }
                break;
            case 1:
                lh.t1 t1Var = ((lh.u1) this.f2702b).f16898e;
                recyclerView.getClass();
                rect.right = t1Var.E1(RecyclerView.R(view)) ? 0 : AndroidUtilities.dp(4.0f);
                rect.bottom = AndroidUtilities.dp(4.0f);
                break;
            case 2:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) this.f2702b;
                int iB = recyclerView.T(view).b();
                if (iB == 0) {
                    rect.left = AndroidUtilities.dp(18.0f);
                }
                if (iB != tVar.getAdapter().h() - 1) {
                    int iH = tVar.getAdapter().h();
                    if (iH != 4) {
                        rect.right = AndroidUtilities.dp(24.0f);
                    } else {
                        rect.right = rl.z(58.0f, iH, tVar.getWidth() - AndroidUtilities.dp(36.0f)) / (iH - 1);
                    }
                } else {
                    rect.right = AndroidUtilities.dp(18.0f);
                }
                break;
            case 3:
                lh.w wVar = ((cv) this.f2702b).h;
                if (!(view instanceof bv)) {
                    wVar.getClass();
                    if (RecyclerView.R(view) == 1) {
                        rect.top = AndroidUtilities.dp(14.0f);
                    }
                } else {
                    rect.left = -wVar.getPaddingLeft();
                    rect.right = -wVar.getPaddingRight();
                }
                break;
            case 4:
                yy yyVar = (yy) this.f2702b;
                ww wwVar = yyVar.L;
                if (!(view instanceof j8)) {
                    if ((view instanceof zk0) || (view instanceof ox)) {
                        rect.left = -wwVar.getPaddingLeft();
                        rect.right = -wwVar.getPaddingRight();
                        if (view instanceof ox) {
                            rect.top = AndroidUtilities.dp(8.0f);
                        }
                    } else if (view instanceof n9) {
                        rect.bottom = AndroidUtilities.dp(12.0f);
                    }
                    break;
                } else {
                    rect.left = AndroidUtilities.dp(5.0f);
                    rect.right = AndroidUtilities.dp(5.0f);
                    recyclerView.getClass();
                    if (RecyclerView.R(view) + 1 > yyVar.N.A && !UserConfig.getInstance(yyVar.Y0).isPremium() && !yyVar.Q0) {
                        rect.top = AndroidUtilities.dp(10.0f);
                        break;
                    }
                }
                break;
            case 5:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((ArrayList) this.f2702b).size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                }
                break;
            case 6:
                recyclerView.getClass();
                if (RecyclerView.R(view) == ((rh0) this.f2702b).f41935c.size() - 1) {
                    rect.bottom = AndroidUtilities.dp(4.0f);
                }
                break;
            case 7:
                super.a(rect, view, recyclerView, l1Var);
                recyclerView.getClass();
                int iR2 = RecyclerView.R(view);
                dj0 dj0Var = (dj0) this.f2702b;
                if (iR2 == dj0Var.Y.size()) {
                    rect.bottom = dj0Var.f37424h0;
                }
                break;
            default:
                recyclerView.getClass();
                int iR3 = RecyclerView.R(view);
                vo0 vo0Var = (vo0) this.f2702b;
                int i10 = vo0Var.P;
                if (iR3 >= i10) {
                    int i11 = vo0Var.T;
                    if (iR3 < i10 + i11) {
                        int i12 = iR3 - i10;
                        int i13 = i12 / 3;
                        boolean z10 = i13 == 0;
                        boolean z11 = i13 == (i11 - 1) / 3;
                        int i14 = i12 % 3;
                        boolean z12 = i14 == 0;
                        boolean z13 = i14 == 2;
                        rect.top = z10 ? AndroidUtilities.dp(8.0f) : 0;
                        rect.bottom = z11 ? AndroidUtilities.dp(8.0f) : 0;
                        rect.left = z12 ? AndroidUtilities.dp(8.0f) : 0;
                        rect.right = z13 ? AndroidUtilities.dp(8.0f) : 0;
                        break;
                    }
                }
                break;
        }
    }
}
