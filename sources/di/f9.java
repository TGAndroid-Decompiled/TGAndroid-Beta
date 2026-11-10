package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
public final class f9 extends v {
    public final q9 d;

    public f9(Context context, q9 q9Var) {
        super(context);
        this.d = q9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        q9 q9Var = this.d;
        j4 currentPeerView = q9Var.f9629n0.getCurrentPeerView();
        t5 t5Var = q9Var.f9650x;
        if (t5Var != null && currentPeerView != null) {
            j3 j3Var = currentPeerView.L0;
            t5Var.setOffset(q9Var.f9611e0);
            if (q9Var.f9650x.f9793f == 1.0f) {
                q9Var.f9629n0.setVisibility(4);
            } else {
                q9Var.f9629n0.setVisibility(0);
            }
            q9Var.f9629n0.B();
            float top = j3Var.getTop() + currentPeerView.getTop();
            float f11 = q9Var.f9650x.f9793f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (j3Var.getMeasuredHeight() > 0) {
                q9Var.f9633p1 = j3Var.getMeasuredHeight();
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, q9Var.f9650x.f9794n / q9Var.f9633p1, f11);
            q9Var.f9629n0.setPivotY(top);
            q9Var.f9629n0.setPivotX(getMeasuredWidth() / 2.0f);
            q9Var.f9629n0.setScaleX(T1);
            q9Var.f9629n0.setScaleY(T1);
            currentPeerView.E2 = true;
            if (q9Var.f9611e0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f11, T1, q9Var.f9650x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f9190h1.f3369b = (int) org.telegram.messenger.g0.T1(10.0f, 6.0f / f10, q9Var.f9650x.f9793f);
            j3Var.invalidateOutline();
            q9Var.f9629n0.setTranslationY((q9Var.f9650x.f9790b - top) * f11);
        }
        if (currentPeerView != null) {
            q9Var.f9607c1.setTranslationY(((currentPeerView.L0.getY() + currentPeerView.getY()) - q9Var.f9607c1.getTop()) - org.telegram.messenger.g0.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        q9 q9Var = this.d;
        if (!q9Var.f9602b || q9Var.f9605c) {
            View rootView = getRootView();
            Rect rect = org.telegram.messenger.g0.Q;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                int height = rootView.getHeight();
                if (rect.top != 0) {
                    i11 = org.telegram.messenger.g0.f22561m;
                } else {
                    i11 = 0;
                }
                i12 = Math.max(0, ((height - i11) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
            }
            q9Var.h(i12);
            size += q9Var.f9632p0;
        }
        int size2 = View.MeasureSpec.getSize(i7);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            q9Var.f9629n0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            q9Var.f9629n0.getLayoutParams().width = i14;
            size2 = i14;
        }
        q9Var.f9653y0.getLayoutParams().height = size + 1;
        q9Var.f9653y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) q9Var.f9653y0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22561m;
        super.onMeasure(i7, i10);
    }
}
