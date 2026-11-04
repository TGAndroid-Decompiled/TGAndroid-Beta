package o2;

import j$.util.Objects;
public final class f {
    public final String f20534a;
    public final String f20535b;
    public final String f20536c;

    public f(String str, String str2, String str3) {
        this.f20534a = str;
        this.f20535b = str2;
        this.f20536c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f20534a, fVar.f20534a) && Objects.equals(this.f20535b, fVar.f20535b) && Objects.equals(this.f20536c, fVar.f20536c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = this.f20534a.hashCode() * 31;
        int i10 = 0;
        String str = this.f20535b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (hashCode + i3) * 31;
        String str2 = this.f20536c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
