package m2;

import j$.util.Objects;
public final class f {
    public final String f15778a;
    public final String f15779b;
    public final String f15780c;

    public f(String str, String str2, String str3) {
        this.f15778a = str;
        this.f15779b = str2;
        this.f15780c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f15778a, fVar.f15778a) && Objects.equals(this.f15779b, fVar.f15779b) && Objects.equals(this.f15780c, fVar.f15780c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15778a.hashCode() * 31;
        int i11 = 0;
        String str = this.f15779b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f15780c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
