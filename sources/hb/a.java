package hb;

import aa.j;
import java.util.concurrent.CountDownLatch;
public final class a {
    public final CountDownLatch f14443a;
    public j f14444b = null;

    public a(CountDownLatch countDownLatch) {
        this.f14443a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.j.a(this.f14443a, aVar.f14443a) && kotlin.jvm.internal.j.a(this.f14444b, aVar.f14444b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f14443a.hashCode() * 31;
        j jVar = this.f14444b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.f14443a + ", subscriber=" + this.f14444b + ')';
    }
}
