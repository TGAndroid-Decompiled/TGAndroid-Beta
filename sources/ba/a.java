package ba;
public final class a {
    public final int f2517a;
    public String f2518b;
    public int f2519c;

    public int a() {
        String str = this.f2518b;
        int i10 = this.f2519c;
        this.f2519c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.f2519c;
            this.f2519c = i13 + 1;
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
        switch (this.f2517a) {
            case 3:
                return this.f2518b;
            case 4:
                return this.f2519c + ": " + this.f2518b;
            default:
                return super.toString();
        }
    }

    public a(String str, int i10) {
        this.f2517a = i10;
        switch (i10) {
            case 3:
                String[] split = str.split(" +", 3);
                if (split.length >= 2) {
                    String str2 = split[0];
                    this.f2519c = Integer.parseInt(split[1]);
                    if (split.length == 3) {
                        String str3 = split[2];
                    }
                    this.f2518b = str;
                    return;
                }
                throw new IllegalArgumentException();
            default:
                this.f2518b = str;
                this.f2519c = 0;
                return;
        }
    }

    public a(int i10, String str, Object[] objArr) {
        this.f2517a = 4;
        this.f2518b = String.format(str, objArr);
        this.f2519c = i10;
    }

    public a(int i10, String str) {
        this.f2517a = 0;
        this.f2519c = i10;
        this.f2518b = str;
    }
}
