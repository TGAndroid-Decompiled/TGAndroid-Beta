package mg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.xn;
public final class j0 extends FrameLayout {
    public final p2 f14024a;
    public final View f14025b;
    public final boolean f14026c;
    public final MessageObject d;
    public final xn e;
    public final int f14027f;
    public final int h;
    public final boolean f14028n;
    public final float f14029r;
    public final float f14030s;
    public final float v;
    public final q0 f14031w;
    public final m0 f14032x;

    public j0(m0 m0Var, Context context, p2 p2Var, View view, boolean z4, MessageObject messageObject, xn xnVar, int i10, int i11, boolean z10, float f10, float f11, float f12, q0 q0Var) {
        super(context);
        this.f14032x = m0Var;
        this.f14024a = p2Var;
        this.f14025b = view;
        this.f14026c = z4;
        this.d = messageObject;
        this.e = xnVar;
        this.f14027f = i10;
        this.h = i11;
        this.f14028n = z10;
        this.f14029r = f10;
        this.f14030s = f11;
        this.v = f12;
        this.f14031w = q0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: mg.j0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            m0 m0Var = this.f14032x;
            if (i10 < m0Var.f14067x.size()) {
                ((l0) m0Var.f14067x.get(i10)).f14037a.onAttachedToWindow();
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
            m0 m0Var = this.f14032x;
            if (i10 < m0Var.f14067x.size()) {
                ((l0) m0Var.f14067x.get(i10)).f14037a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
