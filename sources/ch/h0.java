package ch;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ij;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.cn;
public final class h0 extends FrameLayout {
    public final f2 f6259a;
    public final View f6260b;
    public final boolean f6261c;
    public final ij d;
    public final cn f6262e;
    public final int f6263f;
    public final int h;
    public final boolean f6264n;
    public final float f6265r;
    public final float f6266s;
    public final float f6267w;
    public final o0 f6268x;
    public final k0 f6269y;

    public h0(k0 k0Var, Context context, f2 f2Var, View view, boolean z9, ij ijVar, cn cnVar, int i7, int i10, boolean z10, float f10, float f11, float f12, o0 o0Var) {
        super(context);
        this.f6269y = k0Var;
        this.f6259a = f2Var;
        this.f6260b = view;
        this.f6261c = z9;
        this.d = ijVar;
        this.f6262e = cnVar;
        this.f6263f = i7;
        this.h = i10;
        this.f6264n = z10;
        this.f6265r = f10;
        this.f6266s = f11;
        this.f6267w = f12;
        this.f6268x = o0Var;
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
            k0 k0Var = this.f6269y;
            if (i7 < k0Var.f6305x.size()) {
                ((j0) k0Var.f6305x.get(i7)).f6274a.P();
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
            k0 k0Var = this.f6269y;
            if (i7 < k0Var.f6305x.size()) {
                ((j0) k0Var.f6305x.get(i7)).f6274a.R();
                i7++;
            } else {
                return;
            }
        }
    }
}
