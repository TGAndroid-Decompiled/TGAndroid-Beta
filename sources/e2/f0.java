package e2;
public final class f0 extends IllegalStateException {
    public final int f6138a;
    public final int f6139b;

    public f0(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: e2.f0.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f0.class == obj.getClass()) {
                f0 f0Var = (f0) obj;
                if (this.f6138a == f0Var.f6138a && this.f6139b == f0Var.f6139b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.f6138a) * 31) + this.f6139b;
    }
}
