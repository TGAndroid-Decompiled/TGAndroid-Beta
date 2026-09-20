package c5;
public final class a {
    public final int f3841a;
    public String f3842b;
    public String f3843c;

    public a() {
        this.f3841a = 1;
    }

    public r a() {
        if (!"first_party".equals(this.f3843c)) {
            if (this.f3842b != null) {
                if (this.f3843c != null) {
                    return new r(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f3841a) {
            case 3:
                return this.f3842b + ", " + this.f3843c;
            default:
                return super.toString();
        }
    }

    public a(int i10, String str, String str2) {
        this.f3841a = i10;
        this.f3842b = str;
        this.f3843c = str2;
    }

    public a(String str, String str2) {
        this.f3841a = 4;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f3842b = str;
        this.f3843c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
