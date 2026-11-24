package defpackage;

import java.util.concurrent.CountDownLatch;
public final class nj4 {
    public final CountDownLatch a;
    public jz2 b = null;

    public nj4(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nj4) {
                nj4 nj4Var = (nj4) obj;
                if (!this.a.equals(nj4Var.a) || !rr5.a(this.b, nj4Var.b)) {
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
        jz2 jz2Var = this.b;
        if (jz2Var == null) {
            hashCode = 0;
        } else {
            hashCode = jz2Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
    }
}
