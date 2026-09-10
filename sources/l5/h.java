package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f12789a;
    public final Integer f12790b;
    public final l f12791c;
    public final long d;
    public final long e;
    public final Map f12792f;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap) {
        this.f12789a = str;
        this.f12790b = num;
        this.f12791c = lVar;
        this.d = j3;
        this.e = j10;
        this.f12792f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f12792f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f12792f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f12789a;
        if (str != null) {
            obj.f6103a = str;
            obj.f6104b = this.f12790b;
            l lVar = this.f12791c;
            if (lVar != null) {
                obj.f6105c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f6106f = new HashMap(this.f12792f);
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
            Integer num2 = hVar.f12790b;
            if (this.f12789a.equals(hVar.f12789a) && ((num = this.f12790b) != null ? num.equals(num2) : num2 == null) && this.f12791c.equals(hVar.f12791c) && this.d == hVar.d && this.e == hVar.e && this.f12792f.equals(hVar.f12792f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f12789a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f12790b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f12791c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f12792f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f12789a + ", code=" + this.f12790b + ", encodedPayload=" + this.f12791c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f12792f + "}";
    }
}
