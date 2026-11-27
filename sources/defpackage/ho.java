package defpackage;

import java.util.Arrays;
public final class ho {
    public final int a;
    public final zn b;
    public final wn c;
    public final String d;

    public ho(zn znVar, wn wnVar, String str) {
        this.b = znVar;
        this.c = wnVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{znVar, wnVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        if (!vue.a(this.b, hoVar.b) || !vue.a(this.c, hoVar.c) || !vue.a(this.d, hoVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
