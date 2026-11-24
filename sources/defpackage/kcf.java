package defpackage;
public final class kcf {
    public final boolean equals(Object obj) {
        if (obj == this || (obj instanceof kcf)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -228219804;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=common, enableFirelog=true, firelogEventType=1}";
    }
}
