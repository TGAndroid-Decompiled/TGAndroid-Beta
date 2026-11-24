package defpackage;
public enum i3e implements eqe {
    RESULT_UNKNOWN(0),
    RESULT_SUCCESS(1),
    RESULT_FAIL(2),
    RESULT_SKIPPED(3);
    
    public final byte a;

    i3e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + i3e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
