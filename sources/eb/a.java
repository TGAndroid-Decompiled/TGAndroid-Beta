package eb;

import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.j;
import z9.i;
public final class a {
    public final CountDownLatch f9917a;
    public i f9918b = null;

    public a(CountDownLatch countDownLatch) {
        this.f9917a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.f9917a, aVar.f9917a) && j.a(this.f9918b, aVar.f9918b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f9917a.hashCode() * 31;
        i iVar = this.f9918b;
        if (iVar == null) {
            hashCode = 0;
        } else {
            hashCode = iVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(latch=" + this.f9917a + ", subscriber=" + this.f9918b + ')';
    }
}
