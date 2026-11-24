package defpackage;
public enum l3e implements eqe {
    CLASSIFICATION_UNKNOWN(0),
    CLASSIFICATION_NONE(1),
    CLASSIFICATION_ALL(2);
    
    public final byte a;

    l3e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + l3e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
