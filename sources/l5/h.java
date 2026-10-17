package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15910a;
    public final Integer f15911b;
    public final m f15912c;
    public final long d;
    public final long e;
    public final Map f15913f;

    public h(String str, Integer num, m mVar, long j10, long j11, HashMap hashMap) {
        this.f15910a = str;
        this.f15911b = num;
        this.f15912c = mVar;
        this.d = j10;
        this.e = j11;
        this.f15913f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15913f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15913f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.l c() {
        ?? obj = new Object();
        String str = this.f15910a;
        if (str != null) {
            obj.f7647a = str;
            obj.f7648b = this.f15911b;
            m mVar = this.f15912c;
            if (mVar != null) {
                obj.f7649c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f7650f = new HashMap(this.f15913f);
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
            Integer num2 = hVar.f15911b;
            if (this.f15910a.equals(hVar.f15910a) && ((num = this.f15911b) != null ? num.equals(num2) : num2 == null) && this.f15912c.equals(hVar.f15912c) && this.d == hVar.d && this.e == hVar.e && this.f15913f.equals(hVar.f15913f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15910a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15911b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.d;
        long j11 = this.e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15912c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f15913f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15910a + ", code=" + this.f15911b + ", encodedPayload=" + this.f15912c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f15913f + "}";
    }
}
