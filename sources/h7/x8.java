package h7;
public final class x8 {
    public final String f7847a;

    public x8(String str) {
        this.f7847a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x8) && this.f7847a.equals(((x8) obj).f7847a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7847a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a4.w.n("MLKitLoggingOptions{libraryName=", this.f7847a, ", enableFirelog=true, firelogEventType=1}");
    }
}
