package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.co;
public final class b1 extends FrameLayout {
    public final n2 f454a;
    public final View f455b;
    public final boolean f456c;
    public final MessageObject d;
    public final co f457e;
    public final int f458f;
    public final int h;
    public final boolean f459n;
    public final float f460r;
    public final float f461s;
    public final float v;
    public final j1 f462w;
    public final e1 f463x;

    public b1(e1 e1Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, co coVar, int i10, int i11, boolean z11, float f7, float f10, float f11, j1 j1Var) {
        super(context);
        this.f463x = e1Var;
        this.f454a = n2Var;
        this.f455b = view;
        this.f456c = z10;
        this.d = messageObject;
        this.f457e = coVar;
        this.f458f = i10;
        this.h = i11;
        this.f459n = z11;
        this.f460r = f7;
        this.f461s = f10;
        this.v = f11;
        this.f462w = j1Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: ah.b1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            e1 e1Var = this.f463x;
            if (i10 < e1Var.f526x.size()) {
                ((d1) e1Var.f526x.get(i10)).f483a.onAttachedToWindow();
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
            e1 e1Var = this.f463x;
            if (i10 < e1Var.f526x.size()) {
                ((d1) e1Var.f526x.get(i10)).f483a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
