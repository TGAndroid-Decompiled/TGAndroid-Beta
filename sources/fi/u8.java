package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
public final class u8 extends v {
    public final f9 d;

    public u8(Context context, f9 f9Var) {
        super(context);
        this.d = f9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        f9 f9Var = this.d;
        z3 currentPeerView = f9Var.f11989o0.getCurrentPeerView();
        j5 j5Var = f9Var.f12010x;
        if (j5Var != null && currentPeerView != null) {
            c3 c3Var = currentPeerView.M0;
            j5Var.setOffset(f9Var.f11973f0);
            if (f9Var.f12010x.f12153f == 1.0f) {
                f9Var.f11989o0.setVisibility(4);
            } else {
                f9Var.f11989o0.setVisibility(0);
            }
            f9Var.f11989o0.B();
            float top = c3Var.getTop() + currentPeerView.getTop();
            float f11 = f9Var.f12010x.f12153f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (c3Var.getMeasuredHeight() > 0) {
                f9Var.f11994q1 = c3Var.getMeasuredHeight();
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, f9Var.f12010x.f12154n / f9Var.f11994q1, f11);
            f9Var.f11989o0.setPivotY(top);
            f9Var.f11989o0.setPivotX(getMeasuredWidth() / 2.0f);
            f9Var.f11989o0.setScaleX(T1);
            f9Var.f11989o0.setScaleY(T1);
            currentPeerView.F2 = true;
            if (f9Var.f11973f0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f11, T1, f9Var.f12010x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f12839i1.f3302b = (int) org.telegram.messenger.g0.T1(10.0f, 6.0f / f10, f9Var.f12010x.f12153f);
            c3Var.invalidateOutline();
            f9Var.f11989o0.setTranslationY((f9Var.f12010x.f12150b - top) * f11);
        }
        if (currentPeerView != null) {
            f9Var.f11968d1.setTranslationY(((currentPeerView.M0.getY() + currentPeerView.getY()) - f9Var.f11968d1.getTop()) - org.telegram.messenger.g0.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        f9 f9Var = this.d;
        if (!f9Var.f11961b || f9Var.f11964c) {
            View rootView = getRootView();
            Rect rect = org.telegram.messenger.g0.Q;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                int height = rootView.getHeight();
                if (rect.top != 0) {
                    i11 = org.telegram.messenger.g0.f24220m;
                } else {
                    i11 = 0;
                }
                i12 = Math.max(0, ((height - i11) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
            }
            f9Var.h(i12);
            size += f9Var.f11993q0;
        }
        int size2 = View.MeasureSpec.getSize(i7);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            f9Var.f11989o0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            f9Var.f11989o0.getLayoutParams().width = i14;
            size2 = i14;
        }
        f9Var.f12014z0.getLayoutParams().height = size + 1;
        f9Var.f12014z0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) f9Var.f12014z0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f24220m;
        super.onMeasure(i7, i10);
    }
}
