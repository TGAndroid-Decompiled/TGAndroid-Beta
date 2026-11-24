package defpackage;

import j$.util.Objects;
import java.util.Arrays;
public final class u54 implements lf7 {
    public static final go4 g;
    public static final go4 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        fo4 fo4Var = new fo4();
        fo4Var.s = wf7.n("application/id3");
        g = new go4(fo4Var);
        fo4 fo4Var2 = new fo4();
        fo4Var2.s = wf7.n("application/x-scte35");
        h = new go4(fo4Var2);
    }

    public u54(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override
    public final go4 a() {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return h;
            case 1:
            case 2:
                return g;
            default:
                return null;
        }
    }

    @Override
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u54.class == obj.getClass()) {
                u54 u54Var = (u54) obj;
                if (this.c == u54Var.c && this.d == u54Var.d && Objects.equals(this.a, u54Var.a) && this.b.equals(u54Var.b) && Arrays.equals(this.e, u54Var.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = this.f;
        if (i2 == 0) {
            String str = this.a;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int j = ts2.j((527 + i) * 31, 31, this.b);
            long j2 = this.c;
            long j3 = this.d;
            int hashCode = Arrays.hashCode(this.e) + ((((j + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
            this.f = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override
    public final void b(ht6 ht6Var) {
    }
}
