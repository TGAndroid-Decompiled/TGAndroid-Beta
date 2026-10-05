package kg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
public class f {
    public final jg.a f14794a;
    public final Paint f14795b;
    public final Paint f14796c;
    public final Paint d;
    public final Path f14797e;
    public final Path f14798f;
    public final Path f14799g;
    public ValueAnimator h;
    public ValueAnimator f14800i;
    public int f14801j;
    public final float[] f14802k;
    public final float[] f14803l;
    public int f14804m;
    public boolean f14805n;
    public float f14806o;
    public final d6 f14807p;

    public f(jg.a aVar, boolean z10, d6 d6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f14795b = paint;
        Paint paint2 = new Paint(1);
        this.f14796c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f14797e = new Path();
        this.f14798f = new Path();
        this.f14799g = new Path();
        this.f14805n = true;
        this.f14806o = 1.0f;
        this.f14807p = d6Var;
        this.f14794a = aVar;
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
        long[] jArr = aVar.f14115a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f14802k = new float[length];
        long[] jArr2 = aVar.f14115a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f14803l = new float[length2];
    }

    public void a() {
        int i10;
        jg.a aVar = this.f14794a;
        int i11 = aVar.f14120g;
        d6 d6Var = this.f14807p;
        if (i11 >= 0 && i6.c1(i11)) {
            this.f14804m = i6.v0(aVar.f14120g, d6Var);
        } else {
            if (i0.a.f(i6.v0(i6.f20827d6, d6Var)) < 0.5d) {
                i10 = aVar.f14121i;
            } else {
                i10 = aVar.h;
            }
            this.f14804m = i10;
        }
        this.f14796c.setColor(this.f14804m);
        this.f14795b.setColor(this.f14804m);
        this.d.setColor(this.f14804m);
    }
}
