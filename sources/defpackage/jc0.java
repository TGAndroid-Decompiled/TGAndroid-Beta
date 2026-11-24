package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class jc0 extends View {
    public hc0 a;
    public final ln b;
    public boolean c;
    public boolean d;
    public final j15 e;
    public Drawable f;
    public Drawable h;
    public boolean n;
    public Paint r;
    public Paint s;
    public boolean w;
    public final mc0 x;

    public jc0(mc0 mc0Var, Context context) {
        super(context);
        this.x = mc0Var;
        ln lnVar = new ln(400L, gm.H);
        this.b = lnVar;
        this.e = new j15();
        lnVar.a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.x.Q, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
    }
}
