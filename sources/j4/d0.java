package j4;
public final class d0 extends b0 {
    public d0(Object obj) {
        super(obj, -1L);
    }

    public final d0 b(Object obj) {
        b0 b0Var;
        if (this.f13426a.equals(obj)) {
            b0Var = this;
        } else {
            long j10 = this.d;
            b0Var = new b0(this.f13427b, this.f13428c, this.f13429e, j10, obj);
        }
        return new b0(b0Var);
    }

    public d0(Object obj, long j10, int i9) {
        super(-1, -1, i9, j10, obj);
    }
}
