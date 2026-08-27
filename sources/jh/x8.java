package jh;

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
        i9 i9Var = this.d;
        e4 currentPeerView = i9Var.f13487j0.getCurrentPeerView();
        k5 k5Var = i9Var.f13511w;
        if (k5Var != null && currentPeerView != null) {
            j3 j3Var = currentPeerView.Y0;
            k5Var.setOffset(i9Var.f13465a0);
            if (i9Var.f13511w.f13581f == 1.0f) {
                i9Var.f13487j0.setVisibility(4);
            } else {
                i9Var.f13487j0.setVisibility(0);
            }
            i9Var.f13487j0.B();
            float top = j3Var.getTop() + currentPeerView.getTop();
            float f10 = i9Var.f13511w.f13581f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (j3Var.getMeasuredHeight() > 0) {
                i9Var.f13492m1 = j3Var.getMeasuredHeight();
            }
            float f11 = i9Var.f13511w.f13582n / i9Var.f13492m1;
            float fLerp = AndroidUtilities.lerp(1.0f, f11, f10);
            i9Var.f13487j0.setPivotY(top);
            i9Var.f13487j0.setPivotX(getMeasuredWidth() / 2.0f);
            i9Var.f13487j0.setScaleX(fLerp);
            i9Var.f13487j0.setScaleY(fLerp);
            currentPeerView.R2 = true;
            if (i9Var.f13465a0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f10, fLerp, i9Var.f13511w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f13279u1.f7048b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f11, i9Var.f13511w.f13581f);
            j3Var.invalidateOutline();
            i9Var.f13487j0.setTranslationY((i9Var.f13511w.f13578b - top) * f10);
        }
        if (currentPeerView != null) {
            i9Var.Z0.setTranslationY(((currentPeerView.Y0.getY() + currentPeerView.getY()) - i9Var.Z0.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        i9 i9Var = this.d;
        if (!i9Var.f13467b || i9Var.f13470c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int iMax = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                iMax = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            i9Var.setKeyboardHeightFromParent(iMax);
            size += i9Var.f13491l0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i12 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i12) {
            i9Var.f13487j0.getLayoutParams().width = -1;
            size = i12;
        } else {
            int i13 = (int) ((size / 16.0f) * 9.0f);
            i9Var.f13487j0.getLayoutParams().width = i13;
            size2 = i13;
        }
        i9Var.f13509u0.getLayoutParams().height = size + 1;
        i9Var.f13509u0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) i9Var.f13509u0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
