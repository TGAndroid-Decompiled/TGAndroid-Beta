package h2;
public final class f0 extends IllegalStateException {
    public final int f13755a;
    public final int f13756b;

    public f0(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: h2.f0.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f0.class == obj.getClass()) {
                f0 f0Var = (f0) obj;
                if (this.f13755a == f0Var.f13755a && this.f13756b == f0Var.f13756b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.f13755a) * 31) + this.f13756b;
    }
}
