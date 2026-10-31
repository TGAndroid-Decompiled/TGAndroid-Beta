package m2;

import j$.util.Objects;
public final class f {
    public final String f12649a;
    public final String f12650b;
    public final String f12651c;

    public f(String str, String str2, String str3) {
        this.f12649a = str;
        this.f12650b = str2;
        this.f12651c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f12649a, fVar.f12649a) && Objects.equals(this.f12650b, fVar.f12650b) && Objects.equals(this.f12651c, fVar.f12651c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f12649a.hashCode() * 31;
        int i11 = 0;
        String str = this.f12650b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f12651c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
