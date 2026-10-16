package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class f {
    public static final f f2117i = new f(0, 0, 1, 1, false, 0, true);
    public static final String f2118j;
    public static final String f2119k;
    public static final String f2120l;
    public static final String f2121m;
    public static final String f2122n;
    public static final String f2123o;
    public static final String f2124p;
    public final int f2125a;
    public final int f2126b;
    public final int f2127c;
    public final int d;
    public final int e;
    public final boolean f2128f;
    public final boolean f2129g;
    public AudioAttributes h;

    static {
        String str = e2.m0.f8375a;
        f2118j = Integer.toString(0, 36);
        f2119k = Integer.toString(1, 36);
        f2120l = Integer.toString(2, 36);
        f2121m = Integer.toString(3, 36);
        f2122n = Integer.toString(4, 36);
        f2123o = Integer.toString(5, 36);
        f2124p = Integer.toString(6, 36);
    }

    public f(int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11) {
        this.f2125a = i10;
        this.f2126b = i11;
        this.f2127c = i12;
        this.d = i13;
        this.e = i14;
        this.f2128f = z10;
        this.f2129g = z11;
    }

    public static f a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str = f2118j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f2119k;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f2120l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f2121m;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f2122n;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f2123o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f2124p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new f(i10, i11, i12, i13, z12, i14, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2125a).setFlags(this.f2126b).setUsage(this.f2127c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                d.j(usage, this.d);
                d.b(usage, this.f2129g);
            }
            if (i10 >= 32) {
                e.b(usage, this.e);
                e.a(usage, this.f2128f);
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
            if (this.f2125a == fVar.f2125a && this.f2126b == fVar.f2126b && this.f2127c == fVar.f2127c && this.d == fVar.d && this.e == fVar.e && this.f2128f == fVar.f2128f && this.f2129g == fVar.f2129g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f2125a) * 31) + this.f2126b) * 31) + this.f2127c) * 31) + this.d) * 31) + this.e) * 31) + (this.f2128f ? 1 : 0)) * 31) + (this.f2129g ? 1 : 0);
    }
}
