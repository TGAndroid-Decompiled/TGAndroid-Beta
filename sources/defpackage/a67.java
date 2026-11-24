package defpackage;

import android.content.Context;
public final class a67 extends xz1 {
    public final j67 A0;
    public final xz1 y0;
    public final boolean z0;

    public a67(j67 j67Var, Context context, int i, ylb ylbVar, xz1 xz1Var, boolean z) {
        super(i, ylbVar, context, false);
        this.A0 = j67Var;
        this.y0 = xz1Var;
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
