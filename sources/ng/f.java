package ng;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public class f {
    public final mg.a f21595a;
    public final Paint f21596b;
    public final Paint f21597c;
    public final Paint d;
    public final Path f21598e;
    public final Path f21599f;
    public final Path f21600g;
    public ValueAnimator h;
    public ValueAnimator f21601i;
    public int f21602j;
    public final float[] f21603k;
    public final float[] f21604l;
    public int f21605m;
    public boolean f21606n;
    public float f21607o;
    public final i6 f21608p;

    public f(mg.a aVar, boolean z10, i6 i6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f21596b = paint;
        Paint paint2 = new Paint(1);
        this.f21597c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f21598e = new Path();
        this.f21599f = new Path();
        this.f21600g = new Path();
        this.f21606n = true;
        this.f21607o = 1.0f;
        this.f21608p = i6Var;
        this.f21595a = aVar;
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
        long[] jArr = aVar.f21067a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f21603k = new float[length];
        long[] jArr2 = aVar.f21067a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f21604l = new float[length2];
    }

    public void a() {
        int i7;
        mg.a aVar = this.f21595a;
        int i10 = aVar.f21072g;
        i6 i6Var = this.f21608p;
        if (i10 >= 0 && n6.f1(i10)) {
            this.f21605m = n6.w0(aVar.f21072g, i6Var);
        } else {
            if (i0.a.h(n6.w0(n6.f29451d6, i6Var)) < 0.5d) {
                i7 = aVar.f21073i;
            } else {
                i7 = aVar.h;
            }
            this.f21605m = i7;
        }
        this.f21597c.setColor(this.f21605m);
        this.f21596b.setColor(this.f21605m);
        this.d.setColor(this.f21605m);
    }
}
