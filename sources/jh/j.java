package jh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.lk0;

public final class j extends f2.w0 {

    public final int f13518a;

    public j(int i10) {
        this.f13518a = i10;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        switch (this.f13518a) {
            case 0:
                recyclerView.getClass();
                int iS = RecyclerView.S(view);
                rect.setEmpty();
                if (iS == 1) {
                    rect.left = AndroidUtilities.dp(31.0f) + (-AndroidUtilities.dp(85.0f));
                } else if (iS == 2) {
                    rect.left = AndroidUtilities.dp(31.0f) + (-AndroidUtilities.dp(85.0f));
                }
                break;
            case 1:
                rect.right = AndroidUtilities.dp(2.0f);
                break;
            case 2:
                rect.right = AndroidUtilities.dp(2.0f);
                break;
            case 3:
                lk0 lk0Var = (lk0) recyclerView.T(view);
                if (lk0Var == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                } else {
                    int iB = lk0Var.b() % 4;
                    rect.left = iB == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = iB != 3 ? AndroidUtilities.dp(4.0f) : 0;
                }
                break;
            case 4:
                lk0 lk0Var2 = (lk0) recyclerView.T(view);
                if (lk0Var2 == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                } else {
                    int iB2 = lk0Var2.b() % 4;
                    rect.left = iB2 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = iB2 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                }
                break;
            case 5:
                lk0 lk0Var3 = (lk0) recyclerView.T(view);
                if (lk0Var3 == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                } else if (lk0Var3.f5793f == 5) {
                    int iB3 = lk0Var3.b() % 4;
                    rect.left = iB3 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = iB3 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                } else {
                    rect.right = 0;
                    rect.left = 0;
                }
                break;
            case 6:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                break;
            case 7:
                recyclerView.getClass();
                int iR = RecyclerView.R(view);
                rect.left = AndroidUtilities.dp(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (iR == l1Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(12.0f);
                }
                break;
            case 8:
                super.a(rect, view, recyclerView, l1Var);
                rect.top = 1;
                break;
            case 9:
                super.a(rect, view, recyclerView, l1Var);
                recyclerView.getClass();
                int iR2 = RecyclerView.R(view);
                rect.left = AndroidUtilities.dp(8.0f);
                if (iR2 == l1Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(10.0f);
                }
                if (iR2 == 0) {
                    rect.left = AndroidUtilities.dp(10.0f);
                }
                break;
            default:
                rect.top = AndroidUtilities.dp(6.0f);
                break;
        }
    }

    @Override
    public void b(Canvas canvas, RecyclerView recyclerView) {
        switch (this.f13518a) {
            case 8:
                int width = recyclerView.getWidth();
                int childCount = recyclerView.getChildCount();
                int i10 = childCount - 1;
                int i11 = 0;
                while (i11 < i10) {
                    View childAt = recyclerView.getChildAt(i11);
                    View childAt2 = i11 < childCount + (-2) ? recyclerView.getChildAt(i11 + 1) : null;
                    if (RecyclerView.R(childAt) >= 0 && !(childAt instanceof org.telegram.ui.Cells.s3) && !(childAt2 instanceof org.telegram.ui.Cells.s3)) {
                        float bottom = childAt.getBottom();
                        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), bottom, width - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), bottom, org.telegram.ui.ActionBar.g6.f23175k0);
                    }
                    i11++;
                }
                break;
        }
    }
}
