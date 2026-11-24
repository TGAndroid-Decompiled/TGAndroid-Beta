package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class d39 extends FrameLayout {
    public final d a;
    public final View b;
    public final boolean c;
    public final k47 d;
    public final yv1 e;
    public final int f;
    public final int h;
    public final boolean n;
    public final float r;
    public final float s;
    public final float w;
    public final k39 x;
    public final g39 y;

    public d39(g39 g39Var, Context context, d dVar, View view, boolean z, k47 k47Var, yv1 yv1Var, int i, int i2, boolean z2, float f, float f2, float f3, k39 k39Var) {
        super(context);
        this.y = g39Var;
        this.a = dVar;
        this.b = view;
        this.c = z;
        this.d = k47Var;
        this.e = yv1Var;
        this.f = i;
        this.h = i2;
        this.n = z2;
        this.r = f;
        this.s = f2;
        this.w = f3;
        this.x = k39Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d39.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        ArrayList arrayList = this.y.x;
        super.onAttachedToWindow();
        for (int i = 0; i < arrayList.size(); i++) {
            ((f39) arrayList.get(i)).a.I();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.y.x;
        super.onDetachedFromWindow();
        for (int i = 0; i < arrayList.size(); i++) {
            ((f39) arrayList.get(i)).a.K();
        }
    }
}
