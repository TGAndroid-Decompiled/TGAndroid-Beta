package defpackage;
public enum f1e implements boe {
    RESULT_UNKNOWN(0),
    RESULT_SUCCESS(1),
    RESULT_FAIL(2),
    RESULT_SKIPPED(3);
    
    public final byte a;

    f1e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + f1e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
