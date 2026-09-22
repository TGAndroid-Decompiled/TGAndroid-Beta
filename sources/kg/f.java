package kg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public class f {
    public final jg.a f13620a;
    public final Paint f13621b;
    public final Paint f13622c;
    public final Paint d;
    public final Path e;
    public final Path f13623f;
    public final Path f13624g;
    public ValueAnimator h;
    public ValueAnimator f13625i;
    public int f13626j;
    public final float[] f13627k;
    public final float[] f13628l;
    public int f13629m;
    public boolean f13630n;
    public float f13631o;
    public final e6 f13632p;

    public f(jg.a aVar, boolean z10, e6 e6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f13621b = paint;
        Paint paint2 = new Paint(1);
        this.f13622c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f13623f = new Path();
        this.f13624g = new Path();
        this.f13630n = true;
        this.f13631o = 1.0f;
        this.f13632p = e6Var;
        this.f13620a = aVar;
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
        long[] jArr = aVar.f12994a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f13627k = new float[length];
        long[] jArr2 = aVar.f12994a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f13628l = new float[length2];
    }

    public void a() {
        int i10;
        jg.a aVar = this.f13620a;
        int i11 = aVar.f12998g;
        e6 e6Var = this.f13632p;
        if (i11 >= 0 && i6.c1(i11)) {
            this.f13629m = i6.v0(aVar.f12998g, e6Var);
        } else {
            if (i0.a.f(i6.v0(i6.f18834d6, e6Var)) < 0.5d) {
                i10 = aVar.f12999i;
            } else {
                i10 = aVar.h;
            }
            this.f13629m = i10;
        }
        this.f13622c.setColor(this.f13629m);
        this.f13621b.setColor(this.f13629m);
        this.d.setColor(this.f13629m);
    }
}
