package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
public final class dx8 {
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

    public dx8(yl2 yl2Var) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(gm.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, gm.L(3.0f), gm.L(6.0f));
        this.j = new Path();
        this.b = yl2Var;
        d53 d53Var = d53.g;
        this.d = new ln(0.0f, yl2Var, 0L, 320L, d53Var);
        this.e = new ln(0.0f, yl2Var, 0L, 160L, d53Var);
        this.f = new ln(0.0f, yl2Var, 0L, 160L, d53Var);
        this.g = new ln[]{new ln(0.0f, yl2Var, 0L, 160L, d53Var), new ln(0.0f, yl2Var, 0L, 160L, d53Var), new ln(0.0f, yl2Var, 0L, 160L, d53Var), new ln(0.0f, yl2Var, 0L, 160L, d53Var)};
        this.h = new ln[]{new ln(0.0f, yl2Var, 0L, 160L, d53Var), new ln(0.0f, yl2Var, 0L, 160L, d53Var), new ln(0.0f, yl2Var, 0L, 160L, d53Var), new ln(0.0f, yl2Var, 0L, 160L, d53Var)};
    }

    public static ea6 a(dx7 dx7Var, long j, long j2) {
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        return new ea6(da6Var);
    }

    public final void b() {
        jte.p(this.a);
        Uri uri = (Uri) this.e;
        uri.getClass();
        Uri.Builder buildUpon = uri.buildUpon();
        k44 k44Var = (k44) this.f;
        k44Var.getClass();
        rg5 rg5Var = (rg5) k44Var.b;
        jte.p(rg5Var.k);
        String str = rg5Var.l;
        String valueOf = String.valueOf(rg5Var.c.b());
        ntd.a("_HLS_pathway", str);
        ntd.a("_HLS_throughput", valueOf);
        for (Map.Entry entry : new TreeMap(d89.g(2, new Object[]{"_HLS_pathway", str, "_HLS_throughput", valueOf}, null)).entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        Map map = Collections.EMPTY_MAP;
        Uri build = buildUpon.build();
        build.getClass();
        dx7 dx7Var = new dx7(((wx4) this.b).createDataSource(), new g83(build, 1, null, map, 0L, -1L, null, 0), 8, new k4f((byte) 26));
        mx6 mx6Var = (mx6) this.j;
        mx6Var.getClass();
        mx6Var.v0(dx7Var, (oo8) this.c, 0);
    }

    public final void c(cx8 cx8Var) {
        boolean z = false;
        if (cx8Var != null) {
            this.c = cx8Var;
            float f = cx8Var.d;
            float f2 = cx8Var.c;
            PointF[] pointFArr = cx8Var.b;
            if (!this.a) {
                ((ln) this.e).e(true, f2);
                ((ln) this.f).e(true, f);
                for (int i = 0; i < Math.min(4, pointFArr.length); i++) {
                    ((ln[]) this.g)[i].e(true, pointFArr[i].x - f2);
                    ((ln[]) this.h)[i].e(true, pointFArr[i].y - f);
                }
            }
        }
        if (cx8Var != null) {
            z = true;
        }
        this.a = z;
        ((yl2) this.b).run();
    }

    public dx8(wx4 wx4Var) {
        this.b = wx4Var;
        this.c = new oo8(this, (byte) 16);
        this.d = new dfb(new Handler(hac.z(), null));
    }
}
