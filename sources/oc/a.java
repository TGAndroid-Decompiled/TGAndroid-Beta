package oc;

import java.io.InputStream;
public final class a {
    public static int f20892f;
    public InputStream f20893a;
    public int f20894b;
    public int f20895c;
    public int d;
    public mc.a f20896e;

    public final int a() {
        char c10;
        if (this.d == 8) {
            this.f20894b = this.f20895c;
            this.f20895c = this.f20893a.read();
            this.d = 0;
            if (this.f20894b == -1) {
                return -1;
            }
        }
        int i7 = this.f20894b;
        int i10 = this.d;
        int i11 = (i7 >> (7 - i10)) & 1;
        this.d = i10 + 1;
        mc.a aVar = this.f20896e;
        if (i11 == 0) {
            c10 = '0';
        } else {
            c10 = '1';
        }
        int i12 = aVar.f20002c;
        char[] cArr = aVar.f20001b;
        if (i12 < cArr.length - 1) {
            cArr[i12] = c10;
            aVar.f20002c = i12 + 1;
        }
        f20892f++;
        return i11;
    }

    public final boolean b(String str) {
        boolean z9;
        String str2;
        if (a() == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        f(str, str2);
        return z9;
    }

    public final long c(int i7) {
        if (i7 <= 64) {
            long j3 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                j3 = (j3 << 1) | a();
            }
            return j3;
        }
        throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }

    public final long d(int i7, String str) {
        long c10 = c(i7);
        f(str, String.valueOf(c10));
        return c10;
    }

    public final int e(String str) {
        int i7 = 0;
        int i10 = 0;
        while (a() == 0) {
            i10++;
        }
        if (i10 > 0) {
            i7 = (int) (((1 << i10) - 1) + c(i10));
        }
        f(str, String.valueOf(i7));
        return i7;
    }

    public final void f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int i7 = f20892f;
        mc.a aVar = this.f20896e;
        String valueOf = String.valueOf(i7 - aVar.f20002c);
        int length = 8 - valueOf.length();
        sb2.append("@".concat(valueOf));
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - aVar.f20002c;
        for (int i11 = 0; i11 < length2; i11++) {
            sb2.append(' ');
        }
        sb2.append(aVar);
        sb2.append(" (" + str2 + ")");
        aVar.f20002c = 0;
    }
}
