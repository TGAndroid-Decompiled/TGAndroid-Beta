package ng;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public class f {
    public final mg.a f20573a;
    public final Paint f20574b;
    public final Paint f20575c;
    public final Paint d;
    public final Path f20576e;
    public final Path f20577f;
    public final Path f20578g;
    public ValueAnimator h;
    public ValueAnimator f20579i;
    public int f20580j;
    public final float[] f20581k;
    public final float[] f20582l;
    public int f20583m;
    public boolean f20584n;
    public float f20585o;
    public final h6 f20586p;

    public f(mg.a aVar, boolean z9, h6 h6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f20574b = paint;
        Paint paint2 = new Paint(1);
        this.f20575c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f20576e = new Path();
        this.f20577f = new Path();
        this.f20578g = new Path();
        this.f20584n = true;
        this.f20585o = 1.0f;
        this.f20586p = h6Var;
        this.f20573a = aVar;
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
        long[] jArr = aVar.f20021a;
        if (z9) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f20581k = new float[length];
        long[] jArr2 = aVar.f20021a;
        if (z9) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f20582l = new float[length2];
    }

    public void a() {
        int i7;
        mg.a aVar = this.f20573a;
        int i10 = aVar.f20026g;
        h6 h6Var = this.f20586p;
        if (i10 >= 0 && m6.f1(i10)) {
            this.f20583m = m6.w0(aVar.f20026g, h6Var);
        } else {
            if (i0.a.h(m6.w0(m6.f27890d6, h6Var)) < 0.5d) {
                i7 = aVar.f20027i;
            } else {
                i7 = aVar.h;
            }
            this.f20583m = i7;
        }
        this.f20575c.setColor(this.f20583m);
        this.f20574b.setColor(this.f20583m);
        this.d.setColor(this.f20583m);
    }
}
