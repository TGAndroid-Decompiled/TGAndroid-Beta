package defpackage;
public final class y0f {
    public final String a;

    public y0f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof y0f) && this.a.equals(((y0f) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return qd4.y("MLKitLoggingOptions{libraryName=", this.a, ", enableFirelog=true, firelogEventType=1}");
    }
}
