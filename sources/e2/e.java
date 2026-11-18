package e2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e f10369i = new e(0, 0, 1, 1, false, 0, true);
    public static final String f10370j;
    public static final String f10371k;
    public static final String f10372l;
    public static final String f10373m;
    public static final String f10374n;
    public static final String f10375o;
    public static final String f10376p;
    public final int f10377a;
    public final int f10378b;
    public final int f10379c;
    public final int d;
    public final int f10380e;
    public final boolean f10381f;
    public final boolean f10382g;
    public AudioAttributes h;

    static {
        String str = h2.l0.f13786a;
        f10370j = Integer.toString(0, 36);
        f10371k = Integer.toString(1, 36);
        f10372l = Integer.toString(2, 36);
        f10373m = Integer.toString(3, 36);
        f10374n = Integer.toString(4, 36);
        f10375o = Integer.toString(5, 36);
        f10376p = Integer.toString(6, 36);
    }

    public e(int i7, int i10, int i11, int i12, boolean z10, int i13, boolean z11) {
        this.f10377a = i7;
        this.f10378b = i10;
        this.f10379c = i11;
        this.d = i12;
        this.f10380e = i13;
        this.f10381f = z10;
        this.f10382g = z11;
    }

    public static e a(Bundle bundle) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = f10370j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i7 = bundle.getInt(str);
        } else {
            i7 = 0;
        }
        String str2 = f10371k;
        if (bundle.containsKey(str2)) {
            i10 = bundle.getInt(str2);
        } else {
            i10 = 0;
        }
        String str3 = f10372l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i11 = bundle.getInt(str3);
        } else {
            i11 = 1;
        }
        String str4 = f10373m;
        if (bundle.containsKey(str4)) {
            i12 = bundle.getInt(str4);
        } else {
            i12 = 1;
        }
        String str5 = f10374n;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f10375o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f10376p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new e(i7, i10, i11, i12, z12, i13, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10377a).setFlags(this.f10378b).setUsage(this.f10379c);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                ab.y.k(usage, this.d);
                ab.y.a(usage, this.f10382g);
            }
            if (i7 >= 32) {
                d.b(usage, this.f10380e);
                d.a(usage, this.f10381f);
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
            if (this.f10377a == eVar.f10377a && this.f10378b == eVar.f10378b && this.f10379c == eVar.f10379c && this.d == eVar.d && this.f10380e == eVar.f10380e && this.f10381f == eVar.f10381f && this.f10382g == eVar.f10382g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f10377a) * 31) + this.f10378b) * 31) + this.f10379c) * 31) + this.d) * 31) + this.f10380e) * 31) + (this.f10381f ? 1 : 0)) * 31) + (this.f10382g ? 1 : 0);
    }
}
