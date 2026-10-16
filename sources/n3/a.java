package n3;

import b2.r0;
import b2.t0;
import b2.w;
import b2.w0;
import b2.x;
import j$.util.Objects;
import java.util.Arrays;
public final class a implements t0 {
    public static final x f15697g;
    public static final x h;
    public final String f15698a;
    public final String f15699b;
    public final long f15700c;
    public final long d;
    public final byte[] e;
    public int f15701f;

    static {
        w wVar = new w();
        wVar.f2470r = w0.n("application/id3");
        f15697g = new x(wVar);
        w wVar2 = new w();
        wVar2.f2470r = w0.n("application/x-scte35");
        h = new x(wVar2);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f15698a = str;
        this.f15699b = str2;
        this.f15700c = j10;
        this.d = j11;
        this.e = bArr;
    }

    @Override
    public final x a() {
        String str = this.f15698a;
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
                return f15697g;
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
            if (this.f15700c == aVar.f15700c && this.d == aVar.d && Objects.equals(this.f15698a, aVar.f15698a) && Objects.equals(this.f15699b, aVar.f15699b) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f15701f == 0) {
            int i11 = 0;
            String str = this.f15698a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f15699b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j10 = this.f15700c;
            long j11 = this.d;
            this.f15701f = Arrays.hashCode(this.e) + ((((((i12 + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f15701f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f15698a + ", id=" + this.d + ", durationMs=" + this.f15700c + ", value=" + this.f15699b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
