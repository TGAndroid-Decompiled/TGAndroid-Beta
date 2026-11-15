package ng;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public class f {
    public final mg.a f21138a;
    public final Paint f21139b;
    public final Paint f21140c;
    public final Paint d;
    public final Path f21141e;
    public final Path f21142f;
    public final Path f21143g;
    public ValueAnimator h;
    public ValueAnimator f21144i;
    public int f21145j;
    public final float[] f21146k;
    public final float[] f21147l;
    public int f21148m;
    public boolean f21149n;
    public float f21150o;
    public final e6 f21151p;

    public f(mg.a aVar, boolean z10, e6 e6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f21139b = paint;
        Paint paint2 = new Paint(1);
        this.f21140c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f21141e = new Path();
        this.f21142f = new Path();
        this.f21143g = new Path();
        this.f21149n = true;
        this.f21150o = 1.0f;
        this.f21151p = e6Var;
        this.f21138a = aVar;
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
        long[] jArr = aVar.f20613a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f21146k = new float[length];
        long[] jArr2 = aVar.f20613a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f21147l = new float[length2];
    }

    public void a() {
        int i7;
        mg.a aVar = this.f21138a;
        int i10 = aVar.f20618g;
        e6 e6Var = this.f21151p;
        if (i10 >= 0 && j6.f1(i10)) {
            this.f21148m = j6.w0(aVar.f20618g, e6Var);
        } else {
            if (i0.a.h(j6.w0(j6.f28849d6, e6Var)) < 0.5d) {
                i7 = aVar.f20619i;
            } else {
                i7 = aVar.h;
            }
            this.f21148m = i7;
        }
        this.f21140c.setColor(this.f21148m);
        this.f21139b.setColor(this.f21148m);
        this.d.setColor(this.f21148m);
    }
}
