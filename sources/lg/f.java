package lg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public class f {
    public final kg.a f16116a;
    public final Paint f16117b;
    public final Paint f16118c;
    public final Paint d;
    public final Path e;
    public final Path f16119f;
    public final Path f16120g;
    public ValueAnimator h;
    public ValueAnimator f16121i;
    public int f16122j;
    public final float[] f16123k;
    public final float[] f16124l;
    public int f16125m;
    public boolean f16126n;
    public float f16127o;
    public final g6 f16128p;

    public f(kg.a aVar, boolean z10, g6 g6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f16117b = paint;
        Paint paint2 = new Paint(1);
        this.f16118c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f16119f = new Path();
        this.f16120g = new Path();
        this.f16126n = true;
        this.f16127o = 1.0f;
        this.f16128p = g6Var;
        this.f16116a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!jg.g.A1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(aVar.h);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        paint.setStyle(style);
        paint.setColor(aVar.h);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(10.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(aVar.h);
        long[] jArr = aVar.f15092a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f16123k = new float[length];
        long[] jArr2 = aVar.f15092a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f16124l = new float[length2];
    }

    public void a() {
        int i10;
        kg.a aVar = this.f16116a;
        int i11 = aVar.f15096g;
        g6 g6Var = this.f16128p;
        if (i11 >= 0 && k6.e1(i11)) {
            this.f16125m = k6.w0(aVar.f15096g, g6Var);
        } else {
            if (i0.a.h(k6.w0(k6.f21183d6, g6Var)) < 0.5d) {
                i10 = aVar.f15097i;
            } else {
                i10 = aVar.h;
            }
            this.f16125m = i10;
        }
        this.f16118c.setColor(this.f16125m);
        this.f16117b.setColor(this.f16125m);
        this.d.setColor(this.f16125m);
    }
}
