package defpackage;
public final class as extends ja {
    public final String c;
    public final byte d;

    public as(int i, int i2, String str) {
        super(i, false);
        this.d = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && as.class == obj.getClass()) {
                as asVar = (as) obj;
                if (this.d == asVar.d && this.c.equals(asVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
