package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
public final class tf9 extends View implements snb {
    public final vnb a;
    public final Paint b;
    public mk0 c;

    public tf9(Context context, vnb vnbVar) {
        super(context);
        this.b = new Paint();
        this.a = vnbVar;
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.wl));
    }

    public mk0 getRow() {
        return this.c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, hl.L(6.0f), getMeasuredWidth(), hl.L(6.0f) + 1, this.b);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(6.0f) + 1);
    }

    @Override
    public final void updateColors() {
        this.b.setColor(aob.v0(aob.wl, this.a));
    }
}
