package defpackage;

import j$.util.Objects;
public final class ol5 implements lf7 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public ol5(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        jte.f(z2);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    public static defpackage.ol5 d(java.util.Map r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ol5.d(java.util.Map):ol5");
    }

    @Override
    public final go4 a() {
        return null;
    }

    @Override
    public final void b(ht6 ht6Var) {
        String str = this.c;
        if (str != null) {
            ht6Var.H = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            ht6Var.F = str2;
        }
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ol5.class == obj.getClass()) {
            ol5 ol5Var = (ol5) obj;
            if (this.a == ol5Var.a && Objects.equals(this.b, ol5Var.b) && Objects.equals(this.c, ol5Var.c) && Objects.equals(this.d, ol5Var.d) && this.e == ol5Var.e && this.f == ol5Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = (527 + this.a) * 31;
        int i4 = 0;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }
}
