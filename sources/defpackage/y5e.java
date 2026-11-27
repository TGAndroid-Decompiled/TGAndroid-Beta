package defpackage;
public enum y5e implements sse {
    CLASSIFICATION_UNKNOWN(0),
    CLASSIFICATION_NONE(1),
    CLASSIFICATION_ALL(2);
    
    public final byte a;

    y5e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + y5e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
