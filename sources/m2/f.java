package m2;

import j$.util.Objects;
public final class f {
    public final String f14422a;
    public final String f14423b;
    public final String f14424c;

    public f(String str, String str2, String str3) {
        this.f14422a = str;
        this.f14423b = str2;
        this.f14424c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f14422a, fVar.f14422a) && Objects.equals(this.f14423b, fVar.f14423b) && Objects.equals(this.f14424c, fVar.f14424c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14422a.hashCode() * 31;
        int i11 = 0;
        String str = this.f14423b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f14424c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
