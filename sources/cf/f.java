package cf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.r;
import j3.f0;
import java.util.HashMap;
import m.s3;
public final class f {
    public static int f2293n;
    public static final Rect f2294o = new Rect();
    public final s3 f2295a;
    public final ef.f f2296b;
    public final String f2297c;
    public final int d;
    public final int e;
    public final boolean f2298f;
    public final ef.a f2299g;
    public final ff.c h;
    public final r f2300i;
    public View f2301j;
    public View f2302k;
    public f0 f2303l;
    public boolean f2304m;

    public f(s3 s3Var, e eVar) {
        int i10 = f2293n;
        f2293n = i10 + 1;
        ff.c cVar = new ff.c();
        this.h = cVar;
        r rVar = new r(new d(this, 0));
        this.f2300i = rVar;
        StringBuilder sb = new StringBuilder();
        String str = eVar.f2287c;
        sb.append(str == null ? "pip-source" : str);
        sb.append("-");
        sb.append(i10);
        String sb2 = sb.toString();
        this.f2297c = sb2;
        this.f2299g = eVar.f2286b;
        this.d = eVar.e;
        this.e = eVar.d;
        this.f2298f = eVar.f2288f;
        this.f2295a = s3Var;
        cVar.c(eVar.h, eVar.f2290i);
        this.f2303l = eVar.f2289g;
        this.f2302k = eVar.f2292k;
        this.f2296b = new ef.f(this);
        View view = eVar.f2291j;
        rVar.T(view);
        this.f2301j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) s3Var.f13641a).put(sb2, this);
        s3Var.g();
    }

    public final PictureInPictureParams a() {
        boolean z4;
        PictureInPictureParams.Builder a2 = this.h.a();
        a2.setActions(null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            if (i10 >= 31) {
                z4 = true;
            } else {
                z4 = false;
            }
            a2.setAutoEnterEnabled(z4);
        }
        return a2.build();
    }

    public final void b(boolean z4) {
        boolean z10;
        if (this.h.b() && this.f2299g.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f2304m != z10) {
            this.f2304m = z10;
            if (z4) {
                s3 s3Var = this.f2295a;
                s3Var.g();
                ((a) s3Var.f13643c).invalidate();
            }
        }
    }

    public final void c() {
        this.f2300i.T(null);
        s3 s3Var = this.f2295a;
        if (((HashMap) s3Var.f13641a).remove(this.f2297c) != null) {
            s3Var.g();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f2295a.a(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: cf.f.e(android.view.View):void");
    }
}
