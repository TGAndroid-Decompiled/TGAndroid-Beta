package m3;
public final class s {
    public final u f17256a;
    public final u f17257b;

    public s(u uVar, u uVar2) {
        this.f17256a = uVar;
        this.f17257b = uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f17256a.equals(sVar.f17256a) && this.f17257b.equals(sVar.f17257b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17257b.hashCode() + (this.f17256a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        u uVar = this.f17256a;
        sb2.append(uVar);
        u uVar2 = this.f17257b;
        if (uVar.equals(uVar2)) {
            str = "";
        } else {
            str = ", " + uVar2;
        }
        return aa.d.r(sb2, str, "]");
    }
}
