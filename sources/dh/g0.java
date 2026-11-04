package dh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.wm;
public final class g0 extends FrameLayout {
    public final d2 f9007a;
    public final View f9008b;
    public final boolean f9009c;
    public final zi d;
    public final wm f9010e;
    public final int f9011f;
    public final int h;
    public final boolean f9012n;
    public final float f9013r;
    public final float f9014s;
    public final float f9015w;
    public final n0 f9016x;
    public final j0 f9017y;

    public g0(j0 j0Var, Context context, d2 d2Var, View view, boolean z10, zi ziVar, wm wmVar, int i3, int i10, boolean z11, float f10, float f11, float f12, n0 n0Var) {
        super(context);
        this.f9017y = j0Var;
        this.f9007a = d2Var;
        this.f9008b = view;
        this.f9009c = z10;
        this.d = ziVar;
        this.f9010e = wmVar;
        this.f9011f = i3;
        this.h = i10;
        this.f9012n = z11;
        this.f9013r = f10;
        this.f9014s = f11;
        this.f9015w = f12;
        this.f9016x = n0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: dh.g0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = 0;
        while (true) {
            j0 j0Var = this.f9017y;
            if (i3 < j0Var.f9054x.size()) {
                ((i0) j0Var.f9054x.get(i3)).f9022a.P();
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = 0;
        while (true) {
            j0 j0Var = this.f9017y;
            if (i3 < j0Var.f9054x.size()) {
                ((i0) j0Var.f9054x.get(i3)).f9022a.R();
                i3++;
            } else {
                return;
            }
        }
    }
}
