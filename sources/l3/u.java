package l3;

import kh.a2;
public final class u extends Exception {
    public final int f11263a;
    public final boolean f11264b;
    public final j3.n0 f11265c;

    public u(int i10, j3.n0 n0Var, boolean z4) {
        super(a2.j(i10, "AudioTrack write failed: "));
        this.f11264b = z4;
        this.f11263a = i10;
        this.f11265c = n0Var;
    }
}
