package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x8 extends t {
    public final i9 d;

    public x8(Context context, i9 i9Var) {
        super(context);
        this.d = i9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        i9 i9Var = this.d;
        d4 currentPeerView = i9Var.f15765j0.getCurrentPeerView();
        l5 l5Var = i9Var.f15789w;
        if (l5Var != null && currentPeerView != null) {
            h3 h3Var = currentPeerView.Y0;
            l5Var.setOffset(i9Var.f15743a0);
            if (i9Var.f15789w.f15886f == 1.0f) {
                i9Var.f15765j0.setVisibility(4);
            } else {
                i9Var.f15765j0.setVisibility(0);
            }
            i9Var.f15765j0.B();
            float top = h3Var.getTop() + currentPeerView.getTop();
            float f10 = i9Var.f15789w.f15886f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (h3Var.getMeasuredHeight() > 0) {
                i9Var.f15770m1 = h3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, i9Var.f15789w.f15887n / i9Var.f15770m1, f10);
            i9Var.f15765j0.setPivotY(top);
            i9Var.f15765j0.setPivotX(getMeasuredWidth() / 2.0f);
            i9Var.f15765j0.setScaleX(lerp);
            i9Var.f15765j0.setScaleY(lerp);
            currentPeerView.R2 = true;
            if (i9Var.f15743a0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f10, lerp, i9Var.f15789w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f15528u1.f11662b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f9, i9Var.f15789w.f15886f);
            h3Var.invalidateOutline();
            i9Var.f15765j0.setTranslationY((i9Var.f15789w.f15883b - top) * f10);
        }
        if (currentPeerView != null) {
            i9Var.Z0.setTranslationY(((currentPeerView.Y0.getY() + currentPeerView.getY()) - i9Var.Z0.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        i9 i9Var = this.d;
        if (!i9Var.f15745b || i9Var.f15748c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i13 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                int height = rootView.getHeight();
                if (rect.top != 0) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                i13 = Math.max(0, ((height - i12) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            i9Var.setKeyboardHeightFromParent(i13);
            size += i9Var.f15769l0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i14) {
            i9Var.f15765j0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            i9Var.f15765j0.getLayoutParams().width = i15;
            size2 = i15;
        }
        i9Var.f15787u0.getLayoutParams().height = size + 1;
        i9Var.f15787u0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) i9Var.f15787u0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
