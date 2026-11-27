package defpackage;

import j$.util.Objects;
public final class tv8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public tv8(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv8)) {
            return false;
        }
        tv8 tv8Var = (tv8) obj;
        if (Objects.equals(this.a, tv8Var.a) && Objects.equals(this.b, tv8Var.b) && Objects.equals(this.c, tv8Var.c) && Objects.equals(this.d, tv8Var.d) && Objects.equals(this.e, tv8Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (527 + i) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i9 + i5;
    }
}
