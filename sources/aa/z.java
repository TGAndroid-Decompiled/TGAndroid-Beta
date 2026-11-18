package aa;
public final class z {
    public final String f885a;
    public final String f886b;

    public z(String str, String str2) {
        this.f885a = str;
        this.f886b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (kotlin.jvm.internal.j.a(this.f885a, zVar.f885a) && kotlin.jvm.internal.j.a(this.f886b, zVar.f886b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        String str = this.f885a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f886b;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i10 + i7;
    }

    public final String toString() {
        return "FirebaseInstallationId(fid=" + this.f885a + ", authToken=" + this.f886b + ')';
    }
}
