package defpackage;

import android.content.Context;
public final class a47 extends ky1 {
    public final j47 A0;
    public final ky1 y0;
    public final boolean z0;

    public a47(j47 j47Var, Context context, int i, wjb wjbVar, ky1 ky1Var, boolean z) {
        super(i, wjbVar, context, false);
        this.A0 = j47Var;
        this.y0 = ky1Var;
        this.z0 = z;
    }

    @Override
    public final boolean b() {
        return this.y0.b();
    }

    @Override
    public final boolean c() {
        return this.y0.c();
    }

    @Override
    public final boolean d() {
        if (this.z0 && this.A0.u0 && this.w <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int getFillColor() {
        return this.y0.getFillColor();
    }

    @Override
    public final boolean j() {
        return this.y0.j();
    }
}
