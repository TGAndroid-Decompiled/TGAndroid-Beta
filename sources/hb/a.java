package hb;

import aa.j;
import java.util.concurrent.CountDownLatch;
public final class a {
    public final CountDownLatch f14107a;
    public j f14108b = null;

    public a(CountDownLatch countDownLatch) {
        this.f14107a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.j.a(this.f14107a, aVar.f14107a) && kotlin.jvm.internal.j.a(this.f14108b, aVar.f14108b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f14107a.hashCode() * 31;
        j jVar = this.f14108b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.f14107a + ", subscriber=" + this.f14108b + ')';
    }
}
