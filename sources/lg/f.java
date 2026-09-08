package lg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class f {
    public final kg.a f15464a;
    public final Paint f15465b;
    public final Paint f15466c;
    public final Paint d;
    public final Path f15467e;
    public final Path f15468f;
    public final Path f15469g;
    public ValueAnimator h;
    public ValueAnimator f15470i;
    public int f15471j;
    public final float[] f15472k;
    public final float[] f15473l;
    public int f15474m;
    public boolean f15475n;
    public float f15476o;
    public final f6 f15477p;

    public f(kg.a aVar, boolean z10, f6 f6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f15465b = paint;
        Paint paint2 = new Paint(1);
        this.f15466c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f15467e = new Path();
        this.f15468f = new Path();
        this.f15469g = new Path();
        this.f15475n = true;
        this.f15476o = 1.0f;
        this.f15477p = f6Var;
        this.f15464a = aVar;
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
        long[] jArr = aVar.f14944a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f15472k = new float[length];
        long[] jArr2 = aVar.f14944a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f15473l = new float[length2];
    }

    public void a() {
        int i10;
        kg.a aVar = this.f15464a;
        int i11 = aVar.f14949g;
        f6 f6Var = this.f15477p;
        if (i11 >= 0 && j6.c1(i11)) {
            this.f15474m = j6.v0(aVar.f14949g, f6Var);
        } else {
            if (i0.a.f(j6.v0(j6.f20690d6, f6Var)) < 0.5d) {
                i10 = aVar.f14950i;
            } else {
                i10 = aVar.h;
            }
            this.f15474m = i10;
        }
        this.f15466c.setColor(this.f15474m);
        this.f15465b.setColor(this.f15474m);
        this.d.setColor(this.f15474m);
    }
}
