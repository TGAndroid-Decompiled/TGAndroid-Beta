package c5;
public final class a {
    public String f4699a;
    public String f4700b;

    public a(String str, String str2) {
        this.f4699a = str;
        this.f4700b = str2;
    }

    public s a() {
        if (!"first_party".equals(this.f4700b)) {
            if (this.f4699a != null) {
                if (this.f4700b != null) {
                    return new s(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }
}
