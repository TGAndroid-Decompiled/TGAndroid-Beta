package kotlin;

import kotlin.jvm.internal.Intrinsics;

public final class KotlinVersion implements Comparable {
    public static final KotlinVersion CURRENT = new KotlinVersion();
    public final int version = 131348;

    @Override
    public final int compareTo(Object obj) {
        KotlinVersion other = (KotlinVersion) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.version - other.version;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public final int hashCode() {
        return this.version;
    }

    public final String toString() {
        return "2.1.20";
    }
}
