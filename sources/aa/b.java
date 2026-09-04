package aa;
public final class b {
    public final int f373a;
    public String f374b;
    public int f375c;

    public int a() {
        String str = this.f374b;
        int i10 = this.f375c;
        this.f375c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.f375c;
            this.f375c = i13 + 1;
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
        switch (this.f373a) {
            case 2:
                return this.f375c + ": " + this.f374b;
            default:
                return super.toString();
        }
    }

    public b(String str) {
        this.f373a = 1;
        this.f374b = str;
        this.f375c = 0;
    }

    public b(String str, int i10, Object[] objArr) {
        this.f373a = 2;
        this.f374b = String.format(str, objArr);
        this.f375c = i10;
    }

    public b(int i10, String str) {
        this.f373a = 0;
        this.f375c = i10;
        this.f374b = str;
    }
}
