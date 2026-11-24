package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class a19 extends FrameLayout {
    public final d a;
    public final View b;
    public final boolean c;
    public final k27 d;
    public final mu1 e;
    public final int f;
    public final int h;
    public final boolean n;
    public final float r;
    public final float s;
    public final float w;
    public final h19 x;
    public final d19 y;

    public a19(d19 d19Var, Context context, d dVar, View view, boolean z, k27 k27Var, mu1 mu1Var, int i, int i2, boolean z2, float f, float f2, float f3, h19 h19Var) {
        super(context);
        this.y = d19Var;
        this.a = dVar;
        this.b = view;
        this.c = z;
        this.d = k27Var;
        this.e = mu1Var;
        this.f = i;
        this.h = i2;
        this.n = z2;
        this.r = f;
        this.s = f2;
        this.w = f3;
        this.x = h19Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a19.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        ArrayList arrayList = this.y.x;
        super.onAttachedToWindow();
        for (int i = 0; i < arrayList.size(); i++) {
            ((c19) arrayList.get(i)).a.I();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.y.x;
        super.onDetachedFromWindow();
        for (int i = 0; i < arrayList.size(); i++) {
            ((c19) arrayList.get(i)).a.K();
        }
    }
}
