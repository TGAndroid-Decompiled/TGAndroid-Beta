package defpackage;

import j$.util.Objects;
import java.util.HashMap;
public final class j0b {
    public final String a;
    public final qo5 b;
    public final qo5 c;
    public final qo5 d;

    public j0b(String str, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = str;
        this.b = qo5.b(hashMap);
        this.c = qo5.b(hashMap2);
        this.d = qo5.b(hashMap3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j0b) {
                j0b j0bVar = (j0b) obj;
                if (Objects.equals(this.a, j0bVar.a) && this.b.equals(j0bVar.b) && this.c.equals(j0bVar.c) && this.d.equals(j0bVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
}
