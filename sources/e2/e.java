package e2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e f10395i = new e(0, 0, 1, 1, false, 0, true);
    public static final String f10396j;
    public static final String f10397k;
    public static final String f10398l;
    public static final String f10399m;
    public static final String f10400n;
    public static final String f10401o;
    public static final String f10402p;
    public final int f10403a;
    public final int f10404b;
    public final int f10405c;
    public final int d;
    public final int f10406e;
    public final boolean f10407f;
    public final boolean f10408g;
    public AudioAttributes h;

    static {
        String str = h2.l0.f13812a;
        f10396j = Integer.toString(0, 36);
        f10397k = Integer.toString(1, 36);
        f10398l = Integer.toString(2, 36);
        f10399m = Integer.toString(3, 36);
        f10400n = Integer.toString(4, 36);
        f10401o = Integer.toString(5, 36);
        f10402p = Integer.toString(6, 36);
    }

    public e(int i7, int i10, int i11, int i12, boolean z10, int i13, boolean z11) {
        this.f10403a = i7;
        this.f10404b = i10;
        this.f10405c = i11;
        this.d = i12;
        this.f10406e = i13;
        this.f10407f = z10;
        this.f10408g = z11;
    }

    public static e a(Bundle bundle) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = f10396j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i7 = bundle.getInt(str);
        } else {
            i7 = 0;
        }
        String str2 = f10397k;
        if (bundle.containsKey(str2)) {
            i10 = bundle.getInt(str2);
        } else {
            i10 = 0;
        }
        String str3 = f10398l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i11 = bundle.getInt(str3);
        } else {
            i11 = 1;
        }
        String str4 = f10399m;
        if (bundle.containsKey(str4)) {
            i12 = bundle.getInt(str4);
        } else {
            i12 = 1;
        }
        String str5 = f10400n;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f10401o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f10402p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new e(i7, i10, i11, i12, z12, i13, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10403a).setFlags(this.f10404b).setUsage(this.f10405c);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                ab.y.k(usage, this.d);
                ab.y.a(usage, this.f10408g);
            }
            if (i7 >= 32) {
                d.b(usage, this.f10406e);
                d.a(usage, this.f10407f);
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
            if (this.f10403a == eVar.f10403a && this.f10404b == eVar.f10404b && this.f10405c == eVar.f10405c && this.d == eVar.d && this.f10406e == eVar.f10406e && this.f10407f == eVar.f10407f && this.f10408g == eVar.f10408g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f10403a) * 31) + this.f10404b) * 31) + this.f10405c) * 31) + this.d) * 31) + this.f10406e) * 31) + (this.f10407f ? 1 : 0)) * 31) + (this.f10408g ? 1 : 0);
    }
}
