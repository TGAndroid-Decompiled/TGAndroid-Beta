package ng;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public class f {
    public final mg.a f21527a;
    public final Paint f21528b;
    public final Paint f21529c;
    public final Paint d;
    public final Path f21530e;
    public final Path f21531f;
    public final Path f21532g;
    public ValueAnimator h;
    public ValueAnimator f21533i;
    public int f21534j;
    public final float[] f21535k;
    public final float[] f21536l;
    public int f21537m;
    public boolean f21538n;
    public float f21539o;
    public final h6 f21540p;

    public f(mg.a aVar, boolean z10, h6 h6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f21528b = paint;
        Paint paint2 = new Paint(1);
        this.f21529c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f21530e = new Path();
        this.f21531f = new Path();
        this.f21532g = new Path();
        this.f21538n = true;
        this.f21539o = 1.0f;
        this.f21540p = h6Var;
        this.f21527a = aVar;
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
        long[] jArr = aVar.f21002a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f21535k = new float[length];
        long[] jArr2 = aVar.f21002a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f21536l = new float[length2];
    }

    public void a() {
        int i7;
        mg.a aVar = this.f21527a;
        int i10 = aVar.f21007g;
        h6 h6Var = this.f21540p;
        if (i10 >= 0 && m6.f1(i10)) {
            this.f21537m = m6.w0(aVar.f21007g, h6Var);
        } else {
            if (i0.a.h(m6.w0(m6.f29378d6, h6Var)) < 0.5d) {
                i7 = aVar.f21008i;
            } else {
                i7 = aVar.h;
            }
            this.f21537m = i7;
        }
        this.f21529c.setColor(this.f21537m);
        this.f21528b.setColor(this.f21537m);
        this.d.setColor(this.f21537m);
    }
}
