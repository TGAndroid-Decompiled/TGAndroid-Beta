package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
public final class l3 extends v {
    public final org.telegram.ui.Components.y5 d;
    public final org.telegram.ui.Components.y5 f11699e;
    public final org.telegram.ui.Components.voip.h f11700f;
    public final org.telegram.ui.Components.y5 h;
    public final org.telegram.ui.Components.y5 f11701n;
    public boolean f11702r;
    public boolean f11703s;
    public final f4 v;
    public final m9 f11704w;
    public final i4 f11705x;

    public l3(i4 i4Var, Context context, f4 f4Var, m9 m9Var) {
        super(context);
        this.f11705x = i4Var;
        this.v = f4Var;
        this.f11704w = m9Var;
        gr grVar = gr.f28844f;
        this.d = new org.telegram.ui.Components.y5(this, 150L, grVar);
        this.f11699e = new org.telegram.ui.Components.y5(this, 150L, grVar);
        this.f11700f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(this);
        this.h = y5Var;
        org.telegram.ui.Components.y5 y5Var2 = new org.telegram.ui.Components.y5(this);
        this.f11701n = y5Var2;
        y5Var.f34857g = 500L;
        y5Var2.f34857g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: ih.l3.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: ih.l3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        f1 f1Var;
        i4 i4Var = this.f11705x;
        h4 h4Var = i4Var.I2;
        if (i4Var.G1 && !i4Var.Y2 && h4Var.d != null && (f1Var = h4Var.f11500a) != null && f1Var.n() && h4Var.d.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f11705x.f11545f1) {
            if (this.f11702r) {
                gc gcVar = gc.f28729w;
                if (gcVar != null && view == gcVar.f28733e) {
                    if (this.f11703s) {
                        return super.drawChild(canvas, view, j10);
                    }
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            }
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11705x.f11548g1.j();
        gc.a(this, new fh.y0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i4 i4Var = this.f11705x;
        i4Var.f11548g1.k();
        gc.h(this);
        c4 c4Var = i4Var.M1;
        if (c4Var != null) {
            m9 m9Var = ((d9) c4Var).d;
            m9Var.U0 = false;
            m9Var.P();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f11705x.f11591u0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i9, i10);
    }
}
