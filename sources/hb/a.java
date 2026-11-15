package hb;

import aa.j;
import java.util.concurrent.CountDownLatch;
public final class a {
    public final CountDownLatch f13798a;
    public j f13799b = null;

    public a(CountDownLatch countDownLatch) {
        this.f13798a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.j.a(this.f13798a, aVar.f13798a) && kotlin.jvm.internal.j.a(this.f13799b, aVar.f13799b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f13798a.hashCode() * 31;
        j jVar = this.f13799b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.f13798a + ", subscriber=" + this.f13799b + ')';
    }
}
