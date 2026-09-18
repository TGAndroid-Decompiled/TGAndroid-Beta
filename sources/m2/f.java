package m2;

import j$.util.Objects;
public final class f {
    public final String f14597a;
    public final String f14598b;
    public final String f14599c;

    public f(String str, String str2, String str3) {
        this.f14597a = str;
        this.f14598b = str2;
        this.f14599c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f14597a, fVar.f14597a) && Objects.equals(this.f14598b, fVar.f14598b) && Objects.equals(this.f14599c, fVar.f14599c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14597a.hashCode() * 31;
        int i11 = 0;
        String str = this.f14598b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f14599c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
