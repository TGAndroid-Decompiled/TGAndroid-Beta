package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o9 extends w {
    public final z9 d;

    public o9(Context context, z9 z9Var) {
        super(context);
        this.d = z9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        z9 z9Var = this.d;
        p4 currentPeerView = z9Var.f6238n0.getCurrentPeerView();
        b6 b6Var = z9Var.f6258w;
        if (b6Var != null && currentPeerView != null) {
            q3 q3Var = currentPeerView.f5652c1;
            b6Var.setOffset(z9Var.f6220e0);
            if (z9Var.f6258w.f5179f == 1.0f) {
                z9Var.f6238n0.setVisibility(4);
            } else {
                z9Var.f6238n0.setVisibility(0);
            }
            z9Var.f6238n0.B();
            float top = q3Var.getTop() + currentPeerView.getTop();
            float f10 = z9Var.f6258w.f5179f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (q3Var.getMeasuredHeight() > 0) {
                z9Var.f6245q1 = q3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, z9Var.f6258w.f5180n / z9Var.f6245q1, f10);
            z9Var.f6238n0.setPivotY(top);
            z9Var.f6238n0.setPivotX(getMeasuredWidth() / 2.0f);
            z9Var.f6238n0.setScaleX(lerp);
            z9Var.f6238n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (z9Var.f6220e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f10, lerp, z9Var.f6258w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f5722y1.f5909b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f7, z9Var.f6258w.f5179f);
            q3Var.invalidateOutline();
            z9Var.f6238n0.setTranslationY((z9Var.f6258w.f5177b - top) * f10);
        }
        if (currentPeerView != null) {
            z9Var.f6219d1.setTranslationY(((currentPeerView.f5652c1.getY() + currentPeerView.getY()) - z9Var.f6219d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        z9 z9Var = this.d;
        if (!z9Var.f6212b || z9Var.f6215c) {
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
            z9Var.setKeyboardHeightFromParent(i13);
            size += z9Var.f6242p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i14) {
            z9Var.f6238n0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            z9Var.f6238n0.getLayoutParams().width = i15;
            size2 = i15;
        }
        z9Var.f6264y0.getLayoutParams().height = size + 1;
        z9Var.f6264y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) z9Var.f6264y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
