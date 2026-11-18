package o5;

import h2.e0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f21706a;
    public final Integer f21707b;
    public final l f21708c;
    public final long d;
    public final long f21709e;
    public final Map f21710f;
    public final Integer f21711g;
    public final String h;
    public final byte[] f21712i;
    public final byte[] f21713j;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f21706a = str;
        this.f21707b = num;
        this.f21708c = lVar;
        this.d = j3;
        this.f21709e = j10;
        this.f21710f = hashMap;
        this.f21711g = num2;
        this.h = str2;
        this.f21712i = bArr;
        this.f21713j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f21710f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f21710f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final e0 c() {
        ?? obj = new Object();
        String str = this.f21706a;
        if (str != null) {
            obj.f13747a = str;
            obj.f13748b = this.f21707b;
            obj.f13752g = this.f21711g;
            obj.h = this.h;
            obj.f13753i = this.f21712i;
            obj.f13754j = this.f21713j;
            l lVar = this.f21708c;
            if (lVar != null) {
                obj.f13749c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f13750e = Long.valueOf(this.f21709e);
                obj.f13751f = new HashMap(this.f21710f);
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
            Integer num3 = hVar.f21711g;
            Integer num4 = hVar.f21707b;
            if (this.f21706a.equals(hVar.f21706a) && ((num = this.f21707b) != null ? num.equals(num4) : num4 == null) && this.f21708c.equals(hVar.f21708c) && this.d == hVar.d && this.f21709e == hVar.f21709e && this.f21710f.equals(hVar.f21710f) && ((num2 = this.f21711g) != null ? num2.equals(num3) : num3 == null) && ((str = this.h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f21712i, hVar.f21712i) && Arrays.equals(this.f21713j, hVar.f21713j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f21706a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        Integer num = this.f21707b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f21709e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.f21708c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f21710f.hashCode()) * 1000003;
        Integer num2 = this.f21711g;
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
        return ((((i10 ^ i7) * 1000003) ^ Arrays.hashCode(this.f21712i)) * 1000003) ^ Arrays.hashCode(this.f21713j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f21706a + ", code=" + this.f21707b + ", encodedPayload=" + this.f21708c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f21709e + ", autoMetadata=" + this.f21710f + ", productId=" + this.f21711g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.f21712i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f21713j) + "}";
    }
}
