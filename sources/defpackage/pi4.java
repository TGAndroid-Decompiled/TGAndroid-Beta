package defpackage;
public final class pi4 {
    public final String a;
    public final String b;

    public pi4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi4)) {
            return false;
        }
        pi4 pi4Var = (pi4) obj;
        if (rr5.a(this.a, pi4Var.a) && rr5.a(this.b, pi4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "FirebaseInstallationId(fid=" + this.a + ", authToken=" + this.b + ')';
    }
}
