package kg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public class f {
    public final jg.a f14840a;
    public final Paint f14841b;
    public final Paint f14842c;
    public final Paint d;
    public final Path f14843e;
    public final Path f14844f;
    public final Path f14845g;
    public ValueAnimator h;
    public ValueAnimator f14846i;
    public int f14847j;
    public final float[] f14848k;
    public final float[] f14849l;
    public int f14850m;
    public boolean f14851n;
    public float f14852o;
    public final d6 f14853p;

    public f(jg.a aVar, boolean z10, d6 d6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f14841b = paint;
        Paint paint2 = new Paint(1);
        this.f14842c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f14843e = new Path();
        this.f14844f = new Path();
        this.f14845g = new Path();
        this.f14851n = true;
        this.f14852o = 1.0f;
        this.f14853p = d6Var;
        this.f14840a = aVar;
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
        long[] jArr = aVar.f14150a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f14848k = new float[length];
        long[] jArr2 = aVar.f14150a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f14849l = new float[length2];
    }

    public void a() {
        int i10;
        jg.a aVar = this.f14840a;
        int i11 = aVar.f14155g;
        d6 d6Var = this.f14853p;
        if (i11 >= 0 && h6.d1(i11)) {
            this.f14850m = h6.w0(aVar.f14155g, d6Var);
        } else {
            if (i0.a.f(h6.w0(h6.f20786d6, d6Var)) < 0.5d) {
                i10 = aVar.f14156i;
            } else {
                i10 = aVar.h;
            }
            this.f14850m = i10;
        }
        this.f14842c.setColor(this.f14850m);
        this.f14841b.setColor(this.f14850m);
        this.d.setColor(this.f14850m);
    }
}
