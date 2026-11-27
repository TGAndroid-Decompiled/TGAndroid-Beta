package defpackage;
public enum t5e implements sse {
    REASON_UNKNOWN(0),
    REASON_MISSING(1),
    REASON_UPGRADE(2),
    REASON_INVALID(3);
    
    public final byte a;

    t5e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + t5e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
