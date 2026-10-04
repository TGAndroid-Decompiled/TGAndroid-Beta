package kg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
public class f {
    public final jg.a f14793a;
    public final Paint f14794b;
    public final Paint f14795c;
    public final Paint d;
    public final Path f14796e;
    public final Path f14797f;
    public final Path f14798g;
    public ValueAnimator h;
    public ValueAnimator f14799i;
    public int f14800j;
    public final float[] f14801k;
    public final float[] f14802l;
    public int f14803m;
    public boolean f14804n;
    public float f14805o;
    public final d6 f14806p;

    public f(jg.a aVar, boolean z10, d6 d6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f14794b = paint;
        Paint paint2 = new Paint(1);
        this.f14795c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f14796e = new Path();
        this.f14797f = new Path();
        this.f14798g = new Path();
        this.f14804n = true;
        this.f14805o = 1.0f;
        this.f14806p = d6Var;
        this.f14793a = aVar;
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
        long[] jArr = aVar.f14114a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f14801k = new float[length];
        long[] jArr2 = aVar.f14114a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f14802l = new float[length2];
    }

    public void a() {
        int i10;
        jg.a aVar = this.f14793a;
        int i11 = aVar.f14119g;
        d6 d6Var = this.f14806p;
        if (i11 >= 0 && i6.c1(i11)) {
            this.f14803m = i6.v0(aVar.f14119g, d6Var);
        } else {
            if (i0.a.f(i6.v0(i6.f20818d6, d6Var)) < 0.5d) {
                i10 = aVar.f14120i;
            } else {
                i10 = aVar.h;
            }
            this.f14803m = i10;
        }
        this.f14795c.setColor(this.f14803m);
        this.f14794b.setColor(this.f14803m);
        this.d.setColor(this.f14803m);
    }
}
