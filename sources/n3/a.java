package n3;

import b2.m0;
import b2.o0;
import b2.r;
import b2.r0;
import b2.s;
import j$.util.Objects;
import java.util.Arrays;
public final class a implements o0 {
    public static final s f16561g;
    public static final s h;
    public final String f16562a;
    public final String f16563b;
    public final long f16564c;
    public final long d;
    public final byte[] f16565e;
    public int f16566f;

    static {
        r rVar = new r();
        rVar.f3506q = r0.n("application/id3");
        f16561g = new s(rVar);
        r rVar2 = new r();
        rVar2.f3506q = r0.n("application/x-scte35");
        h = new s(rVar2);
    }

    public a(String str, String str2, long j3, long j10, byte[] bArr) {
        this.f16562a = str;
        this.f16563b = str2;
        this.f16564c = j3;
        this.d = j10;
        this.f16565e = bArr;
    }

    @Override
    public final s a() {
        String str = this.f16562a;
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
                return f16561g;
            default:
                return null;
        }
    }

    @Override
    public final byte[] c() {
        if (a() != null) {
            return this.f16565e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f16564c == aVar.f16564c && this.d == aVar.d && Objects.equals(this.f16562a, aVar.f16562a) && Objects.equals(this.f16563b, aVar.f16563b) && Arrays.equals(this.f16565e, aVar.f16565e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f16566f == 0) {
            int i11 = 0;
            String str = this.f16562a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f16563b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j3 = this.f16564c;
            long j10 = this.d;
            this.f16566f = Arrays.hashCode(this.f16565e) + ((((((i12 + i11) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f16566f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f16562a + ", id=" + this.d + ", durationMs=" + this.f16564c + ", value=" + this.f16563b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
