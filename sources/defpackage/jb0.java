package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class jb0 extends View {
    public hb0 a;
    public final lm b;
    public boolean c;
    public boolean d;
    public final kz4 e;
    public Drawable f;
    public Drawable h;
    public boolean n;
    public Paint r;
    public Paint s;
    public boolean w;
    public final mb0 x;

    public jb0(mb0 mb0Var, Context context) {
        super(context);
        this.x = mb0Var;
        lm lmVar = new lm(400L, gl.H);
        this.b = lmVar;
        this.e = new kz4();
        lmVar.a = this;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.x.Q, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
    }
}
