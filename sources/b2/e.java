package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String f2956i;
    public static final String f2957j;
    public static final String f2958k;
    public static final String f2959l;
    public static final String f2960m;
    public static final String f2961n;
    public final int f2962a;
    public final int f2963b;
    public final int f2964c;
    public final int d;
    public final int e;
    public final boolean f2965f;
    public w0 f2966g;

    static {
        String str = e2.d0.f7872a;
        f2956i = Integer.toString(0, 36);
        f2957j = Integer.toString(1, 36);
        f2958k = Integer.toString(2, 36);
        f2959l = Integer.toString(3, 36);
        f2960m = Integer.toString(4, 36);
        f2961n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f2962a = i10;
        this.f2963b = i11;
        this.f2964c = i12;
        this.d = i13;
        this.e = i14;
        this.f2965f = z10;
    }

    public static e a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str = f2956i;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f2957j;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f2958k;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f2959l;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f2960m;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f2961n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        } else {
            z10 = false;
        }
        return new e(i10, i11, i12, i13, i14, z10);
    }

    public final w0 b() {
        if (this.f2966g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2962a).setFlags(this.f2963b).setUsage(this.f2964c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.k(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.e);
                d.a(usage, this.f2965f);
            }
            obj.f3338a = usage.build();
            this.f2966g = obj;
        }
        return this.f2966g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f2962a == eVar.f2962a && this.f2963b == eVar.f2963b && this.f2964c == eVar.f2964c && this.d == eVar.d && this.e == eVar.e && this.f2965f == eVar.f2965f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f2962a) * 31) + this.f2963b) * 31) + this.f2964c) * 31) + this.d) * 31) + this.e) * 31) + (this.f2965f ? 1 : 0);
    }
}
