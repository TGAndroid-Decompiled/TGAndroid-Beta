package defpackage;

import java.util.Arrays;
public final class ywd {
    public final daf a;
    public final Boolean b;
    public final ehf c;

    public ywd(htd htdVar) {
        this.a = (daf) htdVar.b;
        this.b = (Boolean) htdVar.c;
        this.c = (ehf) htdVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ywd)) {
            return false;
        }
        ywd ywdVar = (ywd) obj;
        if (vue.a(this.a, ywdVar.a) && vue.a(this.b, ywdVar.b) && vue.a(null, null) && vue.a(this.c, ywdVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
