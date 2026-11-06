package hb;

import aa.j;
import java.util.concurrent.CountDownLatch;
public final class a {
    public final CountDownLatch f14441a;
    public j f14442b = null;

    public a(CountDownLatch countDownLatch) {
        this.f14441a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.j.a(this.f14441a, aVar.f14441a) && kotlin.jvm.internal.j.a(this.f14442b, aVar.f14442b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f14441a.hashCode() * 31;
        j jVar = this.f14442b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.f14441a + ", subscriber=" + this.f14442b + ')';
    }
}
