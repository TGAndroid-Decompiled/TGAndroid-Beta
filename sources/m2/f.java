package m2;

import j$.util.Objects;
public final class f {
    public final String f14410a;
    public final String f14411b;
    public final String f14412c;

    public f(String str, String str2, String str3) {
        this.f14410a = str;
        this.f14411b = str2;
        this.f14412c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f14410a, fVar.f14410a) && Objects.equals(this.f14411b, fVar.f14411b) && Objects.equals(this.f14412c, fVar.f14412c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14410a.hashCode() * 31;
        int i11 = 0;
        String str = this.f14411b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f14412c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
