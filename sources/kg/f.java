package kg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public class f {
    public final jg.a f13608a;
    public final Paint f13609b;
    public final Paint f13610c;
    public final Paint d;
    public final Path e;
    public final Path f13611f;
    public final Path f13612g;
    public ValueAnimator h;
    public ValueAnimator f13613i;
    public int f13614j;
    public final float[] f13615k;
    public final float[] f13616l;
    public int f13617m;
    public boolean f13618n;
    public float f13619o;
    public final d6 f13620p;

    public f(jg.a aVar, boolean z10, d6 d6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f13609b = paint;
        Paint paint2 = new Paint(1);
        this.f13610c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f13611f = new Path();
        this.f13612g = new Path();
        this.f13618n = true;
        this.f13619o = 1.0f;
        this.f13620p = d6Var;
        this.f13608a = aVar;
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
        long[] jArr = aVar.f12984a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f13615k = new float[length];
        long[] jArr2 = aVar.f12984a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f13616l = new float[length2];
    }

    public void a() {
        int i10;
        jg.a aVar = this.f13608a;
        int i11 = aVar.f12988g;
        d6 d6Var = this.f13620p;
        if (i11 >= 0 && h6.c1(i11)) {
            this.f13617m = h6.v0(aVar.f12988g, d6Var);
        } else {
            if (i0.a.f(h6.v0(h6.f18789d6, d6Var)) < 0.5d) {
                i10 = aVar.f12989i;
            } else {
                i10 = aVar.h;
            }
            this.f13617m = i10;
        }
        this.f13610c.setColor(this.f13617m);
        this.f13609b.setColor(this.f13617m);
        this.d.setColor(this.f13617m);
    }
}
