package bf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.r;
import j3.f0;
import java.util.HashMap;
import m.s3;
public final class f {
    public static int f1815n;
    public static final Rect f1816o = new Rect();
    public final s3 f1817a;
    public final df.e f1818b;
    public final String f1819c;
    public final int d;
    public final int e;
    public final boolean f1820f;
    public final df.a f1821g;
    public final ef.c h;
    public final r f1822i;
    public View f1823j;
    public View f1824k;
    public f0 f1825l;
    public boolean f1826m;

    public f(s3 s3Var, e eVar) {
        int i10 = f1815n;
        f1815n = i10 + 1;
        ef.c cVar = new ef.c();
        this.h = cVar;
        d dVar = new d(this, 0);
        ?? obj = new Object();
        obj.d = new ef.b(obj, 0);
        obj.f4004a = dVar;
        this.f1822i = obj;
        StringBuilder sb = new StringBuilder();
        String str = eVar.f1809c;
        sb.append(str == null ? "pip-source" : str);
        sb.append("-");
        sb.append(i10);
        String sb2 = sb.toString();
        this.f1819c = sb2;
        this.f1821g = eVar.f1808b;
        this.d = eVar.e;
        this.e = eVar.d;
        this.f1820f = eVar.f1810f;
        this.f1817a = s3Var;
        cVar.c(eVar.h, eVar.f1812i);
        this.f1825l = eVar.f1811g;
        this.f1824k = eVar.f1814k;
        this.f1818b = new df.e(this);
        View view = eVar.f1813j;
        obj.o(view);
        this.f1823j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) s3Var.f13625a).put(sb2, this);
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
        if (this.h.b() && this.f1821g.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f1826m != z10) {
            this.f1826m = z10;
            if (z4) {
                s3 s3Var = this.f1817a;
                s3Var.g();
                ((a) s3Var.f13627c).invalidate();
            }
        }
    }

    public final void c() {
        this.f1822i.o(null);
        s3 s3Var = this.f1817a;
        if (((HashMap) s3Var.f13625a).remove(this.f1819c) != null) {
            s3Var.g();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f1817a.a(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: bf.f.e(android.view.View):void");
    }
}
