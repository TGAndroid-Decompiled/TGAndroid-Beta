package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class f {
    public static final f f3180i = new f(0, 0, 1, 1, false, 0, true);
    public static final String f3181j;
    public static final String f3182k;
    public static final String f3183l;
    public static final String f3184m;
    public static final String f3185n;
    public static final String f3186o;
    public static final String f3187p;
    public final int f3188a;
    public final int f3189b;
    public final int f3190c;
    public final int d;
    public final int e;
    public final boolean f3191f;
    public final boolean f3192g;
    public AudioAttributes h;

    static {
        String str = e2.n0.f9692a;
        f3181j = Integer.toString(0, 36);
        f3182k = Integer.toString(1, 36);
        f3183l = Integer.toString(2, 36);
        f3184m = Integer.toString(3, 36);
        f3185n = Integer.toString(4, 36);
        f3186o = Integer.toString(5, 36);
        f3187p = Integer.toString(6, 36);
    }

    public f(int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11) {
        this.f3188a = i10;
        this.f3189b = i11;
        this.f3190c = i12;
        this.d = i13;
        this.e = i14;
        this.f3191f = z10;
        this.f3192g = z11;
    }

    public static f a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str = f3181j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f3182k;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f3183l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f3184m;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f3185n;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f3186o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f3187p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new f(i10, i11, i12, i13, z12, i14, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f3188a).setFlags(this.f3189b).setUsage(this.f3190c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                d.j(usage, this.d);
                d.b(usage, this.f3192g);
            }
            if (i10 >= 32) {
                e.b(usage, this.e);
                e.a(usage, this.f3191f);
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
            if (this.f3188a == fVar.f3188a && this.f3189b == fVar.f3189b && this.f3190c == fVar.f3190c && this.d == fVar.d && this.e == fVar.e && this.f3191f == fVar.f3191f && this.f3192g == fVar.f3192g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f3188a) * 31) + this.f3189b) * 31) + this.f3190c) * 31) + this.d) * 31) + this.e) * 31) + (this.f3191f ? 1 : 0)) * 31) + (this.f3192g ? 1 : 0);
    }
}
