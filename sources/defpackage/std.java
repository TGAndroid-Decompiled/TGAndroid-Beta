package defpackage;

import java.util.Arrays;
public final class std {
    public final pxe a;
    public final Boolean b;
    public final b2f c;

    public std(htd htdVar) {
        this.a = (pxe) htdVar.b;
        this.b = (Boolean) htdVar.c;
        this.c = (b2f) htdVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof std)) {
            return false;
        }
        std stdVar = (std) obj;
        if (vue.a(this.a, stdVar.a) && vue.a(this.b, stdVar.b) && vue.a(null, null) && vue.a(this.c, stdVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
