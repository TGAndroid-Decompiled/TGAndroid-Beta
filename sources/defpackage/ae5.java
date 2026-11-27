package defpackage;

import java.io.Serializable;
import java.util.Arrays;
public final class ae5 {
    public static final byte[] f = {0, 0, 1};
    public int a;
    public int b;
    public boolean c;
    public byte d;
    public Serializable e;

    public final d90 a() {
        String str;
        if (this.d == 7 && (str = (String) this.e) != null) {
            return new d90(this.a, this.b, str, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.e) == null) {
            sb.append(" processName");
        }
        if ((this.d & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.d & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.d & 4) == 0) {
            sb.append(" defaultProcess");
        }
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }

    public final void b(int i, int i2, byte[] bArr) {
        if (!this.c) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = (byte[]) this.e;
        int length = bArr2.length;
        int i4 = this.a + i3;
        byte[] bArr3 = bArr2;
        if (length < i4) {
            ?? copyOf = Arrays.copyOf(bArr2, i4 << 1);
            this.e = copyOf;
            bArr3 = copyOf;
        }
        System.arraycopy(bArr, i, bArr3, this.a, i3);
        this.a += i3;
    }
}
