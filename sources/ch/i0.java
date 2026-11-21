package ch;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.fj;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.bn;
public final class i0 extends FrameLayout {
    public final g2 f5402a;
    public final View f5403b;
    public final boolean f5404c;
    public final fj d;
    public final bn f5405e;
    public final int f5406f;
    public final int h;
    public final boolean f5407n;
    public final float f5408r;
    public final float f5409s;
    public final float f5410w;
    public final p0 f5411x;
    public final l0 f5412y;

    public i0(l0 l0Var, Context context, g2 g2Var, View view, boolean z10, fj fjVar, bn bnVar, int i7, int i10, boolean z11, float f10, float f11, float f12, p0 p0Var) {
        super(context);
        this.f5412y = l0Var;
        this.f5402a = g2Var;
        this.f5403b = view;
        this.f5404c = z10;
        this.d = fjVar;
        this.f5405e = bnVar;
        this.f5406f = i7;
        this.h = i10;
        this.f5407n = z11;
        this.f5408r = f10;
        this.f5409s = f11;
        this.f5410w = f12;
        this.f5411x = p0Var;
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
            l0 l0Var = this.f5412y;
            if (i7 < l0Var.f5449x.size()) {
                ((k0) l0Var.f5449x.get(i7)).f5418a.P();
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
            l0 l0Var = this.f5412y;
            if (i7 < l0Var.f5449x.size()) {
                ((k0) l0Var.f5449x.get(i7)).f5418a.R();
                i7++;
            } else {
                return;
            }
        }
    }
}
