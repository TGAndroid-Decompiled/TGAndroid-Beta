package defpackage;

import java.util.Map;
public final class y7a {
    public static final x7a Companion = new Object();
    public static final d26[] d = {null, null, fpe.a(new hf8())};
    public final c8a a;
    public final ppb b;
    public final Map c;

    public y7a(int i, c8a c8aVar, ppb ppbVar, Map map) {
        if (1 == (i & 1)) {
            this.a = c8aVar;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = ppbVar;
            }
            if ((i & 4) == 0) {
                this.c = null;
                return;
            } else {
                this.c = map;
                return;
            }
        }
        dte.a(i, 1, w7a.a.d());
        throw null;
    }

    public static y7a a(y7a y7aVar, c8a c8aVar, ppb ppbVar, Map map, int i) {
        if ((i & 1) != 0) {
            c8aVar = y7aVar.a;
        }
        if ((i & 2) != 0) {
            ppbVar = y7aVar.b;
        }
        if ((i & 4) != 0) {
            map = y7aVar.c;
        }
        y7aVar.getClass();
        c8aVar.getClass();
        return new y7a(c8aVar, ppbVar, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7a)) {
            return false;
        }
        y7a y7aVar = (y7a) obj;
        if (rr5.a(this.a, y7aVar.a) && rr5.a(this.b, y7aVar.b) && rr5.a(this.c, y7aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        ppb ppbVar = this.b;
        if (ppbVar == null) {
            hashCode = 0;
        } else {
            hashCode = ppbVar.hashCode();
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

    public y7a(c8a c8aVar, ppb ppbVar, Map map) {
        c8aVar.getClass();
        this.a = c8aVar;
        this.b = ppbVar;
        this.c = map;
    }
}
