package defpackage;

import java.util.Map;
public final class o9a {
    public static final n9a Companion = new Object();
    public static final h26[] d = {null, null, ure.a(new tg8())};
    public final s9a a;
    public final orb b;
    public final Map c;

    public o9a(int i, s9a s9aVar, orb orbVar, Map map) {
        if (1 == (i & 1)) {
            this.a = s9aVar;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = orbVar;
            }
            if ((i & 4) == 0) {
                this.c = null;
                return;
            } else {
                this.c = map;
                return;
            }
        }
        sve.a(i, 1, m9a.a.d());
        throw null;
    }

    public static o9a a(o9a o9aVar, s9a s9aVar, orb orbVar, Map map, int i) {
        if ((i & 1) != 0) {
            s9aVar = o9aVar.a;
        }
        if ((i & 2) != 0) {
            orbVar = o9aVar.b;
        }
        if ((i & 4) != 0) {
            map = o9aVar.c;
        }
        o9aVar.getClass();
        s9aVar.getClass();
        return new o9a(s9aVar, orbVar, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9a)) {
            return false;
        }
        o9a o9aVar = (o9a) obj;
        if (ur5.a(this.a, o9aVar.a) && ur5.a(this.b, o9aVar.b) && ur5.a(this.c, o9aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        orb orbVar = this.b;
        if (orbVar == null) {
            hashCode = 0;
        } else {
            hashCode = orbVar.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Map map = this.c;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public o9a(s9a s9aVar, orb orbVar, Map map) {
        s9aVar.getClass();
        this.a = s9aVar;
        this.b = orbVar;
        this.c = map;
    }
}
