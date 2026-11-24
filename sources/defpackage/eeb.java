package defpackage;

import java.nio.ByteBuffer;
public abstract class eeb {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public eeb() {
        if (o5f.F == null) {
            o5f.F = new o5f((byte) 28);
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}
