package defpackage;

import java.nio.ByteBuffer;
public abstract class zhb {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public zhb() {
        if (faf.F == null) {
            faf.F = new faf((byte) 28);
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}
