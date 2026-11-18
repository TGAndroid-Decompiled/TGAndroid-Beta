package hb;

import aa.j;
import java.util.concurrent.CountDownLatch;
public final class a {
    public final CountDownLatch f14112a;
    public j f14113b = null;

    public a(CountDownLatch countDownLatch) {
        this.f14112a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.j.a(this.f14112a, aVar.f14112a) && kotlin.jvm.internal.j.a(this.f14113b, aVar.f14113b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f14112a.hashCode() * 31;
        j jVar = this.f14113b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.f14112a + ", subscriber=" + this.f14113b + ')';
    }
}
