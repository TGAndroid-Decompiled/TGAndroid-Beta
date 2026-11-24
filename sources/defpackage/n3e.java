package defpackage;
public enum n3e implements eqe {
    MODE_UNKNOWN(0),
    MODE_ACCURATE(1),
    MODE_FAST(2),
    MODE_SELFIE(3);
    
    public final byte a;

    n3e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + n3e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
