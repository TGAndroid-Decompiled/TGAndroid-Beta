package m3;

public final class s {

    public final u f17632a;

    public final u f17633b;

    public s(u uVar, u uVar2) {
        this.f17632a = uVar;
        this.f17633b = uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f17632a.equals(sVar.f17632a) && this.f17633b.equals(sVar.f17633b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17633b.hashCode() + (this.f17632a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        u uVar = this.f17632a;
        sb2.append(uVar);
        u uVar2 = this.f17633b;
        if (uVar.equals(uVar2)) {
            str = "";
        } else {
            str = ", " + uVar2;
        }
        return a9.p.p(sb2, str, "]");
    }
}
