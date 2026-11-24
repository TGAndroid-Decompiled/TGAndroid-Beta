package defpackage;

import java.nio.ByteBuffer;
public final class sk9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Object f;

    public sk9(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.f = bArr;
        this.e = i6;
    }

    public sk9(int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = byteBuffer;
    }
}
