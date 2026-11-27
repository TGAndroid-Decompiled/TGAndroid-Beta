package defpackage;

import android.content.Context;
public final class h67 extends bz1 {
    public final boolean A0;
    public final q67 B0;
    public final bz1 z0;

    public h67(q67 q67Var, Context context, int i, vnb vnbVar, bz1 bz1Var, boolean z) {
        super(i, vnbVar, context, false);
        this.B0 = q67Var;
        this.z0 = bz1Var;
        this.A0 = z;
    }

    @Override
    public final boolean b() {
        return this.z0.b();
    }

    @Override
    public final boolean c() {
        return this.z0.c();
    }

    @Override
    public final boolean d() {
        if (this.A0 && this.B0.u0 && this.w <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.z0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.z0.j();
    }
}
