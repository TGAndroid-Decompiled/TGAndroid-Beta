package m2;

import j$.util.Objects;
public final class f {
    public final String f15682a;
    public final String f15683b;
    public final String f15684c;

    public f(String str, String str2, String str3) {
        this.f15682a = str;
        this.f15683b = str2;
        this.f15684c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f15682a, fVar.f15682a) && Objects.equals(this.f15683b, fVar.f15683b) && Objects.equals(this.f15684c, fVar.f15684c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15682a.hashCode() * 31;
        int i11 = 0;
        String str = this.f15683b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f15684c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
