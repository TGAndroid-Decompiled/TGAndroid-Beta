package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class lb0 extends View {
    public jb0 a;
    public final mm b;
    public boolean c;
    public boolean d;
    public final o15 e;
    public Drawable f;
    public Drawable h;
    public boolean n;
    public Paint r;
    public Paint s;
    public boolean w;
    public final ob0 x;

    public lb0(ob0 ob0Var, Context context) {
        super(context);
        this.x = ob0Var;
        mm mmVar = new mm(400L, hl.H);
        this.b = mmVar;
        this.e = new o15();
        mmVar.a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.x.Q, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
    }
}
