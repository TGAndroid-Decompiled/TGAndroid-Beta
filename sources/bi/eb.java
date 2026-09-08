package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class eb extends b0 {
    public final pb d;

    public eb(Context context, pb pbVar) {
        super(context);
        this.d = pbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        pb pbVar = this.d;
        o5 currentPeerView = pbVar.f3588n0.getCurrentPeerView();
        a7 a7Var = pbVar.f3608w;
        if (a7Var != null && currentPeerView != null) {
            l4 l4Var = currentPeerView.f3436c1;
            a7Var.setOffset(pbVar.f3570e0);
            if (pbVar.f3608w.f2792f == 1.0f) {
                pbVar.f3588n0.setVisibility(4);
            } else {
                pbVar.f3588n0.setVisibility(0);
            }
            pbVar.f3588n0.B();
            float top = l4Var.getTop() + currentPeerView.getTop();
            float f10 = pbVar.f3608w.f2792f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (l4Var.getMeasuredHeight() > 0) {
                pbVar.f3595q1 = l4Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, pbVar.f3608w.f2793n / pbVar.f3595q1, f10);
            pbVar.f3588n0.setPivotY(top);
            pbVar.f3588n0.setPivotX(getMeasuredWidth() / 2.0f);
            pbVar.f3588n0.setScaleX(lerp);
            pbVar.f3588n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (pbVar.f3570e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f10, lerp, pbVar.f3608w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f3505y1.f3716b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f7, pbVar.f3608w.f2792f);
            l4Var.invalidateOutline();
            pbVar.f3588n0.setTranslationY((pbVar.f3608w.f2789b - top) * f10);
        }
        if (currentPeerView != null) {
            pbVar.f3568d1.setTranslationY(((currentPeerView.f3436c1.getY() + currentPeerView.getY()) - pbVar.f3568d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        pb pbVar = this.d;
        if (!pbVar.f3561b || pbVar.f3564c) {
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
            pbVar.setKeyboardHeightFromParent(i13);
            size += pbVar.f3592p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i14) {
            pbVar.f3588n0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            pbVar.f3588n0.getLayoutParams().width = i15;
            size2 = i15;
        }
        pbVar.f3614y0.getLayoutParams().height = size + 1;
        pbVar.f3614y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) pbVar.f3614y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
