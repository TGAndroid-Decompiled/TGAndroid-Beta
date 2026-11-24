package defpackage;
public final class at extends ja {
    public final String c;
    public final byte d;

    public at(int i, int i2, String str) {
        super(i, false);
        this.d = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && at.class == obj.getClass()) {
                at atVar = (at) obj;
                if (this.d == atVar.d && this.c.equals(atVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
