package c5;
public final class a {
    public String f4694a;
    public String f4695b;

    public a(String str, String str2) {
        this.f4694a = str;
        this.f4695b = str2;
    }

    public s a() {
        if (!"first_party".equals(this.f4695b)) {
            if (this.f4694a != null) {
                if (this.f4695b != null) {
                    return new s(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }
}
