package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String f2959i;
    public static final String f2960j;
    public static final String f2961k;
    public static final String f2962l;
    public static final String f2963m;
    public static final String f2964n;
    public final int f2965a;
    public final int f2966b;
    public final int f2967c;
    public final int d;
    public final int e;
    public final boolean f2968f;
    public w0 f2969g;

    static {
        String str = e2.d0.f7885a;
        f2959i = Integer.toString(0, 36);
        f2960j = Integer.toString(1, 36);
        f2961k = Integer.toString(2, 36);
        f2962l = Integer.toString(3, 36);
        f2963m = Integer.toString(4, 36);
        f2964n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f2965a = i10;
        this.f2966b = i11;
        this.f2967c = i12;
        this.d = i13;
        this.e = i14;
        this.f2968f = z10;
    }

    public static e a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str = f2959i;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f2960j;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f2961k;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f2962l;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f2963m;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f2964n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        } else {
            z10 = false;
        }
        return new e(i10, i11, i12, i13, i14, z10);
    }

    public final w0 b() {
        if (this.f2969g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2965a).setFlags(this.f2966b).setUsage(this.f2967c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.k(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.e);
                d.a(usage, this.f2968f);
            }
            obj.f3341a = usage.build();
            this.f2969g = obj;
        }
        return this.f2969g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f2965a == eVar.f2965a && this.f2966b == eVar.f2966b && this.f2967c == eVar.f2967c && this.d == eVar.d && this.e == eVar.e && this.f2968f == eVar.f2968f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f2965a) * 31) + this.f2966b) * 31) + this.f2967c) * 31) + this.d) * 31) + this.e) * 31) + (this.f2968f ? 1 : 0);
    }
}
