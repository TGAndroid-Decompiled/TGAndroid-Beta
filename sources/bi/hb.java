package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hb extends b0 {
    public final sb d;

    public hb(Context context, sb sbVar) {
        super(context);
        this.d = sbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        sb sbVar = this.d;
        q5 currentPeerView = sbVar.f3693n0.getCurrentPeerView();
        e7 e7Var = sbVar.f3713w;
        if (e7Var != null && currentPeerView != null) {
            o4 o4Var = currentPeerView.f3515c1;
            e7Var.setOffset(sbVar.f3675e0);
            if (sbVar.f3713w.f2995f == 1.0f) {
                sbVar.f3693n0.setVisibility(4);
            } else {
                sbVar.f3693n0.setVisibility(0);
            }
            sbVar.f3693n0.B();
            float top = o4Var.getTop() + currentPeerView.getTop();
            float f10 = sbVar.f3713w.f2995f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (o4Var.getMeasuredHeight() > 0) {
                sbVar.f3700q1 = o4Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, sbVar.f3713w.f2996n / sbVar.f3700q1, f10);
            sbVar.f3693n0.setPivotY(top);
            sbVar.f3693n0.setPivotX(getMeasuredWidth() / 2.0f);
            sbVar.f3693n0.setScaleX(lerp);
            sbVar.f3693n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (sbVar.f3675e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f10, lerp, sbVar.f3713w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f3585y1.f3789b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f7, sbVar.f3713w.f2995f);
            o4Var.invalidateOutline();
            sbVar.f3693n0.setTranslationY((sbVar.f3713w.f2993b - top) * f10);
        }
        if (currentPeerView != null) {
            sbVar.f3674d1.setTranslationY(((currentPeerView.f3515c1.getY() + currentPeerView.getY()) - sbVar.f3674d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        sb sbVar = this.d;
        if (!sbVar.f3667b || sbVar.f3670c) {
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
            sbVar.setKeyboardHeightFromParent(i13);
            size += sbVar.f3697p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i14) {
            sbVar.f3693n0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            sbVar.f3693n0.getLayoutParams().width = i15;
            size2 = i15;
        }
        sbVar.f3719y0.getLayoutParams().height = size + 1;
        sbVar.f3719y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) sbVar.f3719y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
