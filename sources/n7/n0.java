package n7;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
public class n0 {
    public static final l0 d;
    public final k0 f15124a;
    public final Character f15125b;
    public volatile n0 f15126c;

    static {
        new m0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new m0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new n0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new n0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new l0(new k0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public n0(k0 k0Var, Character ch2) {
        this.f15124a = k0Var;
        if (ch2 != null) {
            byte[] bArr = k0Var.f15117g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(a.c("Padding character %s was already in alphabet", ch2));
            }
        }
        this.f15125b = ch2;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        a.m(0, i10, bArr.length);
        while (i11 < i10) {
            k0 k0Var = this.f15124a;
            b(sb2, bArr, i11, Math.min(k0Var.f15116f, i10 - i11));
            i11 += k0Var.f15116f;
        }
    }

    public final void b(StringBuilder sb2, byte[] bArr, int i10, int i11) {
        a.m(i10, i10 + i11, bArr.length);
        k0 k0Var = this.f15124a;
        int i12 = k0Var.f15116f;
        int i13 = k0Var.d;
        if (i11 <= i12) {
            int i14 = 0;
            long j3 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                j3 = (j3 | (bArr[i10 + i15] & 255)) << 8;
            }
            int i16 = (i11 + 1) * 8;
            while (i14 < i11 * 8) {
                sb2.append(k0Var.f15114b[((int) (j3 >>> ((i16 - i13) - i14))) & k0Var.f15115c]);
                i14 += i13;
            }
            if (this.f15125b != null) {
                while (i14 < k0Var.f15116f * 8) {
                    sb2.append('=');
                    i14 += i13;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final String c(int i10, byte[] bArr) {
        a.m(0, i10, bArr.length);
        k0 k0Var = this.f15124a;
        int i11 = k0Var.f15116f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(k0Var.e * a.a(i10, i11));
        try {
            a(sb2, bArr, i10);
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (this.f15124a.equals(n0Var.f15124a) && Objects.equals(this.f15125b, n0Var.f15125b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15124a.hashCode() ^ Objects.hashCode(this.f15125b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        k0 k0Var = this.f15124a;
        sb2.append(k0Var);
        if (8 % k0Var.d != 0) {
            Character ch2 = this.f15125b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public n0(String str, String str2) {
        this(new k0(str, str2.toCharArray()), (Character) '=');
    }
}
