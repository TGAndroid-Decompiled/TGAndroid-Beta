package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
public final class b8b extends qg5 {
    public final m8b d;

    public b8b(m8b m8bVar, Context context) {
        super(context);
        this.d = m8bVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        m8b m8bVar = this.d;
        y28 currentPeerView = m8bVar.o0.getCurrentPeerView();
        n0a n0aVar = m8bVar.x;
        if (n0aVar != null && currentPeerView != null) {
            d28 d28Var = currentPeerView.S0;
            n0aVar.setOffset(m8bVar.f0);
            int i = (m8bVar.x.f > 1.0f ? 1 : (m8bVar.x.f == 1.0f ? 0 : -1));
            c8b c8bVar = m8bVar.o0;
            if (i == 0) {
                c8bVar.setVisibility(4);
            } else {
                c8bVar.setVisibility(0);
            }
            m8bVar.o0.B();
            float top = d28Var.getTop() + currentPeerView.getTop();
            float f2 = m8bVar.x.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (d28Var.getMeasuredHeight() > 0) {
                m8bVar.q1 = d28Var.getMeasuredHeight();
            }
            float R1 = gl.R1(1.0f, m8bVar.x.n / m8bVar.q1, f2);
            m8bVar.o0.setPivotY(top);
            m8bVar.o0.setPivotX(getMeasuredWidth() / 2.0f);
            m8bVar.o0.setScaleX(R1);
            m8bVar.o0.setScaleY(R1);
            currentPeerView.L2 = true;
            if (m8bVar.f0 == 0.0f) {
                currentPeerView.S0(0.0f, 0.0f, null);
            } else {
                currentPeerView.S0(f2, R1, m8bVar.x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.o1.b = (int) gl.R1(10.0f, 6.0f / f, m8bVar.x.f);
            d28Var.invalidateOutline();
            m8bVar.o0.setTranslationY((m8bVar.x.b - top) * f2);
        }
        if (currentPeerView != null) {
            m8bVar.d1.setTranslationY(((currentPeerView.S0.getY() + currentPeerView.getY()) - m8bVar.d1.getTop()) - gl.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2);
        m8b m8bVar = this.d;
        if (!m8bVar.b || m8bVar.c) {
            View rootView = getRootView();
            Rect rect = gl.Q;
            getWindowVisibleDisplayFrame(rect);
            int i4 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                int height = rootView.getHeight();
                if (rect.top != 0) {
                    i3 = gl.m;
                } else {
                    i3 = 0;
                }
                i4 = Math.max(0, ((height - i3) - gl.o1(rootView)) - (rect.bottom - rect.top));
            }
            m8bVar.g(i4);
            size += m8bVar.q0;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int i5 = (int) ((size2 * 16.0f) / 9.0f);
        c8b c8bVar = m8bVar.o0;
        if (size > i5) {
            c8bVar.getLayoutParams().width = -1;
            size = i5;
        } else {
            int i6 = (int) ((size / 16.0f) * 9.0f);
            c8bVar.getLayoutParams().width = i6;
            size2 = i6;
        }
        m8bVar.z0.getLayoutParams().height = size + 1;
        m8bVar.z0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) m8bVar.z0.getLayoutParams()).topMargin = gl.m;
        super.onMeasure(i, i2);
    }
}
