package c5;
public final class a {
    public final int f4197a;
    public String f4198b;
    public String f4199c;

    public a() {
        this.f4197a = 1;
    }

    public r a() {
        if (!"first_party".equals(this.f4199c)) {
            if (this.f4198b != null) {
                if (this.f4199c != null) {
                    return new r(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public String toString() {
        switch (this.f4197a) {
            case 2:
                return this.f4198b + ", " + this.f4199c;
            default:
                return super.toString();
        }
    }

    public a(int i10, String str, String str2) {
        this.f4197a = i10;
        this.f4198b = str;
        this.f4199c = str2;
    }
}
