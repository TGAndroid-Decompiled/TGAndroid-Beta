package defpackage;

import android.graphics.Color;
public final class pl0 extends nl0 {
    public final wjb s;

    public pl0(wjb wjbVar, wjb wjbVar2) {
        super(wjbVar);
        this.s = wjbVar2;
    }

    @Override
    public final int K() {
        int a = a(this.c);
        wjb wjbVar = this.s;
        if (bkb.g1(wjbVar) && Color.alpha(bkb.v0(bkb.va, wjbVar)) != 0) {
            return 0;
        }
        return a;
    }

    @Override
    public final float U0() {
        return gl.N(0.6f);
    }

    @Override
    public final int a1() {
        wjb wjbVar = this.s;
        if (bkb.g1(wjbVar)) {
            return bkb.v0(bkb.xa, wjbVar);
        }
        return 0;
    }

    @Override
    public final float b() {
        if (bkb.g1(this.s)) {
            return gl.N(1.0f);
        }
        return this.r;
    }

    @Override
    public final int b0() {
        wjb wjbVar = this.s;
        if (bkb.g1(wjbVar)) {
            return bkb.v0(bkb.va, wjbVar);
        }
        return 0;
    }

    @Override
    public final float c() {
        if (bkb.g1(this.s)) {
            return gl.N(2.25f);
        }
        return this.n;
    }

    @Override
    public final int d1() {
        wjb wjbVar = this.s;
        if (bkb.g1(wjbVar)) {
            return bkb.v0(bkb.wa, wjbVar);
        }
        return a(this.b);
    }

    @Override
    public final int k0() {
        int a = a(this.d);
        wjb wjbVar = this.s;
        if (bkb.g1(wjbVar) && Color.alpha(bkb.v0(bkb.va, wjbVar)) != 0) {
            return 0;
        }
        return a;
    }
}
