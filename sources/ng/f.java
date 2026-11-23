package ng;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public class f {
    public final mg.a f21496a;
    public final Paint f21497b;
    public final Paint f21498c;
    public final Paint d;
    public final Path f21499e;
    public final Path f21500f;
    public final Path f21501g;
    public ValueAnimator h;
    public ValueAnimator f21502i;
    public int f21503j;
    public final float[] f21504k;
    public final float[] f21505l;
    public int f21506m;
    public boolean f21507n;
    public float f21508o;
    public final h6 f21509p;

    public f(mg.a aVar, boolean z10, h6 h6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f21497b = paint;
        Paint paint2 = new Paint(1);
        this.f21498c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f21499e = new Path();
        this.f21500f = new Path();
        this.f21501g = new Path();
        this.f21507n = true;
        this.f21508o = 1.0f;
        this.f21509p = h6Var;
        this.f21496a = aVar;
        paint2.setStrokeWidth(g0.N(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!lg.g.B1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(aVar.h);
        paint.setStrokeWidth(g0.N(1.0f));
        paint.setStyle(style);
        paint.setColor(aVar.h);
        paint3.setStrokeWidth(g0.N(10.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(aVar.h);
        long[] jArr = aVar.f20971a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f21504k = new float[length];
        long[] jArr2 = aVar.f20971a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f21505l = new float[length2];
    }

    public void a() {
        int i7;
        mg.a aVar = this.f21496a;
        int i10 = aVar.f20976g;
        h6 h6Var = this.f21509p;
        if (i10 >= 0 && m6.f1(i10)) {
            this.f21506m = m6.w0(aVar.f20976g, h6Var);
        } else {
            if (i0.a.h(m6.w0(m6.f29347d6, h6Var)) < 0.5d) {
                i7 = aVar.f20977i;
            } else {
                i7 = aVar.h;
            }
            this.f21506m = i7;
        }
        this.f21498c.setColor(this.f21506m);
        this.f21497b.setColor(this.f21506m);
        this.d.setColor(this.f21506m);
    }
}
