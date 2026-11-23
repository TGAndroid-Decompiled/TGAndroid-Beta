package e2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e f10361i = new e(0, 0, 1, 1, false, 0, true);
    public static final String f10362j;
    public static final String f10363k;
    public static final String f10364l;
    public static final String f10365m;
    public static final String f10366n;
    public static final String f10367o;
    public static final String f10368p;
    public final int f10369a;
    public final int f10370b;
    public final int f10371c;
    public final int d;
    public final int f10372e;
    public final boolean f10373f;
    public final boolean f10374g;
    public AudioAttributes h;

    static {
        String str = h2.l0.f13778a;
        f10362j = Integer.toString(0, 36);
        f10363k = Integer.toString(1, 36);
        f10364l = Integer.toString(2, 36);
        f10365m = Integer.toString(3, 36);
        f10366n = Integer.toString(4, 36);
        f10367o = Integer.toString(5, 36);
        f10368p = Integer.toString(6, 36);
    }

    public e(int i7, int i10, int i11, int i12, boolean z10, int i13, boolean z11) {
        this.f10369a = i7;
        this.f10370b = i10;
        this.f10371c = i11;
        this.d = i12;
        this.f10372e = i13;
        this.f10373f = z10;
        this.f10374g = z11;
    }

    public static e a(Bundle bundle) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = f10362j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i7 = bundle.getInt(str);
        } else {
            i7 = 0;
        }
        String str2 = f10363k;
        if (bundle.containsKey(str2)) {
            i10 = bundle.getInt(str2);
        } else {
            i10 = 0;
        }
        String str3 = f10364l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i11 = bundle.getInt(str3);
        } else {
            i11 = 1;
        }
        String str4 = f10365m;
        if (bundle.containsKey(str4)) {
            i12 = bundle.getInt(str4);
        } else {
            i12 = 1;
        }
        String str5 = f10366n;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f10367o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f10368p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new e(i7, i10, i11, i12, z12, i13, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10369a).setFlags(this.f10370b).setUsage(this.f10371c);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                ab.y.k(usage, this.d);
                ab.y.a(usage, this.f10374g);
            }
            if (i7 >= 32) {
                d.b(usage, this.f10372e);
                d.a(usage, this.f10373f);
            }
            this.h = usage.build();
        }
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f10369a == eVar.f10369a && this.f10370b == eVar.f10370b && this.f10371c == eVar.f10371c && this.d == eVar.d && this.f10372e == eVar.f10372e && this.f10373f == eVar.f10373f && this.f10374g == eVar.f10374g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f10369a) * 31) + this.f10370b) * 31) + this.f10371c) * 31) + this.d) * 31) + this.f10372e) * 31) + (this.f10373f ? 1 : 0)) * 31) + (this.f10374g ? 1 : 0);
    }
}
