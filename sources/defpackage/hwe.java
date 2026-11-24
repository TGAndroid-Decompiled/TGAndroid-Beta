package defpackage;
public final class hwe {
    public final String a;

    public hwe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof hwe) && this.a.equals(((hwe) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return tb4.y("MLKitLoggingOptions{libraryName=", this.a, ", enableFirelog=true, firelogEventType=1}");
    }
}
