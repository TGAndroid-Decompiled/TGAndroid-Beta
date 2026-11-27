package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
public final class ct6 {
    public static final ct6 d = new ct6(new pm3((byte) 16, false));
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        String str = gcc.a;
        e = "0";
        f = "1";
        g = "2";
    }

    public ct6(pm3 pm3Var) {
        this.a = (Uri) pm3Var.b;
        this.b = (String) pm3Var.c;
        this.c = (Bundle) pm3Var.d;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct6)) {
            return false;
        }
        ct6 ct6Var = (ct6) obj;
        if (Objects.equals(this.a, ct6Var.a) && Objects.equals(this.b, ct6Var.b)) {
            if (this.c == null) {
                z = true;
            } else {
                z = false;
            }
            if (ct6Var.c == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        Uri uri = this.a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (this.c != null) {
            i = 1;
        }
        return i3 + i;
    }
}
