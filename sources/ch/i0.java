package ch;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.gj;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.an;
public final class i0 extends FrameLayout {
    public final e2 f5090a;
    public final View f5091b;
    public final boolean f5092c;
    public final gj d;
    public final an f5093e;
    public final int f5094f;
    public final int h;
    public final boolean f5095n;
    public final float f5096r;
    public final float f5097s;
    public final float f5098w;
    public final p0 f5099x;
    public final l0 f5100y;

    public i0(l0 l0Var, Context context, e2 e2Var, View view, boolean z10, gj gjVar, an anVar, int i7, int i10, boolean z11, float f10, float f11, float f12, p0 p0Var) {
        super(context);
        this.f5100y = l0Var;
        this.f5090a = e2Var;
        this.f5091b = view;
        this.f5092c = z10;
        this.d = gjVar;
        this.f5093e = anVar;
        this.f5094f = i7;
        this.h = i10;
        this.f5095n = z11;
        this.f5096r = f10;
        this.f5097s = f11;
        this.f5098w = f12;
        this.f5099x = p0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: ch.i0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = 0;
        while (true) {
            l0 l0Var = this.f5100y;
            if (i7 < l0Var.f5135x.size()) {
                ((k0) l0Var.f5135x.get(i7)).f5104a.P();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        while (true) {
            l0 l0Var = this.f5100y;
            if (i7 < l0Var.f5135x.size()) {
                ((k0) l0Var.f5135x.get(i7)).f5104a.R();
                i7++;
            } else {
                return;
            }
        }
    }
}
