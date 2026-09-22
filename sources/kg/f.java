package kg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class f {
    public final jg.a f13618a;
    public final Paint f13619b;
    public final Paint f13620c;
    public final Paint d;
    public final Path e;
    public final Path f13621f;
    public final Path f13622g;
    public ValueAnimator h;
    public ValueAnimator f13623i;
    public int f13624j;
    public final float[] f13625k;
    public final float[] f13626l;
    public int f13627m;
    public boolean f13628n;
    public float f13629o;
    public final f6 f13630p;

    public f(jg.a aVar, boolean z10, f6 f6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f13619b = paint;
        Paint paint2 = new Paint(1);
        this.f13620c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f13621f = new Path();
        this.f13622g = new Path();
        this.f13628n = true;
        this.f13629o = 1.0f;
        this.f13630p = f6Var;
        this.f13618a = aVar;
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
        long[] jArr = aVar.f12996a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f13625k = new float[length];
        long[] jArr2 = aVar.f12996a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f13626l = new float[length2];
    }

    public void a() {
        int i10;
        jg.a aVar = this.f13618a;
        int i11 = aVar.f13000g;
        f6 f6Var = this.f13630p;
        if (i11 >= 0 && j6.c1(i11)) {
            this.f13627m = j6.v0(aVar.f13000g, f6Var);
        } else {
            if (i0.a.f(j6.v0(j6.f19109d6, f6Var)) < 0.5d) {
                i10 = aVar.f13001i;
            } else {
                i10 = aVar.h;
            }
            this.f13627m = i10;
        }
        this.f13620c.setColor(this.f13627m);
        this.f13619b.setColor(this.f13627m);
        this.d.setColor(this.f13627m);
    }
}
