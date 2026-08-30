package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x8 extends u {
    public final i9 d;

    public x8(Context context, i9 i9Var) {
        super(context);
        this.d = i9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        i9 i9Var = this.d;
        d4 currentPeerView = i9Var.f15472k0.getCurrentPeerView();
        m5 m5Var = i9Var.f15495w;
        if (m5Var != null && currentPeerView != null) {
            i3 i3Var = currentPeerView.Z0;
            m5Var.setOffset(i9Var.f15452b0);
            if (i9Var.f15495w.f15611f == 1.0f) {
                i9Var.f15472k0.setVisibility(4);
            } else {
                i9Var.f15472k0.setVisibility(0);
            }
            i9Var.f15472k0.B();
            float top = i3Var.getTop() + currentPeerView.getTop();
            float f11 = i9Var.f15495w.f15611f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (i3Var.getMeasuredHeight() > 0) {
                i9Var.f15478n1 = i3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, i9Var.f15495w.f15612n / i9Var.f15478n1, f11);
            i9Var.f15472k0.setPivotY(top);
            i9Var.f15472k0.setPivotX(getMeasuredWidth() / 2.0f);
            i9Var.f15472k0.setScaleX(lerp);
            i9Var.f15472k0.setScaleY(lerp);
            currentPeerView.S2 = true;
            if (i9Var.f15452b0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f11, lerp, i9Var.f15495w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f15246v1.f12047b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f10, i9Var.f15495w.f15611f);
            i3Var.invalidateOutline();
            i9Var.f15472k0.setTranslationY((i9Var.f15495w.f15609b - top) * f11);
        }
        if (currentPeerView != null) {
            i9Var.f15450a1.setTranslationY(((currentPeerView.Z0.getY() + currentPeerView.getY()) - i9Var.f15450a1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        i9 i9Var = this.d;
        if (!i9Var.f15451b || i9Var.f15454c) {
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
            size += i9Var.m0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i14) {
            i9Var.f15472k0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            i9Var.f15472k0.getLayoutParams().width = i15;
            size2 = i15;
        }
        i9Var.f15494v0.getLayoutParams().height = size + 1;
        i9Var.f15494v0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) i9Var.f15494v0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
