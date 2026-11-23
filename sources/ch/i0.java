package ch;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.gj;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.bn;
public final class i0 extends FrameLayout {
    public final g2 f5368a;
    public final View f5369b;
    public final boolean f5370c;
    public final gj d;
    public final bn f5371e;
    public final int f5372f;
    public final int h;
    public final boolean f5373n;
    public final float f5374r;
    public final float f5375s;
    public final float f5376w;
    public final p0 f5377x;
    public final l0 f5378y;

    public i0(l0 l0Var, Context context, g2 g2Var, View view, boolean z10, gj gjVar, bn bnVar, int i7, int i10, boolean z11, float f10, float f11, float f12, p0 p0Var) {
        super(context);
        this.f5378y = l0Var;
        this.f5368a = g2Var;
        this.f5369b = view;
        this.f5370c = z10;
        this.d = gjVar;
        this.f5371e = bnVar;
        this.f5372f = i7;
        this.h = i10;
        this.f5373n = z11;
        this.f5374r = f10;
        this.f5375s = f11;
        this.f5376w = f12;
        this.f5377x = p0Var;
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
            l0 l0Var = this.f5378y;
            if (i7 < l0Var.f5415x.size()) {
                ((k0) l0Var.f5415x.get(i7)).f5384a.P();
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
            l0 l0Var = this.f5378y;
            if (i7 < l0Var.f5415x.size()) {
                ((k0) l0Var.f5415x.get(i7)).f5384a.R();
                i7++;
            } else {
                return;
            }
        }
    }
}
