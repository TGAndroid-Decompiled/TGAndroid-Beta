package g2;
public final class g0 extends IllegalStateException {
    public final int f11844a;
    public final int f11845b;

    public g0(int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: g2.g0.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g0.class == obj.getClass()) {
                g0 g0Var = (g0) obj;
                if (this.f11844a == g0Var.f11844a && this.f11845b == g0Var.f11845b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.f11844a) * 31) + this.f11845b;
    }
}
