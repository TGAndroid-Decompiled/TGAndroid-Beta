package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
public final class de9 extends View implements vlb {
    public final ylb a;
    public final Paint b;
    public ll0 c;

    public de9(Context context, ylb ylbVar) {
        super(context);
        this.b = new Paint();
        this.a = ylbVar;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.vl));
    }

    public ll0 getRow() {
        return this.c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, gm.L(6.0f), getMeasuredWidth(), gm.L(6.0f) + 1, this.b);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(6.0f) + 1);
    }

    @Override
    public final void updateColors() {
        this.b.setColor(cmb.v0(cmb.vl, this.a));
    }
}
