package hb;

import aa.j;
import java.util.concurrent.CountDownLatch;
public final class a {
    public final CountDownLatch f14141a;
    public j f14142b = null;

    public a(CountDownLatch countDownLatch) {
        this.f14141a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.j.a(this.f14141a, aVar.f14141a) && kotlin.jvm.internal.j.a(this.f14142b, aVar.f14142b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f14141a.hashCode() * 31;
        j jVar = this.f14142b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.f14141a + ", subscriber=" + this.f14142b + ')';
    }
}
