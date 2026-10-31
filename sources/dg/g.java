package dg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public class g {
    public final cg.a f5909a;
    public final Paint f5910b;
    public final Paint f5911c;
    public final Paint d;
    public final Path e;
    public final Path f5912f;
    public final Path f5913g;
    public ValueAnimator h;
    public ValueAnimator f5914i;
    public int f5915j;
    public final float[] f5916k;
    public final float[] f5917l;
    public int f5918m;
    public boolean f5919n;
    public float f5920o;
    public final p6 f5921p;

    public g(cg.a aVar, boolean z10, p6 p6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f5910b = paint;
        Paint paint2 = new Paint(1);
        this.f5911c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f5912f = new Path();
        this.f5913g = new Path();
        this.f5919n = true;
        this.f5920o = 1.0f;
        this.f5921p = p6Var;
        this.f5909a = aVar;
        paint2.setStrokeWidth(i0.N(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!bg.i.A1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(aVar.h);
        paint.setStrokeWidth(i0.N(1.0f));
        paint.setStyle(style);
        paint.setColor(aVar.h);
        paint3.setStrokeWidth(i0.N(10.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(aVar.h);
        long[] jArr = aVar.f4158a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f5916k = new float[length];
        long[] jArr2 = aVar.f4158a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f5917l = new float[length2];
    }

    public void a() {
        int i10;
        cg.a aVar = this.f5909a;
        int i11 = aVar.f4162g;
        p6 p6Var = this.f5921p;
        if (i11 >= 0 && t6.f1(i11)) {
            this.f5918m = t6.w0(aVar.f4162g, p6Var);
        } else {
            if (i0.b.h(t6.w0(t6.f20929d6, p6Var)) < 0.5d) {
                i10 = aVar.f4163i;
            } else {
                i10 = aVar.h;
            }
            this.f5918m = i10;
        }
        this.f5911c.setColor(this.f5918m);
        this.f5910b.setColor(this.f5918m);
        this.d.setColor(this.f5918m);
    }
}
