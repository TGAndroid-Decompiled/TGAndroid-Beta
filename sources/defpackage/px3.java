package defpackage;

import java.nio.ByteBuffer;
public final class px3 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final u8a b;
    public volatile byte c = 0;

    public px3(u8a u8aVar, int i) {
        this.b = u8aVar;
        this.a = i;
    }

    public final int a(int i) {
        xf7 b = b();
        int a = b.a(16);
        if (a != 0) {
            ByteBuffer byteBuffer = b.b;
            int i2 = a + b.a;
            return byteBuffer.getInt(byteBuffer.getInt(i2) + i2 + 4 + (i << 2));
        }
        return 0;
    }

    public final xf7 b() {
        ThreadLocal threadLocal = d;
        xf7 xf7Var = (xf7) threadLocal.get();
        xf7 xf7Var2 = xf7Var;
        if (xf7Var == null) {
            ?? zhbVar = new zhb();
            threadLocal.set(zhbVar);
            xf7Var2 = zhbVar;
        }
        yf7 yf7Var = (yf7) this.b.a;
        int a = yf7Var.a(6);
        if (a != 0) {
            int i = a + yf7Var.a;
            int i2 = yf7Var.b.getInt(i) + i + 4 + (this.a << 2);
            int i3 = yf7Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = yf7Var.b;
            xf7Var2.b = byteBuffer;
            if (byteBuffer != null) {
                xf7Var2.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                xf7Var2.c = i4;
                xf7Var2.d = xf7Var2.b.getShort(i4);
                return xf7Var2;
            }
            xf7Var2.a = 0;
            xf7Var2.c = 0;
            xf7Var2.d = 0;
        }
        return xf7Var2;
    }

    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        xf7 b = b();
        int a = b.a(4);
        if (a != 0) {
            i = b.b.getInt(a + b.a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        xf7 b2 = b();
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
