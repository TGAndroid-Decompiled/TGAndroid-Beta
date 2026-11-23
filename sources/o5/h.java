package o5;

import h2.e0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f21796a;
    public final Integer f21797b;
    public final m f21798c;
    public final long d;
    public final long f21799e;
    public final Map f21800f;
    public final Integer f21801g;
    public final String h;
    public final byte[] f21802i;
    public final byte[] f21803j;

    public h(String str, Integer num, m mVar, long j3, long j10, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f21796a = str;
        this.f21797b = num;
        this.f21798c = mVar;
        this.d = j3;
        this.f21799e = j10;
        this.f21800f = hashMap;
        this.f21801g = num2;
        this.h = str2;
        this.f21802i = bArr;
        this.f21803j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f21800f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f21800f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final e0 c() {
        ?? obj = new Object();
        String str = this.f21796a;
        if (str != null) {
            obj.f13739a = str;
            obj.f13740b = this.f21797b;
            obj.f13744g = this.f21801g;
            obj.h = this.h;
            obj.f13745i = this.f21802i;
            obj.f13746j = this.f21803j;
            m mVar = this.f21798c;
            if (mVar != null) {
                obj.f13741c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.f13742e = Long.valueOf(this.f21799e);
                obj.f13743f = new HashMap(this.f21800f);
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
            Integer num3 = hVar.f21801g;
            Integer num4 = hVar.f21797b;
            if (this.f21796a.equals(hVar.f21796a) && ((num = this.f21797b) != null ? num.equals(num4) : num4 == null) && this.f21798c.equals(hVar.f21798c) && this.d == hVar.d && this.f21799e == hVar.f21799e && this.f21800f.equals(hVar.f21800f) && ((num2 = this.f21801g) != null ? num2.equals(num3) : num3 == null) && ((str = this.h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f21802i, hVar.f21802i) && Arrays.equals(this.f21803j, hVar.f21803j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f21796a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        Integer num = this.f21797b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f21799e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.f21798c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f21800f.hashCode()) * 1000003;
        Integer num2 = this.f21801g;
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
        return ((((i10 ^ i7) * 1000003) ^ Arrays.hashCode(this.f21802i)) * 1000003) ^ Arrays.hashCode(this.f21803j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f21796a + ", code=" + this.f21797b + ", encodedPayload=" + this.f21798c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f21799e + ", autoMetadata=" + this.f21800f + ", productId=" + this.f21801g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.f21802i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f21803j) + "}";
    }
}
