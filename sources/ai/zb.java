package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class zb extends i0 {
    public final kc d;

    public zb(kc kcVar, Context context) {
        super(context);
        this.d = kcVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        kc kcVar = this.d;
        f6 currentPeerView = kcVar.f1283n0.getCurrentPeerView();
        t7 t7Var = kcVar.f1303w;
        if (t7Var != null && currentPeerView != null) {
            b5 b5Var = currentPeerView.f955c1;
            t7Var.setOffset(kcVar.f1265e0);
            if (kcVar.f1303w.f1742f == 1.0f) {
                kcVar.f1283n0.setVisibility(4);
            } else {
                kcVar.f1283n0.setVisibility(0);
            }
            kcVar.f1283n0.B();
            float top = b5Var.getTop() + currentPeerView.getTop();
            float f10 = kcVar.f1303w.f1742f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (b5Var.getMeasuredHeight() > 0) {
                kcVar.f1290q1 = b5Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, kcVar.f1303w.f1743n / kcVar.f1290q1, f10);
            kcVar.f1283n0.setPivotY(top);
            kcVar.f1283n0.setPivotX(getMeasuredWidth() / 2.0f);
            kcVar.f1283n0.setScaleX(lerp);
            kcVar.f1283n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (kcVar.f1265e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f10, lerp, kcVar.f1303w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f1024y1.f1185b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f7, kcVar.f1303w.f1742f);
            b5Var.invalidateOutline();
            kcVar.f1283n0.setTranslationY((kcVar.f1303w.f1739b - top) * f10);
        }
        if (currentPeerView != null) {
            kcVar.f1263d1.setTranslationY(((currentPeerView.f955c1.getY() + currentPeerView.getY()) - kcVar.f1263d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        kc kcVar = this.d;
        if (!kcVar.f1256b || kcVar.f1259c) {
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
            kcVar.setKeyboardHeightFromParent(i13);
            size += kcVar.f1287p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i14) {
            kcVar.f1283n0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            kcVar.f1283n0.getLayoutParams().width = i15;
            size2 = i15;
        }
        kcVar.f1309y0.getLayoutParams().height = size + 1;
        kcVar.f1309y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) kcVar.f1309y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
