package c5;
public final class a {
    public String f4697a;
    public String f4698b;

    public a(String str, String str2) {
        this.f4697a = str;
        this.f4698b = str2;
    }

    public r a() {
        if (!"first_party".equals(this.f4698b)) {
            if (this.f4697a != null) {
                if (this.f4698b != null) {
                    return new r(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }
}
