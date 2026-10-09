package aa;
public final class b {
    public final int f386a;
    public String f387b;
    public int f388c;

    public int a() {
        String str = this.f387b;
        int i10 = this.f388c;
        this.f388c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.f388c;
            this.f388c = i13 + 1;
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
        switch (this.f386a) {
            case 2:
                return this.f388c + ": " + this.f387b;
            case 3:
                return this.f387b;
            default:
                return super.toString();
        }
    }

    public b(String str, int i10) {
        this.f386a = i10;
        switch (i10) {
            case 3:
                String[] split = str.split(" +", 3);
                if (split.length >= 2) {
                    String str2 = split[0];
                    this.f388c = Integer.parseInt(split[1]);
                    if (split.length == 3) {
                        String str3 = split[2];
                    }
                    this.f387b = str;
                    return;
                }
                throw new IllegalArgumentException();
            default:
                this.f387b = str;
                this.f388c = 0;
                return;
        }
    }

    public b(String str, int i10, Object[] objArr) {
        this.f386a = 2;
        this.f387b = String.format(str, objArr);
        this.f388c = i10;
    }

    public b(int i10, String str) {
        this.f386a = 0;
        this.f388c = i10;
        this.f387b = str;
    }
}
