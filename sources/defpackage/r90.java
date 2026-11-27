package defpackage;

import java.util.Arrays;
import java.util.HashMap;
public final class r90 {
    public final String a;
    public final Integer b;
    public final j34 c;
    public final long d;
    public final long e;
    public final HashMap f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public r90(String str, Integer num, j34 j34Var, long j, long j2, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = j34Var;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final q90 c() {
        ?? obj = new Object();
        String str = this.a;
        if (str != null) {
            obj.a = str;
            obj.c = this.b;
            obj.d = this.g;
            obj.b = this.h;
            obj.i = this.i;
            obj.j = this.j;
            j34 j34Var = this.c;
            if (j34Var != null) {
                obj.e = j34Var;
                obj.f = Long.valueOf(this.d);
                obj.g = Long.valueOf(this.e);
                obj.h = new HashMap(this.f);
                return obj;
            }
            p3d.h("Null encodedPayload");
            return null;
        }
        p3d.h("Null transportName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof r90) {
                r90 r90Var = (r90) obj;
                if (this.a.equals(r90Var.a)) {
                    Integer num = r90Var.b;
                    Integer num2 = this.b;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    if (this.c.equals(r90Var.c) && this.d == r90Var.d && this.e == r90Var.e && this.f.equals(r90Var.f)) {
                        Integer num3 = r90Var.g;
                        Integer num4 = this.g;
                        if (num4 == null) {
                            if (num3 != null) {
                                return false;
                            }
                        } else if (!num4.equals(num3)) {
                            return false;
                        }
                        String str = r90Var.h;
                        String str2 = this.h;
                        if (str2 == null) {
                            if (str != null) {
                                return false;
                            }
                        } else if (!str2.equals(str)) {
                            return false;
                        }
                        if (Arrays.equals(this.i, r90Var.i) && Arrays.equals(this.j, r90Var.j)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        int hashCode4 = (((((((((hashCode3 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
