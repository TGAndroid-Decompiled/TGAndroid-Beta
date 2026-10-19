package ba;
public final class a {
    public final int f4225a;
    public String f4226b;
    public int f4227c;

    public int a() {
        String str = this.f4226b;
        int i10 = this.f4227c;
        this.f4227c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.f4227c;
            this.f4227c = i13 + 1;
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
        switch (this.f4225a) {
            case 2:
                return this.f4227c + ": " + this.f4226b;
            case 3:
                return this.f4226b;
            default:
                return super.toString();
        }
    }

    public a(String str, int i10) {
        this.f4225a = i10;
        switch (i10) {
            case 3:
                String[] split = str.split(" +", 3);
                if (split.length >= 2) {
                    String str2 = split[0];
                    this.f4227c = Integer.parseInt(split[1]);
                    if (split.length == 3) {
                        String str3 = split[2];
                    }
                    this.f4226b = str;
                    return;
                }
                throw new IllegalArgumentException();
            default:
                this.f4226b = str;
                this.f4227c = 0;
                return;
        }
    }

    public a(String str, int i10, Object[] objArr) {
        this.f4225a = 2;
        this.f4226b = String.format(str, objArr);
        this.f4227c = i10;
    }

    public a(int i10, String str) {
        this.f4225a = 0;
        this.f4227c = i10;
        this.f4226b = str;
    }
}
