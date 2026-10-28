package bh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.wn;
public final class p0 extends FrameLayout {
    public final r2 f4103a;
    public final View f4104b;
    public final boolean f4105c;
    public final MessageObject d;
    public final wn e;
    public final int f4106f;
    public final int h;
    public final boolean f4107n;
    public final float f4108r;
    public final float f4109s;
    public final float v;
    public final x0 f4110w;
    public final s0 f4111x;

    public p0(s0 s0Var, Context context, r2 r2Var, View view, boolean z10, MessageObject messageObject, wn wnVar, int i10, int i11, boolean z11, float f7, float f10, float f11, x0 x0Var) {
        super(context);
        this.f4111x = s0Var;
        this.f4103a = r2Var;
        this.f4104b = view;
        this.f4105c = z10;
        this.d = messageObject;
        this.e = wnVar;
        this.f4106f = i10;
        this.h = i11;
        this.f4107n = z11;
        this.f4108r = f7;
        this.f4109s = f10;
        this.v = f11;
        this.f4110w = x0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: bh.p0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            s0 s0Var = this.f4111x;
            if (i10 < s0Var.f4144x.size()) {
                ((r0) s0Var.f4144x.get(i10)).f4114a.onAttachedToWindow();
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
            s0 s0Var = this.f4111x;
            if (i10 < s0Var.f4144x.size()) {
                ((r0) s0Var.f4144x.get(i10)).f4114a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
