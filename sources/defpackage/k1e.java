package defpackage;
public enum k1e implements boe {
    MODE_UNKNOWN(0),
    MODE_ACCURATE(1),
    MODE_FAST(2),
    MODE_SELFIE(3);
    
    public final byte a;

    k1e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + k1e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
