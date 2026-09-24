package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String f2954i;
    public static final String f2955j;
    public static final String f2956k;
    public static final String f2957l;
    public static final String f2958m;
    public static final String f2959n;
    public final int f2960a;
    public final int f2961b;
    public final int f2962c;
    public final int d;
    public final int e;
    public final boolean f2963f;
    public w0 f2964g;

    static {
        String str = e2.d0.f7870a;
        f2954i = Integer.toString(0, 36);
        f2955j = Integer.toString(1, 36);
        f2956k = Integer.toString(2, 36);
        f2957l = Integer.toString(3, 36);
        f2958m = Integer.toString(4, 36);
        f2959n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f2960a = i10;
        this.f2961b = i11;
        this.f2962c = i12;
        this.d = i13;
        this.e = i14;
        this.f2963f = z10;
    }

    public static e a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str = f2954i;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f2955j;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f2956k;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f2957l;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f2958m;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f2959n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        } else {
            z10 = false;
        }
        return new e(i10, i11, i12, i13, i14, z10);
    }

    public final w0 b() {
        if (this.f2964g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2960a).setFlags(this.f2961b).setUsage(this.f2962c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.k(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.e);
                d.a(usage, this.f2963f);
            }
            obj.f3336a = usage.build();
            this.f2964g = obj;
        }
        return this.f2964g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f2960a == eVar.f2960a && this.f2961b == eVar.f2961b && this.f2962c == eVar.f2962c && this.d == eVar.d && this.e == eVar.e && this.f2963f == eVar.f2963f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f2960a) * 31) + this.f2961b) * 31) + this.f2962c) * 31) + this.d) * 31) + this.e) * 31) + (this.f2963f ? 1 : 0);
    }
}
