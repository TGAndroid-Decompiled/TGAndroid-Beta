package mg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.zn;
public final class j0 extends FrameLayout {
    public final p2 f14012a;
    public final View f14013b;
    public final boolean f14014c;
    public final MessageObject d;
    public final zn e;
    public final int f14015f;
    public final int h;
    public final boolean f14016n;
    public final float f14017r;
    public final float f14018s;
    public final float v;
    public final q0 f14019w;
    public final m0 f14020x;

    public j0(m0 m0Var, Context context, p2 p2Var, View view, boolean z4, MessageObject messageObject, zn znVar, int i10, int i11, boolean z10, float f10, float f11, float f12, q0 q0Var) {
        super(context);
        this.f14020x = m0Var;
        this.f14012a = p2Var;
        this.f14013b = view;
        this.f14014c = z4;
        this.d = messageObject;
        this.e = znVar;
        this.f14015f = i10;
        this.h = i11;
        this.f14016n = z10;
        this.f14017r = f10;
        this.f14018s = f11;
        this.v = f12;
        this.f14019w = q0Var;
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
            m0 m0Var = this.f14020x;
            if (i10 < m0Var.f14055x.size()) {
                ((l0) m0Var.f14055x.get(i10)).f14025a.onAttachedToWindow();
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
            m0 m0Var = this.f14020x;
            if (i10 < m0Var.f14055x.size()) {
                ((l0) m0Var.f14055x.get(i10)).f14025a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
