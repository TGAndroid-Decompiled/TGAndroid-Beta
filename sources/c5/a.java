package c5;
public final class a {
    public String f4698a;
    public String f4699b;

    public a(String str, String str2) {
        this.f4698a = str;
        this.f4699b = str2;
    }

    public r a() {
        if (!"first_party".equals(this.f4699b)) {
            if (this.f4698a != null) {
                if (this.f4699b != null) {
                    return new r(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }
}
