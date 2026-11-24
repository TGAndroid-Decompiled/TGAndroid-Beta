package defpackage;

import android.graphics.Color;
public final class pm0 extends nm0 {
    public final ylb s;

    public pm0(ylb ylbVar, ylb ylbVar2) {
        super(ylbVar);
        this.s = ylbVar2;
    }

    @Override
    public final int V() {
        int a = a(this.c);
        ylb ylbVar = this.s;
        if (cmb.g1(ylbVar) && Color.alpha(cmb.v0(cmb.va, ylbVar)) != 0) {
            return 0;
        }
        return a;
    }

    @Override
    public final float b() {
        if (cmb.g1(this.s)) {
            return gm.N(1.0f);
        }
        return this.r;
    }

    @Override
    public final float c() {
        if (cmb.g1(this.s)) {
            return gm.N(2.25f);
        }
        return this.n;
    }

    @Override
    public final int g0() {
        ylb ylbVar = this.s;
        if (cmb.g1(ylbVar)) {
            return cmb.v0(cmb.va, ylbVar);
        }
        return 0;
    }

    @Override
    public final float g1() {
        return gm.N(0.6f);
    }

    @Override
    public final int h1() {
        ylb ylbVar = this.s;
        if (cmb.g1(ylbVar)) {
            return cmb.v0(cmb.xa, ylbVar);
        }
        return 0;
    }

    @Override
    public final int r1() {
        ylb ylbVar = this.s;
        if (cmb.g1(ylbVar)) {
            return cmb.v0(cmb.wa, ylbVar);
        }
        return a(this.b);
    }

    @Override
    public final int u0() {
        int a = a(this.d);
        ylb ylbVar = this.s;
        if (cmb.g1(ylbVar) && Color.alpha(cmb.v0(cmb.va, ylbVar)) != 0) {
            return 0;
        }
        return a;
    }
}
