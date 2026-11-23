package ch;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.gj;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.bn;
public final class i0 extends FrameLayout {
    public final g2 f5405a;
    public final View f5406b;
    public final boolean f5407c;
    public final gj d;
    public final bn f5408e;
    public final int f5409f;
    public final int h;
    public final boolean f5410n;
    public final float f5411r;
    public final float f5412s;
    public final float f5413w;
    public final p0 f5414x;
    public final l0 f5415y;

    public i0(l0 l0Var, Context context, g2 g2Var, View view, boolean z10, gj gjVar, bn bnVar, int i7, int i10, boolean z11, float f10, float f11, float f12, p0 p0Var) {
        super(context);
        this.f5415y = l0Var;
        this.f5405a = g2Var;
        this.f5406b = view;
        this.f5407c = z10;
        this.d = gjVar;
        this.f5408e = bnVar;
        this.f5409f = i7;
        this.h = i10;
        this.f5410n = z11;
        this.f5411r = f10;
        this.f5412s = f11;
        this.f5413w = f12;
        this.f5414x = p0Var;
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
            l0 l0Var = this.f5415y;
            if (i7 < l0Var.f5452x.size()) {
                ((k0) l0Var.f5452x.get(i7)).f5421a.P();
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
            l0 l0Var = this.f5415y;
            if (i7 < l0Var.f5452x.size()) {
                ((k0) l0Var.f5452x.get(i7)).f5421a.R();
                i7++;
            } else {
                return;
            }
        }
    }
}
