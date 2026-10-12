package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15155a;
    public final Integer f15156b;
    public final m f15157c;
    public final long d;
    public final long f15158e;
    public final Map f15159f;

    public h(String str, Integer num, m mVar, long j3, long j10, HashMap hashMap) {
        this.f15155a = str;
        this.f15156b = num;
        this.f15157c = mVar;
        this.d = j3;
        this.f15158e = j10;
        this.f15159f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15159f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15159f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f15155a;
        if (str != null) {
            obj.f7950a = str;
            obj.f7951b = this.f15156b;
            m mVar = this.f15157c;
            if (mVar != null) {
                obj.f7952c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.f7953e = Long.valueOf(this.f15158e);
                obj.f7954f = new HashMap(this.f15159f);
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
            Integer num2 = hVar.f15156b;
            if (this.f15155a.equals(hVar.f15155a) && ((num = this.f15156b) != null ? num.equals(num2) : num2 == null) && this.f15157c.equals(hVar.f15157c) && this.d == hVar.d && this.f15158e == hVar.f15158e && this.f15159f.equals(hVar.f15159f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15155a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15156b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f15158e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15157c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f15159f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15155a + ", code=" + this.f15156b + ", encodedPayload=" + this.f15157c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f15158e + ", autoMetadata=" + this.f15159f + "}";
    }
}
