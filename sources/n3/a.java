package n3;

import b2.m0;
import b2.o0;
import b2.r;
import b2.r0;
import b2.s;
import j$.util.Objects;
import java.util.Arrays;
public final class a implements o0 {
    public static final s f14898g;
    public static final s h;
    public final String f14899a;
    public final String f14900b;
    public final long f14901c;
    public final long d;
    public final byte[] e;
    public int f14902f;

    static {
        r rVar = new r();
        rVar.f3245q = r0.n("application/id3");
        f14898g = new s(rVar);
        r rVar2 = new r();
        rVar2.f3245q = r0.n("application/x-scte35");
        h = new s(rVar2);
    }

    public a(String str, String str2, long j3, long j10, byte[] bArr) {
        this.f14899a = str;
        this.f14900b = str2;
        this.f14901c = j3;
        this.d = j10;
        this.e = bArr;
    }

    @Override
    public final s a() {
        String str = this.f14899a;
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
                return f14898g;
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
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f14901c == aVar.f14901c && this.d == aVar.d && Objects.equals(this.f14899a, aVar.f14899a) && Objects.equals(this.f14900b, aVar.f14900b) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f14902f == 0) {
            int i11 = 0;
            String str = this.f14899a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f14900b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j3 = this.f14901c;
            long j10 = this.d;
            this.f14902f = Arrays.hashCode(this.e) + ((((((i12 + i11) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f14902f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f14899a + ", id=" + this.d + ", durationMs=" + this.f14901c + ", value=" + this.f14900b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
