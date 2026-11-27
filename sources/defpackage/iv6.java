package defpackage;
public final class iv6 {
    public final Object a;
    public final byte b;

    public iv6(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = (byte) 1;
        } else if (obj instanceof jw6) {
            this.b = (byte) 2;
        } else {
            iy8.d();
            throw null;
        }
    }
}
