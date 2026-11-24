package defpackage;

import java.util.Arrays;
public final class mze {
    public final Float a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mze)) {
            return false;
        }
        mze mzeVar = (mze) obj;
        if (fse.a(null, null) && fse.a(this.a, mzeVar.a) && fse.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.a, null});
    }
}
