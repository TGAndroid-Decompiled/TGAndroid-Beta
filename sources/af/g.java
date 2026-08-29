package af;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.s;
import j3.k0;
import java.util.HashMap;
import m.s3;
public final class g {
    public static int f395n;
    public static final Rect f396o = new Rect();
    public final s3 f397a;
    public final cf.e f398b;
    public final String f399c;
    public final int d;
    public final int f400e;
    public final boolean f401f;
    public final cf.a f402g;
    public final df.c h;
    public final s f403i;
    public View f404j;
    public View f405k;
    public k0 f406l;
    public boolean f407m;

    public g(s3 s3Var, f fVar) {
        int i10 = f395n;
        f395n = i10 + 1;
        df.c cVar = new df.c();
        this.h = cVar;
        s sVar = new s(new e(this, 0));
        this.f403i = sVar;
        StringBuilder sb2 = new StringBuilder();
        String str = fVar.f388c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f399c = sb3;
        this.f402g = fVar.f387b;
        this.d = fVar.f389e;
        this.f400e = fVar.d;
        this.f401f = fVar.f390f;
        this.f397a = s3Var;
        cVar.c(fVar.h, fVar.f392i);
        this.f406l = fVar.f391g;
        this.f405k = fVar.f394k;
        this.f398b = new cf.e(this);
        View view = fVar.f393j;
        sVar.O(view);
        this.f404j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) s3Var.f16688a).put(sb3, this);
        s3Var.g();
    }

    public final PictureInPictureParams a() {
        boolean z10;
        PictureInPictureParams.Builder a2 = this.h.a();
        a2.setActions(null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            if (i10 >= 31) {
                z10 = true;
            } else {
                z10 = false;
            }
            a2.setAutoEnterEnabled(z10);
        }
        return a2.build();
    }

    public final void b(boolean z10) {
        boolean z11;
        if (this.h.b() && this.f402g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f407m != z11) {
            this.f407m = z11;
            if (z10) {
                s3 s3Var = this.f397a;
                s3Var.g();
                ((a) s3Var.f16690c).invalidate();
            }
        }
    }

    public final void c() {
        this.f403i.O(null);
        s3 s3Var = this.f397a;
        if (((HashMap) s3Var.f16688a).remove(this.f399c) != null) {
            s3Var.g();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f397a.a(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: af.g.e(android.view.View):void");
    }
}
