package defpackage;
public final class bs extends ka {
    public final String c;
    public final byte d;

    public bs(int i, int i2, String str) {
        super(i, false);
        this.d = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && bs.class == obj.getClass()) {
                bs bsVar = (bs) obj;
                if (this.d == bsVar.d && this.c.equals(bsVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
