package j7;
public final class z8 {
    public final String f9222a;

    public z8(String str) {
        this.f9222a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof z8) && this.f9222a.equals(((z8) obj).f9222a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f9222a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return android.support.v4.media.a.o("MLKitLoggingOptions{libraryName=", this.f9222a, ", enableFirelog=true, firelogEventType=1}");
    }
}
