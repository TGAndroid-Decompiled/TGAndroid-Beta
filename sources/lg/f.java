package lg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public class f {
    public final kg.a f16054a;
    public final Paint f16055b;
    public final Paint f16056c;
    public final Paint d;
    public final Path e;
    public final Path f16057f;
    public final Path f16058g;
    public ValueAnimator h;
    public ValueAnimator f16059i;
    public int f16060j;
    public final float[] f16061k;
    public final float[] f16062l;
    public int f16063m;
    public boolean f16064n;
    public float f16065o;
    public final d6 f16066p;

    public f(kg.a aVar, boolean z10, d6 d6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f16055b = paint;
        Paint paint2 = new Paint(1);
        this.f16056c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f16057f = new Path();
        this.f16058g = new Path();
        this.f16064n = true;
        this.f16065o = 1.0f;
        this.f16066p = d6Var;
        this.f16054a = aVar;
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
        long[] jArr = aVar.f15047a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f16061k = new float[length];
        long[] jArr2 = aVar.f15047a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f16062l = new float[length2];
    }

    public void a() {
        int i10;
        kg.a aVar = this.f16054a;
        int i11 = aVar.f15051g;
        d6 d6Var = this.f16066p;
        if (i11 >= 0 && h6.d1(i11)) {
            this.f16063m = h6.w0(aVar.f15051g, d6Var);
        } else {
            if (i0.a.h(h6.w0(h6.f20993d6, d6Var)) < 0.5d) {
                i10 = aVar.f15052i;
            } else {
                i10 = aVar.h;
            }
            this.f16063m = i10;
        }
        this.f16056c.setColor(this.f16063m);
        this.f16055b.setColor(this.f16063m);
        this.d.setColor(this.f16063m);
    }
}
