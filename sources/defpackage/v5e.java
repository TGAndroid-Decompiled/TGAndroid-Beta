package defpackage;
public enum v5e implements sse {
    RESULT_UNKNOWN(0),
    RESULT_SUCCESS(1),
    RESULT_FAIL(2),
    RESULT_SKIPPED(3);
    
    public final byte a;

    v5e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + v5e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
