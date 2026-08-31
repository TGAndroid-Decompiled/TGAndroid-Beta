package o4;
public final class v extends u {
    public v(Object obj, long j10, int i10) {
        super(-1, -1, i10, j10, obj);
    }

    public final v b(Object obj) {
        u uVar;
        if (this.f16579a.equals(obj)) {
            uVar = this;
        } else {
            long j10 = this.d;
            uVar = new u(this.f16580b, this.f16581c, this.f16582e, j10, obj);
        }
        return new u(uVar);
    }
}
