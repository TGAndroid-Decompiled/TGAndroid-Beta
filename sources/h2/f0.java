package h2;
public final class f0 extends IllegalStateException {
    public final int f13787a;
    public final int f13788b;

    public f0(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: h2.f0.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f0.class == obj.getClass()) {
                f0 f0Var = (f0) obj;
                if (this.f13787a == f0Var.f13787a && this.f13788b == f0Var.f13788b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.f13787a) * 31) + this.f13788b;
    }
}
