package c5;
public final class a {
    public String f4255a;
    public String f4256b;

    public a(String str, String str2) {
        this.f4255a = str;
        this.f4256b = str2;
    }

    public r a() {
        if (!"first_party".equals(this.f4256b)) {
            if (this.f4255a != null) {
                if (this.f4256b != null) {
                    return new r(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }
}
