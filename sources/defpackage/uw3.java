package defpackage;

import java.nio.ByteBuffer;
public final class uw3 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final wtc b;
    public volatile byte c = 0;

    public uw3(wtc wtcVar, int i) {
        this.b = wtcVar;
        this.a = i;
    }

    public final int a(int i) {
        od7 b = b();
        int a = b.a(16);
        if (a != 0) {
            ByteBuffer byteBuffer = b.b;
            int i2 = a + b.a;
            return byteBuffer.getInt(byteBuffer.getInt(i2) + i2 + 4 + (i << 2));
        }
        return 0;
    }

    public final od7 b() {
        ThreadLocal threadLocal = d;
        od7 od7Var = (od7) threadLocal.get();
        od7 od7Var2 = od7Var;
        if (od7Var == null) {
            ?? eebVar = new eeb();
            threadLocal.set(eebVar);
            od7Var2 = eebVar;
        }
        pd7 pd7Var = (pd7) this.b.a;
        int a = pd7Var.a(6);
        if (a != 0) {
            int i = a + pd7Var.a;
            int i2 = pd7Var.b.getInt(i) + i + 4 + (this.a << 2);
            int i3 = pd7Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = pd7Var.b;
            od7Var2.b = byteBuffer;
            if (byteBuffer != null) {
                od7Var2.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                od7Var2.c = i4;
                od7Var2.d = od7Var2.b.getShort(i4);
                return od7Var2;
            }
            od7Var2.a = 0;
            od7Var2.c = 0;
            od7Var2.d = 0;
        }
        return od7Var2;
    }

    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        od7 b = b();
        int a = b.a(4);
        if (a != 0) {
            i = b.b.getInt(a + b.a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        od7 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i3 = a2 + b2.a;
            i2 = b2.b.getInt(b2.b.getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
