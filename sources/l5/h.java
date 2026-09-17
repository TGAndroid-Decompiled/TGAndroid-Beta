package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15305a;
    public final Integer f15306b;
    public final l f15307c;
    public final long d;
    public final long f15308e;
    public final Map f15309f;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap) {
        this.f15305a = str;
        this.f15306b = num;
        this.f15307c = lVar;
        this.d = j3;
        this.f15308e = j10;
        this.f15309f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15309f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15309f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f15305a;
        if (str != null) {
            obj.f6401a = str;
            obj.f6402b = this.f15306b;
            l lVar = this.f15307c;
            if (lVar != null) {
                obj.f6403c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f6404e = Long.valueOf(this.f15308e);
                obj.f6405f = new HashMap(this.f15309f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            Integer num2 = hVar.f15306b;
            if (this.f15305a.equals(hVar.f15305a) && ((num = this.f15306b) != null ? num.equals(num2) : num2 == null) && this.f15307c.equals(hVar.f15307c) && this.d == hVar.d && this.f15308e == hVar.f15308e && this.f15309f.equals(hVar.f15309f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15305a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15306b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f15308e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15307c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f15309f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15305a + ", code=" + this.f15306b + ", encodedPayload=" + this.f15307c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f15308e + ", autoMetadata=" + this.f15309f + "}";
    }
}
