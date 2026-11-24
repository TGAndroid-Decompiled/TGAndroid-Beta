package defpackage;
public enum d1e implements boe {
    REASON_UNKNOWN(0),
    REASON_MISSING(1),
    REASON_UPGRADE(2),
    REASON_INVALID(3);
    
    public final byte a;

    d1e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + d1e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
