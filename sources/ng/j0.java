package ng;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.xn;
public final class j0 extends FrameLayout {
    public final p2 f16090a;
    public final View f16091b;
    public final boolean f16092c;
    public final MessageObject d;
    public final xn f16093e;
    public final int f16094f;
    public final int h;
    public final boolean f16095n;
    public final float f16096r;
    public final float f16097s;
    public final float v;
    public final q0 f16098w;
    public final m0 f16099x;

    public j0(m0 m0Var, Context context, p2 p2Var, View view, boolean z4, MessageObject messageObject, xn xnVar, int i10, int i11, boolean z10, float f10, float f11, float f12, q0 q0Var) {
        super(context);
        this.f16099x = m0Var;
        this.f16090a = p2Var;
        this.f16091b = view;
        this.f16092c = z4;
        this.d = messageObject;
        this.f16093e = xnVar;
        this.f16094f = i10;
        this.h = i11;
        this.f16095n = z10;
        this.f16096r = f10;
        this.f16097s = f11;
        this.v = f12;
        this.f16098w = q0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: ng.j0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            m0 m0Var = this.f16099x;
            if (i10 < m0Var.f16136x.size()) {
                ((l0) m0Var.f16136x.get(i10)).f16104a.onAttachedToWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            m0 m0Var = this.f16099x;
            if (i10 < m0Var.f16136x.size()) {
                ((l0) m0Var.f16136x.get(i10)).f16104a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
