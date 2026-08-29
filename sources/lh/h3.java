package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
public final class h3 extends t {
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 f15651e;
    public final org.telegram.ui.Components.voip.h f15652f;
    public final org.telegram.ui.Components.d6 h;
    public final org.telegram.ui.Components.d6 f15653n;
    public boolean f15654r;
    public boolean f15655s;
    public final a4 v;
    public final i9 f15656w;
    public final d4 f15657x;

    public h3(d4 d4Var, Context context, a4 a4Var, i9 i9Var) {
        super(context);
        this.f15657x = d4Var;
        this.v = a4Var;
        this.f15656w = i9Var;
        jr jrVar = jr.f29800f;
        this.d = new org.telegram.ui.Components.d6(this, 150L, jrVar);
        this.f15651e = new org.telegram.ui.Components.d6(this, 150L, jrVar);
        this.f15652f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(this);
        this.h = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6(this);
        this.f15653n = d6Var2;
        d6Var.f27669g = 500L;
        d6Var2.f27669g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: lh.h3.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: lh.h3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d1 d1Var;
        d4 d4Var = this.f15657x;
        c4 c4Var = d4Var.I2;
        if (d4Var.G1 && !d4Var.Y2 && c4Var.d != null && (d1Var = c4Var.f15426a) != null && d1Var.n() && c4Var.d.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f15657x.f15481f1) {
            if (this.f15654r) {
                mc mcVar = mc.f30644w;
                if (mcVar != null && view == mcVar.f30648e) {
                    if (this.f15655s) {
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
        this.f15657x.f15484g1.j();
        mc.a(this, new ih.u0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d4 d4Var = this.f15657x;
        d4Var.f15484g1.k();
        mc.h(this);
        x3 x3Var = d4Var.M1;
        if (x3Var != null) {
            i9 i9Var = ((z8) x3Var).d;
            i9Var.U0 = false;
            i9Var.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f15657x.f15527u0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
