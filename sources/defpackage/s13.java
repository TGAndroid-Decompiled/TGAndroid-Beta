package defpackage;
public final class s13 {
    public final byte a;
    public final String b;
    public final String c;

    public s13(String str, String str2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                ite.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
                this.b = str;
                this.c = (str2 == null || str2.length() <= 0) ? null : str2;
                return;
            default:
                this.b = str;
                this.c = str2;
                if (str.length() > 0) {
                    return;
                }
                u36.j("userId should not be empty");
                throw null;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 3:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public s13(String str, String str2, byte b, boolean z) {
        this.a = b;
        this.b = str;
        this.c = str2;
    }
}
