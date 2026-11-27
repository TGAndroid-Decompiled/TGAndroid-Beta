package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
public final class p49 extends FrameLayout {
    public final e a;
    public final View b;
    public final boolean c;
    public final r47 d;
    public final zu1 e;
    public final int f;
    public final int h;
    public final boolean n;
    public final float r;
    public final float s;
    public final float w;
    public final w49 x;
    public final s49 y;

    public p49(s49 s49Var, Context context, e eVar, View view, boolean z, r47 r47Var, zu1 zu1Var, int i, int i2, boolean z2, float f, float f2, float f3, w49 w49Var) {
        super(context);
        this.y = s49Var;
        this.a = eVar;
        this.b = view;
        this.c = z;
        this.d = r47Var;
        this.e = zu1Var;
        this.f = i;
        this.h = i2;
        this.n = z2;
        this.r = f;
        this.s = f2;
        this.w = f3;
        this.x = w49Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p49.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        ArrayList arrayList = this.y.x;
        super.onAttachedToWindow();
        for (int i = 0; i < arrayList.size(); i++) {
            ((r49) arrayList.get(i)).a.I();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.y.x;
        super.onDetachedFromWindow();
        for (int i = 0; i < arrayList.size(); i++) {
            ((r49) arrayList.get(i)).a.K();
        }
    }
}
