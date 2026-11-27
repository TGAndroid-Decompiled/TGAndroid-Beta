package defpackage;
public enum f6e implements sse {
    FORMAT_UNKNOWN(0),
    FORMAT_LUMINANCE(1),
    FORMAT_RGB8(2),
    FORMAT_MONOCHROME(3);
    
    public final byte a;

    f6e(int i) {
        this.a = i;
    }

    @Override
    public final String toString() {
        return "<" + f6e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
