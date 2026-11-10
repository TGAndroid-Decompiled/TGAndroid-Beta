package h2;
public final class f0 extends IllegalStateException {
    public final int f14085a;
    public final int f14086b;

    public f0(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: h2.f0.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f0.class == obj.getClass()) {
                f0 f0Var = (f0) obj;
                if (this.f14085a == f0Var.f14085a && this.f14086b == f0Var.f14086b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.f14085a) * 31) + this.f14086b;
    }
}
