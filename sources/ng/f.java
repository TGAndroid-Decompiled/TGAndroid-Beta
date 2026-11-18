package ng;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public class f {
    public final mg.a f21499a;
    public final Paint f21500b;
    public final Paint f21501c;
    public final Paint d;
    public final Path f21502e;
    public final Path f21503f;
    public final Path f21504g;
    public ValueAnimator h;
    public ValueAnimator f21505i;
    public int f21506j;
    public final float[] f21507k;
    public final float[] f21508l;
    public int f21509m;
    public boolean f21510n;
    public float f21511o;
    public final i6 f21512p;

    public f(mg.a aVar, boolean z10, i6 i6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f21500b = paint;
        Paint paint2 = new Paint(1);
        this.f21501c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f21502e = new Path();
        this.f21503f = new Path();
        this.f21504g = new Path();
        this.f21510n = true;
        this.f21511o = 1.0f;
        this.f21512p = i6Var;
        this.f21499a = aVar;
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
        long[] jArr = aVar.f20974a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f21507k = new float[length];
        long[] jArr2 = aVar.f20974a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f21508l = new float[length2];
    }

    public void a() {
        int i7;
        mg.a aVar = this.f21499a;
        int i10 = aVar.f20979g;
        i6 i6Var = this.f21512p;
        if (i10 >= 0 && n6.f1(i10)) {
            this.f21509m = n6.w0(aVar.f20979g, i6Var);
        } else {
            if (i0.a.h(n6.w0(n6.f29394d6, i6Var)) < 0.5d) {
                i7 = aVar.f20980i;
            } else {
                i7 = aVar.h;
            }
            this.f21509m = i7;
        }
        this.f21501c.setColor(this.f21509m);
        this.f21500b.setColor(this.f21509m);
        this.d.setColor(this.f21509m);
    }
}
