package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String f3271i;
    public static final String f3272j;
    public static final String f3273k;
    public static final String f3274l;
    public static final String f3275m;
    public static final String f3276n;
    public final int f3277a;
    public final int f3278b;
    public final int f3279c;
    public final int d;
    public final int f3280e;
    public final boolean f3281f;
    public w0 f3282g;

    static {
        String str = e2.d0.f8532a;
        f3271i = Integer.toString(0, 36);
        f3272j = Integer.toString(1, 36);
        f3273k = Integer.toString(2, 36);
        f3274l = Integer.toString(3, 36);
        f3275m = Integer.toString(4, 36);
        f3276n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f3277a = i10;
        this.f3278b = i11;
        this.f3279c = i12;
        this.d = i13;
        this.f3280e = i14;
        this.f3281f = z10;
    }

    public static e a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str = f3271i;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f3272j;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f3273k;
        int i14 = 1;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f3274l;
        if (bundle.containsKey(str4)) {
            i14 = bundle.getInt(str4);
        }
        int i15 = i14;
        String str5 = f3275m;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f3276n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        return new e(i10, i11, i12, i15, i13, z10);
    }

    public final w0 b() {
        if (this.f3282g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f3277a).setFlags(this.f3278b).setUsage(this.f3279c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.j(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.f3280e);
                d.a(usage, this.f3281f);
            }
            obj.f3681a = usage.build();
            this.f3282g = obj;
        }
        return this.f3282g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f3277a == eVar.f3277a && this.f3278b == eVar.f3278b && this.f3279c == eVar.f3279c && this.d == eVar.d && this.f3280e == eVar.f3280e && this.f3281f == eVar.f3281f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f3277a) * 31) + this.f3278b) * 31) + this.f3279c) * 31) + this.d) * 31) + this.f3280e) * 31) + (this.f3281f ? 1 : 0);
    }
}
