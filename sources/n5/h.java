package n5;

import g2.f0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f20237a;
    public final Integer f20238b;
    public final l f20239c;
    public final long d;
    public final long f20240e;
    public final Map f20241f;
    public final Integer f20242g;
    public final String h;
    public final byte[] f20243i;
    public final byte[] f20244j;

    public h(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f20237a = str;
        this.f20238b = num;
        this.f20239c = lVar;
        this.d = j10;
        this.f20240e = j11;
        this.f20241f = hashMap;
        this.f20242g = num2;
        this.h = str2;
        this.f20243i = bArr;
        this.f20244j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f20241f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f20241f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final f0 c() {
        ?? obj = new Object();
        String str = this.f20237a;
        if (str != null) {
            obj.f11833a = str;
            obj.f11834b = this.f20238b;
            obj.f11838g = this.f20242g;
            obj.h = this.h;
            obj.f11839i = this.f20243i;
            obj.f11840j = this.f20244j;
            l lVar = this.f20239c;
            if (lVar != null) {
                obj.f11835c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f11836e = Long.valueOf(this.f20240e);
                obj.f11837f = new HashMap(this.f20241f);
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
            Integer num3 = hVar.f20242g;
            Integer num4 = hVar.f20238b;
            if (this.f20237a.equals(hVar.f20237a) && ((num = this.f20238b) != null ? num.equals(num4) : num4 == null) && this.f20239c.equals(hVar.f20239c) && this.d == hVar.d && this.f20240e == hVar.f20240e && this.f20241f.equals(hVar.f20241f) && ((num2 = this.f20242g) != null ? num2.equals(num3) : num3 == null) && ((str = this.h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f20243i, hVar.f20243i) && Arrays.equals(this.f20244j, hVar.f20244j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f20237a.hashCode() ^ 1000003) * 1000003;
        int i3 = 0;
        Integer num = this.f20238b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.f20240e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.f20239c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f20241f.hashCode()) * 1000003;
        Integer num2 = this.f20242g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (hashCode4 ^ hashCode2) * 1000003;
        String str = this.h;
        if (str != null) {
            i3 = str.hashCode();
        }
        return ((((i10 ^ i3) * 1000003) ^ Arrays.hashCode(this.f20243i)) * 1000003) ^ Arrays.hashCode(this.f20244j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f20237a + ", code=" + this.f20238b + ", encodedPayload=" + this.f20239c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f20240e + ", autoMetadata=" + this.f20241f + ", productId=" + this.f20242g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.f20243i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f20244j) + "}";
    }
}
