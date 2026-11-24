package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
public final class lp5 {
    public long a;
    public float b;
    public float c;
    public boolean d;
    public float e;
    public final RectF f = new RectF();
    public int g;
    public final Paint h;
    public final int i;

    public lp5(int i) {
        this.i = i;
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
