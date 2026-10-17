package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.sn;
public final class a1 extends FrameLayout {
    public final n2 f651a;
    public final View f652b;
    public final boolean f653c;
    public final MessageObject d;
    public final sn e;
    public final int f654f;
    public final int h;
    public final boolean f655n;
    public final float f656r;
    public final float f657s;
    public final float v;
    public final i1 f658w;
    public final d1 f659x;

    public a1(d1 d1Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, sn snVar, int i10, int i11, boolean z11, float f7, float f10, float f11, i1 i1Var) {
        super(context);
        this.f659x = d1Var;
        this.f651a = n2Var;
        this.f652b = view;
        this.f653c = z10;
        this.d = messageObject;
        this.e = snVar;
        this.f654f = i10;
        this.h = i11;
        this.f655n = z11;
        this.f656r = f7;
        this.f657s = f10;
        this.v = f11;
        this.f658w = i1Var;
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
            d1 d1Var = this.f659x;
            if (i10 < d1Var.f709x.size()) {
                ((c1) d1Var.f709x.get(i10)).f670a.onAttachedToWindow();
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
            d1 d1Var = this.f659x;
            if (i10 < d1Var.f709x.size()) {
                ((c1) d1Var.f709x.get(i10)).f670a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
