package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class f {
    public static final f f3739i = new f(0, 0, 1, 1, false, 0, true);
    public static final String f3740j;
    public static final String f3741k;
    public static final String f3742l;
    public static final String f3743m;
    public static final String f3744n;
    public static final String f3745o;
    public static final String f3746p;
    public final int f3747a;
    public final int f3748b;
    public final int f3749c;
    public final int d;
    public final int e;
    public final boolean f3750f;
    public final boolean f3751g;
    public AudioAttributes h;

    static {
        String str = e2.m0.f8254a;
        f3740j = Integer.toString(0, 36);
        f3741k = Integer.toString(1, 36);
        f3742l = Integer.toString(2, 36);
        f3743m = Integer.toString(3, 36);
        f3744n = Integer.toString(4, 36);
        f3745o = Integer.toString(5, 36);
        f3746p = Integer.toString(6, 36);
    }

    public f(int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11) {
        this.f3747a = i10;
        this.f3748b = i11;
        this.f3749c = i12;
        this.d = i13;
        this.e = i14;
        this.f3750f = z10;
        this.f3751g = z11;
    }

    public static f a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str = f3740j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f3741k;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f3742l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f3743m;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f3744n;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f3745o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f3746p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new f(i10, i11, i12, i13, z12, i14, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f3747a).setFlags(this.f3748b).setUsage(this.f3749c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                d.j(usage, this.d);
                d.b(usage, this.f3751g);
            }
            if (i10 >= 32) {
                e.b(usage, this.e);
                e.a(usage, this.f3750f);
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
            if (this.f3747a == fVar.f3747a && this.f3748b == fVar.f3748b && this.f3749c == fVar.f3749c && this.d == fVar.d && this.e == fVar.e && this.f3750f == fVar.f3750f && this.f3751g == fVar.f3751g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f3747a) * 31) + this.f3748b) * 31) + this.f3749c) * 31) + this.d) * 31) + this.e) * 31) + (this.f3750f ? 1 : 0)) * 31) + (this.f3751g ? 1 : 0);
    }
}
