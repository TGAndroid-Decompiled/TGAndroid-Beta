package defpackage;
public enum a6e implements sse {
    MODE_UNKNOWN(0),
    MODE_ACCURATE(1),
    MODE_FAST(2),
    MODE_SELFIE(3);
    
    public final byte a;

    a6e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + a6e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
