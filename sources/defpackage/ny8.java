package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
public final class ny8 {
    public boolean a;
    public final Object b;
    public Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public ny8(gl2 gl2Var) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(hl.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, hl.L(3.0f), hl.L(6.0f));
        this.j = new Path();
        this.b = gl2Var;
        k43 k43Var = k43.g;
        this.d = new mm(0.0f, gl2Var, 0L, 320L, k43Var);
        this.e = new mm(0.0f, gl2Var, 0L, 160L, k43Var);
        this.f = new mm(0.0f, gl2Var, 0L, 160L, k43Var);
        this.g = new mm[]{new mm(0.0f, gl2Var, 0L, 160L, k43Var), new mm(0.0f, gl2Var, 0L, 160L, k43Var), new mm(0.0f, gl2Var, 0L, 160L, k43Var), new mm(0.0f, gl2Var, 0L, 160L, k43Var)};
        this.h = new mm[]{new mm(0.0f, gl2Var, 0L, 160L, k43Var), new mm(0.0f, gl2Var, 0L, 160L, k43Var), new mm(0.0f, gl2Var, 0L, 160L, k43Var), new mm(0.0f, gl2Var, 0L, 160L, k43Var)};
    }

    public static ja6 a(jy7 jy7Var, long j, long j2) {
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        return new ja6(ia6Var);
    }

    public final void b() {
        yve.p(this.a);
        Uri uri = (Uri) this.e;
        uri.getClass();
        Uri.Builder buildUpon = uri.buildUpon();
        v34 v34Var = (v34) this.f;
        v34Var.getClass();
        ug5 ug5Var = (ug5) v34Var.b;
        yve.p(ug5Var.k);
        String str = ug5Var.l;
        String valueOf = String.valueOf(ug5Var.c.b());
        awd.a("_HLS_pathway", str);
        awd.a("_HLS_throughput", valueOf);
        for (Map.Entry entry : new TreeMap(o99.g(2, new Object[]{"_HLS_pathway", str, "_HLS_throughput", valueOf}, null)).entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        Map map = Collections.EMPTY_MAP;
        Uri build = buildUpon.build();
        build.getClass();
        jy7 jy7Var = new jy7(((e05) this.b).createDataSource(), new n73(build, 1, null, map, 0L, -1L, null, 0), 8, new z6f((byte) 26));
        rx6 rx6Var = (rx6) this.j;
        rx6Var.getClass();
        rx6Var.w0(jy7Var, (l09) this.c, 0);
    }

    public final void c(my8 my8Var) {
        boolean z = false;
        if (my8Var != null) {
            this.c = my8Var;
            float f = my8Var.d;
            float f2 = my8Var.c;
            PointF[] pointFArr = my8Var.b;
            if (!this.a) {
                ((mm) this.e).e(true, f2);
                ((mm) this.f).e(true, f);
                for (int i = 0; i < Math.min(4, pointFArr.length); i++) {
                    ((mm[]) this.g)[i].e(true, pointFArr[i].x - f2);
                    ((mm[]) this.h)[i].e(true, pointFArr[i].y - f);
                }
            }
        }
        if (my8Var != null) {
            z = true;
        }
        this.a = z;
        ((gl2) this.b).run();
    }

    public ny8(e05 e05Var) {
        this.b = e05Var;
        this.c = new l09(this, (byte) 13);
        this.d = new xgb(new Handler(gcc.z(), null));
    }
}
