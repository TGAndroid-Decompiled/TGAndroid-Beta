package n3;

import b2.m0;
import b2.o0;
import b2.r;
import b2.r0;
import b2.s;
import j$.util.Objects;
import java.util.Arrays;
public final class a implements o0 {
    public static final s f16445g;
    public static final s h;
    public final String f16446a;
    public final String f16447b;
    public final long f16448c;
    public final long d;
    public final byte[] f16449e;
    public int f16450f;

    static {
        r rVar = new r();
        rVar.f2339q = r0.n("application/id3");
        f16445g = new s(rVar);
        r rVar2 = new r();
        rVar2.f2339q = r0.n("application/x-scte35");
        h = new s(rVar2);
    }

    public a(String str, String str2, long j3, long j10, byte[] bArr) {
        this.f16446a = str;
        this.f16447b = str2;
        this.f16448c = j3;
        this.d = j10;
        this.f16449e = bArr;
    }

    @Override
    public final s a() {
        String str = this.f16446a;
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
                return f16445g;
            default:
                return null;
        }
    }

    @Override
    public final byte[] c() {
        if (a() != null) {
            return this.f16449e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f16448c == aVar.f16448c && this.d == aVar.d && Objects.equals(this.f16446a, aVar.f16446a) && Objects.equals(this.f16447b, aVar.f16447b) && Arrays.equals(this.f16449e, aVar.f16449e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f16450f == 0) {
            int i11 = 0;
            String str = this.f16446a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f16447b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j3 = this.f16448c;
            long j10 = this.d;
            this.f16450f = Arrays.hashCode(this.f16449e) + ((((((i12 + i11) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f16450f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f16446a + ", id=" + this.d + ", durationMs=" + this.f16448c + ", value=" + this.f16447b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
