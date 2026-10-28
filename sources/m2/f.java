package m2;

import j$.util.Objects;
public final class f {
    public final String f17953a;
    public final String f17954b;
    public final String f17955c;

    public f(String str, String str2, String str3) {
        this.f17953a = str;
        this.f17954b = str2;
        this.f17955c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f17953a, fVar.f17953a) && Objects.equals(this.f17954b, fVar.f17954b) && Objects.equals(this.f17955c, fVar.f17955c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f17953a.hashCode() * 31;
        int i11 = 0;
        String str = this.f17954b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f17955c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
