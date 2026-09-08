package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.co;
public final class b1 extends FrameLayout {
    public final n2 f466a;
    public final View f467b;
    public final boolean f468c;
    public final MessageObject d;
    public final co f469e;
    public final int f470f;
    public final int h;
    public final boolean f471n;
    public final float f472r;
    public final float f473s;
    public final float v;
    public final j1 f474w;
    public final e1 f475x;

    public b1(e1 e1Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, co coVar, int i10, int i11, boolean z11, float f7, float f10, float f11, j1 j1Var) {
        super(context);
        this.f475x = e1Var;
        this.f466a = n2Var;
        this.f467b = view;
        this.f468c = z10;
        this.d = messageObject;
        this.f469e = coVar;
        this.f470f = i10;
        this.h = i11;
        this.f471n = z11;
        this.f472r = f7;
        this.f473s = f10;
        this.v = f11;
        this.f474w = j1Var;
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
            e1 e1Var = this.f475x;
            if (i10 < e1Var.f538x.size()) {
                ((d1) e1Var.f538x.get(i10)).f495a.onAttachedToWindow();
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
            e1 e1Var = this.f475x;
            if (i10 < e1Var.f538x.size()) {
                ((d1) e1Var.f538x.get(i10)).f495a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
