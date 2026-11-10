package e2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e f10220i = new e(0, 0, 1, 1, false, 0, true);
    public static final String f10221j;
    public static final String f10222k;
    public static final String f10223l;
    public static final String f10224m;
    public static final String f10225n;
    public static final String f10226o;
    public static final String f10227p;
    public final int f10228a;
    public final int f10229b;
    public final int f10230c;
    public final int d;
    public final int f10231e;
    public final boolean f10232f;
    public final boolean f10233g;
    public AudioAttributes h;

    static {
        String str = h2.m0.f14114a;
        f10221j = Integer.toString(0, 36);
        f10222k = Integer.toString(1, 36);
        f10223l = Integer.toString(2, 36);
        f10224m = Integer.toString(3, 36);
        f10225n = Integer.toString(4, 36);
        f10226o = Integer.toString(5, 36);
        f10227p = Integer.toString(6, 36);
    }

    public e(int i7, int i10, int i11, int i12, boolean z9, int i13, boolean z10) {
        this.f10228a = i7;
        this.f10229b = i10;
        this.f10230c = i11;
        this.d = i12;
        this.f10231e = i13;
        this.f10232f = z9;
        this.f10233g = z10;
    }

    public static e a(Bundle bundle) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = f10221j;
        boolean z9 = false;
        if (bundle.containsKey(str)) {
            i7 = bundle.getInt(str);
        } else {
            i7 = 0;
        }
        String str2 = f10222k;
        if (bundle.containsKey(str2)) {
            i10 = bundle.getInt(str2);
        } else {
            i10 = 0;
        }
        String str3 = f10223l;
        boolean z10 = true;
        if (bundle.containsKey(str3)) {
            i11 = bundle.getInt(str3);
        } else {
            i11 = 1;
        }
        String str4 = f10224m;
        if (bundle.containsKey(str4)) {
            i12 = bundle.getInt(str4);
        } else {
            i12 = 1;
        }
        String str5 = f10225n;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f10226o;
        if (bundle.containsKey(str6)) {
            z9 = bundle.getBoolean(str6);
        }
        boolean z11 = z9;
        String str7 = f10227p;
        if (bundle.containsKey(str7)) {
            z10 = bundle.getBoolean(str7);
        }
        return new e(i7, i10, i11, i12, z11, i13, z10);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10228a).setFlags(this.f10229b).setUsage(this.f10230c);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                ab.x.k(usage, this.d);
                ab.x.a(usage, this.f10233g);
            }
            if (i7 >= 32) {
                d.b(usage, this.f10231e);
                d.a(usage, this.f10232f);
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
            if (this.f10228a == eVar.f10228a && this.f10229b == eVar.f10229b && this.f10230c == eVar.f10230c && this.d == eVar.d && this.f10231e == eVar.f10231e && this.f10232f == eVar.f10232f && this.f10233g == eVar.f10233g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f10228a) * 31) + this.f10229b) * 31) + this.f10230c) * 31) + this.d) * 31) + this.f10231e) * 31) + (this.f10232f ? 1 : 0)) * 31) + (this.f10233g ? 1 : 0);
    }
}
