package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String f2962i;
    public static final String f2963j;
    public static final String f2964k;
    public static final String f2965l;
    public static final String f2966m;
    public static final String f2967n;
    public final int f2968a;
    public final int f2969b;
    public final int f2970c;
    public final int d;
    public final int e;
    public final boolean f2971f;
    public w0 f2972g;

    static {
        String str = e2.d0.f7887a;
        f2962i = Integer.toString(0, 36);
        f2963j = Integer.toString(1, 36);
        f2964k = Integer.toString(2, 36);
        f2965l = Integer.toString(3, 36);
        f2966m = Integer.toString(4, 36);
        f2967n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f2968a = i10;
        this.f2969b = i11;
        this.f2970c = i12;
        this.d = i13;
        this.e = i14;
        this.f2971f = z10;
    }

    public static e a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str = f2962i;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f2963j;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f2964k;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f2965l;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f2966m;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f2967n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        } else {
            z10 = false;
        }
        return new e(i10, i11, i12, i13, i14, z10);
    }

    public final w0 b() {
        if (this.f2972g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2968a).setFlags(this.f2969b).setUsage(this.f2970c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.k(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.e);
                d.a(usage, this.f2971f);
            }
            obj.f3344a = usage.build();
            this.f2972g = obj;
        }
        return this.f2972g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f2968a == eVar.f2968a && this.f2969b == eVar.f2969b && this.f2970c == eVar.f2970c && this.d == eVar.d && this.e == eVar.e && this.f2971f == eVar.f2971f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f2968a) * 31) + this.f2969b) * 31) + this.f2970c) * 31) + this.d) * 31) + this.e) * 31) + (this.f2971f ? 1 : 0);
    }
}
