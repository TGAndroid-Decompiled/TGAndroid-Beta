package aa;
public final class b {
    public final int f385a;
    public String f386b;
    public int f387c;

    public int a() {
        String str = this.f386b;
        int i10 = this.f387c;
        this.f387c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.f387c;
            this.f387c = i13 + 1;
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
        switch (this.f385a) {
            case 2:
                return this.f387c + ": " + this.f386b;
            default:
                return super.toString();
        }
    }

    public b(String str) {
        this.f385a = 1;
        this.f386b = str;
        this.f387c = 0;
    }

    public b(String str, int i10, Object[] objArr) {
        this.f385a = 2;
        this.f386b = String.format(str, objArr);
        this.f387c = i10;
    }

    public b(int i10, String str) {
        this.f385a = 0;
        this.f387c = i10;
        this.f386b = str;
    }
}
