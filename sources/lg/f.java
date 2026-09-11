package lg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class f {
    public final kg.a f15437a;
    public final Paint f15438b;
    public final Paint f15439c;
    public final Paint d;
    public final Path f15440e;
    public final Path f15441f;
    public final Path f15442g;
    public ValueAnimator h;
    public ValueAnimator f15443i;
    public int f15444j;
    public final float[] f15445k;
    public final float[] f15446l;
    public int f15447m;
    public boolean f15448n;
    public float f15449o;
    public final f6 f15450p;

    public f(kg.a aVar, boolean z10, f6 f6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f15438b = paint;
        Paint paint2 = new Paint(1);
        this.f15439c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f15440e = new Path();
        this.f15441f = new Path();
        this.f15442g = new Path();
        this.f15448n = true;
        this.f15449o = 1.0f;
        this.f15450p = f6Var;
        this.f15437a = aVar;
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
        long[] jArr = aVar.f14918a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f15445k = new float[length];
        long[] jArr2 = aVar.f14918a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f15446l = new float[length2];
    }

    public void a() {
        int i10;
        kg.a aVar = this.f15437a;
        int i11 = aVar.f14923g;
        f6 f6Var = this.f15450p;
        if (i11 >= 0 && j6.c1(i11)) {
            this.f15447m = j6.v0(aVar.f14923g, f6Var);
        } else {
            if (i0.a.f(j6.v0(j6.f20663d6, f6Var)) < 0.5d) {
                i10 = aVar.f14924i;
            } else {
                i10 = aVar.h;
            }
            this.f15447m = i10;
        }
        this.f15439c.setColor(this.f15447m);
        this.f15438b.setColor(this.f15447m);
        this.d.setColor(this.f15447m);
    }
}
