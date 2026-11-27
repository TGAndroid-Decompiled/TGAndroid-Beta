package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class xh5 implements tf7 {
    public final String a;
    public final String b;
    public final List c;

    public xh5(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override
    public final ko4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xh5.class == obj.getClass()) {
            xh5 xh5Var = (xh5) obj;
            if (TextUtils.equals(this.a, xh5Var.a) && TextUtils.equals(this.b, xh5Var.b) && this.c.equals(xh5Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.c.hashCode() + ((i3 + i2) * 31);
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        if (str2 != null) {
            str = c00.k(ik8.p(" [", str2, ", "), this.b, "]");
        } else {
            str = "";
        }
        return "HlsTrackMetadataEntry".concat(str);
    }

    @Override
    public final void b(lt6 lt6Var) {
    }
}
