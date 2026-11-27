package defpackage;
public final class u1c {
    public static final u1c d = new u1c(new t1c[0]);
    public static final String e;
    public final int a;
    public final j99 b;
    public int c;

    static {
        String str = gcc.a;
        e = "0";
    }

    public u1c(t1c... t1cVarArr) {
        j99 r = po5.r(t1cVarArr);
        this.b = r;
        this.a = t1cVarArr.length;
        int i = 0;
        while (i < r.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < r.d; i3++) {
                if (((t1c) r.get(i)).equals(r.get(i3))) {
                    efd.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final t1c a(int i) {
        return (t1c) this.b.get(i);
    }

    public final int b(t1c t1cVar) {
        int indexOf = this.b.indexOf(t1cVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u1c.class == obj.getClass()) {
                u1c u1cVar = (u1c) obj;
                if (this.a == u1cVar.a && this.b.equals(u1cVar.b)) {
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
