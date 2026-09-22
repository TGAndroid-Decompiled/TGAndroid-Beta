package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String f2961i;
    public static final String f2962j;
    public static final String f2963k;
    public static final String f2964l;
    public static final String f2965m;
    public static final String f2966n;
    public final int f2967a;
    public final int f2968b;
    public final int f2969c;
    public final int d;
    public final int e;
    public final boolean f2970f;
    public w0 f2971g;

    static {
        String str = e2.d0.f7887a;
        f2961i = Integer.toString(0, 36);
        f2962j = Integer.toString(1, 36);
        f2963k = Integer.toString(2, 36);
        f2964l = Integer.toString(3, 36);
        f2965m = Integer.toString(4, 36);
        f2966n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f2967a = i10;
        this.f2968b = i11;
        this.f2969c = i12;
        this.d = i13;
        this.e = i14;
        this.f2970f = z10;
    }

    public static e a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str = f2961i;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f2962j;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f2963k;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f2964l;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f2965m;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f2966n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        } else {
            z10 = false;
        }
        return new e(i10, i11, i12, i13, i14, z10);
    }

    public final w0 b() {
        if (this.f2971g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2967a).setFlags(this.f2968b).setUsage(this.f2969c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.k(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.e);
                d.a(usage, this.f2970f);
            }
            obj.f3343a = usage.build();
            this.f2971g = obj;
        }
        return this.f2971g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f2967a == eVar.f2967a && this.f2968b == eVar.f2968b && this.f2969c == eVar.f2969c && this.d == eVar.d && this.e == eVar.e && this.f2970f == eVar.f2970f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f2967a) * 31) + this.f2968b) * 31) + this.f2969c) * 31) + this.d) * 31) + this.e) * 31) + (this.f2970f ? 1 : 0);
    }
}
