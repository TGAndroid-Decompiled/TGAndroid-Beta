package defpackage;
public final class vzb {
    public static final vzb d = new vzb(new uzb[0]);
    public static final String e;
    public final int a;
    public final y79 b;
    public int c;

    static {
        String str = hac.a;
        e = "0";
    }

    public vzb(uzb... uzbVarArr) {
        y79 r = mo5.r(uzbVarArr);
        this.b = r;
        this.a = uzbVarArr.length;
        int i = 0;
        while (i < r.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < r.d; i3++) {
                if (((uzb) r.get(i)).equals(r.get(i3))) {
                    ncd.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final uzb a(int i) {
        return (uzb) this.b.get(i);
    }

    public final int b(uzb uzbVar) {
        int indexOf = this.b.indexOf(uzbVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && vzb.class == obj.getClass()) {
                vzb vzbVar = (vzb) obj;
                if (this.a == vzbVar.a && this.b.equals(vzbVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = this.b.hashCode();
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        return this.b.toString();
    }
}
