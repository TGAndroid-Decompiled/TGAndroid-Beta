package ba;
public final class a {
    public final int f2616a;
    public String f2617b;
    public int f2618c;

    public int a() {
        String str = this.f2617b;
        int i10 = this.f2618c;
        this.f2618c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.f2618c;
            this.f2618c = i13 + 1;
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
        switch (this.f2616a) {
            case 2:
                return this.f2618c + ": " + this.f2617b;
            case 3:
                return this.f2617b;
            default:
                return super.toString();
        }
    }

    public a(String str, int i10) {
        this.f2616a = i10;
        switch (i10) {
            case 3:
                String[] split = str.split(" +", 3);
                if (split.length >= 2) {
                    String str2 = split[0];
                    this.f2618c = Integer.parseInt(split[1]);
                    if (split.length == 3) {
                        String str3 = split[2];
                    }
                    this.f2617b = str;
                    return;
                }
                throw new IllegalArgumentException();
            default:
                this.f2617b = str;
                this.f2618c = 0;
                return;
        }
    }

    public a(String str, int i10, Object[] objArr) {
        this.f2616a = 2;
        this.f2617b = String.format(str, objArr);
        this.f2618c = i10;
    }

    public a(int i10, String str) {
        this.f2616a = 0;
        this.f2618c = i10;
        this.f2617b = str;
    }
}
