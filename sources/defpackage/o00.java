package defpackage;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class o00 {
    public static final o00 i = new o00(0, 0, 1, 1, false, 0, true);
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public AudioAttributes h;

    static {
        String str = hac.a;
        j = "0";
        k = "1";
        l = "2";
        m = "3";
        n = "4";
        o = "5";
        p = "6";
    }

    public o00(int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = z;
        this.g = z2;
    }

    public static o00 a(Bundle bundle) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = j;
        boolean z = false;
        if (bundle.containsKey(str)) {
            i2 = bundle.getInt(str);
        } else {
            i2 = 0;
        }
        String str2 = k;
        if (bundle.containsKey(str2)) {
            i3 = bundle.getInt(str2);
        } else {
            i3 = 0;
        }
        String str3 = l;
        boolean z2 = true;
        if (bundle.containsKey(str3)) {
            i4 = bundle.getInt(str3);
        } else {
            i4 = 1;
        }
        String str4 = m;
        if (bundle.containsKey(str4)) {
            i5 = bundle.getInt(str4);
        } else {
            i5 = 1;
        }
        String str5 = n;
        if (bundle.containsKey(str5)) {
            i6 = bundle.getInt(str5);
        } else {
            i6 = 0;
        }
        String str6 = o;
        if (bundle.containsKey(str6)) {
            z = bundle.getBoolean(str6);
        }
        boolean z3 = z;
        String str7 = p;
        if (bundle.containsKey(str7)) {
            z2 = bundle.getBoolean(str7);
        }
        return new o00(i2, i3, i4, i5, z3, i6, z2);
    }

    public final AudioAttributes b() {
        AudioAttributes audioAttributes = this.h;
        if (audioAttributes == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                rs.p(usage, this.d);
                rs.t(usage, this.g);
            }
            if (i2 >= 32) {
                n00.b(usage, this.e);
                n00.a(usage, this.f);
            }
            AudioAttributes build = usage.build();
            this.h = build;
            return build;
        }
        return audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o00.class == obj.getClass()) {
            o00 o00Var = (o00) obj;
            if (this.a == o00Var.a && this.b == o00Var.b && this.c == o00Var.c && this.d == o00Var.d && this.e == o00Var.e && this.f == o00Var.f && this.g == o00Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
