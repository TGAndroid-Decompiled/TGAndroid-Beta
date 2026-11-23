package hb;

import aa.j;
import java.util.concurrent.CountDownLatch;
public final class a {
    public final CountDownLatch f14144a;
    public j f14145b = null;

    public a(CountDownLatch countDownLatch) {
        this.f14144a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.j.a(this.f14144a, aVar.f14144a) && kotlin.jvm.internal.j.a(this.f14145b, aVar.f14145b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f14144a.hashCode() * 31;
        j jVar = this.f14145b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.f14144a + ", subscriber=" + this.f14145b + ')';
    }
}
