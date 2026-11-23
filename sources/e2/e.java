package e2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e f10359i = new e(0, 0, 1, 1, false, 0, true);
    public static final String f10360j;
    public static final String f10361k;
    public static final String f10362l;
    public static final String f10363m;
    public static final String f10364n;
    public static final String f10365o;
    public static final String f10366p;
    public final int f10367a;
    public final int f10368b;
    public final int f10369c;
    public final int d;
    public final int f10370e;
    public final boolean f10371f;
    public final boolean f10372g;
    public AudioAttributes h;

    static {
        String str = h2.l0.f13778a;
        f10360j = Integer.toString(0, 36);
        f10361k = Integer.toString(1, 36);
        f10362l = Integer.toString(2, 36);
        f10363m = Integer.toString(3, 36);
        f10364n = Integer.toString(4, 36);
        f10365o = Integer.toString(5, 36);
        f10366p = Integer.toString(6, 36);
    }

    public e(int i7, int i10, int i11, int i12, boolean z10, int i13, boolean z11) {
        this.f10367a = i7;
        this.f10368b = i10;
        this.f10369c = i11;
        this.d = i12;
        this.f10370e = i13;
        this.f10371f = z10;
        this.f10372g = z11;
    }

    public static e a(Bundle bundle) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = f10360j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i7 = bundle.getInt(str);
        } else {
            i7 = 0;
        }
        String str2 = f10361k;
        if (bundle.containsKey(str2)) {
            i10 = bundle.getInt(str2);
        } else {
            i10 = 0;
        }
        String str3 = f10362l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i11 = bundle.getInt(str3);
        } else {
            i11 = 1;
        }
        String str4 = f10363m;
        if (bundle.containsKey(str4)) {
            i12 = bundle.getInt(str4);
        } else {
            i12 = 1;
        }
        String str5 = f10364n;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f10365o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f10366p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new e(i7, i10, i11, i12, z12, i13, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10367a).setFlags(this.f10368b).setUsage(this.f10369c);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                ab.y.k(usage, this.d);
                ab.y.a(usage, this.f10372g);
            }
            if (i7 >= 32) {
                d.b(usage, this.f10370e);
                d.a(usage, this.f10371f);
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
            if (this.f10367a == eVar.f10367a && this.f10368b == eVar.f10368b && this.f10369c == eVar.f10369c && this.d == eVar.d && this.f10370e == eVar.f10370e && this.f10371f == eVar.f10371f && this.f10372g == eVar.f10372g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f10367a) * 31) + this.f10368b) * 31) + this.f10369c) * 31) + this.d) * 31) + this.f10370e) * 31) + (this.f10371f ? 1 : 0)) * 31) + (this.f10372g ? 1 : 0);
    }
}
