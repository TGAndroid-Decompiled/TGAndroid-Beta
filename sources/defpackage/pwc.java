package defpackage;

import java.util.Arrays;
public final class pwc implements wn {
    public static final pwc a = new Object();

    public final boolean equals(Object obj) {
        return obj instanceof pwc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{pwc.class});
    }
}
