package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
public final class x8 extends v {
    public final i9 d;

    public x8(Context context, i9 i9Var) {
        super(context);
        this.d = i9Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        i9 i9Var = this.d;
        b4 currentPeerView = i9Var.f11861o0.getCurrentPeerView();
        k5 k5Var = i9Var.f11882x;
        if (k5Var != null && currentPeerView != null) {
            e3 e3Var = currentPeerView.M0;
            k5Var.setOffset(i9Var.f11845f0);
            if (i9Var.f11882x.f11931f == 1.0f) {
                i9Var.f11861o0.setVisibility(4);
            } else {
                i9Var.f11861o0.setVisibility(0);
            }
            i9Var.f11861o0.B();
            float top = e3Var.getTop() + currentPeerView.getTop();
            float f11 = i9Var.f11882x.f11931f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (e3Var.getMeasuredHeight() > 0) {
                i9Var.f11866q1 = e3Var.getMeasuredHeight();
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, i9Var.f11882x.f11932n / i9Var.f11866q1, f11);
            i9Var.f11861o0.setPivotY(top);
            i9Var.f11861o0.setPivotX(getMeasuredWidth() / 2.0f);
            i9Var.f11861o0.setScaleX(T1);
            i9Var.f11861o0.setScaleY(T1);
            currentPeerView.F2 = true;
            if (i9Var.f11845f0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f11, T1, i9Var.f11882x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.f11483i1.f3324b = (int) org.telegram.messenger.g0.T1(10.0f, 6.0f / f10, i9Var.f11882x.f11931f);
            e3Var.invalidateOutline();
            i9Var.f11861o0.setTranslationY((i9Var.f11882x.f11928b - top) * f11);
        }
        if (currentPeerView != null) {
            i9Var.f11840d1.setTranslationY(((currentPeerView.M0.getY() + currentPeerView.getY()) - i9Var.f11840d1.getTop()) - org.telegram.messenger.g0.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i10);
        i9 i9Var = this.d;
        if (!i9Var.f11833b || i9Var.f11836c) {
            View rootView = getRootView();
            Rect rect = org.telegram.messenger.g0.Q;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                int height = rootView.getHeight();
                if (rect.top != 0) {
                    i11 = org.telegram.messenger.g0.f23605m;
                } else {
                    i11 = 0;
                }
                i12 = Math.max(0, ((height - i11) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
            }
            i9Var.h(i12);
            size += i9Var.f11865q0;
        }
        int size2 = View.MeasureSpec.getSize(i7);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            i9Var.f11861o0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            i9Var.f11861o0.getLayoutParams().width = i14;
            size2 = i14;
        }
        i9Var.f11886z0.getLayoutParams().height = size + 1;
        i9Var.f11886z0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) i9Var.f11886z0.getLayoutParams()).topMargin = org.telegram.messenger.g0.f23605m;
        super.onMeasure(i7, i10);
    }
}
