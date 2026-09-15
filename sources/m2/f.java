package m2;

import j$.util.Objects;
public final class f {
    public final String f14412a;
    public final String f14413b;
    public final String f14414c;

    public f(String str, String str2, String str3) {
        this.f14412a = str;
        this.f14413b = str2;
        this.f14414c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f14412a, fVar.f14412a) && Objects.equals(this.f14413b, fVar.f14413b) && Objects.equals(this.f14414c, fVar.f14414c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14412a.hashCode() * 31;
        int i11 = 0;
        String str = this.f14413b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f14414c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
