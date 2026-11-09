package ng;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
public class f {
    public final mg.a f20568a;
    public final Paint f20569b;
    public final Paint f20570c;
    public final Paint d;
    public final Path f20571e;
    public final Path f20572f;
    public final Path f20573g;
    public ValueAnimator h;
    public ValueAnimator f20574i;
    public int f20575j;
    public final float[] f20576k;
    public final float[] f20577l;
    public int f20578m;
    public boolean f20579n;
    public float f20580o;
    public final g6 f20581p;

    public f(mg.a aVar, boolean z9, g6 g6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f20569b = paint;
        Paint paint2 = new Paint(1);
        this.f20570c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f20571e = new Path();
        this.f20572f = new Path();
        this.f20573g = new Path();
        this.f20579n = true;
        this.f20580o = 1.0f;
        this.f20581p = g6Var;
        this.f20568a = aVar;
        paint2.setStrokeWidth(g0.N(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!lg.g.A1) {
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
        long[] jArr = aVar.f20016a;
        if (z9) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f20576k = new float[length];
        long[] jArr2 = aVar.f20016a;
        if (z9) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f20577l = new float[length2];
    }

    public void a() {
        int i7;
        mg.a aVar = this.f20568a;
        int i10 = aVar.f20021g;
        g6 g6Var = this.f20581p;
        if (i10 >= 0 && l6.f1(i10)) {
            this.f20578m = l6.w0(aVar.f20021g, g6Var);
        } else {
            if (i0.a.h(l6.w0(l6.f27865d6, g6Var)) < 0.5d) {
                i7 = aVar.f20022i;
            } else {
                i7 = aVar.h;
            }
            this.f20578m = i7;
        }
        this.f20570c.setColor(this.f20578m);
        this.f20569b.setColor(this.f20578m);
        this.d.setColor(this.f20578m);
    }
}
