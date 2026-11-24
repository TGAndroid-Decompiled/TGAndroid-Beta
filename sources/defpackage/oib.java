package defpackage;

import java.util.Arrays;
public final class oib implements wo {
    public static final oib b = new oib(null);
    public final String a;

    public oib(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oib)) {
            return false;
        }
        return fse.a(this.a, ((oib) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
