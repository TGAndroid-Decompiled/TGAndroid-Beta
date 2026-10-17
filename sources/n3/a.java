package n3;

import b2.q0;
import b2.s0;
import b2.v;
import b2.v0;
import b2.w;
import j$.util.Objects;
import java.util.Arrays;
public final class a implements s0 {
    public static final w f17076g;
    public static final w h;
    public final String f17077a;
    public final String f17078b;
    public final long f17079c;
    public final long d;
    public final byte[] e;
    public int f17080f;

    static {
        v vVar = new v();
        vVar.f4078r = v0.n("application/id3");
        f17076g = new w(vVar);
        v vVar2 = new v();
        vVar2.f4078r = v0.n("application/x-scte35");
        h = new w(vVar2);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f17077a = str;
        this.f17078b = str2;
        this.f17079c = j10;
        this.d = j11;
        this.e = bArr;
    }

    @Override
    public final w a() {
        String str = this.f17077a;
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
                return f17076g;
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
            if (this.f17079c == aVar.f17079c && this.d == aVar.d && Objects.equals(this.f17077a, aVar.f17077a) && Objects.equals(this.f17078b, aVar.f17078b) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f17080f == 0) {
            int i11 = 0;
            String str = this.f17077a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f17078b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j10 = this.f17079c;
            long j11 = this.d;
            this.f17080f = Arrays.hashCode(this.e) + ((((((i12 + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f17080f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f17077a + ", id=" + this.d + ", durationMs=" + this.f17079c + ", value=" + this.f17078b;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
