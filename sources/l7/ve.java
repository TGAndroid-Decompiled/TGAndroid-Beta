package l7;

import java.util.Arrays;
public final class ve {
    public final Boolean f15002a;
    public final Boolean f15003b;
    public final Boolean f15004c;
    public final Boolean d;
    public final Boolean f15005e;

    public ve(a5.j jVar) {
        this.f15002a = (Boolean) jVar.f211a;
        this.f15003b = (Boolean) jVar.f212b;
        this.f15004c = (Boolean) jVar.f213c;
        this.d = (Boolean) jVar.d;
        this.f15005e = (Boolean) jVar.f214e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (z5.l.l(this.f15002a, veVar.f15002a) && z5.l.l(this.f15003b, veVar.f15003b) && z5.l.l(this.f15004c, veVar.f15004c) && z5.l.l(this.d, veVar.d) && z5.l.l(this.f15005e, veVar.f15005e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15002a, this.f15003b, this.f15004c, this.d, this.f15005e});
    }
}
