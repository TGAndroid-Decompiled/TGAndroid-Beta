package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f14103a;
    public final Integer f14104b;
    public final m f14105c;
    public final long d;
    public final long e;
    public final Map f14106f;

    public h(String str, Integer num, m mVar, long j3, long j10, HashMap hashMap) {
        this.f14103a = str;
        this.f14104b = num;
        this.f14105c = mVar;
        this.d = j3;
        this.e = j10;
        this.f14106f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f14106f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f14106f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f14103a;
        if (str != null) {
            obj.f7328a = str;
            obj.f7329b = this.f14104b;
            m mVar = this.f14105c;
            if (mVar != null) {
                obj.f7330c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f7331f = new HashMap(this.f14106f);
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
            Integer num2 = hVar.f14104b;
            if (this.f14103a.equals(hVar.f14103a) && ((num = this.f14104b) != null ? num.equals(num2) : num2 == null) && this.f14105c.equals(hVar.f14105c) && this.d == hVar.d && this.e == hVar.e && this.f14106f.equals(hVar.f14106f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f14103a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f14104b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f14105c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14106f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f14103a + ", code=" + this.f14104b + ", encodedPayload=" + this.f14105c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f14106f + "}";
    }
}
