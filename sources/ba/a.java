package ba;
public final class a {
    public final int f4227a;
    public String f4228b;
    public int f4229c;

    public int a() {
        String str = this.f4228b;
        int i10 = this.f4229c;
        this.f4229c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.f4229c;
            this.f4229c = i13 + 1;
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
        switch (this.f4227a) {
            case 2:
                return this.f4229c + ": " + this.f4228b;
            case 3:
                return this.f4228b;
            default:
                return super.toString();
        }
    }

    public a(String str, int i10) {
        this.f4227a = i10;
        switch (i10) {
            case 3:
                String[] split = str.split(" +", 3);
                if (split.length >= 2) {
                    String str2 = split[0];
                    this.f4229c = Integer.parseInt(split[1]);
                    if (split.length == 3) {
                        String str3 = split[2];
                    }
                    this.f4228b = str;
                    return;
                }
                throw new IllegalArgumentException();
            default:
                this.f4228b = str;
                this.f4229c = 0;
                return;
        }
    }

    public a(String str, int i10, Object[] objArr) {
        this.f4227a = 2;
        this.f4228b = String.format(str, objArr);
        this.f4229c = i10;
    }

    public a(int i10, String str) {
        this.f4227a = 0;
        this.f4229c = i10;
        this.f4228b = str;
    }
}
