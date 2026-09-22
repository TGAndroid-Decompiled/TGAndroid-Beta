package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yb extends i0 {
    public final jc d;

    public yb(jc jcVar, Context context) {
        super(context);
        this.d = jcVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        jc jcVar = this.d;
        f6 currentPeerView = jcVar.f1093n0.getCurrentPeerView();
        r7 r7Var = jcVar.f1113w;
        if (r7Var != null && currentPeerView != null) {
            a5 a5Var = currentPeerView.f800c1;
            r7Var.setOffset(jcVar.f1075e0);
            if (jcVar.f1113w.f1471f == 1.0f) {
                jcVar.f1093n0.setVisibility(4);
            } else {
                jcVar.f1093n0.setVisibility(0);
            }
            jcVar.f1093n0.B();
            float top = a5Var.getTop() + currentPeerView.getTop();
            float f10 = jcVar.f1113w.f1471f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (a5Var.getMeasuredHeight() > 0) {
                jcVar.f1100q1 = a5Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, jcVar.f1113w.f1472n / jcVar.f1100q1, f10);
            jcVar.f1093n0.setPivotY(top);
            jcVar.f1093n0.setPivotX(getMeasuredWidth() / 2.0f);
            jcVar.f1093n0.setScaleX(lerp);
            jcVar.f1093n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (jcVar.f1075e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f10, lerp, jcVar.f1113w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f869y1.f1043b = (int) AndroidUtilities.lerp(10.0f, 6.0f / f7, jcVar.f1113w.f1471f);
            a5Var.invalidateOutline();
            jcVar.f1093n0.setTranslationY((jcVar.f1113w.f1469b - top) * f10);
        }
        if (currentPeerView != null) {
            jcVar.f1074d1.setTranslationY(((currentPeerView.f800c1.getY() + currentPeerView.getY()) - jcVar.f1074d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        jc jcVar = this.d;
        if (!jcVar.f1067b || jcVar.f1070c) {
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
            jcVar.setKeyboardHeightFromParent(i13);
            size += jcVar.f1097p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i14 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i14) {
            jcVar.f1093n0.getLayoutParams().width = -1;
            size = i14;
        } else {
            int i15 = (int) ((size / 16.0f) * 9.0f);
            jcVar.f1093n0.getLayoutParams().width = i15;
            size2 = i15;
        }
        jcVar.f1119y0.getLayoutParams().height = size + 1;
        jcVar.f1119y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) jcVar.f1119y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
