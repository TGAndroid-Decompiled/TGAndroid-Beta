package j7;
public final class z8 {
    public final String f9865a;

    public z8(String str) {
        this.f9865a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof z8) && this.f9865a.equals(((z8) obj).f9865a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f9865a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return android.support.v4.media.a.o("MLKitLoggingOptions{libraryName=", this.f9865a, ", enableFirelog=true, firelogEventType=1}");
    }
}
