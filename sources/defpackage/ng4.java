package defpackage;
public final class ng4 {
    public final String a;
    public final String b;

    public ng4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng4)) {
            return false;
        }
        ng4 ng4Var = (ng4) obj;
        if (rp5.a(this.a, ng4Var.a) && rp5.a(this.b, ng4Var.b)) {
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
