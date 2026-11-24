package defpackage;
public enum p1e implements boe {
    FORMAT_UNKNOWN(0),
    FORMAT_LUMINANCE(1),
    FORMAT_RGB8(2),
    FORMAT_MONOCHROME(3);
    
    public final byte a;

    p1e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + p1e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
