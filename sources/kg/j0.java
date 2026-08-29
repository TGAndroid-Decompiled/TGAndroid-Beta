package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.tn;
public final class j0 extends FrameLayout {
    public final o2 f13738a;
    public final View f13739b;
    public final boolean f13740c;
    public final MessageObject d;
    public final tn f13741e;
    public final int f13742f;
    public final int h;
    public final boolean f13743n;
    public final float f13744r;
    public final float f13745s;
    public final float v;
    public final q0 f13746w;
    public final m0 f13747x;

    public j0(m0 m0Var, Context context, o2 o2Var, View view, boolean z10, MessageObject messageObject, tn tnVar, int i10, int i11, boolean z11, float f9, float f10, float f11, q0 q0Var) {
        super(context);
        this.f13747x = m0Var;
        this.f13738a = o2Var;
        this.f13739b = view;
        this.f13740c = z10;
        this.d = messageObject;
        this.f13741e = tnVar;
        this.f13742f = i10;
        this.h = i11;
        this.f13743n = z11;
        this.f13744r = f9;
        this.f13745s = f10;
        this.v = f11;
        this.f13746w = q0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: kg.j0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            m0 m0Var = this.f13747x;
            if (i10 < m0Var.f13784x.size()) {
                ((l0) m0Var.f13784x.get(i10)).f13752a.onAttachedToWindow();
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
            m0 m0Var = this.f13747x;
            if (i10 < m0Var.f13784x.size()) {
                ((l0) m0Var.f13784x.get(i10)).f13752a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
