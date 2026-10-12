package kg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public class f {
    public final jg.a f14838a;
    public final Paint f14839b;
    public final Paint f14840c;
    public final Paint d;
    public final Path f14841e;
    public final Path f14842f;
    public final Path f14843g;
    public ValueAnimator h;
    public ValueAnimator f14844i;
    public int f14845j;
    public final float[] f14846k;
    public final float[] f14847l;
    public int f14848m;
    public boolean f14849n;
    public float f14850o;
    public final c6 f14851p;

    public f(jg.a aVar, boolean z10, c6 c6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f14839b = paint;
        Paint paint2 = new Paint(1);
        this.f14840c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f14841e = new Path();
        this.f14842f = new Path();
        this.f14843g = new Path();
        this.f14849n = true;
        this.f14850o = 1.0f;
        this.f14851p = c6Var;
        this.f14838a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!ig.g.A1) {
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
        long[] jArr = aVar.f14148a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f14846k = new float[length];
        long[] jArr2 = aVar.f14148a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f14847l = new float[length2];
    }

    public void a() {
        int i10;
        jg.a aVar = this.f14838a;
        int i11 = aVar.f14153g;
        c6 c6Var = this.f14851p;
        if (i11 >= 0 && h6.d1(i11)) {
            this.f14848m = h6.w0(aVar.f14153g, c6Var);
        } else {
            if (i0.a.f(h6.w0(h6.f20560d6, c6Var)) < 0.5d) {
                i10 = aVar.f14154i;
            } else {
                i10 = aVar.h;
            }
            this.f14848m = i10;
        }
        this.f14840c.setColor(this.f14848m);
        this.f14839b.setColor(this.f14848m);
        this.d.setColor(this.f14848m);
    }
}
