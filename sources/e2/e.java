package e2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e f10051i = new e(0, 0, 1, 1, false, 0, true);
    public static final String f10052j;
    public static final String f10053k;
    public static final String f10054l;
    public static final String f10055m;
    public static final String f10056n;
    public static final String f10057o;
    public static final String f10058p;
    public final int f10059a;
    public final int f10060b;
    public final int f10061c;
    public final int d;
    public final int f10062e;
    public final boolean f10063f;
    public final boolean f10064g;
    public AudioAttributes h;

    static {
        String str = h2.l0.f13471a;
        f10052j = Integer.toString(0, 36);
        f10053k = Integer.toString(1, 36);
        f10054l = Integer.toString(2, 36);
        f10055m = Integer.toString(3, 36);
        f10056n = Integer.toString(4, 36);
        f10057o = Integer.toString(5, 36);
        f10058p = Integer.toString(6, 36);
    }

    public e(int i7, int i10, int i11, int i12, boolean z10, int i13, boolean z11) {
        this.f10059a = i7;
        this.f10060b = i10;
        this.f10061c = i11;
        this.d = i12;
        this.f10062e = i13;
        this.f10063f = z10;
        this.f10064g = z11;
    }

    public static e a(Bundle bundle) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = f10052j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i7 = bundle.getInt(str);
        } else {
            i7 = 0;
        }
        String str2 = f10053k;
        if (bundle.containsKey(str2)) {
            i10 = bundle.getInt(str2);
        } else {
            i10 = 0;
        }
        String str3 = f10054l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i11 = bundle.getInt(str3);
        } else {
            i11 = 1;
        }
        String str4 = f10055m;
        if (bundle.containsKey(str4)) {
            i12 = bundle.getInt(str4);
        } else {
            i12 = 1;
        }
        String str5 = f10056n;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f10057o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f10058p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new e(i7, i10, i11, i12, z12, i13, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10059a).setFlags(this.f10060b).setUsage(this.f10061c);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                ab.y.k(usage, this.d);
                ab.y.a(usage, this.f10064g);
            }
            if (i7 >= 32) {
                d.b(usage, this.f10062e);
                d.a(usage, this.f10063f);
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
            if (this.f10059a == eVar.f10059a && this.f10060b == eVar.f10060b && this.f10061c == eVar.f10061c && this.d == eVar.d && this.f10062e == eVar.f10062e && this.f10063f == eVar.f10063f && this.f10064g == eVar.f10064g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f10059a) * 31) + this.f10060b) * 31) + this.f10061c) * 31) + this.d) * 31) + this.f10062e) * 31) + (this.f10063f ? 1 : 0)) * 31) + (this.f10064g ? 1 : 0);
    }
}
