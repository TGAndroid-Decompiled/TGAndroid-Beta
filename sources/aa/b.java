package aa;
public final class b {
    public final int f357a;
    public String f358b;
    public int f359c;

    public int a() {
        String str = this.f358b;
        int i10 = this.f359c;
        this.f359c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.f359c;
            this.f359c = i13 + 1;
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
        switch (this.f357a) {
            case 2:
                return this.f359c + ": " + this.f358b;
            default:
                return super.toString();
        }
    }

    public b(String str) {
        this.f357a = 1;
        this.f358b = str;
        this.f359c = 0;
    }

    public b(String str, int i10, Object[] objArr) {
        this.f357a = 2;
        this.f358b = String.format(str, objArr);
        this.f359c = i10;
    }

    public b(int i10, String str) {
        this.f357a = 0;
        this.f359c = i10;
        this.f358b = str;
    }
}
