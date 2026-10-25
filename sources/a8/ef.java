package a8;

import java.util.Arrays;
public final class ef {
    public final Boolean f437a;
    public final Boolean f438b;
    public final Boolean f439c;
    public final Boolean d;
    public final Boolean e;

    public ef(me meVar) {
        this.f437a = (Boolean) meVar.f614a;
        this.f438b = (Boolean) meVar.f615b;
        this.f439c = (Boolean) meVar.f616c;
        this.d = (Boolean) meVar.d;
        this.e = (Boolean) meVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ef)) {
            return false;
        }
        ef efVar = (ef) obj;
        if (o6.l.l(this.f437a, efVar.f437a) && o6.l.l(this.f438b, efVar.f438b) && o6.l.l(this.f439c, efVar.f439c) && o6.l.l(this.d, efVar.d) && o6.l.l(this.e, efVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f437a, this.f438b, this.f439c, this.d, this.e});
    }
}
