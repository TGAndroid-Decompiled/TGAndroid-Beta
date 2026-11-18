package ng;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public class f {
    public final mg.a f21502a;
    public final Paint f21503b;
    public final Paint f21504c;
    public final Paint d;
    public final Path f21505e;
    public final Path f21506f;
    public final Path f21507g;
    public ValueAnimator h;
    public ValueAnimator f21508i;
    public int f21509j;
    public final float[] f21510k;
    public final float[] f21511l;
    public int f21512m;
    public boolean f21513n;
    public float f21514o;
    public final i6 f21515p;

    public f(mg.a aVar, boolean z10, i6 i6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f21503b = paint;
        Paint paint2 = new Paint(1);
        this.f21504c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f21505e = new Path();
        this.f21506f = new Path();
        this.f21507g = new Path();
        this.f21513n = true;
        this.f21514o = 1.0f;
        this.f21515p = i6Var;
        this.f21502a = aVar;
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
        long[] jArr = aVar.f20977a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f21510k = new float[length];
        long[] jArr2 = aVar.f20977a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f21511l = new float[length2];
    }

    public void a() {
        int i7;
        mg.a aVar = this.f21502a;
        int i10 = aVar.f20982g;
        i6 i6Var = this.f21515p;
        if (i10 >= 0 && n6.f1(i10)) {
            this.f21512m = n6.w0(aVar.f20982g, i6Var);
        } else {
            if (i0.a.h(n6.w0(n6.f29396d6, i6Var)) < 0.5d) {
                i7 = aVar.f20983i;
            } else {
                i7 = aVar.h;
            }
            this.f21512m = i7;
        }
        this.f21504c.setColor(this.f21512m);
        this.f21503b.setColor(this.f21512m);
        this.d.setColor(this.f21512m);
    }
}
