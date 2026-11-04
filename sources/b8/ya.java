package b8;

import java.util.Arrays;
public final class ya {
    public final xa f3147a;
    public final Integer f3148b;

    public ya(tf.b bVar) {
        this.f3147a = (xa) bVar.f55094a;
        this.f3148b = (Integer) bVar.f55095b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ya)) {
            return false;
        }
        ya yaVar = (ya) obj;
        if (p6.m.k(this.f3147a, yaVar.f3147a) && p6.m.k(this.f3148b, yaVar.f3148b) && p6.m.k(null, null) && p6.m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3147a, this.f3148b, null, null});
    }
}
