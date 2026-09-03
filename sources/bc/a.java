package bc;

import java.io.InputStream;
import p2.w;
public final class a {
    public static int f1773f;
    public InputStream f1774a;
    public int f1775b;
    public int f1776c;
    public int d;
    public w e;

    public final int a() {
        char c3;
        if (this.d == 8) {
            this.f1775b = this.f1776c;
            this.f1776c = this.f1774a.read();
            this.d = 0;
            if (this.f1775b == -1) {
                return -1;
            }
        }
        int i10 = this.f1775b;
        int i11 = this.d;
        int i12 = (i10 >> (7 - i11)) & 1;
        this.d = i11 + 1;
        w wVar = this.e;
        if (i12 == 0) {
            c3 = '0';
        } else {
            c3 = '1';
        }
        int i13 = wVar.f41051b;
        char[] cArr = (char[]) wVar.f41052c;
        if (i13 < cArr.length - 1) {
            cArr[i13] = c3;
            wVar.f41051b = i13 + 1;
        }
        f1773f++;
        return i12;
    }

    public final boolean b(String str) {
        boolean z4;
        String str2;
        if (a() == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        f(str, str2);
        return z4;
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
        long c3 = c(i10);
        f(str, String.valueOf(c3));
        return c3;
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
        StringBuilder sb = new StringBuilder();
        int i10 = f1773f;
        w wVar = this.e;
        String valueOf = String.valueOf(i10 - wVar.f41051b);
        int length = 8 - valueOf.length();
        sb.append("@".concat(valueOf));
        for (int i11 = 0; i11 < length; i11++) {
            sb.append(' ');
        }
        sb.append(str);
        int length2 = (100 - sb.length()) - wVar.f41051b;
        for (int i12 = 0; i12 < length2; i12++) {
            sb.append(' ');
        }
        sb.append(wVar);
        sb.append(" (" + str2 + ")");
        wVar.f41051b = 0;
    }
}
