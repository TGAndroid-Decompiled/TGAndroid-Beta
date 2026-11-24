package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
public final class cv8 {
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

    public cv8(lk2 lk2Var) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(gl.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, gl.L(3.0f), gl.L(6.0f));
        this.j = new Path();
        this.b = lk2Var;
        s33 s33Var = s33.g;
        this.d = new lm(0.0f, lk2Var, 0L, 320L, s33Var);
        this.e = new lm(0.0f, lk2Var, 0L, 160L, s33Var);
        this.f = new lm(0.0f, lk2Var, 0L, 160L, s33Var);
        this.g = new lm[]{new lm(0.0f, lk2Var, 0L, 160L, s33Var), new lm(0.0f, lk2Var, 0L, 160L, s33Var), new lm(0.0f, lk2Var, 0L, 160L, s33Var), new lm(0.0f, lk2Var, 0L, 160L, s33Var)};
        this.h = new lm[]{new lm(0.0f, lk2Var, 0L, 160L, s33Var), new lm(0.0f, lk2Var, 0L, 160L, s33Var), new lm(0.0f, lk2Var, 0L, 160L, s33Var), new lm(0.0f, lk2Var, 0L, 160L, s33Var)};
    }

    public static f86 a(cv7 cv7Var, long j, long j2) {
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        return new f86(e86Var);
    }

    public final void b() {
        gre.p(this.a);
        Uri uri = (Uri) this.e;
        uri.getClass();
        Uri.Builder buildUpon = uri.buildUpon();
        pj4 pj4Var = (pj4) this.f;
        pj4Var.getClass();
        se5 se5Var = (se5) pj4Var.b;
        gre.p(se5Var.k);
        String str = se5Var.l;
        String valueOf = String.valueOf(se5Var.c.b());
        krd.a("_HLS_pathway", str);
        krd.a("_HLS_throughput", valueOf);
        for (Map.Entry entry : new TreeMap(b69.g(2, new Object[]{"_HLS_pathway", str, "_HLS_throughput", valueOf}, null)).entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        Map map = Collections.EMPTY_MAP;
        Uri build = buildUpon.build();
        build.getClass();
        cv7 cv7Var = new cv7(((ry4) this.b).createDataSource(), new u63(build, 1, null, map, 0L, -1L, null, 0), 8, new i2f((byte) 26));
        mv6 mv6Var = (mv6) this.j;
        mv6Var.getClass();
        mv6Var.r0(cv7Var, (v39) this.c, 0);
    }

    public final void c(bv8 bv8Var) {
        boolean z = false;
        if (bv8Var != null) {
            this.c = bv8Var;
            float f = bv8Var.d;
            float f2 = bv8Var.c;
            PointF[] pointFArr = bv8Var.b;
            if (!this.a) {
                ((lm) this.e).e(true, f2);
                ((lm) this.f).e(true, f);
                for (int i = 0; i < Math.min(4, pointFArr.length); i++) {
                    ((lm[]) this.g)[i].e(true, pointFArr[i].x - f2);
                    ((lm[]) this.h)[i].e(true, pointFArr[i].y - f);
                }
            }
        }
        if (bv8Var != null) {
            z = true;
        }
        this.a = z;
        ((lk2) this.b).run();
    }

    public cv8(ry4 ry4Var) {
        this.b = ry4Var;
        this.c = new v39(this, (byte) 13);
        this.d = new cdb(new Handler(g8c.z(), null));
    }
}
