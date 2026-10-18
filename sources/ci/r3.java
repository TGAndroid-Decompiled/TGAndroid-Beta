package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.qc;
public final class r3 extends w {
    public final org.telegram.ui.Components.f6 d;
    public final org.telegram.ui.Components.f6 e;
    public final org.telegram.ui.Components.voip.h f5910f;
    public final org.telegram.ui.Components.f6 h;
    public final org.telegram.ui.Components.f6 f5911n;
    public boolean f5912r;
    public boolean f5913s;
    public final n4 v;
    public final aa f5914w;
    public final q4 f5915x;

    public r3(q4 q4Var, Context context, n4 n4Var, aa aaVar) {
        super(context);
        this.f5915x = q4Var;
        this.v = n4Var;
        this.f5914w = aaVar;
        bs bsVar = bs.f25037f;
        this.d = new org.telegram.ui.Components.f6(this, 150L, bsVar);
        this.e = new org.telegram.ui.Components.f6(this, 150L, bsVar);
        this.f5910f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(this);
        this.h = f6Var;
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(this);
        this.f5911n = f6Var2;
        f6Var.f26102g = 500L;
        f6Var2.f26102g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: ci.r3.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: ci.r3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h1 h1Var;
        q4 q4Var = this.f5915x;
        p4 p4Var = q4Var.M2;
        if (q4Var.K1 && !q4Var.f5774c3 && ((org.telegram.ui.o4) p4Var.e) != null && (h1Var = (h1) p4Var.f5729b) != null && h1Var.n() && ((org.telegram.ui.o4) p4Var.e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f5915x.f5795j1) {
            if (this.f5912r) {
                qc qcVar = qc.f29638w;
                if (qcVar != null && view == qcVar.e) {
                    if (this.f5913s) {
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
        this.f5915x.f5798k1.i();
        qc.a(this, new ah.m0(this, 1));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q4 q4Var = this.f5915x;
        q4Var.f5798k1.j();
        qc.h(this);
        j4 j4Var = q4Var.Q1;
        if (j4Var != null) {
            aa aaVar = ((r9) j4Var).d;
            aaVar.Y0 = false;
            aaVar.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5915x.f5841y0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
