package e2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e f10215i = new e(0, 0, 1, 1, false, 0, true);
    public static final String f10216j;
    public static final String f10217k;
    public static final String f10218l;
    public static final String f10219m;
    public static final String f10220n;
    public static final String f10221o;
    public static final String f10222p;
    public final int f10223a;
    public final int f10224b;
    public final int f10225c;
    public final int d;
    public final int f10226e;
    public final boolean f10227f;
    public final boolean f10228g;
    public AudioAttributes h;

    static {
        String str = h2.m0.f14112a;
        f10216j = Integer.toString(0, 36);
        f10217k = Integer.toString(1, 36);
        f10218l = Integer.toString(2, 36);
        f10219m = Integer.toString(3, 36);
        f10220n = Integer.toString(4, 36);
        f10221o = Integer.toString(5, 36);
        f10222p = Integer.toString(6, 36);
    }

    public e(int i7, int i10, int i11, int i12, boolean z9, int i13, boolean z10) {
        this.f10223a = i7;
        this.f10224b = i10;
        this.f10225c = i11;
        this.d = i12;
        this.f10226e = i13;
        this.f10227f = z9;
        this.f10228g = z10;
    }

    public static e a(Bundle bundle) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = f10216j;
        boolean z9 = false;
        if (bundle.containsKey(str)) {
            i7 = bundle.getInt(str);
        } else {
            i7 = 0;
        }
        String str2 = f10217k;
        if (bundle.containsKey(str2)) {
            i10 = bundle.getInt(str2);
        } else {
            i10 = 0;
        }
        String str3 = f10218l;
        boolean z10 = true;
        if (bundle.containsKey(str3)) {
            i11 = bundle.getInt(str3);
        } else {
            i11 = 1;
        }
        String str4 = f10219m;
        if (bundle.containsKey(str4)) {
            i12 = bundle.getInt(str4);
        } else {
            i12 = 1;
        }
        String str5 = f10220n;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f10221o;
        if (bundle.containsKey(str6)) {
            z9 = bundle.getBoolean(str6);
        }
        boolean z11 = z9;
        String str7 = f10222p;
        if (bundle.containsKey(str7)) {
            z10 = bundle.getBoolean(str7);
        }
        return new e(i7, i10, i11, i12, z11, i13, z10);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10223a).setFlags(this.f10224b).setUsage(this.f10225c);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                ab.x.k(usage, this.d);
                ab.x.a(usage, this.f10228g);
            }
            if (i7 >= 32) {
                d.b(usage, this.f10226e);
                d.a(usage, this.f10227f);
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
            if (this.f10223a == eVar.f10223a && this.f10224b == eVar.f10224b && this.f10225c == eVar.f10225c && this.d == eVar.d && this.f10226e == eVar.f10226e && this.f10227f == eVar.f10227f && this.f10228g == eVar.f10228g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f10223a) * 31) + this.f10224b) * 31) + this.f10225c) * 31) + this.d) * 31) + this.f10226e) * 31) + (this.f10227f ? 1 : 0)) * 31) + (this.f10228g ? 1 : 0);
    }
}
