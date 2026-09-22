package aa;
public final class b {
    public final int f358a;
    public String f359b;
    public int f360c;

    public int a() {
        String str = this.f359b;
        int i10 = this.f360c;
        this.f360c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.f360c;
            this.f360c = i13 + 1;
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
        switch (this.f358a) {
            case 2:
                return this.f360c + ": " + this.f359b;
            default:
                return super.toString();
        }
    }

    public b(String str) {
        this.f358a = 1;
        this.f359b = str;
        this.f360c = 0;
    }

    public b(String str, int i10, Object[] objArr) {
        this.f358a = 2;
        this.f359b = String.format(str, objArr);
        this.f360c = i10;
    }

    public b(int i10, String str) {
        this.f358a = 0;
        this.f360c = i10;
        this.f359b = str;
    }
}
