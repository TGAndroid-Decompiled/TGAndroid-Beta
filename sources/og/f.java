package og;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
public class f {
    public final ng.a f21085a;
    public final Paint f21086b;
    public final Paint f21087c;
    public final Paint d;
    public final Path f21088e;
    public final Path f21089f;
    public final Path f21090g;
    public ValueAnimator h;
    public ValueAnimator f21091i;
    public int f21092j;
    public final float[] f21093k;
    public final float[] f21094l;
    public int f21095m;
    public boolean f21096n;
    public float f21097o;
    public final e6 f21098p;

    public f(ng.a aVar, boolean z10, e6 e6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f21086b = paint;
        Paint paint2 = new Paint(1);
        this.f21087c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f21088e = new Path();
        this.f21089f = new Path();
        this.f21090g = new Path();
        this.f21096n = true;
        this.f21097o = 1.0f;
        this.f21098p = e6Var;
        this.f21085a = aVar;
        paint2.setStrokeWidth(g0.N(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!mg.g.B1) {
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
        long[] jArr = aVar.f20366a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f21093k = new float[length];
        long[] jArr2 = aVar.f20366a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f21094l = new float[length2];
    }

    public void a() {
        int i3;
        ng.a aVar = this.f21085a;
        int i10 = aVar.f20371g;
        e6 e6Var = this.f21098p;
        if (i10 >= 0 && k6.f1(i10)) {
            this.f21095m = k6.w0(aVar.f20371g, e6Var);
        } else {
            if (i0.a.h(k6.w0(k6.f27878d6, e6Var)) < 0.5d) {
                i3 = aVar.f20372i;
            } else {
                i3 = aVar.h;
            }
            this.f21095m = i3;
        }
        this.f21087c.setColor(this.f21095m);
        this.f21086b.setColor(this.f21095m);
        this.d.setColor(this.f21095m);
    }
}
