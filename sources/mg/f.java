package mg;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public class f {
    public final lg.a f18464a;
    public final Paint f18465b;
    public final Paint f18466c;
    public final Paint d;
    public final Path e;
    public final Path f18467f;
    public final Path f18468g;
    public ValueAnimator h;
    public ValueAnimator f18469i;
    public int f18470j;
    public final float[] f18471k;
    public final float[] f18472l;
    public int f18473m;
    public boolean f18474n;
    public float f18475o;
    public final u6 f18476p;

    public f(lg.a aVar, boolean z10, u6 u6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f18465b = paint;
        Paint paint2 = new Paint(1);
        this.f18466c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f18467f = new Path();
        this.f18468g = new Path();
        this.f18474n = true;
        this.f18475o = 1.0f;
        this.f18476p = u6Var;
        this.f18464a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!kg.h.A1) {
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
        long[] jArr = aVar.f17004a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f18471k = new float[length];
        long[] jArr2 = aVar.f17004a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f18472l = new float[length2];
    }

    public void a() {
        int i10;
        lg.a aVar = this.f18464a;
        int i11 = aVar.f17008g;
        u6 u6Var = this.f18476p;
        if (i11 >= 0 && y6.e1(i11)) {
            this.f18473m = y6.w0(aVar.f17008g, u6Var);
        } else {
            if (i0.a.h(y6.w0(y6.f23357d6, u6Var)) < 0.5d) {
                i10 = aVar.f17009i;
            } else {
                i10 = aVar.h;
            }
            this.f18473m = i10;
        }
        this.f18466c.setColor(this.f18473m);
        this.f18465b.setColor(this.f18473m);
        this.d.setColor(this.f18473m);
    }
}
