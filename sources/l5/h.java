package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15154a;
    public final Integer f15155b;
    public final m f15156c;
    public final long d;
    public final long f15157e;
    public final Map f15158f;

    public h(String str, Integer num, m mVar, long j3, long j10, HashMap hashMap) {
        this.f15154a = str;
        this.f15155b = num;
        this.f15156c = mVar;
        this.d = j3;
        this.f15157e = j10;
        this.f15158f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15158f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15158f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f15154a;
        if (str != null) {
            obj.f7950a = str;
            obj.f7951b = this.f15155b;
            m mVar = this.f15156c;
            if (mVar != null) {
                obj.f7952c = mVar;
                obj.d = Long.valueOf(this.d);
                obj.f7953e = Long.valueOf(this.f15157e);
                obj.f7954f = new HashMap(this.f15158f);
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
            Integer num2 = hVar.f15155b;
            if (this.f15154a.equals(hVar.f15154a) && ((num = this.f15155b) != null ? num.equals(num2) : num2 == null) && this.f15156c.equals(hVar.f15156c) && this.d == hVar.d && this.f15157e == hVar.f15157e && this.f15158f.equals(hVar.f15158f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15154a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15155b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f15157e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15156c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f15158f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15154a + ", code=" + this.f15155b + ", encodedPayload=" + this.f15156c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f15157e + ", autoMetadata=" + this.f15158f + "}";
    }
}
