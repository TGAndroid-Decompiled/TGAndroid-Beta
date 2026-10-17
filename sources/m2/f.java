package m2;

import j$.util.Objects;
public final class f {
    public final String f16428a;
    public final String f16429b;
    public final String f16430c;

    public f(String str, String str2, String str3) {
        this.f16428a = str;
        this.f16429b = str2;
        this.f16430c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f16428a, fVar.f16428a) && Objects.equals(this.f16429b, fVar.f16429b) && Objects.equals(this.f16430c, fVar.f16430c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f16428a.hashCode() * 31;
        int i11 = 0;
        String str = this.f16429b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f16430c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
