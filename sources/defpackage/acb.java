package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
public final class acb extends si5 {
    public final lcb d;

    public acb(lcb lcbVar, Context context) {
        super(context);
        this.d = lcbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        lcb lcbVar = this.d;
        o68 currentPeerView = lcbVar.o0.getCurrentPeerView();
        g4a g4aVar = lcbVar.x;
        if (g4aVar != null && currentPeerView != null) {
            u58 u58Var = currentPeerView.M0;
            g4aVar.setOffset(lcbVar.f0);
            int i = (lcbVar.x.f > 1.0f ? 1 : (lcbVar.x.f == 1.0f ? 0 : -1));
            bcb bcbVar = lcbVar.o0;
            if (i == 0) {
                bcbVar.setVisibility(4);
            } else {
                bcbVar.setVisibility(0);
            }
            lcbVar.o0.B();
            float top = u58Var.getTop() + currentPeerView.getTop();
            float f2 = lcbVar.x.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (u58Var.getMeasuredHeight() > 0) {
                lcbVar.q1 = u58Var.getMeasuredHeight();
            }
            float R1 = hl.R1(1.0f, lcbVar.x.n / lcbVar.q1, f2);
            lcbVar.o0.setPivotY(top);
            lcbVar.o0.setPivotX(getMeasuredWidth() / 2.0f);
            lcbVar.o0.setScaleX(R1);
            lcbVar.o0.setScaleY(R1);
            currentPeerView.F2 = true;
            if (lcbVar.f0 == 0.0f) {
                currentPeerView.S0(0.0f, 0.0f, null);
            } else {
                currentPeerView.S0(f2, R1, lcbVar.x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.i1.b = (int) hl.R1(10.0f, 6.0f / f, lcbVar.x.f);
            u58Var.invalidateOutline();
            lcbVar.o0.setTranslationY((lcbVar.x.b - top) * f2);
        }
        if (currentPeerView != null) {
            lcbVar.d1.setTranslationY(((currentPeerView.M0.getY() + currentPeerView.getY()) - lcbVar.d1.getTop()) - hl.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2);
        lcb lcbVar = this.d;
        if (!lcbVar.b || lcbVar.c) {
            View rootView = getRootView();
            Rect rect = hl.Q;
            getWindowVisibleDisplayFrame(rect);
            int i4 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                int height = rootView.getHeight();
                if (rect.top != 0) {
                    i3 = hl.m;
                } else {
                    i3 = 0;
                }
                i4 = Math.max(0, ((height - i3) - hl.o1(rootView)) - (rect.bottom - rect.top));
            }
            lcbVar.g(i4);
            size += lcbVar.q0;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int i5 = (int) ((size2 * 16.0f) / 9.0f);
        bcb bcbVar = lcbVar.o0;
        if (size > i5) {
            bcbVar.getLayoutParams().width = -1;
            size = i5;
        } else {
            int i6 = (int) ((size / 16.0f) * 9.0f);
            bcbVar.getLayoutParams().width = i6;
            size2 = i6;
        }
        lcbVar.z0.getLayoutParams().height = size + 1;
        lcbVar.z0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) lcbVar.z0.getLayoutParams()).topMargin = hl.m;
        super.onMeasure(i, i2);
    }
}
