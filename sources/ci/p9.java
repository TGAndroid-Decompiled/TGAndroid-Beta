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
        q4 currentPeerView = aaVar.f5203n0.getCurrentPeerView();
        c6 c6Var = aaVar.f5223w;
        if (c6Var != null && currentPeerView != null) {
            r3 r3Var = currentPeerView.f5769c1;
            c6Var.setOffset(aaVar.f5185e0);
            if (aaVar.f5223w.f5280f == 1.0f) {
                aaVar.f5203n0.setVisibility(4);
            } else {
                aaVar.f5203n0.setVisibility(0);
            }
            aaVar.f5203n0.B();
            float top = r3Var.getTop() + currentPeerView.getTop();
            float f10 = aaVar.f5223w.f5280f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (r3Var.getMeasuredHeight() > 0) {
                aaVar.f5210q1 = r3Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, aaVar.f5223w.f5281n / aaVar.f5210q1, f10);
            aaVar.f5203n0.setPivotY(top);
            aaVar.f5203n0.setPivotX(getMeasuredWidth() / 2.0f);
            aaVar.f5203n0.setScaleX(lerp);
            aaVar.f5203n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (aaVar.f5185e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f10, lerp, aaVar.f5223w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f5839y1.f6005b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f7, aaVar.f5223w.f5280f);
            r3Var.invalidateOutline();
            aaVar.f5203n0.setTranslationY((aaVar.f5223w.f5278b - top) * f10);
        }
        if (currentPeerView != null) {
            aaVar.f5184d1.setTranslationY(((currentPeerView.f5769c1.getY() + currentPeerView.getY()) - aaVar.f5184d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        aa aaVar = this.d;
        if (!aaVar.f5177b || aaVar.f5180c) {
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
            size += aaVar.f5207p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i14) {
            aaVar.f5203n0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            aaVar.f5203n0.getLayoutParams().width = i15;
            size2 = i15;
        }
        aaVar.f5229y0.getLayoutParams().height = size + 1;
        aaVar.f5229y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) aaVar.f5229y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
