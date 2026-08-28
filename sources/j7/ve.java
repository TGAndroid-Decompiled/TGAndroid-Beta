package j7;

import java.util.Arrays;
public final class ve {
    public final Boolean f14143a;
    public final Boolean f14144b;
    public final Boolean f14145c;
    public final Boolean d;
    public final Boolean f14146e;

    public ve(b3.b bVar) {
        this.f14143a = (Boolean) bVar.f1413a;
        this.f14144b = (Boolean) bVar.f1414b;
        this.f14145c = (Boolean) bVar.f1415c;
        this.d = (Boolean) bVar.d;
        this.f14146e = (Boolean) bVar.f1416e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (x5.l.l(this.f14143a, veVar.f14143a) && x5.l.l(this.f14144b, veVar.f14144b) && x5.l.l(this.f14145c, veVar.f14145c) && x5.l.l(this.d, veVar.d) && x5.l.l(this.f14146e, veVar.f14146e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14143a, this.f14144b, this.f14145c, this.d, this.f14146e});
    }
}
