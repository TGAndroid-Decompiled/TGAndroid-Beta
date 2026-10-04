package aa;
public final class b {
    public final int f388a;
    public String f389b;
    public int f390c;

    public int a() {
        String str = this.f389b;
        int i10 = this.f390c;
        this.f390c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.f390c;
            this.f390c = i13 + 1;
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
        switch (this.f388a) {
            case 2:
                return this.f390c + ": " + this.f389b;
            default:
                return super.toString();
        }
    }

    public b(String str) {
        this.f388a = 1;
        this.f389b = str;
        this.f390c = 0;
    }

    public b(String str, int i10, Object[] objArr) {
        this.f388a = 2;
        this.f389b = String.format(str, objArr);
        this.f390c = i10;
    }

    public b(int i10, String str) {
        this.f388a = 0;
        this.f390c = i10;
        this.f389b = str;
    }
}
