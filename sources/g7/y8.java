package g7;

public final class y8 {

    public final String f6699a;

    public y8(String str) {
        this.f6699a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof y8) && this.f6699a.equals(((y8) obj).f6699a);
    }

    public final int hashCode() {
        return ((((this.f6699a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a9.p.m("MLKitLoggingOptions{libraryName=", this.f6699a, ", enableFirelog=true, firelogEventType=1}");
    }
}
