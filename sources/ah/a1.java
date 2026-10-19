package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.qn;
public final class a1 extends FrameLayout {
    public final n2 f649a;
    public final View f650b;
    public final boolean f651c;
    public final MessageObject d;
    public final qn e;
    public final int f652f;
    public final int h;
    public final boolean f653n;
    public final float f654r;
    public final float f655s;
    public final float v;
    public final i1 f656w;
    public final d1 f657x;

    public a1(d1 d1Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, qn qnVar, int i10, int i11, boolean z11, float f7, float f10, float f11, i1 i1Var) {
        super(context);
        this.f657x = d1Var;
        this.f649a = n2Var;
        this.f650b = view;
        this.f651c = z10;
        this.d = messageObject;
        this.e = qnVar;
        this.f652f = i10;
        this.h = i11;
        this.f653n = z11;
        this.f654r = f7;
        this.f655s = f10;
        this.v = f11;
        this.f656w = i1Var;
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
            d1 d1Var = this.f657x;
            if (i10 < d1Var.f707x.size()) {
                ((c1) d1Var.f707x.get(i10)).f668a.onAttachedToWindow();
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
            d1 d1Var = this.f657x;
            if (i10 < d1Var.f707x.size()) {
                ((c1) d1Var.f707x.get(i10)).f668a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
