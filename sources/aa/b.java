package aa;
public final class b {
    public final int f359a;
    public String f360b;
    public int f361c;

    public int a() {
        String str = this.f360b;
        int i10 = this.f361c;
        this.f361c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.f361c;
            this.f361c = i13 + 1;
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
        switch (this.f359a) {
            case 2:
                return this.f361c + ": " + this.f360b;
            default:
                return super.toString();
        }
    }

    public b(String str) {
        this.f359a = 1;
        this.f360b = str;
        this.f361c = 0;
    }

    public b(String str, int i10, Object[] objArr) {
        this.f359a = 2;
        this.f360b = String.format(str, objArr);
        this.f361c = i10;
    }

    public b(int i10, String str) {
        this.f359a = 0;
        this.f361c = i10;
        this.f360b = str;
    }
}
