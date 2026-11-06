package ch;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ij;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.an;
public final class h0 extends FrameLayout {
    public final f2 f6256a;
    public final View f6257b;
    public final boolean f6258c;
    public final ij d;
    public final an f6259e;
    public final int f6260f;
    public final int h;
    public final boolean f6261n;
    public final float f6262r;
    public final float f6263s;
    public final float f6264w;
    public final o0 f6265x;
    public final k0 f6266y;

    public h0(k0 k0Var, Context context, f2 f2Var, View view, boolean z9, ij ijVar, an anVar, int i7, int i10, boolean z10, float f10, float f11, float f12, o0 o0Var) {
        super(context);
        this.f6266y = k0Var;
        this.f6256a = f2Var;
        this.f6257b = view;
        this.f6258c = z9;
        this.d = ijVar;
        this.f6259e = anVar;
        this.f6260f = i7;
        this.h = i10;
        this.f6261n = z10;
        this.f6262r = f10;
        this.f6263s = f11;
        this.f6264w = f12;
        this.f6265x = o0Var;
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
            k0 k0Var = this.f6266y;
            if (i7 < k0Var.f6302x.size()) {
                ((j0) k0Var.f6302x.get(i7)).f6271a.P();
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
            k0 k0Var = this.f6266y;
            if (i7 < k0Var.f6302x.size()) {
                ((j0) k0Var.f6302x.get(i7)).f6271a.R();
                i7++;
            } else {
                return;
            }
        }
    }
}
