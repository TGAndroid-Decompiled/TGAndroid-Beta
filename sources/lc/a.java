package lc;

import java.io.InputStream;
public final class a {
    public static int f18173f;
    public InputStream f18174a;
    public int f18175b;
    public int f18176c;
    public int d;
    public jc.a f18177e;

    public final int a() {
        char c2;
        if (this.d == 8) {
            this.f18175b = this.f18176c;
            this.f18176c = this.f18174a.read();
            this.d = 0;
            if (this.f18175b == -1) {
                return -1;
            }
        }
        int i3 = this.f18175b;
        int i10 = this.d;
        int i11 = (i3 >> (7 - i10)) & 1;
        this.d = i10 + 1;
        jc.a aVar = this.f18177e;
        if (i11 == 0) {
            c2 = '0';
        } else {
            c2 = '1';
        }
        int i12 = aVar.f16237c;
        char[] cArr = aVar.f16236b;
        if (i12 < cArr.length - 1) {
            cArr[i12] = c2;
            aVar.f16237c = i12 + 1;
        }
        f18173f++;
        return i11;
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

    public final long c(int i3) {
        if (i3 <= 64) {
            long j10 = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                j10 = (j10 << 1) | a();
            }
            return j10;
        }
        throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }

    public final long d(int i3, String str) {
        long c2 = c(i3);
        f(str, String.valueOf(c2));
        return c2;
    }

    public final int e(String str) {
        int i3 = 0;
        int i10 = 0;
        while (a() == 0) {
            i10++;
        }
        if (i10 > 0) {
            i3 = (int) (((1 << i10) - 1) + c(i10));
        }
        f(str, String.valueOf(i3));
        return i3;
    }

    public final void f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int i3 = f18173f;
        jc.a aVar = this.f18177e;
        String valueOf = String.valueOf(i3 - aVar.f16237c);
        int length = 8 - valueOf.length();
        sb2.append("@".concat(valueOf));
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - aVar.f16237c;
        for (int i11 = 0; i11 < length2; i11++) {
            sb2.append(' ');
        }
        sb2.append(aVar);
        sb2.append(" (" + str2 + ")");
        aVar.f16237c = 0;
    }
}
