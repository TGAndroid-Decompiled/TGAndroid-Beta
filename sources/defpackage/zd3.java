package defpackage;

import j$.util.Objects;
public final class zd3 {
    public final String a;
    public final String b;
    public final String c;

    public zd3(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zd3.class == obj.getClass()) {
            zd3 zd3Var = (zd3) obj;
            if (Objects.equals(this.a, zd3Var.a) && Objects.equals(this.b, zd3Var.b) && Objects.equals(this.c, zd3Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }
}
