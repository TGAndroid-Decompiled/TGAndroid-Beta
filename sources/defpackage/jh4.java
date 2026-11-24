package defpackage;

import java.util.concurrent.CountDownLatch;
public final class jh4 {
    public final CountDownLatch a;
    public zx2 b = null;

    public jh4(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jh4) {
                jh4 jh4Var = (jh4) obj;
                if (!this.a.equals(jh4Var.a) || !rp5.a(this.b, jh4Var.b)) {
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
        zx2 zx2Var = this.b;
        if (zx2Var == null) {
            hashCode = 0;
        } else {
            hashCode = zx2Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
    }
}
