package defpackage;
public enum i1e implements boe {
    CLASSIFICATION_UNKNOWN(0),
    CLASSIFICATION_NONE(1),
    CLASSIFICATION_ALL(2);
    
    public final byte a;

    i1e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + i1e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
