package aa;
public final class a0 {
    public final String f773a;
    public final String f774b;

    public a0(String str, String str2) {
        this.f773a = str;
        this.f774b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (kotlin.jvm.internal.j.a(this.f773a, a0Var.f773a) && kotlin.jvm.internal.j.a(this.f774b, a0Var.f774b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        String str = this.f773a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f774b;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i10 + i7;
    }

    public final String toString() {
        return "FirebaseInstallationId(fid=" + this.f773a + ", authToken=" + this.f774b + ')';
    }
}
