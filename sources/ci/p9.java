package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p9 extends w {
    public final aa d;

    public p9(Context context, aa aaVar) {
        super(context);
        this.d = aaVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        aa aaVar = this.d;
        q4 currentPeerView = aaVar.f5205n0.getCurrentPeerView();
        c6 c6Var = aaVar.f5225w;
        if (c6Var != null && currentPeerView != null) {
            r3 r3Var = currentPeerView.f5771c1;
            c6Var.setOffset(aaVar.f5187e0);
            if (aaVar.f5225w.f5282f == 1.0f) {
                aaVar.f5205n0.setVisibility(4);
            } else {
                aaVar.f5205n0.setVisibility(0);
            }
            aaVar.f5205n0.B();
            float top = r3Var.getTop() + currentPeerView.getTop();
            float f10 = aaVar.f5225w.f5282f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (r3Var.getMeasuredHeight() > 0) {
                aaVar.f5212q1 = r3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, aaVar.f5225w.f5283n / aaVar.f5212q1, f10);
            aaVar.f5205n0.setPivotY(top);
            aaVar.f5205n0.setPivotX(getMeasuredWidth() / 2.0f);
            aaVar.f5205n0.setScaleX(lerp);
            aaVar.f5205n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (aaVar.f5187e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f10, lerp, aaVar.f5225w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f5841y1.f6007b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f7, aaVar.f5225w.f5282f);
            r3Var.invalidateOutline();
            aaVar.f5205n0.setTranslationY((aaVar.f5225w.f5280b - top) * f10);
        }
        if (currentPeerView != null) {
            aaVar.f5186d1.setTranslationY(((currentPeerView.f5771c1.getY() + currentPeerView.getY()) - aaVar.f5186d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        aa aaVar = this.d;
        if (!aaVar.f5179b || aaVar.f5182c) {
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
            aaVar.setKeyboardHeightFromParent(i13);
            size += aaVar.f5209p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i14) {
            aaVar.f5205n0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            aaVar.f5205n0.getLayoutParams().width = i15;
            size2 = i15;
        }
        aaVar.f5231y0.getLayoutParams().height = size + 1;
        aaVar.f5231y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) aaVar.f5231y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
