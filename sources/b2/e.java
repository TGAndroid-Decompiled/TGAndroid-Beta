package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String f2957i;
    public static final String f2958j;
    public static final String f2959k;
    public static final String f2960l;
    public static final String f2961m;
    public static final String f2962n;
    public final int f2963a;
    public final int f2964b;
    public final int f2965c;
    public final int d;
    public final int e;
    public final boolean f2966f;
    public w0 f2967g;

    static {
        String str = e2.d0.f7883a;
        f2957i = Integer.toString(0, 36);
        f2958j = Integer.toString(1, 36);
        f2959k = Integer.toString(2, 36);
        f2960l = Integer.toString(3, 36);
        f2961m = Integer.toString(4, 36);
        f2962n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f2963a = i10;
        this.f2964b = i11;
        this.f2965c = i12;
        this.d = i13;
        this.e = i14;
        this.f2966f = z10;
    }

    public static e a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str = f2957i;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f2958j;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f2959k;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f2960l;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f2961m;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f2962n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        } else {
            z10 = false;
        }
        return new e(i10, i11, i12, i13, i14, z10);
    }

    public final w0 b() {
        if (this.f2967g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2963a).setFlags(this.f2964b).setUsage(this.f2965c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.k(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.e);
                d.a(usage, this.f2966f);
            }
            obj.f3339a = usage.build();
            this.f2967g = obj;
        }
        return this.f2967g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f2963a == eVar.f2963a && this.f2964b == eVar.f2964b && this.f2965c == eVar.f2965c && this.d == eVar.d && this.e == eVar.e && this.f2966f == eVar.f2966f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f2963a) * 31) + this.f2964b) * 31) + this.f2965c) * 31) + this.d) * 31) + this.e) * 31) + (this.f2966f ? 1 : 0);
    }
}
