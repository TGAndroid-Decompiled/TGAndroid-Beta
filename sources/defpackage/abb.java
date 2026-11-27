package defpackage;
public final class abb implements qk4 {
    public final sbb a;

    public abb(sbb sbbVar) {
        this.a = sbbVar;
    }

    @Override
    public final void setInvert(float f) {
        boolean z;
        sbb sbbVar = this.a;
        rbb rbbVar = sbbVar.n;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        hl.j3(rbbVar, z);
        rbb rbbVar2 = sbbVar.n;
        if (i > 0) {
            z2 = true;
        }
        hl.m3(rbbVar2, z2);
    }

    @Override
    public final void invalidate() {
    }
}
