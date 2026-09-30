package m2;

import j$.util.Objects;
public final class f {
    public final String f14654a;
    public final String f14655b;
    public final String f14656c;

    public f(String str, String str2, String str3) {
        this.f14654a = str;
        this.f14655b = str2;
        this.f14656c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f14654a, fVar.f14654a) && Objects.equals(this.f14655b, fVar.f14655b) && Objects.equals(this.f14656c, fVar.f14656c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14654a.hashCode() * 31;
        int i11 = 0;
        String str = this.f14655b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f14656c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
