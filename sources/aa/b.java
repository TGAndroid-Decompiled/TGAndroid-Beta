package aa;
public final class b {
    public final int f361a;
    public String f362b;
    public int f363c;

    public int a() {
        String str = this.f362b;
        int i10 = this.f363c;
        this.f363c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.f363c;
            this.f363c = i13 + 1;
            char charAt2 = str.charAt(i13);
            if (charAt2 >= 55296) {
                i11 |= (charAt2 & 8191) << i12;
                i12 += 13;
            } else {
                return (charAt2 << i12) | i11;
            }
        }
    }

    public String toString() {
        switch (this.f361a) {
            case 2:
                return this.f363c + ": " + this.f362b;
            default:
                return super.toString();
        }
    }

    public b(String str) {
        this.f361a = 1;
        this.f362b = str;
        this.f363c = 0;
    }

    public b(String str, int i10, Object[] objArr) {
        this.f361a = 2;
        this.f362b = String.format(str, objArr);
        this.f363c = i10;
    }

    public b(int i10, String str) {
        this.f361a = 0;
        this.f363c = i10;
        this.f362b = str;
    }
}
