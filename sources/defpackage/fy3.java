package defpackage;

import java.nio.ByteBuffer;
public final class fy3 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final e7a b;
    public volatile byte c = 0;

    public fy3(e7a e7aVar, int i) {
        this.b = e7aVar;
        this.a = i;
    }

    public final int a(int i) {
        qf7 b = b();
        int a = b.a(16);
        if (a != 0) {
            ByteBuffer byteBuffer = b.b;
            int i2 = a + b.a;
            return byteBuffer.getInt(byteBuffer.getInt(i2) + i2 + 4 + (i << 2));
        }
        return 0;
    }

    public final qf7 b() {
        ThreadLocal threadLocal = d;
        qf7 qf7Var = (qf7) threadLocal.get();
        qf7 qf7Var2 = qf7Var;
        if (qf7Var == null) {
            ?? egbVar = new egb();
            threadLocal.set(egbVar);
            qf7Var2 = egbVar;
        }
        rf7 rf7Var = (rf7) this.b.a;
        int a = rf7Var.a(6);
        if (a != 0) {
            int i = a + rf7Var.a;
            int i2 = rf7Var.b.getInt(i) + i + 4 + (this.a << 2);
            int i3 = rf7Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = rf7Var.b;
            qf7Var2.b = byteBuffer;
            if (byteBuffer != null) {
                qf7Var2.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                qf7Var2.c = i4;
                qf7Var2.d = qf7Var2.b.getShort(i4);
                return qf7Var2;
            }
            qf7Var2.a = 0;
            qf7Var2.c = 0;
            qf7Var2.d = 0;
        }
        return qf7Var2;
    }

    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        qf7 b = b();
        int a = b.a(4);
        if (a != 0) {
            i = b.b.getInt(a + b.a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        qf7 b2 = b();
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
