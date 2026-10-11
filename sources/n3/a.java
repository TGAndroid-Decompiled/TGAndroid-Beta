package n3;

import b2.m0;
import b2.o0;
import b2.r;
import b2.r0;
import b2.s;
import j$.util.Objects;
import java.util.Arrays;
public final class a implements o0 {
    public static final s f16582g;
    public static final s h;
    public final String f16583a;
    public final String f16584b;
    public final long f16585c;
    public final long d;
    public final byte[] f16586e;
    public int f16587f;

    static {
        r rVar = new r();
        rVar.f3585q = r0.n("application/id3");
        f16582g = new s(rVar);
        r rVar2 = new r();
        rVar2.f3585q = r0.n("application/x-scte35");
        h = new s(rVar2);
    }

    public a(String str, String str2, long j3, long j10, byte[] bArr) {
        this.f16583a = str;
        this.f16584b = str2;
        this.f16585c = j3;
        this.d = j10;
        this.f16586e = bArr;
    }

    @Override
    public final s a() {
        String str = this.f16583a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return h;
            case 1:
            case 2:
                return f16582g;
            default:
                return null;
        }
    }

    @Override
    public final byte[] c() {
        if (a() != null) {
            return this.f16586e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f16585c == aVar.f16585c && this.d == aVar.d && Objects.equals(this.f16583a, aVar.f16583a) && Objects.equals(this.f16584b, aVar.f16584b) && Arrays.equals(this.f16586e, aVar.f16586e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f16587f == 0) {
            int i11 = 0;
            String str = this.f16583a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f16584b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j3 = this.f16585c;
            long j10 = this.d;
            this.f16587f = Arrays.hashCode(this.f16586e) + ((((((i12 + i11) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f16587f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f16583a + ", id=" + this.d + ", durationMs=" + this.f16585c + ", value=" + this.f16584b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
