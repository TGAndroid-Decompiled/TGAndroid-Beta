package o5;

import h2.e0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f21731a;
    public final Integer f21732b;
    public final l f21733c;
    public final long d;
    public final long f21734e;
    public final Map f21735f;
    public final Integer f21736g;
    public final String h;
    public final byte[] f21737i;
    public final byte[] f21738j;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f21731a = str;
        this.f21732b = num;
        this.f21733c = lVar;
        this.d = j3;
        this.f21734e = j10;
        this.f21735f = hashMap;
        this.f21736g = num2;
        this.h = str2;
        this.f21737i = bArr;
        this.f21738j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f21735f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f21735f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final e0 c() {
        ?? obj = new Object();
        String str = this.f21731a;
        if (str != null) {
            obj.f13776a = str;
            obj.f13777b = this.f21732b;
            obj.f13781g = this.f21736g;
            obj.h = this.h;
            obj.f13782i = this.f21737i;
            obj.f13783j = this.f21738j;
            l lVar = this.f21733c;
            if (lVar != null) {
                obj.f13778c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f13779e = Long.valueOf(this.f21734e);
                obj.f13780f = new HashMap(this.f21735f);
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
            Integer num3 = hVar.f21736g;
            Integer num4 = hVar.f21732b;
            if (this.f21731a.equals(hVar.f21731a) && ((num = this.f21732b) != null ? num.equals(num4) : num4 == null) && this.f21733c.equals(hVar.f21733c) && this.d == hVar.d && this.f21734e == hVar.f21734e && this.f21735f.equals(hVar.f21735f) && ((num2 = this.f21736g) != null ? num2.equals(num3) : num3 == null) && ((str = this.h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f21737i, hVar.f21737i) && Arrays.equals(this.f21738j, hVar.f21738j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f21731a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        Integer num = this.f21732b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f21734e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.f21733c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f21735f.hashCode()) * 1000003;
        Integer num2 = this.f21736g;
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
        return ((((i10 ^ i7) * 1000003) ^ Arrays.hashCode(this.f21737i)) * 1000003) ^ Arrays.hashCode(this.f21738j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f21731a + ", code=" + this.f21732b + ", encodedPayload=" + this.f21733c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f21734e + ", autoMetadata=" + this.f21735f + ", productId=" + this.f21736g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.f21737i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f21738j) + "}";
    }
}
