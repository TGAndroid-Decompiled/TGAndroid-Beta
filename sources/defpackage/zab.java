package defpackage;
public final class zab implements qk4 {
    public final rbb a;

    public zab(rbb rbbVar) {
        this.a = rbbVar;
    }

    @Override
    public final void setInvert(float f) {
        boolean z;
        rbb rbbVar = this.a;
        qbb qbbVar = rbbVar.n;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        hl.j3(qbbVar, z);
        qbb qbbVar2 = rbbVar.n;
        if (i > 0) {
            z2 = true;
        }
        hl.m3(qbbVar2, z2);
    }

    @Override
    public final void invalidate() {
    }
}
