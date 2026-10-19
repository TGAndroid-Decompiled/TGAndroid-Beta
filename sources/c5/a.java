package c5;
public final class a {
    public String f4696a;
    public String f4697b;

    public a(String str, String str2) {
        this.f4696a = str;
        this.f4697b = str2;
    }

    public s a() {
        if (!"first_party".equals(this.f4697b)) {
            if (this.f4696a != null) {
                if (this.f4697b != null) {
                    return new s(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }
}
