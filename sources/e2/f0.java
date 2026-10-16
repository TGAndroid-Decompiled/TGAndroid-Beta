package e2;
public final class f0 extends IllegalStateException {
    public final int f8347a;
    public final int f8348b;

    public f0(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: e2.f0.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f0.class == obj.getClass()) {
                f0 f0Var = (f0) obj;
                if (this.f8347a == f0Var.f8347a && this.f8348b == f0Var.f8348b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.f8347a) * 31) + this.f8348b;
    }
}
