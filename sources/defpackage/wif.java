package defpackage;
public final class wif {
    public final boolean equals(Object obj) {
        if (obj == this || (obj instanceof wif)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -535171828;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=subject-segmentation, enableFirelog=true, firelogEventType=1}";
    }
}
