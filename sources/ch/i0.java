package ch;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.fj;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.bn;
public final class i0 extends FrameLayout {
    public final h2 f5373a;
    public final View f5374b;
    public final boolean f5375c;
    public final fj d;
    public final bn f5376e;
    public final int f5377f;
    public final int h;
    public final boolean f5378n;
    public final float f5379r;
    public final float f5380s;
    public final float f5381w;
    public final p0 f5382x;
    public final l0 f5383y;

    public i0(l0 l0Var, Context context, h2 h2Var, View view, boolean z10, fj fjVar, bn bnVar, int i7, int i10, boolean z11, float f10, float f11, float f12, p0 p0Var) {
        super(context);
        this.f5383y = l0Var;
        this.f5373a = h2Var;
        this.f5374b = view;
        this.f5375c = z10;
        this.d = fjVar;
        this.f5376e = bnVar;
        this.f5377f = i7;
        this.h = i10;
        this.f5378n = z11;
        this.f5379r = f10;
        this.f5380s = f11;
        this.f5381w = f12;
        this.f5382x = p0Var;
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
            l0 l0Var = this.f5383y;
            if (i7 < l0Var.f5420x.size()) {
                ((k0) l0Var.f5420x.get(i7)).f5389a.P();
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
            l0 l0Var = this.f5383y;
            if (i7 < l0Var.f5420x.size()) {
                ((k0) l0Var.f5420x.get(i7)).f5389a.R();
                i7++;
            } else {
                return;
            }
        }
    }
}
