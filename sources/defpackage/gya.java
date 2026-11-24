package defpackage;

import j$.util.Objects;
import java.util.HashMap;
public final class gya {
    public final String a;
    public final qm5 b;
    public final qm5 c;
    public final qm5 d;

    public gya(String str, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = str;
        this.b = qm5.b(hashMap);
        this.c = qm5.b(hashMap2);
        this.d = qm5.b(hashMap3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gya) {
                gya gyaVar = (gya) obj;
                if (Objects.equals(this.a, gyaVar.a) && this.b.equals(gyaVar.b) && this.c.equals(gyaVar.c) && this.d.equals(gyaVar.d)) {
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
