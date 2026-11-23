package o5;

import h2.e0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f21697a;
    public final Integer f21698b;
    public final l f21699c;
    public final long d;
    public final long f21700e;
    public final Map f21701f;
    public final Integer f21702g;
    public final String h;
    public final byte[] f21703i;
    public final byte[] f21704j;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f21697a = str;
        this.f21698b = num;
        this.f21699c = lVar;
        this.d = j3;
        this.f21700e = j10;
        this.f21701f = hashMap;
        this.f21702g = num2;
        this.h = str2;
        this.f21703i = bArr;
        this.f21704j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f21701f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f21701f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final e0 c() {
        ?? obj = new Object();
        String str = this.f21697a;
        if (str != null) {
            obj.f13739a = str;
            obj.f13740b = this.f21698b;
            obj.f13744g = this.f21702g;
            obj.h = this.h;
            obj.f13745i = this.f21703i;
            obj.f13746j = this.f21704j;
            l lVar = this.f21699c;
            if (lVar != null) {
                obj.f13741c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f13742e = Long.valueOf(this.f21700e);
                obj.f13743f = new HashMap(this.f21701f);
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
            Integer num3 = hVar.f21702g;
            Integer num4 = hVar.f21698b;
            if (this.f21697a.equals(hVar.f21697a) && ((num = this.f21698b) != null ? num.equals(num4) : num4 == null) && this.f21699c.equals(hVar.f21699c) && this.d == hVar.d && this.f21700e == hVar.f21700e && this.f21701f.equals(hVar.f21701f) && ((num2 = this.f21702g) != null ? num2.equals(num3) : num3 == null) && ((str = this.h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f21703i, hVar.f21703i) && Arrays.equals(this.f21704j, hVar.f21704j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f21697a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        Integer num = this.f21698b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f21700e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.f21699c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f21701f.hashCode()) * 1000003;
        Integer num2 = this.f21702g;
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
        return ((((i10 ^ i7) * 1000003) ^ Arrays.hashCode(this.f21703i)) * 1000003) ^ Arrays.hashCode(this.f21704j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f21697a + ", code=" + this.f21698b + ", encodedPayload=" + this.f21699c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f21700e + ", autoMetadata=" + this.f21701f + ", productId=" + this.f21702g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.f21703i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f21704j) + "}";
    }
}
