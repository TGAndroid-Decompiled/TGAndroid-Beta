package m2;

import j$.util.Objects;
public final class f {
    public final String f14633a;
    public final String f14634b;
    public final String f14635c;

    public f(String str, String str2, String str3) {
        this.f14633a = str;
        this.f14634b = str2;
        this.f14635c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f14633a, fVar.f14633a) && Objects.equals(this.f14634b, fVar.f14634b) && Objects.equals(this.f14635c, fVar.f14635c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14633a.hashCode() * 31;
        int i11 = 0;
        String str = this.f14634b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f14635c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
