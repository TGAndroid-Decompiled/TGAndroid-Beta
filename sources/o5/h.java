package o5;

import h2.e0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f20815a;
    public final Integer f20816b;
    public final l f20817c;
    public final long d;
    public final long f20818e;
    public final Map f20819f;
    public final Integer f20820g;
    public final String h;
    public final byte[] f20821i;
    public final byte[] f20822j;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f20815a = str;
        this.f20816b = num;
        this.f20817c = lVar;
        this.d = j3;
        this.f20818e = j10;
        this.f20819f = hashMap;
        this.f20820g = num2;
        this.h = str2;
        this.f20821i = bArr;
        this.f20822j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f20819f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f20819f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final e0 c() {
        ?? obj = new Object();
        String str = this.f20815a;
        if (str != null) {
            obj.f14072a = str;
            obj.f14073b = this.f20816b;
            obj.f14077g = this.f20820g;
            obj.h = this.h;
            obj.f14078i = this.f20821i;
            obj.f14079j = this.f20822j;
            l lVar = this.f20817c;
            if (lVar != null) {
                obj.f14074c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f14075e = Long.valueOf(this.f20818e);
                obj.f14076f = new HashMap(this.f20819f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String str2 = hVar.h;
            Integer num3 = hVar.f20820g;
            Integer num4 = hVar.f20816b;
            if (this.f20815a.equals(hVar.f20815a) && ((num = this.f20816b) != null ? num.equals(num4) : num4 == null) && this.f20817c.equals(hVar.f20817c) && this.d == hVar.d && this.f20818e == hVar.f20818e && this.f20819f.equals(hVar.f20819f) && ((num2 = this.f20820g) != null ? num2.equals(num3) : num3 == null) && ((str = this.h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f20821i, hVar.f20821i) && Arrays.equals(this.f20822j, hVar.f20822j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f20815a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        Integer num = this.f20816b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f20818e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.f20817c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f20819f.hashCode()) * 1000003;
        Integer num2 = this.f20820g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (hashCode4 ^ hashCode2) * 1000003;
        String str = this.h;
        if (str != null) {
            i7 = str.hashCode();
        }
        return ((((i10 ^ i7) * 1000003) ^ Arrays.hashCode(this.f20821i)) * 1000003) ^ Arrays.hashCode(this.f20822j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f20815a + ", code=" + this.f20816b + ", encodedPayload=" + this.f20817c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f20818e + ", autoMetadata=" + this.f20819f + ", productId=" + this.f20820g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.f20821i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f20822j) + "}";
    }
}
