package ch;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.fj;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.bn;
public final class i0 extends FrameLayout {
    public final h2 f5376a;
    public final View f5377b;
    public final boolean f5378c;
    public final fj d;
    public final bn f5379e;
    public final int f5380f;
    public final int h;
    public final boolean f5381n;
    public final float f5382r;
    public final float f5383s;
    public final float f5384w;
    public final p0 f5385x;
    public final l0 f5386y;

    public i0(l0 l0Var, Context context, h2 h2Var, View view, boolean z10, fj fjVar, bn bnVar, int i7, int i10, boolean z11, float f10, float f11, float f12, p0 p0Var) {
        super(context);
        this.f5386y = l0Var;
        this.f5376a = h2Var;
        this.f5377b = view;
        this.f5378c = z10;
        this.d = fjVar;
        this.f5379e = bnVar;
        this.f5380f = i7;
        this.h = i10;
        this.f5381n = z11;
        this.f5382r = f10;
        this.f5383s = f11;
        this.f5384w = f12;
        this.f5385x = p0Var;
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
            l0 l0Var = this.f5386y;
            if (i7 < l0Var.f5423x.size()) {
                ((k0) l0Var.f5423x.get(i7)).f5392a.P();
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
            l0 l0Var = this.f5386y;
            if (i7 < l0Var.f5423x.size()) {
                ((k0) l0Var.f5423x.get(i7)).f5392a.R();
                i7++;
            } else {
                return;
            }
        }
    }
}
