package ih;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ik0;
public final class l extends f2.y0 {
    public final int f11693a;

    public l(int i9) {
        this.f11693a = i9;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        int dp;
        int dp2;
        int dp3;
        switch (this.f11693a) {
            case 0:
                recyclerView.getClass();
                int S = RecyclerView.S(view);
                rect.setEmpty();
                if (S == 1) {
                    rect.left = AndroidUtilities.dp(31.0f) + (-AndroidUtilities.dp(85.0f));
                    return;
                } else if (S == 2) {
                    rect.left = AndroidUtilities.dp(31.0f) + (-AndroidUtilities.dp(85.0f));
                    return;
                } else {
                    return;
                }
            case 1:
                super.a(rect, view, recyclerView, n1Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                rect.left = AndroidUtilities.dp(8.0f);
                if (R == n1Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(10.0f);
                }
                if (R == 0) {
                    rect.left = AndroidUtilities.dp(10.0f);
                    return;
                }
                return;
            case 2:
                rect.right = AndroidUtilities.dp(2.0f);
                return;
            case 3:
                rect.right = AndroidUtilities.dp(2.0f);
                return;
            case 4:
                ik0 ik0Var = (ik0) recyclerView.T(view);
                if (ik0Var != null) {
                    int b10 = ik0Var.b() % 4;
                    int i9 = 0;
                    if (b10 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    rect.left = dp;
                    if (b10 != 3) {
                        i9 = AndroidUtilities.dp(4.0f);
                    }
                    rect.right = i9;
                    return;
                }
                rect.left = AndroidUtilities.dp(4.0f);
                rect.right = AndroidUtilities.dp(4.0f);
                return;
            case 5:
                ik0 ik0Var2 = (ik0) recyclerView.T(view);
                if (ik0Var2 != null) {
                    int b11 = ik0Var2.b() % 4;
                    int i10 = 0;
                    if (b11 == 0) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(4.0f);
                    }
                    rect.left = dp2;
                    if (b11 != 3) {
                        i10 = AndroidUtilities.dp(4.0f);
                    }
                    rect.right = i10;
                    return;
                }
                rect.left = AndroidUtilities.dp(4.0f);
                rect.right = AndroidUtilities.dp(4.0f);
                return;
            case 6:
                ik0 ik0Var3 = (ik0) recyclerView.T(view);
                if (ik0Var3 != null) {
                    int i11 = 0;
                    if (ik0Var3.f5505f != 5) {
                        rect.right = 0;
                        rect.left = 0;
                        return;
                    }
                    int b12 = ik0Var3.b() % 4;
                    if (b12 == 0) {
                        dp3 = 0;
                    } else {
                        dp3 = AndroidUtilities.dp(4.0f);
                    }
                    rect.left = dp3;
                    if (b12 != 3) {
                        i11 = AndroidUtilities.dp(4.0f);
                    }
                    rect.right = i11;
                    return;
                }
                rect.left = AndroidUtilities.dp(4.0f);
                rect.right = AndroidUtilities.dp(4.0f);
                return;
            case 7:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                return;
            case 8:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                rect.left = AndroidUtilities.dp(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (R2 == n1Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(12.0f);
                    return;
                }
                return;
            case 9:
                super.a(rect, view, recyclerView, n1Var);
                rect.top = 1;
                return;
            default:
                rect.top = AndroidUtilities.dp(6.0f);
                return;
        }
    }

    @Override
    public void b(Canvas canvas, RecyclerView recyclerView) {
        View view;
        float dp;
        int i9;
        switch (this.f11693a) {
            case 9:
                int width = recyclerView.getWidth();
                int childCount = recyclerView.getChildCount();
                int i10 = childCount - 1;
                for (int i11 = 0; i11 < i10; i11++) {
                    View childAt = recyclerView.getChildAt(i11);
                    if (i11 < childCount - 2) {
                        view = recyclerView.getChildAt(i11 + 1);
                    } else {
                        view = null;
                    }
                    if (RecyclerView.R(childAt) >= 0 && !(childAt instanceof org.telegram.ui.Cells.v3) && !(view instanceof org.telegram.ui.Cells.v3)) {
                        int bottom = childAt.getBottom();
                        if (LocaleController.isRTL) {
                            dp = 0.0f;
                        } else {
                            dp = AndroidUtilities.dp(72.0f);
                        }
                        float f10 = bottom;
                        if (LocaleController.isRTL) {
                            i9 = AndroidUtilities.dp(72.0f);
                        } else {
                            i9 = 0;
                        }
                        canvas.drawLine(dp, f10, width - i9, f10, org.telegram.ui.ActionBar.f6.f23121k0);
                    }
                }
                return;
            default:
                return;
        }
    }
}
