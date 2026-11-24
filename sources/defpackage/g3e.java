package defpackage;
public enum g3e implements eqe {
    REASON_UNKNOWN(0),
    REASON_MISSING(1),
    REASON_UPGRADE(2),
    REASON_INVALID(3);
    
    public final byte a;

    g3e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + g3e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
