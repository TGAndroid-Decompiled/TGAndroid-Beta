package n4;

import d5.f0;
public final class f {
    public final String f18411a;
    public final String f18412b;
    public final String f18413c;

    public f(String str, String str2, String str3) {
        this.f18411a = str;
        this.f18412b = str2;
        this.f18413c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (f0.a(this.f18411a, fVar.f18411a) && f0.a(this.f18412b, fVar.f18412b) && f0.a(this.f18413c, fVar.f18413c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.f18411a.hashCode() * 31;
        int i10 = 0;
        String str = this.f18412b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = (hashCode + i9) * 31;
        String str2 = this.f18413c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }
}
