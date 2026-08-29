package o3;
public final class s {
    public final u f19115a;
    public final u f19116b;

    public s(u uVar, u uVar2) {
        this.f19115a = uVar;
        this.f19116b = uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f19115a.equals(sVar.f19115a) && this.f19116b.equals(sVar.f19116b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19116b.hashCode() + (this.f19115a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        u uVar = this.f19115a;
        sb2.append(uVar);
        u uVar2 = this.f19116b;
        if (uVar.equals(uVar2)) {
            str = "";
        } else {
            str = ", " + uVar2;
        }
        return a4.w.q(sb2, str, "]");
    }
}
