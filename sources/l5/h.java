package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15342a;
    public final Integer f15343b;
    public final m f15344c;
    public final long d;
    public final long f15345e;
    public final Map f15346f;

    public h(String str, Integer num, m mVar, long j3, long j10, HashMap hashMap) {
        this.f15342a = str;
        this.f15343b = num;
        this.f15344c = mVar;
        this.d = j3;
        this.f15345e = j10;
        this.f15346f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15346f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15346f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f15342a;
        if (str != null) {
            obj.f7905a = str;
            obj.f7906b = this.f15343b;
            m mVar = this.f15344c;
            if (mVar != null) {
                obj.f7907c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.f7908e = Long.valueOf(this.f15345e);
                obj.f7909f = new HashMap(this.f15346f);
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
            Integer num2 = hVar.f15343b;
            if (this.f15342a.equals(hVar.f15342a) && ((num = this.f15343b) != null ? num.equals(num2) : num2 == null) && this.f15344c.equals(hVar.f15344c) && this.d == hVar.d && this.f15345e == hVar.f15345e && this.f15346f.equals(hVar.f15346f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15342a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15343b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f15345e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15344c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f15346f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15342a + ", code=" + this.f15343b + ", encodedPayload=" + this.f15344c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f15345e + ", autoMetadata=" + this.f15346f + "}";
    }
}
