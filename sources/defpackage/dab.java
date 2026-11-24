package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
public final class dab extends pi5 {
    public final oab d;

    public dab(oab oabVar, Context context) {
        super(context);
        this.d = oabVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        oab oabVar = this.d;
        a58 currentPeerView = oabVar.o0.getCurrentPeerView();
        p2a p2aVar = oabVar.x;
        if (p2aVar != null && currentPeerView != null) {
            g48 g48Var = currentPeerView.S0;
            p2aVar.setOffset(oabVar.f0);
            int i = (oabVar.x.f > 1.0f ? 1 : (oabVar.x.f == 1.0f ? 0 : -1));
            eab eabVar = oabVar.o0;
            if (i == 0) {
                eabVar.setVisibility(4);
            } else {
                eabVar.setVisibility(0);
            }
            oabVar.o0.B();
            float top = g48Var.getTop() + currentPeerView.getTop();
            float f2 = oabVar.x.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (g48Var.getMeasuredHeight() > 0) {
                oabVar.q1 = g48Var.getMeasuredHeight();
            }
            float R1 = gm.R1(1.0f, oabVar.x.n / oabVar.q1, f2);
            oabVar.o0.setPivotY(top);
            oabVar.o0.setPivotX(getMeasuredWidth() / 2.0f);
            oabVar.o0.setScaleX(R1);
            oabVar.o0.setScaleY(R1);
            currentPeerView.L2 = true;
            if (oabVar.f0 == 0.0f) {
                currentPeerView.S0(0.0f, 0.0f, null);
            } else {
                currentPeerView.S0(f2, R1, oabVar.x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.o1.b = (int) gm.R1(10.0f, 6.0f / f, oabVar.x.f);
            g48Var.invalidateOutline();
            oabVar.o0.setTranslationY((oabVar.x.b - top) * f2);
        }
        if (currentPeerView != null) {
            oabVar.d1.setTranslationY(((currentPeerView.S0.getY() + currentPeerView.getY()) - oabVar.d1.getTop()) - gm.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2);
        oab oabVar = this.d;
        if (!oabVar.b || oabVar.c) {
            View rootView = getRootView();
            Rect rect = gm.Q;
            getWindowVisibleDisplayFrame(rect);
            int i4 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                int height = rootView.getHeight();
                if (rect.top != 0) {
                    i3 = gm.m;
                } else {
                    i3 = 0;
                }
                i4 = Math.max(0, ((height - i3) - gm.o1(rootView)) - (rect.bottom - rect.top));
            }
            oabVar.g(i4);
            size += oabVar.q0;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int i5 = (int) ((size2 * 16.0f) / 9.0f);
        eab eabVar = oabVar.o0;
        if (size > i5) {
            eabVar.getLayoutParams().width = -1;
            size = i5;
        } else {
            int i6 = (int) ((size / 16.0f) * 9.0f);
            eabVar.getLayoutParams().width = i6;
            size2 = i6;
        }
        oabVar.z0.getLayoutParams().height = size + 1;
        oabVar.z0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) oabVar.z0.getLayoutParams()).topMargin = gm.m;
        super.onMeasure(i, i2);
    }
}
