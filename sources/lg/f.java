package lg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public class f {
    public final kg.a f16053a;
    public final Paint f16054b;
    public final Paint f16055c;
    public final Paint d;
    public final Path e;
    public final Path f16056f;
    public final Path f16057g;
    public ValueAnimator h;
    public ValueAnimator f16058i;
    public int f16059j;
    public final float[] f16060k;
    public final float[] f16061l;
    public int f16062m;
    public boolean f16063n;
    public float f16064o;
    public final d6 f16065p;

    public f(kg.a aVar, boolean z10, d6 d6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f16054b = paint;
        Paint paint2 = new Paint(1);
        this.f16055c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f16056f = new Path();
        this.f16057g = new Path();
        this.f16063n = true;
        this.f16064o = 1.0f;
        this.f16065p = d6Var;
        this.f16053a = aVar;
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
        long[] jArr = aVar.f15046a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f16060k = new float[length];
        long[] jArr2 = aVar.f15046a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f16061l = new float[length2];
    }

    public void a() {
        int i10;
        kg.a aVar = this.f16053a;
        int i11 = aVar.f15050g;
        d6 d6Var = this.f16065p;
        if (i11 >= 0 && h6.d1(i11)) {
            this.f16062m = h6.w0(aVar.f15050g, d6Var);
        } else {
            if (i0.a.h(h6.w0(h6.f20990d6, d6Var)) < 0.5d) {
                i10 = aVar.f15051i;
            } else {
                i10 = aVar.h;
            }
            this.f16062m = i10;
        }
        this.f16055c.setColor(this.f16062m);
        this.f16054b.setColor(this.f16062m);
        this.d.setColor(this.f16062m);
    }
}
