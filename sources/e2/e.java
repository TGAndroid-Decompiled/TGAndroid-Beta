package e2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e f10366i = new e(0, 0, 1, 1, false, 0, true);
    public static final String f10367j;
    public static final String f10368k;
    public static final String f10369l;
    public static final String f10370m;
    public static final String f10371n;
    public static final String f10372o;
    public static final String f10373p;
    public final int f10374a;
    public final int f10375b;
    public final int f10376c;
    public final int d;
    public final int f10377e;
    public final boolean f10378f;
    public final boolean f10379g;
    public AudioAttributes h;

    static {
        String str = h2.l0.f13783a;
        f10367j = Integer.toString(0, 36);
        f10368k = Integer.toString(1, 36);
        f10369l = Integer.toString(2, 36);
        f10370m = Integer.toString(3, 36);
        f10371n = Integer.toString(4, 36);
        f10372o = Integer.toString(5, 36);
        f10373p = Integer.toString(6, 36);
    }

    public e(int i7, int i10, int i11, int i12, boolean z10, int i13, boolean z11) {
        this.f10374a = i7;
        this.f10375b = i10;
        this.f10376c = i11;
        this.d = i12;
        this.f10377e = i13;
        this.f10378f = z10;
        this.f10379g = z11;
    }

    public static e a(Bundle bundle) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = f10367j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i7 = bundle.getInt(str);
        } else {
            i7 = 0;
        }
        String str2 = f10368k;
        if (bundle.containsKey(str2)) {
            i10 = bundle.getInt(str2);
        } else {
            i10 = 0;
        }
        String str3 = f10369l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i11 = bundle.getInt(str3);
        } else {
            i11 = 1;
        }
        String str4 = f10370m;
        if (bundle.containsKey(str4)) {
            i12 = bundle.getInt(str4);
        } else {
            i12 = 1;
        }
        String str5 = f10371n;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f10372o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f10373p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new e(i7, i10, i11, i12, z12, i13, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10374a).setFlags(this.f10375b).setUsage(this.f10376c);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                ab.y.k(usage, this.d);
                ab.y.a(usage, this.f10379g);
            }
            if (i7 >= 32) {
                d.b(usage, this.f10377e);
                d.a(usage, this.f10378f);
            }
            this.h = usage.build();
        }
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f10374a == eVar.f10374a && this.f10375b == eVar.f10375b && this.f10376c == eVar.f10376c && this.d == eVar.d && this.f10377e == eVar.f10377e && this.f10378f == eVar.f10378f && this.f10379g == eVar.f10379g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f10374a) * 31) + this.f10375b) * 31) + this.f10376c) * 31) + this.d) * 31) + this.f10377e) * 31) + (this.f10378f ? 1 : 0)) * 31) + (this.f10379g ? 1 : 0);
    }
}
