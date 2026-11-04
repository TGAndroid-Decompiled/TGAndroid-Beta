package ad;
public final class b {
    public final int f314a;
    public String f315b;
    public int f316c;

    public int a() {
        String str = this.f315b;
        int i3 = this.f316c;
        this.f316c = i3 + 1;
        char charAt = str.charAt(i3);
        if (charAt < 55296) {
            return charAt;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        while (true) {
            int i12 = this.f316c;
            this.f316c = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
            } else {
                return (charAt2 << i11) | i10;
            }
        }
    }

    public String toString() {
        switch (this.f314a) {
            case 0:
                return this.f316c + ": " + this.f315b;
            case 4:
                return this.f315b;
            default:
                return super.toString();
        }
    }

    public b(String str, int i3) {
        this.f314a = i3;
        switch (i3) {
            case 4:
                String[] split = str.split(" +", 3);
                if (split.length >= 2) {
                    String str2 = split[0];
                    this.f316c = Integer.parseInt(split[1]);
                    if (split.length == 3) {
                        String str3 = split[2];
                    }
                    this.f315b = str;
                    return;
                }
                throw new IllegalArgumentException();
            default:
                this.f315b = str;
                this.f316c = 0;
                return;
        }
    }

    public b(int i3, String str, Object[] objArr) {
        this.f314a = 0;
        this.f315b = String.format(str, objArr);
        this.f316c = i3;
    }

    public b(int i3, String str) {
        this.f314a = 3;
        this.f316c = i3;
        this.f315b = str;
    }
}
