package hb;

import aa.j;
import java.util.concurrent.CountDownLatch;
public final class a {
    public final CountDownLatch f14115a;
    public j f14116b = null;

    public a(CountDownLatch countDownLatch) {
        this.f14115a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.j.a(this.f14115a, aVar.f14115a) && kotlin.jvm.internal.j.a(this.f14116b, aVar.f14116b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f14115a.hashCode() * 31;
        j jVar = this.f14116b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.f14115a + ", subscriber=" + this.f14116b + ')';
    }
}
