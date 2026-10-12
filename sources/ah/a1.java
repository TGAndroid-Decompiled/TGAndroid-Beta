package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.fo;
public final class a1 extends FrameLayout {
    public final m2 f645a;
    public final View f646b;
    public final boolean f647c;
    public final MessageObject d;
    public final fo e;
    public final int f648f;
    public final int h;
    public final boolean f649n;
    public final float f650r;
    public final float f651s;
    public final float v;
    public final i1 f652w;
    public final d1 f653x;

    public a1(d1 d1Var, Context context, m2 m2Var, View view, boolean z10, MessageObject messageObject, fo foVar, int i10, int i11, boolean z11, float f7, float f10, float f11, i1 i1Var) {
        super(context);
        this.f653x = d1Var;
        this.f645a = m2Var;
        this.f646b = view;
        this.f647c = z10;
        this.d = messageObject;
        this.e = foVar;
        this.f648f = i10;
        this.h = i11;
        this.f649n = z11;
        this.f650r = f7;
        this.f651s = f10;
        this.v = f11;
        this.f652w = i1Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: ah.a1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            d1 d1Var = this.f653x;
            if (i10 < d1Var.f703x.size()) {
                ((c1) d1Var.f703x.get(i10)).f664a.onAttachedToWindow();
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
            d1 d1Var = this.f653x;
            if (i10 < d1Var.f703x.size()) {
                ((c1) d1Var.f703x.get(i10)).f664a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
