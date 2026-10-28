package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n9 extends w {
    public final y9 d;

    public n9(Context context, y9 y9Var) {
        super(context);
        this.d = y9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        y9 y9Var = this.d;
        q4 currentPeerView = y9Var.f9444n0.getCurrentPeerView();
        b6 b6Var = y9Var.f9464w;
        if (b6Var != null && currentPeerView != null) {
            q3 q3Var = currentPeerView.R0;
            b6Var.setOffset(y9Var.f9426e0);
            if (y9Var.f9464w.f8429f == 1.0f) {
                y9Var.f9444n0.setVisibility(4);
            } else {
                y9Var.f9444n0.setVisibility(0);
            }
            y9Var.f9444n0.B();
            float top = q3Var.getTop() + currentPeerView.getTop();
            float f10 = y9Var.f9464w.f8429f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (q3Var.getMeasuredHeight() > 0) {
                y9Var.f9451q1 = q3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, y9Var.f9464w.f8430n / y9Var.f9451q1, f10);
            y9Var.f9444n0.setPivotY(top);
            y9Var.f9444n0.setPivotX(getMeasuredWidth() / 2.0f);
            y9Var.f9444n0.setScaleX(lerp);
            y9Var.f9444n0.setScaleY(lerp);
            currentPeerView.K2 = true;
            if (y9Var.f9426e0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f10, lerp, y9Var.f9464w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f9003n1.f1388b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f7, y9Var.f9464w.f8429f);
            q3Var.invalidateOutline();
            y9Var.f9444n0.setTranslationY((y9Var.f9464w.f8427b - top) * f10);
        }
        if (currentPeerView != null) {
            y9Var.f9425d1.setTranslationY(((currentPeerView.R0.getY() + currentPeerView.getY()) - y9Var.f9425d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        y9 y9Var = this.d;
        if (!y9Var.f9418b || y9Var.f9421c) {
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
            y9Var.setKeyboardHeightFromParent(i13);
            size += y9Var.f9448p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i14) {
            y9Var.f9444n0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            y9Var.f9444n0.getLayoutParams().width = i15;
            size2 = i15;
        }
        y9Var.f9470y0.getLayoutParams().height = size + 1;
        y9Var.f9470y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) y9Var.f9470y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
