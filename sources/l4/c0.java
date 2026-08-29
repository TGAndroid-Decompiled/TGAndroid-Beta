package l4;
public final class c0 extends a0 {
    public c0(Object obj) {
        super(obj, -1L);
    }

    public final c0 b(Object obj) {
        a0 a0Var;
        if (this.f14262a.equals(obj)) {
            a0Var = this;
        } else {
            long j10 = this.d;
            a0Var = new a0(this.f14263b, this.f14264c, this.f14265e, j10, obj);
        }
        return new a0(a0Var);
    }

    public c0(Object obj, long j10, int i10) {
        super(-1, -1, i10, j10, obj);
    }
}
