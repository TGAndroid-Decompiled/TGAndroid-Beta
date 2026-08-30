package b7;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
public class q0 {
    public static final o0 d;
    public final n0 f1720a;
    public final Character f1721b;
    public volatile q0 f1722c;

    static {
        new p0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new p0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new q0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new q0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new o0(new n0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public q0(n0 n0Var, Character ch2) {
        this.f1720a = n0Var;
        if (ch2 != null) {
            byte[] bArr = n0Var.f1711g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(b.d("Padding character %s was already in alphabet", ch2));
            }
        }
        this.f1721b = ch2;
    }

    public void a(StringBuilder sb, byte[] bArr, int i10) {
        int i11 = 0;
        b.m(0, i10, bArr.length);
        while (i11 < i10) {
            n0 n0Var = this.f1720a;
            b(sb, bArr, i11, Math.min(n0Var.f1710f, i10 - i11));
            i11 += n0Var.f1710f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i10, int i11) {
        b.m(i10, i10 + i11, bArr.length);
        n0 n0Var = this.f1720a;
        int i12 = n0Var.f1710f;
        int i13 = n0Var.d;
        if (i11 <= i12) {
            int i14 = 0;
            long j10 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                j10 = (j10 | (bArr[i10 + i15] & 255)) << 8;
            }
            int i16 = (i11 + 1) * 8;
            while (i14 < i11 * 8) {
                sb.append(n0Var.f1708b[((int) (j10 >>> ((i16 - i13) - i14))) & n0Var.f1709c]);
                i14 += i13;
            }
            if (this.f1721b != null) {
                while (i14 < n0Var.f1710f * 8) {
                    sb.append('=');
                    i14 += i13;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final String c(int i10, byte[] bArr) {
        b.m(0, i10, bArr.length);
        n0 n0Var = this.f1720a;
        int i11 = n0Var.f1710f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(n0Var.e * b.a(i10, i11));
        try {
            a(sb, bArr, i10);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            if (this.f1720a.equals(q0Var.f1720a) && Objects.equals(this.f1721b, q0Var.f1721b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1720a.hashCode() ^ Objects.hashCode(this.f1721b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        n0 n0Var = this.f1720a;
        sb.append(n0Var);
        if (8 % n0Var.d != 0) {
            Character ch2 = this.f1721b;
            if (ch2 == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch2);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public q0(String str, String str2) {
        this(new n0(str, str2.toCharArray()), (Character) '=');
    }
}
