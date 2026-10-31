package ic;

import c5.x;
import java.io.InputStream;
public final class a {
    public static int f8241f;
    public InputStream f8242a;
    public int f8243b;
    public int f8244c;
    public int d;
    public x e;

    public final int a() {
        char c10;
        if (this.d == 8) {
            this.f8243b = this.f8244c;
            this.f8244c = this.f8242a.read();
            this.d = 0;
            if (this.f8243b == -1) {
                return -1;
            }
        }
        int i10 = this.f8243b;
        int i11 = this.d;
        int i12 = (i10 >> (7 - i11)) & 1;
        this.d = i11 + 1;
        x xVar = this.e;
        if (i12 == 0) {
            c10 = '0';
        } else {
            c10 = '1';
        }
        int i13 = xVar.f3827b;
        char[] cArr = (char[]) xVar.f3828c;
        if (i13 < cArr.length - 1) {
            cArr[i13] = c10;
            xVar.f3827b = i13 + 1;
        }
        f8241f++;
        return i12;
    }

    public final boolean b(String str) {
        boolean z10;
        String str2;
        if (a() == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        f(str, str2);
        return z10;
    }

    public final long c(int i10) {
        if (i10 <= 64) {
            long j10 = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                j10 = (j10 << 1) | a();
            }
            return j10;
        }
        throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }

    public final long d(int i10, String str) {
        long c10 = c(i10);
        f(str, String.valueOf(c10));
        return c10;
    }

    public final int e(String str) {
        int i10 = 0;
        int i11 = 0;
        while (a() == 0) {
            i11++;
        }
        if (i11 > 0) {
            i10 = (int) (((1 << i11) - 1) + c(i11));
        }
        f(str, String.valueOf(i10));
        return i10;
    }

    public final void f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = f8241f;
        x xVar = this.e;
        String valueOf = String.valueOf(i10 - xVar.f3827b);
        int length = 8 - valueOf.length();
        sb2.append("@".concat(valueOf));
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - xVar.f3827b;
        for (int i12 = 0; i12 < length2; i12++) {
            sb2.append(' ');
        }
        sb2.append(xVar);
        sb2.append(" (" + str2 + ")");
        xVar.f3827b = 0;
    }
}
