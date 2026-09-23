package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f13879a;
    public final Integer f13880b;
    public final m f13881c;
    public final long d;
    public final long e;
    public final Map f13882f;

    public h(String str, Integer num, m mVar, long j3, long j10, HashMap hashMap) {
        this.f13879a = str;
        this.f13880b = num;
        this.f13881c = mVar;
        this.d = j3;
        this.e = j10;
        this.f13882f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f13882f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f13882f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f13879a;
        if (str != null) {
            obj.f7319a = str;
            obj.f7320b = this.f13880b;
            m mVar = this.f13881c;
            if (mVar != null) {
                obj.f7321c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f7322f = new HashMap(this.f13882f);
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
            Integer num2 = hVar.f13880b;
            if (this.f13879a.equals(hVar.f13879a) && ((num = this.f13880b) != null ? num.equals(num2) : num2 == null) && this.f13881c.equals(hVar.f13881c) && this.d == hVar.d && this.e == hVar.e && this.f13882f.equals(hVar.f13882f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f13879a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f13880b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f13881c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f13882f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f13879a + ", code=" + this.f13880b + ", encodedPayload=" + this.f13881c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f13882f + "}";
    }
}
