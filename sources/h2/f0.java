package h2;
public final class f0 extends IllegalStateException {
    public final int f14083a;
    public final int f14084b;

    public f0(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: h2.f0.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f0.class == obj.getClass()) {
                f0 f0Var = (f0) obj;
                if (this.f14083a == f0Var.f14083a && this.f14084b == f0Var.f14084b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.f14083a) * 31) + this.f14084b;
    }
}
