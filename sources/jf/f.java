package jf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import i2.i0;
import java.util.HashMap;
import k2.q0;
public final class f {
    public static int f9860n;
    public static final Rect f9861o = new Rect();
    public final j2.f f9862a;
    public final lf.e f9863b;
    public final String f9864c;
    public final int d;
    public final int e;
    public final boolean f9865f;
    public final lf.a f9866g;
    public final q0 h;
    public final ji.f f9867i;
    public View f9868j;
    public View f9869k;
    public i0 f9870l;
    public boolean f9871m;

    public f(j2.f fVar, e eVar) {
        int i10 = f9860n;
        f9860n = i10 + 1;
        q0 q0Var = new q0();
        this.h = q0Var;
        ji.f fVar2 = new ji.f(new d(this, 0));
        this.f9867i = fVar2;
        StringBuilder sb2 = new StringBuilder();
        String str = eVar.f9854c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f9864c = sb3;
        this.f9866g = eVar.f9853b;
        this.d = eVar.e;
        this.e = eVar.d;
        this.f9865f = eVar.f9855f;
        this.f9862a = fVar;
        q0Var.d(eVar.h, eVar.f9857i);
        this.f9870l = eVar.f9856g;
        this.f9869k = eVar.f9859k;
        this.f9863b = new lf.e(this);
        View view = eVar.f9858j;
        fVar2.v(view);
        this.f9868j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) fVar.f9347a).put(sb3, this);
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
        if (this.h.c() && this.f9866g.q()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f9871m != z11) {
            this.f9871m = z11;
            if (z10) {
                j2.f fVar = this.f9862a;
                fVar.H();
                ((a) fVar.f9349c).invalidate();
            }
        }
    }

    public final void c() {
        this.f9867i.v(null);
        j2.f fVar = this.f9862a;
        if (((HashMap) fVar.f9347a).remove(this.f9864c) != null) {
            fVar.H();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f9862a.m(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: jf.f.e(android.view.View):void");
    }
}
