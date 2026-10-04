package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String f3192i;
    public static final String f3193j;
    public static final String f3194k;
    public static final String f3195l;
    public static final String f3196m;
    public static final String f3197n;
    public final int f3198a;
    public final int f3199b;
    public final int f3200c;
    public final int d;
    public final int f3201e;
    public final boolean f3202f;
    public w0 f3203g;

    static {
        String str = e2.d0.f8538a;
        f3192i = Integer.toString(0, 36);
        f3193j = Integer.toString(1, 36);
        f3194k = Integer.toString(2, 36);
        f3195l = Integer.toString(3, 36);
        f3196m = Integer.toString(4, 36);
        f3197n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f3198a = i10;
        this.f3199b = i11;
        this.f3200c = i12;
        this.d = i13;
        this.f3201e = i14;
        this.f3202f = z10;
    }

    public static e a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str = f3192i;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f3193j;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f3194k;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f3195l;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f3196m;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f3197n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        } else {
            z10 = false;
        }
        return new e(i10, i11, i12, i13, i14, z10);
    }

    public final w0 b() {
        if (this.f3203g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f3198a).setFlags(this.f3199b).setUsage(this.f3200c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.k(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.f3201e);
                d.a(usage, this.f3202f);
            }
            obj.f3602a = usage.build();
            this.f3203g = obj;
        }
        return this.f3203g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f3198a == eVar.f3198a && this.f3199b == eVar.f3199b && this.f3200c == eVar.f3200c && this.d == eVar.d && this.f3201e == eVar.f3201e && this.f3202f == eVar.f3202f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f3198a) * 31) + this.f3199b) * 31) + this.f3200c) * 31) + this.d) * 31) + this.f3201e) * 31) + (this.f3202f ? 1 : 0);
    }
}
