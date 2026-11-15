package ch;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.gj;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.an;
public final class i0 extends FrameLayout {
    public final e2 f5087a;
    public final View f5088b;
    public final boolean f5089c;
    public final gj d;
    public final an f5090e;
    public final int f5091f;
    public final int h;
    public final boolean f5092n;
    public final float f5093r;
    public final float f5094s;
    public final float f5095w;
    public final p0 f5096x;
    public final l0 f5097y;

    public i0(l0 l0Var, Context context, e2 e2Var, View view, boolean z10, gj gjVar, an anVar, int i7, int i10, boolean z11, float f10, float f11, float f12, p0 p0Var) {
        super(context);
        this.f5097y = l0Var;
        this.f5087a = e2Var;
        this.f5088b = view;
        this.f5089c = z10;
        this.d = gjVar;
        this.f5090e = anVar;
        this.f5091f = i7;
        this.h = i10;
        this.f5092n = z11;
        this.f5093r = f10;
        this.f5094s = f11;
        this.f5095w = f12;
        this.f5096x = p0Var;
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
            l0 l0Var = this.f5097y;
            if (i7 < l0Var.f5132x.size()) {
                ((k0) l0Var.f5132x.get(i7)).f5101a.P();
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
            l0 l0Var = this.f5097y;
            if (i7 < l0Var.f5132x.size()) {
                ((k0) l0Var.f5132x.get(i7)).f5101a.R();
                i7++;
            } else {
                return;
            }
        }
    }
}
