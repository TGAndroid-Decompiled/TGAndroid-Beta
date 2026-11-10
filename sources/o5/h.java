package o5;

import h2.e0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f20823a;
    public final Integer f20824b;
    public final l f20825c;
    public final long d;
    public final long f20826e;
    public final Map f20827f;
    public final Integer f20828g;
    public final String h;
    public final byte[] f20829i;
    public final byte[] f20830j;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f20823a = str;
        this.f20824b = num;
        this.f20825c = lVar;
        this.d = j3;
        this.f20826e = j10;
        this.f20827f = hashMap;
        this.f20828g = num2;
        this.h = str2;
        this.f20829i = bArr;
        this.f20830j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f20827f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f20827f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final e0 c() {
        ?? obj = new Object();
        String str = this.f20823a;
        if (str != null) {
            obj.f14074a = str;
            obj.f14075b = this.f20824b;
            obj.f14079g = this.f20828g;
            obj.h = this.h;
            obj.f14080i = this.f20829i;
            obj.f14081j = this.f20830j;
            l lVar = this.f20825c;
            if (lVar != null) {
                obj.f14076c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f14077e = Long.valueOf(this.f20826e);
                obj.f14078f = new HashMap(this.f20827f);
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
            Integer num3 = hVar.f20828g;
            Integer num4 = hVar.f20824b;
            if (this.f20823a.equals(hVar.f20823a) && ((num = this.f20824b) != null ? num.equals(num4) : num4 == null) && this.f20825c.equals(hVar.f20825c) && this.d == hVar.d && this.f20826e == hVar.f20826e && this.f20827f.equals(hVar.f20827f) && ((num2 = this.f20828g) != null ? num2.equals(num3) : num3 == null) && ((str = this.h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f20829i, hVar.f20829i) && Arrays.equals(this.f20830j, hVar.f20830j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f20823a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        Integer num = this.f20824b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f20826e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.f20825c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f20827f.hashCode()) * 1000003;
        Integer num2 = this.f20828g;
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
        return ((((i10 ^ i7) * 1000003) ^ Arrays.hashCode(this.f20829i)) * 1000003) ^ Arrays.hashCode(this.f20830j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f20823a + ", code=" + this.f20824b + ", encodedPayload=" + this.f20825c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f20826e + ", autoMetadata=" + this.f20827f + ", productId=" + this.f20828g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.f20829i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f20830j) + "}";
    }
}
