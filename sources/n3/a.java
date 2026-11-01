package n3;

import b2.r0;
import b2.t0;
import b2.v0;
import b2.w;
import b2.x;
import j$.util.Objects;
import java.util.Arrays;
public final class a implements t0 {
    public static final x f13487g;
    public static final x h;
    public final String f13488a;
    public final String f13489b;
    public final long f13490c;
    public final long d;
    public final byte[] e;
    public int f13491f;

    static {
        w wVar = new w();
        wVar.f2370r = v0.n("application/id3");
        f13487g = new x(wVar);
        w wVar2 = new w();
        wVar2.f2370r = v0.n("application/x-scte35");
        h = new x(wVar2);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f13488a = str;
        this.f13489b = str2;
        this.f13490c = j10;
        this.d = j11;
        this.e = bArr;
    }

    @Override
    public final x a() {
        String str = this.f13488a;
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
                return f13487g;
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
            if (this.f13490c == aVar.f13490c && this.d == aVar.d && Objects.equals(this.f13488a, aVar.f13488a) && Objects.equals(this.f13489b, aVar.f13489b) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f13491f == 0) {
            int i11 = 0;
            String str = this.f13488a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f13489b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j10 = this.f13490c;
            long j11 = this.d;
            this.f13491f = Arrays.hashCode(this.e) + ((((((i12 + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f13491f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f13488a + ", id=" + this.d + ", durationMs=" + this.f13490c + ", value=" + this.f13489b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
