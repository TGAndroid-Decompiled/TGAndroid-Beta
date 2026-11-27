package defpackage;

import j$.util.Objects;
import java.util.HashMap;
public final class i2b {
    public final String a;
    public final to5 b;
    public final to5 c;
    public final to5 d;

    public i2b(String str, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = str;
        this.b = to5.b(hashMap);
        this.c = to5.b(hashMap2);
        this.d = to5.b(hashMap3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i2b) {
                i2b i2bVar = (i2b) obj;
                if (Objects.equals(this.a, i2bVar.a) && this.b.equals(i2bVar.b) && this.c.equals(i2bVar.c) && this.d.equals(i2bVar.d)) {
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
