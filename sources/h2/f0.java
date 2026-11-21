package h2;
public final class f0 extends IllegalStateException {
    public final int f13784a;
    public final int f13785b;

    public f0(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: h2.f0.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f0.class == obj.getClass()) {
                f0 f0Var = (f0) obj;
                if (this.f13784a == f0Var.f13784a && this.f13785b == f0Var.f13785b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.f13784a) * 31) + this.f13785b;
    }
}
