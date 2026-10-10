package kg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public class f {
    public final jg.a f14841a;
    public final Paint f14842b;
    public final Paint f14843c;
    public final Paint d;
    public final Path f14844e;
    public final Path f14845f;
    public final Path f14846g;
    public ValueAnimator h;
    public ValueAnimator f14847i;
    public int f14848j;
    public final float[] f14849k;
    public final float[] f14850l;
    public int f14851m;
    public boolean f14852n;
    public float f14853o;
    public final e6 f14854p;

    public f(jg.a aVar, boolean z10, e6 e6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f14842b = paint;
        Paint paint2 = new Paint(1);
        this.f14843c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f14844e = new Path();
        this.f14845f = new Path();
        this.f14846g = new Path();
        this.f14852n = true;
        this.f14853o = 1.0f;
        this.f14854p = e6Var;
        this.f14841a = aVar;
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
        long[] jArr = aVar.f14151a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f14849k = new float[length];
        long[] jArr2 = aVar.f14151a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f14850l = new float[length2];
    }

    public void a() {
        int i10;
        jg.a aVar = this.f14841a;
        int i11 = aVar.f14156g;
        e6 e6Var = this.f14854p;
        if (i11 >= 0 && i6.d1(i11)) {
            this.f14851m = i6.w0(aVar.f14156g, e6Var);
        } else {
            if (i0.a.f(i6.w0(i6.f20801d6, e6Var)) < 0.5d) {
                i10 = aVar.f14157i;
            } else {
                i10 = aVar.h;
            }
            this.f14851m = i10;
        }
        this.f14843c.setColor(this.f14851m);
        this.f14842b.setColor(this.f14851m);
        this.d.setColor(this.f14851m);
    }
}
