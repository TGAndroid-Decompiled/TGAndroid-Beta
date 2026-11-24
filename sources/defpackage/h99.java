package defpackage;

import java.util.ArrayList;
public final class h99 implements Comparable {
    public long b = -9223372036854775807L;
    public final ArrayList a = new ArrayList();

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((h99) obj).b);
    }
}
