package defpackage;
public enum m3e implements eqe {
    LANDMARK_UNKNOWN(0),
    LANDMARK_NONE(1),
    LANDMARK_ALL(2),
    LANDMARK_CONTOUR(3);
    
    public final byte a;

    m3e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + m3e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
