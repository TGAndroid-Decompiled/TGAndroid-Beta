package jf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import i2.i0;
import java.util.HashMap;
import k2.q0;
public final class f {
    public static int f9861n;
    public static final Rect f9862o = new Rect();
    public final j2.f f9863a;
    public final lf.e f9864b;
    public final String f9865c;
    public final int d;
    public final int e;
    public final boolean f9866f;
    public final lf.a f9867g;
    public final q0 h;
    public final ji.f f9868i;
    public View f9869j;
    public View f9870k;
    public i0 f9871l;
    public boolean f9872m;

    public f(j2.f fVar, e eVar) {
        int i10 = f9861n;
        f9861n = i10 + 1;
        q0 q0Var = new q0();
        this.h = q0Var;
        ji.f fVar2 = new ji.f(new d(this, 0));
        this.f9868i = fVar2;
        StringBuilder sb2 = new StringBuilder();
        String str = eVar.f9855c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f9865c = sb3;
        this.f9867g = eVar.f9854b;
        this.d = eVar.e;
        this.e = eVar.d;
        this.f9866f = eVar.f9856f;
        this.f9863a = fVar;
        q0Var.d(eVar.h, eVar.f9858i);
        this.f9871l = eVar.f9857g;
        this.f9870k = eVar.f9860k;
        this.f9864b = new lf.e(this);
        View view = eVar.f9859j;
        fVar2.v(view);
        this.f9869j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) fVar.f9348a).put(sb3, this);
        fVar.H();
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
        if (this.h.c() && this.f9867g.q()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f9872m != z11) {
            this.f9872m = z11;
            if (z10) {
                j2.f fVar = this.f9863a;
                fVar.H();
                ((a) fVar.f9350c).invalidate();
            }
        }
    }

    public final void c() {
        this.f9868i.v(null);
        j2.f fVar = this.f9863a;
        if (((HashMap) fVar.f9348a).remove(this.f9865c) != null) {
            fVar.H();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f9863a.m(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: jf.f.e(android.view.View):void");
    }
}
