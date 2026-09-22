package c5;
public final class a {
    public final int f3840a;
    public String f3841b;
    public String f3842c;

    public a() {
        this.f3840a = 1;
    }

    public q a() {
        if (!"first_party".equals(this.f3842c)) {
            if (this.f3841b != null) {
                if (this.f3842c != null) {
                    return new q(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f3840a) {
            case 3:
                return this.f3841b + ", " + this.f3842c;
            default:
                return super.toString();
        }
    }

    public a(int i10, String str, String str2) {
        this.f3840a = i10;
        this.f3841b = str;
        this.f3842c = str2;
    }

    public a(String str, String str2) {
        this.f3840a = 4;
        n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f3841b = str;
        this.f3842c = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
