package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class f {
    public static final f f2113i = new f(0, 0, 1, 1, false, 0, true);
    public static final String f2114j;
    public static final String f2115k;
    public static final String f2116l;
    public static final String f2117m;
    public static final String f2118n;
    public static final String f2119o;
    public static final String f2120p;
    public final int f2121a;
    public final int f2122b;
    public final int f2123c;
    public final int d;
    public final int e;
    public final boolean f2124f;
    public final boolean f2125g;
    public AudioAttributes h;

    static {
        String str = e2.m0.f8372a;
        f2114j = Integer.toString(0, 36);
        f2115k = Integer.toString(1, 36);
        f2116l = Integer.toString(2, 36);
        f2117m = Integer.toString(3, 36);
        f2118n = Integer.toString(4, 36);
        f2119o = Integer.toString(5, 36);
        f2120p = Integer.toString(6, 36);
    }

    public f(int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11) {
        this.f2121a = i10;
        this.f2122b = i11;
        this.f2123c = i12;
        this.d = i13;
        this.e = i14;
        this.f2124f = z10;
        this.f2125g = z11;
    }

    public static f a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str = f2114j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f2115k;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f2116l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f2117m;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f2118n;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f2119o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f2120p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new f(i10, i11, i12, i13, z12, i14, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2121a).setFlags(this.f2122b).setUsage(this.f2123c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                d.j(usage, this.d);
                d.b(usage, this.f2125g);
            }
            if (i10 >= 32) {
                e.b(usage, this.e);
                e.a(usage, this.f2124f);
            }
            this.h = usage.build();
        }
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f2121a == fVar.f2121a && this.f2122b == fVar.f2122b && this.f2123c == fVar.f2123c && this.d == fVar.d && this.e == fVar.e && this.f2124f == fVar.f2124f && this.f2125g == fVar.f2125g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f2121a) * 31) + this.f2122b) * 31) + this.f2123c) * 31) + this.d) * 31) + this.e) * 31) + (this.f2124f ? 1 : 0)) * 31) + (this.f2125g ? 1 : 0);
    }
}
