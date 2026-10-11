package l5;

import java.util.HashMap;
import java.util.Map;
public final class h {
    public final String f15445a;
    public final Integer f15446b;
    public final l f15447c;
    public final long d;
    public final long f15448e;
    public final Map f15449f;

    public h(String str, Integer num, l lVar, long j3, long j10, HashMap hashMap) {
        this.f15445a = str;
        this.f15446b = num;
        this.f15447c = lVar;
        this.d = j3;
        this.f15448e = j10;
        this.f15449f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f15449f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f15449f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final com.google.firebase.messaging.n c() {
        ?? obj = new Object();
        String str = this.f15445a;
        if (str != null) {
            obj.f7953a = str;
            obj.f7954b = this.f15446b;
            l lVar = this.f15447c;
            if (lVar != null) {
                obj.f7955c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.f7956e = Long.valueOf(this.f15448e);
                obj.f7957f = new HashMap(this.f15449f);
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
            Integer num2 = hVar.f15446b;
            if (this.f15445a.equals(hVar.f15445a) && ((num = this.f15446b) != null ? num.equals(num2) : num2 == null) && this.f15447c.equals(hVar.f15447c) && this.d == hVar.d && this.f15448e == hVar.f15448e && this.f15449f.equals(hVar.f15449f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15445a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15446b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.d;
        long j10 = this.f15448e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f15447c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f15449f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f15445a + ", code=" + this.f15446b + ", encodedPayload=" + this.f15447c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.f15448e + ", autoMetadata=" + this.f15449f + "}";
    }
}
