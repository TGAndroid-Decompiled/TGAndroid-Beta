package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f13903a;
    public final Integer f13904b;
    public final m f13905c;
    public final long d;
    public final long e;
    public final Map f13906f;

    public h(String str, Integer num, m mVar, long j3, long j10, HashMap hashMap) {
        this.f13903a = str;
        this.f13904b = num;
        this.f13905c = mVar;
        this.d = j3;
        this.e = j10;
        this.f13906f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f13906f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f13906f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f13903a;
        if (str != null) {
            obj.f7336a = str;
            obj.f7337b = this.f13904b;
            m mVar = this.f13905c;
            if (mVar != null) {
                obj.f7338c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f7339f = new HashMap(this.f13906f);
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
            Integer num2 = hVar.f13904b;
            if (this.f13903a.equals(hVar.f13903a) && ((num = this.f13904b) != null ? num.equals(num2) : num2 == null) && this.f13905c.equals(hVar.f13905c) && this.d == hVar.d && this.e == hVar.e && this.f13906f.equals(hVar.f13906f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f13903a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f13904b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f13905c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f13906f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f13903a + ", code=" + this.f13904b + ", encodedPayload=" + this.f13905c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f13906f + "}";
    }
}
