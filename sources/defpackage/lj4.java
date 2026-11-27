package defpackage;

import java.util.concurrent.CountDownLatch;
public final class lj4 {
    public final CountDownLatch a;
    public ty2 b = null;

    public lj4(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lj4) {
                lj4 lj4Var = (lj4) obj;
                if (!this.a.equals(lj4Var.a) || !ur5.a(this.b, lj4Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        ty2 ty2Var = this.b;
        if (ty2Var == null) {
            hashCode = 0;
        } else {
            hashCode = ty2Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
    }
}
