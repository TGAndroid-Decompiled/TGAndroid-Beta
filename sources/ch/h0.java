package ch;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ij;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.cn;
public final class h0 extends FrameLayout {
    public final f2 f6254a;
    public final View f6255b;
    public final boolean f6256c;
    public final ij d;
    public final cn f6257e;
    public final int f6258f;
    public final int h;
    public final boolean f6259n;
    public final float f6260r;
    public final float f6261s;
    public final float f6262w;
    public final o0 f6263x;
    public final k0 f6264y;

    public h0(k0 k0Var, Context context, f2 f2Var, View view, boolean z9, ij ijVar, cn cnVar, int i7, int i10, boolean z10, float f10, float f11, float f12, o0 o0Var) {
        super(context);
        this.f6264y = k0Var;
        this.f6254a = f2Var;
        this.f6255b = view;
        this.f6256c = z9;
        this.d = ijVar;
        this.f6257e = cnVar;
        this.f6258f = i7;
        this.h = i10;
        this.f6259n = z10;
        this.f6260r = f10;
        this.f6261s = f11;
        this.f6262w = f12;
        this.f6263x = o0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: ch.h0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = 0;
        while (true) {
            k0 k0Var = this.f6264y;
            if (i7 < k0Var.f6300x.size()) {
                ((j0) k0Var.f6300x.get(i7)).f6269a.P();
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
            k0 k0Var = this.f6264y;
            if (i7 < k0Var.f6300x.size()) {
                ((j0) k0Var.f6300x.get(i7)).f6269a.R();
                i7++;
            } else {
                return;
            }
        }
    }
}
