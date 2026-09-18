package kg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public class f {
    public final jg.a f13619a;
    public final Paint f13620b;
    public final Paint f13621c;
    public final Paint d;
    public final Path e;
    public final Path f13622f;
    public final Path f13623g;
    public ValueAnimator h;
    public ValueAnimator f13624i;
    public int f13625j;
    public final float[] f13626k;
    public final float[] f13627l;
    public int f13628m;
    public boolean f13629n;
    public float f13630o;
    public final e6 f13631p;

    public f(jg.a aVar, boolean z10, e6 e6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f13620b = paint;
        Paint paint2 = new Paint(1);
        this.f13621c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f13622f = new Path();
        this.f13623g = new Path();
        this.f13629n = true;
        this.f13630o = 1.0f;
        this.f13631p = e6Var;
        this.f13619a = aVar;
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
        this.f13626k = new float[length];
        long[] jArr2 = aVar.f12995a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f13627l = new float[length2];
    }

    public void a() {
        int i10;
        jg.a aVar = this.f13619a;
        int i11 = aVar.f12999g;
        e6 e6Var = this.f13631p;
        if (i11 >= 0 && j6.c1(i11)) {
            this.f13628m = j6.v0(aVar.f12999g, e6Var);
        } else {
            if (i0.a.f(j6.v0(j6.f19062d6, e6Var)) < 0.5d) {
                i10 = aVar.f13000i;
            } else {
                i10 = aVar.h;
            }
            this.f13628m = i10;
        }
        this.f13621c.setColor(this.f13628m);
        this.f13620b.setColor(this.f13628m);
        this.d.setColor(this.f13628m);
    }
}
