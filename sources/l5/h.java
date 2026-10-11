package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15409a;
    public final Integer f15410b;
    public final l f15411c;
    public final long d;
    public final long f15412e;
    public final Map f15413f;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap) {
        this.f15409a = str;
        this.f15410b = num;
        this.f15411c = lVar;
        this.d = j3;
        this.f15412e = j10;
        this.f15413f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15413f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15413f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f15409a;
        if (str != null) {
            obj.f7953a = str;
            obj.f7954b = this.f15410b;
            l lVar = this.f15411c;
            if (lVar != null) {
                obj.f7955c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f7956e = Long.valueOf(this.f15412e);
                obj.f7957f = new HashMap(this.f15413f);
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
            Integer num2 = hVar.f15410b;
            if (this.f15409a.equals(hVar.f15409a) && ((num = this.f15410b) != null ? num.equals(num2) : num2 == null) && this.f15411c.equals(hVar.f15411c) && this.d == hVar.d && this.f15412e == hVar.f15412e && this.f15413f.equals(hVar.f15413f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15409a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15410b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f15412e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15411c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f15413f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15409a + ", code=" + this.f15410b + ", encodedPayload=" + this.f15411c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f15412e + ", autoMetadata=" + this.f15413f + "}";
    }
}
