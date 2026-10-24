package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.zr;
public final class q3 extends w {
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.voip.h f5777f;
    public final org.telegram.ui.Components.d6 h;
    public final org.telegram.ui.Components.d6 f5778n;
    public boolean f5779r;
    public boolean f5780s;
    public final m4 v;
    public final z9 f5781w;
    public final p4 f5782x;

    public q3(p4 p4Var, Context context, m4 m4Var, z9 z9Var) {
        super(context);
        this.f5782x = p4Var;
        this.v = m4Var;
        this.f5781w = z9Var;
        zr zrVar = zr.f33337f;
        this.d = new org.telegram.ui.Components.d6(this, 150L, zrVar);
        this.e = new org.telegram.ui.Components.d6(this, 150L, zrVar);
        this.f5777f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(this);
        this.h = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6(this);
        this.f5778n = d6Var2;
        d6Var.f25570g = 500L;
        d6Var2.f25570g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q3.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h1 h1Var;
        p4 p4Var = this.f5782x;
        o4 o4Var = p4Var.M2;
        if (p4Var.K1 && !p4Var.f5658c3 && ((org.telegram.ui.n4) o4Var.e) != null && (h1Var = (h1) o4Var.f5632b) != null && h1Var.n() && ((org.telegram.ui.n4) o4Var.e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f5782x.f5679j1) {
            if (this.f5779r) {
                oc ocVar = oc.f29196w;
                if (ocVar != null && view == ocVar.e) {
                    if (this.f5780s) {
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
        this.f5782x.f5682k1.i();
        oc.a(this, new ah.m0(this, 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p4 p4Var = this.f5782x;
        p4Var.f5682k1.j();
        oc.h(this);
        i4 i4Var = p4Var.Q1;
        if (i4Var != null) {
            z9 z9Var = ((q9) i4Var).d;
            z9Var.Y0 = false;
            z9Var.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5782x.f5725y0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
