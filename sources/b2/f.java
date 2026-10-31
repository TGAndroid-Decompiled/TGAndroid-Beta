package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class f {
    public static final f f2027i = new f(0, 0, 1, 1, false, 0, true);
    public static final String f2028j;
    public static final String f2029k;
    public static final String f2030l;
    public static final String f2031m;
    public static final String f2032n;
    public static final String f2033o;
    public static final String f2034p;
    public final int f2035a;
    public final int f2036b;
    public final int f2037c;
    public final int d;
    public final int e;
    public final boolean f2038f;
    public final boolean f2039g;
    public AudioAttributes h;

    static {
        String str = e2.l0.f6165a;
        f2028j = Integer.toString(0, 36);
        f2029k = Integer.toString(1, 36);
        f2030l = Integer.toString(2, 36);
        f2031m = Integer.toString(3, 36);
        f2032n = Integer.toString(4, 36);
        f2033o = Integer.toString(5, 36);
        f2034p = Integer.toString(6, 36);
    }

    public f(int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11) {
        this.f2035a = i10;
        this.f2036b = i11;
        this.f2037c = i12;
        this.d = i13;
        this.e = i14;
        this.f2038f = z10;
        this.f2039g = z11;
    }

    public static f a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str = f2028j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f2029k;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f2030l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f2031m;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f2032n;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f2033o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f2034p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new f(i10, i11, i12, i13, z12, i14, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2035a).setFlags(this.f2036b).setUsage(this.f2037c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                d.j(usage, this.d);
                d.b(usage, this.f2039g);
            }
            if (i10 >= 32) {
                e.b(usage, this.e);
                e.a(usage, this.f2038f);
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
            if (this.f2035a == fVar.f2035a && this.f2036b == fVar.f2036b && this.f2037c == fVar.f2037c && this.d == fVar.d && this.e == fVar.e && this.f2038f == fVar.f2038f && this.f2039g == fVar.f2039g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f2035a) * 31) + this.f2036b) * 31) + this.f2037c) * 31) + this.d) * 31) + this.e) * 31) + (this.f2038f ? 1 : 0)) * 31) + (this.f2039g ? 1 : 0);
    }
}
