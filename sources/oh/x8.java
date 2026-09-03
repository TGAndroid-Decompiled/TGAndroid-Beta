package oh;

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
        float f10;
        i9 i9Var = this.d;
        f4 currentPeerView = i9Var.f17279k0.getCurrentPeerView();
        n5 n5Var = i9Var.f17302w;
        if (n5Var != null && currentPeerView != null) {
            j3 j3Var = currentPeerView.Z0;
            n5Var.setOffset(i9Var.f17258b0);
            if (i9Var.f17302w.f17493f == 1.0f) {
                i9Var.f17279k0.setVisibility(4);
            } else {
                i9Var.f17279k0.setVisibility(0);
            }
            i9Var.f17279k0.B();
            float top = j3Var.getTop() + currentPeerView.getTop();
            float f11 = i9Var.f17302w.f17493f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (j3Var.getMeasuredHeight() > 0) {
                i9Var.f17285n1 = j3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, i9Var.f17302w.f17494n / i9Var.f17285n1, f11);
            i9Var.f17279k0.setPivotY(top);
            i9Var.f17279k0.setPivotX(getMeasuredWidth() / 2.0f);
            i9Var.f17279k0.setScaleX(lerp);
            i9Var.f17279k0.setScaleY(lerp);
            currentPeerView.S2 = true;
            if (i9Var.f17258b0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f11, lerp, i9Var.f17302w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f17118v1.f12498b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f10, i9Var.f17302w.f17493f);
            j3Var.invalidateOutline();
            i9Var.f17279k0.setTranslationY((i9Var.f17302w.f17490b - top) * f11);
        }
        if (currentPeerView != null) {
            i9Var.f17256a1.setTranslationY(((currentPeerView.Z0.getY() + currentPeerView.getY()) - i9Var.f17256a1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        i9 i9Var = this.d;
        if (!i9Var.f17257b || i9Var.f17260c) {
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
            i9Var.f17279k0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            i9Var.f17279k0.getLayoutParams().width = i15;
            size2 = i15;
        }
        i9Var.f17301v0.getLayoutParams().height = size + 1;
        i9Var.f17301v0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) i9Var.f17301v0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
