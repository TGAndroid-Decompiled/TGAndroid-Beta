package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String f2025i;
    public static final String f2026j;
    public static final String f2027k;
    public static final String f2028l;
    public static final String f2029m;
    public static final String f2030n;
    public final int f2031a;
    public final int f2032b;
    public final int f2033c;
    public final int d;
    public final int f2034e;
    public final boolean f2035f;
    public w0 f2036g;

    static {
        String str = e2.d0.f8765a;
        f2025i = Integer.toString(0, 36);
        f2026j = Integer.toString(1, 36);
        f2027k = Integer.toString(2, 36);
        f2028l = Integer.toString(3, 36);
        f2029m = Integer.toString(4, 36);
        f2030n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f2031a = i10;
        this.f2032b = i11;
        this.f2033c = i12;
        this.d = i13;
        this.f2034e = i14;
        this.f2035f = z10;
    }

    public static e a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str = f2025i;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f2026j;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f2027k;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f2028l;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f2029m;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f2030n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        } else {
            z10 = false;
        }
        return new e(i10, i11, i12, i13, i14, z10);
    }

    public final w0 b() {
        if (this.f2036g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2031a).setFlags(this.f2032b).setUsage(this.f2033c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.k(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.f2034e);
                d.a(usage, this.f2035f);
            }
            obj.f2435a = usage.build();
            this.f2036g = obj;
        }
        return this.f2036g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f2031a == eVar.f2031a && this.f2032b == eVar.f2032b && this.f2033c == eVar.f2033c && this.d == eVar.d && this.f2034e == eVar.f2034e && this.f2035f == eVar.f2035f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f2031a) * 31) + this.f2032b) * 31) + this.f2033c) * 31) + this.d) * 31) + this.f2034e) * 31) + (this.f2035f ? 1 : 0);
    }
}
