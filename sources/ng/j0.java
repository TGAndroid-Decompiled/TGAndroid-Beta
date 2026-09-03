package ng;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.xn;
public final class j0 extends FrameLayout {
    public final p2 f16092a;
    public final View f16093b;
    public final boolean f16094c;
    public final MessageObject d;
    public final xn f16095e;
    public final int f16096f;
    public final int h;
    public final boolean f16097n;
    public final float f16098r;
    public final float f16099s;
    public final float v;
    public final q0 f16100w;
    public final m0 f16101x;

    public j0(m0 m0Var, Context context, p2 p2Var, View view, boolean z4, MessageObject messageObject, xn xnVar, int i10, int i11, boolean z10, float f10, float f11, float f12, q0 q0Var) {
        super(context);
        this.f16101x = m0Var;
        this.f16092a = p2Var;
        this.f16093b = view;
        this.f16094c = z4;
        this.d = messageObject;
        this.f16095e = xnVar;
        this.f16096f = i10;
        this.h = i11;
        this.f16097n = z10;
        this.f16098r = f10;
        this.f16099s = f11;
        this.v = f12;
        this.f16100w = q0Var;
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
            m0 m0Var = this.f16101x;
            if (i10 < m0Var.f16138x.size()) {
                ((l0) m0Var.f16138x.get(i10)).f16106a.onAttachedToWindow();
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
            m0 m0Var = this.f16101x;
            if (i10 < m0Var.f16138x.size()) {
                ((l0) m0Var.f16138x.get(i10)).f16106a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
