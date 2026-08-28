package f7;
public final class z8 {
    public final String f5910a;

    public z8(String str) {
        this.f5910a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof z8) && this.f5910a.equals(((z8) obj).f5910a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f5910a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return aa.d.o("MLKitLoggingOptions{libraryName=", this.f5910a, ", enableFirelog=true, firelogEventType=1}");
    }
}
