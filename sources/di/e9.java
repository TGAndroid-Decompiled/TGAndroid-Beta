package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
public final class e9 extends v {
    public final p9 d;

    public e9(Context context, p9 p9Var) {
        super(context);
        this.d = p9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        p9 p9Var = this.d;
        i4 currentPeerView = p9Var.f9559n0.getCurrentPeerView();
        s5 s5Var = p9Var.f9580x;
        if (s5Var != null && currentPeerView != null) {
            j3 j3Var = currentPeerView.L0;
            s5Var.setOffset(p9Var.f9541e0);
            if (p9Var.f9580x.f9759f == 1.0f) {
                p9Var.f9559n0.setVisibility(4);
            } else {
                p9Var.f9559n0.setVisibility(0);
            }
            p9Var.f9559n0.B();
            float top = j3Var.getTop() + currentPeerView.getTop();
            float f11 = p9Var.f9580x.f9759f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (j3Var.getMeasuredHeight() > 0) {
                p9Var.f9563p1 = j3Var.getMeasuredHeight();
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, p9Var.f9580x.f9760n / p9Var.f9563p1, f11);
            p9Var.f9559n0.setPivotY(top);
            p9Var.f9559n0.setPivotX(getMeasuredWidth() / 2.0f);
            p9Var.f9559n0.setScaleX(T1);
            p9Var.f9559n0.setScaleY(T1);
            currentPeerView.E2 = true;
            if (p9Var.f9541e0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f11, T1, p9Var.f9580x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f9153h1.f3369b = (int) org.telegram.messenger.g0.T1(10.0f, 6.0f / f10, p9Var.f9580x.f9759f);
            j3Var.invalidateOutline();
            p9Var.f9559n0.setTranslationY((p9Var.f9580x.f9756b - top) * f11);
        }
        if (currentPeerView != null) {
            p9Var.f9537c1.setTranslationY(((currentPeerView.L0.getY() + currentPeerView.getY()) - p9Var.f9537c1.getTop()) - org.telegram.messenger.g0.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        p9 p9Var = this.d;
        if (!p9Var.f9532b || p9Var.f9535c) {
            View rootView = getRootView();
            Rect rect = org.telegram.messenger.g0.Q;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                int height = rootView.getHeight();
                if (rect.top != 0) {
                    i11 = org.telegram.messenger.g0.f22531m;
                } else {
                    i11 = 0;
                }
                i12 = Math.max(0, ((height - i11) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
            }
            p9Var.h(i12);
            size += p9Var.f9562p0;
        }
        int size2 = View.MeasureSpec.getSize(i7);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            p9Var.f9559n0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            p9Var.f9559n0.getLayoutParams().width = i14;
            size2 = i14;
        }
        p9Var.f9583y0.getLayoutParams().height = size + 1;
        p9Var.f9583y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) p9Var.f9583y0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22531m;
        super.onMeasure(i7, i10);
    }
}
