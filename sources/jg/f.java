package jg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class f {
    public final ig.a f11914a;
    public final Paint f11915b;
    public final Paint f11916c;
    public final Paint d;
    public final Path e;
    public final Path f11917f;
    public final Path f11918g;
    public ValueAnimator h;
    public ValueAnimator f11919i;
    public int f11920j;
    public final float[] f11921k;
    public final float[] f11922l;
    public int f11923m;
    public boolean f11924n;
    public float f11925o;
    public final f6 f11926p;

    public f(ig.a aVar, boolean z10, f6 f6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f11915b = paint;
        Paint paint2 = new Paint(1);
        this.f11916c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f11917f = new Path();
        this.f11918g = new Path();
        this.f11924n = true;
        this.f11925o = 1.0f;
        this.f11926p = f6Var;
        this.f11914a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!hg.g.A1) {
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
        long[] jArr = aVar.f10584a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f11921k = new float[length];
        long[] jArr2 = aVar.f10584a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f11922l = new float[length2];
    }

    public void a() {
        int i10;
        ig.a aVar = this.f11914a;
        int i11 = aVar.f10588g;
        f6 f6Var = this.f11926p;
        if (i11 >= 0 && j6.c1(i11)) {
            this.f11923m = j6.v0(aVar.f10588g, f6Var);
        } else {
            if (i0.a.f(j6.v0(j6.f17928d6, f6Var)) < 0.5d) {
                i10 = aVar.f10589i;
            } else {
                i10 = aVar.h;
            }
            this.f11923m = i10;
        }
        this.f11916c.setColor(this.f11923m);
        this.f11915b.setColor(this.f11923m);
        this.d.setColor(this.f11923m);
    }
}
