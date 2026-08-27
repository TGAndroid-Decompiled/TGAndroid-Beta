package h3;

public final class i2 {

    public static final i2 f7934b = new i2(false);

    public final boolean f7935a;

    public i2(boolean z10) {
        this.f7935a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i2.class == obj.getClass() && this.f7935a == ((i2) obj).f7935a;
    }

    public final int hashCode() {
        return !this.f7935a ? 1 : 0;
    }
}
