package defpackage;
public final class jye {
    public final String a;

    public jye(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof jye) && this.a.equals(((jye) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return kt6.o("MLKitLoggingOptions{libraryName=", this.a, ", enableFirelog=true, firelogEventType=1}");
    }
}
