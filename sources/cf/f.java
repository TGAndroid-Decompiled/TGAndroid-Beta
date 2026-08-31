package cf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.s;
import j3.f0;
import java.util.HashMap;
import m.r3;
public final class f {
    public static int f2489n;
    public static final Rect f2490o = new Rect();
    public final r3 f2491a;
    public final ef.e f2492b;
    public final String f2493c;
    public final int d;
    public final int f2494e;
    public final boolean f2495f;
    public final ef.a f2496g;
    public final ff.c h;
    public final s f2497i;
    public View f2498j;
    public View f2499k;
    public f0 f2500l;
    public boolean f2501m;

    public f(r3 r3Var, e eVar) {
        int i10 = f2489n;
        f2489n = i10 + 1;
        ff.c cVar = new ff.c();
        this.h = cVar;
        d dVar = new d(this, 0);
        ?? obj = new Object();
        obj.d = new ff.b(obj, 0);
        obj.f4080a = dVar;
        this.f2497i = obj;
        StringBuilder sb = new StringBuilder();
        String str = eVar.f2482c;
        sb.append(str == null ? "pip-source" : str);
        sb.append("-");
        sb.append(i10);
        String sb2 = sb.toString();
        this.f2493c = sb2;
        this.f2496g = eVar.f2481b;
        this.d = eVar.f2483e;
        this.f2494e = eVar.d;
        this.f2495f = eVar.f2484f;
        this.f2491a = r3Var;
        cVar.c(eVar.h, eVar.f2486i);
        this.f2500l = eVar.f2485g;
        this.f2499k = eVar.f2488k;
        this.f2492b = new ef.e(this);
        View view = eVar.f2487j;
        obj.o(view);
        this.f2498j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) r3Var.f13327a).put(sb2, this);
        r3Var.g();
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
        if (this.h.b() && this.f2496g.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f2501m != z10) {
            this.f2501m = z10;
            if (z4) {
                r3 r3Var = this.f2491a;
                r3Var.g();
                ((a) r3Var.f13329c).invalidate();
            }
        }
    }

    public final void c() {
        this.f2497i.o(null);
        r3 r3Var = this.f2491a;
        if (((HashMap) r3Var.f13327a).remove(this.f2493c) != null) {
            r3Var.g();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f2491a.a(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: cf.f.e(android.view.View):void");
    }
}
