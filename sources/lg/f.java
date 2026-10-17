package lg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public class f {
    public final kg.a f16047a;
    public final Paint f16048b;
    public final Paint f16049c;
    public final Paint d;
    public final Path e;
    public final Path f16050f;
    public final Path f16051g;
    public ValueAnimator h;
    public ValueAnimator f16052i;
    public int f16053j;
    public final float[] f16054k;
    public final float[] f16055l;
    public int f16056m;
    public boolean f16057n;
    public float f16058o;
    public final d6 f16059p;

    public f(kg.a aVar, boolean z10, d6 d6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f16048b = paint;
        Paint paint2 = new Paint(1);
        this.f16049c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f16050f = new Path();
        this.f16051g = new Path();
        this.f16057n = true;
        this.f16058o = 1.0f;
        this.f16059p = d6Var;
        this.f16047a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!jg.g.A1) {
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
        long[] jArr = aVar.f15040a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f16054k = new float[length];
        long[] jArr2 = aVar.f15040a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f16055l = new float[length2];
    }

    public void a() {
        int i10;
        kg.a aVar = this.f16047a;
        int i11 = aVar.f15044g;
        d6 d6Var = this.f16059p;
        if (i11 >= 0 && h6.d1(i11)) {
            this.f16056m = h6.w0(aVar.f15044g, d6Var);
        } else {
            if (i0.b.h(h6.w0(h6.f20986d6, d6Var)) < 0.5d) {
                i10 = aVar.f15045i;
            } else {
                i10 = aVar.h;
            }
            this.f16056m = i10;
        }
        this.f16049c.setColor(this.f16056m);
        this.f16048b.setColor(this.f16056m);
        this.d.setColor(this.f16056m);
    }
}
