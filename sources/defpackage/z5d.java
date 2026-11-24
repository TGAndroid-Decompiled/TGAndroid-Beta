package defpackage;

import java.util.Arrays;
public final class z5d implements wo {
    public static final z5d c;
    public final boolean a;
    public final String b;

    static {
        rhb rhbVar = new rhb((byte) 9, false);
        rhbVar.b = Boolean.FALSE;
        c = new z5d(rhbVar);
    }

    public z5d(rhb rhbVar) {
        this.a = ((Boolean) rhbVar.b).booleanValue();
        this.b = (String) rhbVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z5d)) {
            return false;
        }
        z5d z5dVar = (z5d) obj;
        if (fse.a(null, null) && this.a == z5dVar.a && fse.a(this.b, z5dVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
