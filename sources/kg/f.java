package kg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class f {
    public final jg.a f13621a;
    public final Paint f13622b;
    public final Paint f13623c;
    public final Paint d;
    public final Path e;
    public final Path f13624f;
    public final Path f13625g;
    public ValueAnimator h;
    public ValueAnimator f13626i;
    public int f13627j;
    public final float[] f13628k;
    public final float[] f13629l;
    public int f13630m;
    public boolean f13631n;
    public float f13632o;
    public final f6 f13633p;

    public f(jg.a aVar, boolean z10, f6 f6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f13622b = paint;
        Paint paint2 = new Paint(1);
        this.f13623c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f13624f = new Path();
        this.f13625g = new Path();
        this.f13631n = true;
        this.f13632o = 1.0f;
        this.f13633p = f6Var;
        this.f13621a = aVar;
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
        long[] jArr = aVar.f12995a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f13628k = new float[length];
        long[] jArr2 = aVar.f12995a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f13629l = new float[length2];
    }

    public void a() {
        int i10;
        jg.a aVar = this.f13621a;
        int i11 = aVar.f12999g;
        f6 f6Var = this.f13633p;
        if (i11 >= 0 && j6.c1(i11)) {
            this.f13630m = j6.v0(aVar.f12999g, f6Var);
        } else {
            if (i0.a.f(j6.v0(j6.f18863d6, f6Var)) < 0.5d) {
                i10 = aVar.f13000i;
            } else {
                i10 = aVar.h;
            }
            this.f13630m = i10;
        }
        this.f13623c.setColor(this.f13630m);
        this.f13622b.setColor(this.f13630m);
        this.d.setColor(this.f13630m);
    }
}
