package e2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e f10398i = new e(0, 0, 1, 1, false, 0, true);
    public static final String f10399j;
    public static final String f10400k;
    public static final String f10401l;
    public static final String f10402m;
    public static final String f10403n;
    public static final String f10404o;
    public static final String f10405p;
    public final int f10406a;
    public final int f10407b;
    public final int f10408c;
    public final int d;
    public final int f10409e;
    public final boolean f10410f;
    public final boolean f10411g;
    public AudioAttributes h;

    static {
        String str = h2.l0.f13815a;
        f10399j = Integer.toString(0, 36);
        f10400k = Integer.toString(1, 36);
        f10401l = Integer.toString(2, 36);
        f10402m = Integer.toString(3, 36);
        f10403n = Integer.toString(4, 36);
        f10404o = Integer.toString(5, 36);
        f10405p = Integer.toString(6, 36);
    }

    public e(int i7, int i10, int i11, int i12, boolean z10, int i13, boolean z11) {
        this.f10406a = i7;
        this.f10407b = i10;
        this.f10408c = i11;
        this.d = i12;
        this.f10409e = i13;
        this.f10410f = z10;
        this.f10411g = z11;
    }

    public static e a(Bundle bundle) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = f10399j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i7 = bundle.getInt(str);
        } else {
            i7 = 0;
        }
        String str2 = f10400k;
        if (bundle.containsKey(str2)) {
            i10 = bundle.getInt(str2);
        } else {
            i10 = 0;
        }
        String str3 = f10401l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i11 = bundle.getInt(str3);
        } else {
            i11 = 1;
        }
        String str4 = f10402m;
        if (bundle.containsKey(str4)) {
            i12 = bundle.getInt(str4);
        } else {
            i12 = 1;
        }
        String str5 = f10403n;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f10404o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f10405p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new e(i7, i10, i11, i12, z12, i13, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10406a).setFlags(this.f10407b).setUsage(this.f10408c);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                ab.y.k(usage, this.d);
                ab.y.a(usage, this.f10411g);
            }
            if (i7 >= 32) {
                d.b(usage, this.f10409e);
                d.a(usage, this.f10410f);
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
            if (this.f10406a == eVar.f10406a && this.f10407b == eVar.f10407b && this.f10408c == eVar.f10408c && this.d == eVar.d && this.f10409e == eVar.f10409e && this.f10410f == eVar.f10410f && this.f10411g == eVar.f10411g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f10406a) * 31) + this.f10407b) * 31) + this.f10408c) * 31) + this.d) * 31) + this.f10409e) * 31) + (this.f10410f ? 1 : 0)) * 31) + (this.f10411g ? 1 : 0);
    }
}
