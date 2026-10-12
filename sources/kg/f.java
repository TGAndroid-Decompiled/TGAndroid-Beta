package kg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public class f {
    public final jg.a f14837a;
    public final Paint f14838b;
    public final Paint f14839c;
    public final Paint d;
    public final Path f14840e;
    public final Path f14841f;
    public final Path f14842g;
    public ValueAnimator h;
    public ValueAnimator f14843i;
    public int f14844j;
    public final float[] f14845k;
    public final float[] f14846l;
    public int f14847m;
    public boolean f14848n;
    public float f14849o;
    public final c6 f14850p;

    public f(jg.a aVar, boolean z10, c6 c6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f14838b = paint;
        Paint paint2 = new Paint(1);
        this.f14839c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f14840e = new Path();
        this.f14841f = new Path();
        this.f14842g = new Path();
        this.f14848n = true;
        this.f14849o = 1.0f;
        this.f14850p = c6Var;
        this.f14837a = aVar;
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
        this.f14845k = new float[length];
        long[] jArr2 = aVar.f14148a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f14846l = new float[length2];
    }

    public void a() {
        int i10;
        jg.a aVar = this.f14837a;
        int i11 = aVar.f14153g;
        c6 c6Var = this.f14850p;
        if (i11 >= 0 && h6.d1(i11)) {
            this.f14847m = h6.w0(aVar.f14153g, c6Var);
        } else {
            if (i0.a.f(h6.w0(h6.f20559d6, c6Var)) < 0.5d) {
                i10 = aVar.f14154i;
            } else {
                i10 = aVar.h;
            }
            this.f14847m = i10;
        }
        this.f14839c.setColor(this.f14847m);
        this.f14838b.setColor(this.f14847m);
        this.d.setColor(this.f14847m);
    }
}
