package bi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.vk0;
public final class o extends s4.n0 {
    public final int f3419a;

    public o(int i10) {
        this.f3419a = i10;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int dp;
        int dp2;
        int dp3;
        switch (this.f3419a) {
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
                super.a(rect, view, recyclerView, z0Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                rect.left = AndroidUtilities.dp(8.0f);
                if (R == z0Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(10.0f);
                }
                if (R == 0) {
                    rect.left = AndroidUtilities.dp(10.0f);
                    return;
                }
                return;
            case 2:
                rect.top = AndroidUtilities.dp(6.0f);
                return;
            case 3:
                rect.right = AndroidUtilities.dp(2.0f);
                return;
            case 4:
                rect.right = AndroidUtilities.dp(2.0f);
                return;
            case 5:
                vk0 vk0Var = (vk0) recyclerView.T(view);
                if (vk0Var != null) {
                    int b10 = vk0Var.b() % 4;
                    int i10 = 0;
                    if (b10 == 0) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    rect.left = dp;
                    if (b10 != 3) {
                        i10 = AndroidUtilities.dp(4.0f);
                    }
                    rect.right = i10;
                    return;
                }
                rect.left = AndroidUtilities.dp(4.0f);
                rect.right = AndroidUtilities.dp(4.0f);
                return;
            case 6:
                vk0 vk0Var2 = (vk0) recyclerView.T(view);
                if (vk0Var2 != null) {
                    int b11 = vk0Var2.b() % 4;
                    int i11 = 0;
                    if (b11 == 0) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(4.0f);
                    }
                    rect.left = dp2;
                    if (b11 != 3) {
                        i11 = AndroidUtilities.dp(4.0f);
                    }
                    rect.right = i11;
                    return;
                }
                rect.left = AndroidUtilities.dp(4.0f);
                rect.right = AndroidUtilities.dp(4.0f);
                return;
            case 7:
                vk0 vk0Var3 = (vk0) recyclerView.T(view);
                if (vk0Var3 != null) {
                    int i12 = 0;
                    if (vk0Var3.f45770f != 5) {
                        rect.right = 0;
                        rect.left = 0;
                        return;
                    }
                    int b12 = vk0Var3.b() % 4;
                    if (b12 == 0) {
                        dp3 = 0;
                    } else {
                        dp3 = AndroidUtilities.dp(4.0f);
                    }
                    rect.left = dp3;
                    if (b12 != 3) {
                        i12 = AndroidUtilities.dp(4.0f);
                    }
                    rect.right = i12;
                    return;
                }
                rect.left = AndroidUtilities.dp(4.0f);
                rect.right = AndroidUtilities.dp(4.0f);
                return;
            case 8:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                return;
            case 9:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                rect.left = AndroidUtilities.dp(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (R2 == z0Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(12.0f);
                    return;
                }
                return;
            default:
                super.a(rect, view, recyclerView, z0Var);
                rect.top = 1;
                return;
        }
    }

    @Override
    public void b(Canvas canvas, RecyclerView recyclerView) {
        View view;
        float dp;
        int i10;
        switch (this.f3419a) {
            case 10:
                int width = recyclerView.getWidth();
                int childCount = recyclerView.getChildCount();
                int i11 = childCount - 1;
                for (int i12 = 0; i12 < i11; i12++) {
                    View childAt = recyclerView.getChildAt(i12);
                    if (i12 < childCount - 2) {
                        view = recyclerView.getChildAt(i12 + 1);
                    } else {
                        view = null;
                    }
                    if (RecyclerView.R(childAt) >= 0 && !(childAt instanceof org.telegram.ui.Cells.u3) && !(view instanceof org.telegram.ui.Cells.u3)) {
                        int bottom = childAt.getBottom();
                        if (LocaleController.isRTL) {
                            dp = 0.0f;
                        } else {
                            dp = AndroidUtilities.dp(72.0f);
                        }
                        float f7 = bottom;
                        if (LocaleController.isRTL) {
                            i10 = AndroidUtilities.dp(72.0f);
                        } else {
                            i10 = 0;
                        }
                        canvas.drawLine(dp, f7, width - i10, f7, org.telegram.ui.ActionBar.j6.f20812k0);
                    }
                }
                return;
            default:
                return;
        }
    }
}
