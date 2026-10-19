package m2;

import j$.util.Objects;
public final class f {
    public final String f16436a;
    public final String f16437b;
    public final String f16438c;

    public f(String str, String str2, String str3) {
        this.f16436a = str;
        this.f16437b = str2;
        this.f16438c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f16436a, fVar.f16436a) && Objects.equals(this.f16437b, fVar.f16437b) && Objects.equals(this.f16438c, fVar.f16438c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f16436a.hashCode() * 31;
        int i11 = 0;
        String str = this.f16437b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f16438c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
