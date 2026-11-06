package ng;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public class f {
    public final mg.a f20565a;
    public final Paint f20566b;
    public final Paint f20567c;
    public final Paint d;
    public final Path f20568e;
    public final Path f20569f;
    public final Path f20570g;
    public ValueAnimator h;
    public ValueAnimator f20571i;
    public int f20572j;
    public final float[] f20573k;
    public final float[] f20574l;
    public int f20575m;
    public boolean f20576n;
    public float f20577o;
    public final f6 f20578p;

    public f(mg.a aVar, boolean z9, f6 f6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f20566b = paint;
        Paint paint2 = new Paint(1);
        this.f20567c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f20568e = new Path();
        this.f20569f = new Path();
        this.f20570g = new Path();
        this.f20576n = true;
        this.f20577o = 1.0f;
        this.f20578p = f6Var;
        this.f20565a = aVar;
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
        long[] jArr = aVar.f20013a;
        if (z9) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f20573k = new float[length];
        long[] jArr2 = aVar.f20013a;
        if (z9) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f20574l = new float[length2];
    }

    public void a() {
        int i7;
        mg.a aVar = this.f20565a;
        int i10 = aVar.f20018g;
        f6 f6Var = this.f20578p;
        if (i10 >= 0 && k6.f1(i10)) {
            this.f20575m = k6.w0(aVar.f20018g, f6Var);
        } else {
            if (i0.a.h(k6.w0(k6.f27848d6, f6Var)) < 0.5d) {
                i7 = aVar.f20019i;
            } else {
                i7 = aVar.h;
            }
            this.f20575m = i7;
        }
        this.f20567c.setColor(this.f20575m);
        this.f20566b.setColor(this.f20575m);
        this.d.setColor(this.f20575m);
    }
}
