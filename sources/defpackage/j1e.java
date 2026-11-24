package defpackage;
public enum j1e implements boe {
    LANDMARK_UNKNOWN(0),
    LANDMARK_NONE(1),
    LANDMARK_ALL(2),
    LANDMARK_CONTOUR(3);
    
    public final byte a;

    j1e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + j1e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
