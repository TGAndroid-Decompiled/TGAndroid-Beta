package m2;

import j$.util.Objects;
public final class f {
    public final String f15998a;
    public final String f15999b;
    public final String f16000c;

    public f(String str, String str2, String str3) {
        this.f15998a = str;
        this.f15999b = str2;
        this.f16000c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f15998a, fVar.f15998a) && Objects.equals(this.f15999b, fVar.f15999b) && Objects.equals(this.f16000c, fVar.f16000c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15998a.hashCode() * 31;
        int i11 = 0;
        String str = this.f15999b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f16000c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
