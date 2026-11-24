package defpackage;

import java.nio.ByteBuffer;
public abstract class egb {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public egb() {
        if (q7f.F == null) {
            q7f.F = new q7f((byte) 28);
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}
