package hg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.qn;
public final class k0 extends FrameLayout {
    public final o2 f10631a;
    public final View f10632b;
    public final boolean f10633c;
    public final MessageObject d;
    public final qn f10634e;
    public final int f10635f;
    public final int h;
    public final boolean f10636n;
    public final float f10637r;
    public final float f10638s;
    public final float v;
    public final r0 f10639w;
    public final n0 f10640x;

    public k0(n0 n0Var, Context context, o2 o2Var, View view, boolean z10, MessageObject messageObject, qn qnVar, int i9, int i10, boolean z11, float f10, float f11, float f12, r0 r0Var) {
        super(context);
        this.f10640x = n0Var;
        this.f10631a = o2Var;
        this.f10632b = view;
        this.f10633c = z10;
        this.d = messageObject;
        this.f10634e = qnVar;
        this.f10635f = i9;
        this.h = i10;
        this.f10636n = z11;
        this.f10637r = f10;
        this.f10638s = f11;
        this.v = f12;
        this.f10639w = r0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: hg.k0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = 0;
        while (true) {
            n0 n0Var = this.f10640x;
            if (i9 < n0Var.f10676x.size()) {
                ((m0) n0Var.f10676x.get(i9)).f10645a.onAttachedToWindow();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = 0;
        while (true) {
            n0 n0Var = this.f10640x;
            if (i9 < n0Var.f10676x.size()) {
                ((m0) n0Var.f10676x.get(i9)).f10645a.onDetachedFromWindow();
                i9++;
            } else {
                return;
            }
        }
    }
}
