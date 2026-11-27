package defpackage;
public enum z5e implements sse {
    LANDMARK_UNKNOWN(0),
    LANDMARK_NONE(1),
    LANDMARK_ALL(2),
    LANDMARK_CONTOUR(3);
    
    public final byte a;

    z5e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + z5e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
