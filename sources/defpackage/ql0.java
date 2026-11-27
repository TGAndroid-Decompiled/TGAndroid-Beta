package defpackage;

import android.graphics.Color;
public final class ql0 extends ol0 {
    public final vnb s;

    public ql0(vnb vnbVar, vnb vnbVar2) {
        super(vnbVar);
        this.s = vnbVar2;
    }

    @Override
    public final int X() {
        int a = a(this.c);
        vnb vnbVar = this.s;
        if (aob.g1(vnbVar) && Color.alpha(aob.v0(aob.wa, vnbVar)) != 0) {
            return 0;
        }
        return a;
    }

    @Override
    public final float b() {
        if (aob.g1(this.s)) {
            return hl.N(1.0f);
        }
        return this.r;
    }

    @Override
    public final float c() {
        if (aob.g1(this.s)) {
            return hl.N(2.25f);
        }
        return this.n;
    }

    @Override
    public final int m0() {
        vnb vnbVar = this.s;
        if (aob.g1(vnbVar)) {
            return aob.v0(aob.wa, vnbVar);
        }
        return 0;
    }

    @Override
    public final float m1() {
        return hl.N(0.6f);
    }

    @Override
    public final int o1() {
        vnb vnbVar = this.s;
        if (aob.g1(vnbVar)) {
            return aob.v0(aob.ya, vnbVar);
        }
        return 0;
    }

    @Override
    public final int x0() {
        int a = a(this.d);
        vnb vnbVar = this.s;
        if (aob.g1(vnbVar) && Color.alpha(aob.v0(aob.wa, vnbVar)) != 0) {
            return 0;
        }
        return a;
    }

    @Override
    public final int x1() {
        vnb vnbVar = this.s;
        if (aob.g1(vnbVar)) {
            return aob.v0(aob.xa, vnbVar);
        }
        return a(this.b);
    }
}
