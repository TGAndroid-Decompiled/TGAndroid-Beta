package d5;
public final class a {
    public String f7928a;
    public String f7929b;

    public a(String str, String str2, boolean z10) {
        this.f7928a = str;
        this.f7929b = str2;
    }

    public r a() {
        if (!"first_party".equals(this.f7929b)) {
            if (this.f7928a != null) {
                if (this.f7929b != null) {
                    return new r(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public a(String str, String str2) {
        o6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f7928a = str;
        this.f7929b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
