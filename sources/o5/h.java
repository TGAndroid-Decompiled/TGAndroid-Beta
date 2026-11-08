package o5;

import h2.e0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f20818a;
    public final Integer f20819b;
    public final l f20820c;
    public final long d;
    public final long f20821e;
    public final Map f20822f;
    public final Integer f20823g;
    public final String h;
    public final byte[] f20824i;
    public final byte[] f20825j;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f20818a = str;
        this.f20819b = num;
        this.f20820c = lVar;
        this.d = j3;
        this.f20821e = j10;
        this.f20822f = hashMap;
        this.f20823g = num2;
        this.h = str2;
        this.f20824i = bArr;
        this.f20825j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f20822f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f20822f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final e0 c() {
        ?? obj = new Object();
        String str = this.f20818a;
        if (str != null) {
            obj.f14072a = str;
            obj.f14073b = this.f20819b;
            obj.f14077g = this.f20823g;
            obj.h = this.h;
            obj.f14078i = this.f20824i;
            obj.f14079j = this.f20825j;
            l lVar = this.f20820c;
            if (lVar != null) {
                obj.f14074c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f14075e = Long.valueOf(this.f20821e);
                obj.f14076f = new HashMap(this.f20822f);
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
            Integer num3 = hVar.f20823g;
            Integer num4 = hVar.f20819b;
            if (this.f20818a.equals(hVar.f20818a) && ((num = this.f20819b) != null ? num.equals(num4) : num4 == null) && this.f20820c.equals(hVar.f20820c) && this.d == hVar.d && this.f20821e == hVar.f20821e && this.f20822f.equals(hVar.f20822f) && ((num2 = this.f20823g) != null ? num2.equals(num3) : num3 == null) && ((str = this.h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f20824i, hVar.f20824i) && Arrays.equals(this.f20825j, hVar.f20825j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f20818a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        Integer num = this.f20819b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f20821e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.f20820c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f20822f.hashCode()) * 1000003;
        Integer num2 = this.f20823g;
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
        return ((((i10 ^ i7) * 1000003) ^ Arrays.hashCode(this.f20824i)) * 1000003) ^ Arrays.hashCode(this.f20825j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f20818a + ", code=" + this.f20819b + ", encodedPayload=" + this.f20820c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f20821e + ", autoMetadata=" + this.f20822f + ", productId=" + this.f20823g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.f20824i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f20825j) + "}";
    }
}
